package ma.enset.jpa_hibernate.dao;

import ma.enset.jpa_hibernate.entities.Patient;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface PatientRepository extends JpaRepository<Patient,Long> {
    List<Patient> findByNomContains(String mc);
}
