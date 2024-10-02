package com.projet.spring.Foyer_SE5_Med_Amine_Hajji.entities;

import jakarta.persistence.*;
import lombok.*;
import lombok.experimental.FieldDefaults;

@Entity
    @AllArgsConstructor
    @NoArgsConstructor
    @Getter
    @Setter
    @FieldDefaults(level= AccessLevel.PRIVATE)



public class Chambre {
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    @Column(name= "idChambtre")
    Long idChambre; //clé primaire
    Long numeroChambre;
    @Enumerated(EnumType.STRING)
    TypeChambre typeChambre;



}
