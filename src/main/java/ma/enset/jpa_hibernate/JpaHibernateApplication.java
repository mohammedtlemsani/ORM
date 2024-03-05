package ma.enset.jpa_hibernate;

import ma.enset.jpa_hibernate.dao.PatientRepository;
import ma.enset.jpa_hibernate.entities.Patient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.support.NullValue;
import org.springframework.context.annotation.Bean;

import java.util.Date;
import java.util.List;
import java.util.Optional;
import java.util.stream.Stream;

@SpringBootApplication
public class JpaHibernateApplication implements CommandLineRunner {
	@Autowired
	private PatientRepository patientRepository ;
	public static void main(String[] args) {
		SpringApplication.run(JpaHibernateApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {

	}
	@Bean
	CommandLineRunner start(PatientRepository patientRepository){
		return args -> {
			Stream.of("hamid","mohammed","oussama").forEach(name->{
				Patient p = new Patient();
				p.setNom(name);
				p.setDateNaissance(new Date());
				p.setMalade(true);
				patientRepository.save(p);
			});
		};
	}
}
