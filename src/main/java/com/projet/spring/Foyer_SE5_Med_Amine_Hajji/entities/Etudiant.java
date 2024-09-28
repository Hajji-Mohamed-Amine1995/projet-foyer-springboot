package com.projet.spring.Foyer_SE5_Med_Amine_Hajji.entities;
import jakarta.persistence.*;
import lombok.*;
import lombok.experimental.FieldDefaults;

import java.util.Date;
import java.util.List;
import java.util.logging.Level;

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
    String nomEt;
    String prenomEt;
    Long cin;
    String ecole;
    Date dateNaissance;




}
