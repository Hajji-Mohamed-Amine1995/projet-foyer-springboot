package com.projet.spring.Foyer_SE5_Med_Amine_Hajji.entities;
import jakarta.persistence.*;
import lombok.*;
import lombok.experimental.FieldDefaults;

import java.util.Date;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE)
public class Etudiant {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long idEtudiant;// clé primaire
    String nomEtudiant;
    String prenomEtudiant;
    Long cin;
    String ecole;
    Date dateNaissance;
}
