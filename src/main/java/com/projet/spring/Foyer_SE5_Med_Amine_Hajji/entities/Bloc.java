package com.projet.spring.Foyer_SE5_Med_Amine_Hajji.entities;


import jakarta.persistence.*;
import lombok.*;
import lombok.experimental.FieldDefaults;

@Entity
@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@FieldDefaults(level=AccessLevel.PRIVATE)




public class Bloc
{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="idBloc")
    Long idBloc; // clé primaire
    String nomBloc;
    Long capaciteBloc;


}
