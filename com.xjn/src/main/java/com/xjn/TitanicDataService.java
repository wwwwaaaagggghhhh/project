package com.xjn;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import java.util.Arrays;
import java.util.List;

/**
 * Implémentation d'un service web pour accéder aux données du Titanic.
 */
@WebService(targetNamespace = "http://xjn.com/", portName = "TitanicDataServicePort", serviceName = "TitanicDataServiceService")
public class TitanicDataService {

    // Chargement du jeu de données du Titanic
    private List<String[]> dataset = TitanicDatasetLoader.loadDataset("C:\\titanic.csv");

    /**
     * Récupère les attributs d'un passager en fonction de son nom.
     *
     * @param passengerName Nom du passager
     * @return Tableau d'attributs du passager
     */
    @WebMethod(operationName = "getPassengerAttributes", action = "urn:GetPassengerAttributes")
    @WebResult(name = "return")
    public String[] getPassengerAttributes(@WebParam(name = "arg0") String passengerName) {
        for (String[] passenger : dataset) {
            if (passenger[3].equals(passengerName)) {
                return passenger;
            }
        }
        return new String[0];
    }

    /**
     * Récupère le nombre de passagers ayant une certaine valeur pour un attribut donné.
     *
     * @param attributeName  Nom de l'attribut
     * @param attributeValue Valeur de l'attribut
     * @return Nombre de passagers ayant la valeur spécifiée pour l'attribut
     */
    @WebMethod(operationName = "getCountByAttribute", action = "urn:GetCountByAttribute")
    @WebResult(name = "return")
    public int getCountByAttribute(@WebParam(name = "arg0") String attributeName,
                                   @WebParam(name = "arg1") String attributeValue) {
        int count = 0;

        for (String[] passenger : dataset) {
            int attributeIndex = findAttributeIndex(attributeName);

            if (attributeIndex != -1 && passenger.length > attributeIndex
                    && passenger[attributeIndex].equals(attributeValue)) {
                count++;
            }
        }

        return count;
    }

    // Recherche l'index d'un attribut dans le jeu de données
    private int findAttributeIndex(String attributeName) {
        for (int i = 0; i < dataset.get(0).length; i++) {
            if (dataset.get(0)[i].equals(attributeName)) {
                return i;
            }
        }
        return -1;
    }
}
