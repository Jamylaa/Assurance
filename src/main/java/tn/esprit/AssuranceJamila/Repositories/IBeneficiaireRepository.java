package tn.esprit.AssuranceJamila.Repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import tn.esprit.AssuranceJamila.Entities.Beneficiaire;

@Repository
public interface IBeneficiaireRepository extends JpaRepository<Beneficiaire, Integer> {
}
