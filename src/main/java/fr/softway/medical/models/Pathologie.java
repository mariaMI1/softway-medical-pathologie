package fr.softway.medical.models;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@AllArgsConstructor
public class Pathologie {
    @Getter
    private int multiple;
    @Getter
    @Setter
    private String libelle;
}
