package fr.softway.medical.services;


import fr.softway.medical.models.Pathologie;


public class PathologieService {

    public static String pathologieDepuisIndex(int index) {
        StringBuilder result = new StringBuilder();
        for (Pathologie pathologie : PathologiesDonnees.getPathologies()) {
            if (0 == index % pathologie.getMultiple()) {
                result = result.length() > 0 ? result.append(", " + pathologie.getLibelle()) :
                        result.append(pathologie.getLibelle());
            }
        }
        return result.length() > 0 ? result.toString() : "Aucune pathologie connue";
    }
}
