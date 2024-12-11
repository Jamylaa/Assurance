package tn.esprit.AssuranceJamila.Services;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import tn.esprit.AssuranceJamila.Entities.Contrat;
import tn.esprit.AssuranceJamila.Repositories.IAssuranceRepository;
import tn.esprit.AssuranceJamila.Repositories.IBeneficiaireRepository;
import tn.esprit.AssuranceJamila.Repositories.IContratRepository;

@AllArgsConstructor
@Service
public class ContratServiceImpl implements IContratService {
    IContratRepository contratRepository;
    IBeneficiaireRepository beneficiaireRepository;
    IAssuranceRepository assuranceRepository;

    @Override
    public Contrat ajouterContrat(Contrat c) { return contratRepository.save(c);}




}