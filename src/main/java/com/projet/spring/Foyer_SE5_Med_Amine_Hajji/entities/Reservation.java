package com.projet.spring.Foyer_SE5_Med_Amine_Hajji.entities;
import jakarta.persistence.*;
import lombok.*;
import lombok.experimental.FieldDefaults;

import java.util.Date;
import java.util.Locale;

@Entity
@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE)

public class Reservation {
    @Id
    @Column(name = "idReservation")
    String  idReservation; //clé primaire
    Date anneeUniversitaire;
    Boolean estValide;

}
