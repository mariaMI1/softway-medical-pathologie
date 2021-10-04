package fr.softway.medical.services;


import fr.softway.medical.models.Pathologie;


public class PathologieService {

    public static String pathologiesDepuisIndex(int index) {
        StringBuilder result = new StringBuilder();
        for (Pathologie pathologie : PathologiesDonnees.getPathologies()) {
            //si l'index est multiple d'une des pathologies connues, remonter celle ci.
            if (0 == index % pathologie.getMultiple() && index > 0) {
                result = result.length() > 0 ? result.append(", " + pathologie.getLibelle()) :
                        result.append(pathologie.getLibelle());
            }
        }
        return result.length() > 0 ? result.toString() : "Aucune pathologie connue";
    }
}
