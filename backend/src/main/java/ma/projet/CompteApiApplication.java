package ma.projet;

import ma.projet.entities.Compte;
import ma.projet.entities.TypeCompte;
import ma.projet.repositories.CompteRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.Date;

@SpringBootApplication
public class CompteApiApplication {

    public static void main(String[] args) {
        SpringApplication.run(CompteApiApplication.class, args);
    }

    @Bean
    CommandLineRunner initData(CompteRepository compteRepository) {
        return args -> {
            compteRepository.save(new Compte(null, 5000.0, new Date(), TypeCompte.COURANT));
            compteRepository.save(new Compte(null, 12000.0, new Date(), TypeCompte.EPARGNE));
            compteRepository.save(new Compte(null, 8500.0, new Date(), TypeCompte.COURANT));
        };
    }
}
