package ma.ensa.patientsmvc;

import ma.ensa.patientsmvc.entities.Patient;
import ma.ensa.patientsmvc.repositories.PatientRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.Date;

@SpringBootApplication
public class PatientsMvcApplication {

    public static void main(String[] args) {
        SpringApplication.run(PatientsMvcApplication.class, args);
    }
    //@Bean
    CommandLineRunner start(PatientRepository patientRepository){
        return args -> {
            patientRepository.save(new Patient(null,"Hamza",new Date(),false,122));
            patientRepository.save(new Patient(null,"Mohammed",new Date(),true,370));
            patientRepository.save(new Patient(null,"Meryem",new Date(),false,312));
            patientRepository.save(new Patient(null,"Ayoub",new Date(),true,143));

            patientRepository.findAll().forEach(p ->{
                System.out.println(p.getNom());
            });

        };
    }

}
