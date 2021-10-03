package fr.softway.medical.services;

import fr.softway.medical.models.Pathologie;

import java.util.ArrayList;
import java.util.List;

public class PathologiesDonnees {
    public static List<Pathologie> getPathologies() {
        List<Pathologie> pathologies = new ArrayList<Pathologie>();
        pathologies.add(new Pathologie(3,"Cardiologie"));
        pathologies.add(new Pathologie(5,"Traumatologie"));
        return pathologies;

    }
}
