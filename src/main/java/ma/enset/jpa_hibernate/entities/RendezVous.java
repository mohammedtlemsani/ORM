package ma.enset.jpa_hibernate.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;
@Entity
@Data @AllArgsConstructor @NoArgsConstructor
public class RendezVous {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id ;
    private Date date;
    @ManyToOne
    private Patient patient;
    @ManyToOne
    private Medecin medecin;
    private StatusRdv statusRdv;
    @OneToOne
    private Consultation consultation;
}
