package tn.esprit.AssuranceJamila.Services;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import tn.esprit.AssuranceJamila.Entities.Assurance;
import tn.esprit.AssuranceJamila.Repositories.IAssuranceRepository;
import tn.esprit.AssuranceJamila.Repositories.IBeneficiaireRepository;
import tn.esprit.AssuranceJamila.Repositories.IContratRepository;

@AllArgsConstructor
@Service
public class AssuranceService implements IAssuranceService {
IAssuranceRepository assuranceRepository;

IBeneficiaireRepository beneficiaireRepository;
IContratRepository contratRepository;

    @Override
    public Assurance ajouterAssurance(Assurance a) {
        return assuranceRepository.save(a);}

   // @Override
    // public Assurance ajouterAssurance(Assurance a, int cinBf, String matricule) {
     //   return assuranceRepository.save(a);}
}