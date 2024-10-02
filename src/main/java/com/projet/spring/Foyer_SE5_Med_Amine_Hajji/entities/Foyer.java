package com.projet.spring.Foyer_SE5_Med_Amine_Hajji.entities;
import jakarta.persistence.*;
import lombok.*;
import lombok.experimental.FieldDefaults;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@FieldDefaults(level=AccessLevel.PRIVATE)



public class Foyer {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="idFoyer")
    Long idFoyer; // cle primaire
    String nomFoyer;
    Long capaciteFoyer;


}
