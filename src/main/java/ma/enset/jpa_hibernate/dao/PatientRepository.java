package ma.enset.jpa_hibernate.dao;
import jakarta.transaction.Transactional;
import ma.enset.jpa_hibernate.entities.Patient;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import java.util.List;
public interface PatientRepository extends JpaRepository<Patient,Long> {
    List<Patient> findByNomContains(String mc);
    @Query("select p from Patient p where p.id = :id")
    Patient search(@Param("id")long id);
    @Transactional
    @Modifying
    @Query("UPDATE Patient p SET p.nom = :nom WHERE p.id = :id")
    void updatePatientNom(@Param("id") long id, @Param("nom") String nom);
    @Transactional
    void deletePatientById(long id);
}
