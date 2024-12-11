package tn.esprit.AssuranceJamila.Controllers;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import tn.esprit.AssuranceJamila.Entities.Beneficiaire;
import tn.esprit.AssuranceJamila.Repositories.IBeneficiaireRepository;
import tn.esprit.AssuranceJamila.Services.BeneficiaireService;
import tn.esprit.AssuranceJamila.Services.IBeneficiaireService;

@RestController
@RequestMapping("Beneficiaire")
@AllArgsConstructor
//@Tag(name="a")
public class BeneficiareRestController {
    BeneficiaireService beneficiaireService;

    @PostMapping("/add_beneficiaire")
    public Beneficiaire ajouterBeneficiaire(@RequestBody Beneficiaire bf){
        return beneficiaireService.ajouterBeneficiaire(bf);
    }


}