package tn.esprit.AssuranceJamila.Repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import tn.esprit.AssuranceJamila.Entities.Contrat;

@Repository
public interface IContratRepository extends JpaRepository<Contrat, Integer> {
}