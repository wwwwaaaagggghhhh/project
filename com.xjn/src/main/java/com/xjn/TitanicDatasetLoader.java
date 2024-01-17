package com.xjn;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;

/**
 * Classe utilitaire pour charger le jeu de données du Titanic à partir d'un fichier CSV.
 */
public class TitanicDatasetLoader {

    /**
     * Charge le jeu de données du Titanic à partir d'un fichier CSV.
     *
     * @param csvFilePath Chemin du fichier CSV contenant le jeu de données
     * @return Liste des enregistrements du jeu de données
     */
    @WebMethod
    public static List<String[]> loadDataset(@WebParam(name = "arg0") String csvFilePath) {
        List<String[]> dataset = new ArrayList<>();

        try (BufferedReader br = new BufferedReader(new FileReader(csvFilePath))) {
            String line;
            while ((line = br.readLine()) != null) {
                String[] attributes = line.split(",");
                dataset.add(attributes);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        return dataset;
    }
}
