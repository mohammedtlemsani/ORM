package ma.enset.jpa_hibernate.dao;

import ma.enset.jpa_hibernate.entities.Consultation;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ConsultationRepository extends JpaRepository<Consultation,Long> {
}
