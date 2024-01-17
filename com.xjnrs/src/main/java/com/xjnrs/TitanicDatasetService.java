package com.xjnrs;

import java.util.List;

import javax.ws.rs.*;
import javax.ws.rs.core.*;

import com.xjnrs.TitanicDatasetLoader;

/**
 * Service web RESTful fournissant des fonctionnalités pour accéder aux données du Titanic.
 */
@Path("/titanic")
public class TitanicDatasetService {

    // Chargement du jeu de données du Titanic
    private List<String[]> dataset = TitanicDatasetLoader.loadDataset("C:\\titanic.csv");

    /**
     * Récupère les attributs d'un passager en fonction de son nom.
     *
     * @param passengerName Nom du passager
     * @return Attributs du passager sous forme de chaîne de caractères séparés par des virgules
     */
    @GET
    @Path("/passenger-attr/{attr}")
    @Produces("text/plain")
    public String getPassengerAttributes(@PathParam("attr") String passengerName) {
        for (String[] passenger : dataset) {
            if (passenger[3].equals(passengerName)) {
                return String.join(",", passenger);
            }
        }

        return "";
    }

    /**
     * Récupère le nombre de passagers ayant une certaine valeur pour un attribut donné.
     *
     * @param attributeName  Nom de l'attribut
     * @param attributeValue Valeur de l'attribut
     * @return Nombre de passagers ayant la valeur spécifiée pour l'attribut
     */
    @GET
    @Path("/count/{attr}/{val}")
    @Produces("text/plain")
    public int getCountByAttribute(@PathParam("attr") String attributeName, @PathParam("val") String attributeValue) {
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
