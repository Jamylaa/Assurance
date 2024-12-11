package tn.esprit.AssuranceJamila.Services;

import org.springframework.stereotype.Service;
import tn.esprit.AssuranceJamila.Entities.Beneficiaire;
import tn.esprit.AssuranceJamila.Repositories.IAssuranceRepository;
import tn.esprit.AssuranceJamila.Repositories.IBeneficiaireRepository;
import lombok.AllArgsConstructor;
import java.util.Date;
import java.util.List;
@AllArgsConstructor
@Service
public class BeneficiaireService implements IBeneficiaireService {
    IBeneficiaireRepository beneficiaireRepository;
    IAssuranceRepository assuranceRepository;

    @Override
    public Beneficiaire ajouterBeneficiaire(Beneficiaire bf) {
        return beneficiaireRepository.save(bf);
    }
}
