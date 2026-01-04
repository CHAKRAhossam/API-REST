package ma.projet.controllers;

import ma.projet.entities.Compte;
import ma.projet.repositories.CompteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
@CrossOrigin(origins = "http://localhost:3000")
public class CompteController {

    @Autowired
    private CompteRepository compteRepository;

    @GetMapping("/comptes")
    public List<Compte> getAllComptes() {
        return compteRepository.findAll();
    }

    @GetMapping("/comptes/{id}")
    public Compte getCompteById(@PathVariable Long id) {
        return compteRepository.findById(id).orElse(null);
    }

    @PostMapping("/comptes")
    public Compte createCompte(@RequestBody Compte compte) {
        return compteRepository.save(compte);
    }

    @PutMapping("/comptes/{id}")
    public Compte updateCompte(@PathVariable Long id, @RequestBody Compte compte) {
        compte.setId(id);
        return compteRepository.save(compte);
    }

    @DeleteMapping("/comptes/{id}")
    public void deleteCompte(@PathVariable Long id) {
        compteRepository.deleteById(id);
    }
}
