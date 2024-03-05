package ma.enset.jpa_hibernate;

import ma.enset.jpa_hibernate.dao.PatientRepository;
import ma.enset.jpa_hibernate.entities.Patient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.support.NullValue;

import java.util.Date;
import java.util.List;
import java.util.Optional;

@SpringBootApplication
public class JpaHibernateApplication implements CommandLineRunner {
	@Autowired
	private PatientRepository patientRepository ;
	public static void main(String[] args) {
		SpringApplication.run(JpaHibernateApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		//System.out.println(patientRepository.search(9));
		//patientRepository.updatePatientNom(9,"LAILA");
/*		List<Patient> patients= patientRepository.findAll();
		patients.forEach(patient -> {
			System.out.println(patient.toString());
		});
		Patient patient = patientRepository.findById(Long.valueOf(1)).get();
		System.out.println(patient.toString());
		List<Patient> patients1 = patientRepository.findByNomContains("med");
		patients1.forEach(patient1 -> {
			System.out.println(patient1.toString());
		});
	*/}
}
