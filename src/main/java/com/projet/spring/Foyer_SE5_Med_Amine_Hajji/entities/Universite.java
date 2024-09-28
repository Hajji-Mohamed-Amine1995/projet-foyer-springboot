package com.projet.spring.Foyer_SE5_Med_Amine_Hajji.entities;

import jakarta.persistence.*;
import lombok.experimental.FieldDefaults;
import lombok.*;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@FieldDefaults(level=AccessLevel.PRIVATE)




public class Universite {
    @Id
    @GeneratedValue(strategy =GenerationType.IDENTITY )
    @Column(name="idUniversite")
    Long idUniversite; //clé primaire
    String nomUniversite;
    String adresse;

}
