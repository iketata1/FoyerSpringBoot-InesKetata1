package tn.esprit.foyerspringboot.entities;


import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@Entity
@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor

public class Chambre {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)


    private Long idChambre;
    private Long numeroChambre;
    @Enumerated(EnumType.STRING)
    private tn.esprit.foyerspringboot.enums.typeChambre typeC;

    @OneToMany
    private List<Reservation> R;
    @ManyToOne
    private Bloc B;

}