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
		patientRepository.save(new Patient(1, "Mohammed", new Date(2002, 9, 13), true, 10));
		patientRepository.save(new Patient(2, "Fatima", new Date(1995, 5, 25), false, 8));
		patientRepository.save(new Patient(3, "Ahmed", new Date(1980, 2, 10), true, 12));
		patientRepository.save(new Patient(4, "Amina", new Date(1976, 11, 7), false, 15));
		patientRepository.save(new Patient(5, "Youssef", new Date(1999, 8, 20), true, 9));
		patientRepository.save(new Patient(6, "Khadija", new Date(1965, 4, 3), false, 11));
		patientRepository.save(new Patient(7, "Zineb", new Date(1988, 10, 15), true, 14));
		patientRepository.save(new Patient(8, "Hassan", new Date(2005, 12, 28), true, 7));
		patientRepository.save(new Patient(9, "Leila", new Date(1992, 7, 18), false, 13));
		patientRepository.save(new Patient(10, "Omar", new Date(1978, 3, 30), true, 16));
		//System.out.println(patientRepository.search(9));
		//patientRepository.updatePatientNom(9,"LAILA");
		patientRepository.deletePatientById(9);
		List<Patient> patients= patientRepository.findAll();
		patients.forEach(patient -> {
			System.out.println(patient.toString());
		});
		Patient patient = patientRepository.findById(Long.valueOf(1)).get();
		System.out.println(patient.toString());
		List<Patient> patients1 = patientRepository.findByNomContains("med");
		patients1.forEach(patient1 -> {
			System.out.println(patient1.toString());
		});
	}
}
