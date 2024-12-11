package tn.esprit.AssuranceJamila.Controllers;

import lombok.AllArgsConstructor;
import lombok.Getter;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import tn.esprit.AssuranceJamila.Entities.Contrat;
import tn.esprit.AssuranceJamila.Repositories.IBeneficiaireRepository;
import tn.esprit.AssuranceJamila.Repositories.IContratRepository;
import tn.esprit.AssuranceJamila.Services.IBeneficiaireService;
import tn.esprit.AssuranceJamila.Services.IContratService;


@RestController
@RequestMapping("Contrat")
@AllArgsConstructor
//@Tag(name="a")
public class ContratRestController {
    IContratService contratService;
IBeneficiaireService beneficiaireService;

@PostMapping("/ajouter-Contrat")
    public Contrat ajouterContrat(@RequestBody Contrat c) {
        return contratService.ajouterContrat(c);}

  //  @PostMapping("/")



}