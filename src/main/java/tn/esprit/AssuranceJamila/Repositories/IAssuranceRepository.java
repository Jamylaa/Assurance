package tn.esprit.AssuranceJamila.Repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import tn.esprit.AssuranceJamila.Entities.Assurance;

@Repository
public interface IAssuranceRepository extends JpaRepository<Assurance, Integer> {
}
