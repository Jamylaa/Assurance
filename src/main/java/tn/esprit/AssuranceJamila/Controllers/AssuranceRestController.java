package tn.esprit.AssuranceJamila.Controllers;

import io.swagger.v3.oas.annotations.tags.Tag;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import tn.esprit.AssuranceJamila.Entities.Assurance;
import tn.esprit.AssuranceJamila.Entities.Beneficiaire;
import tn.esprit.AssuranceJamila.Services.AssuranceService;
import tn.esprit.AssuranceJamila.Services.IAssuranceService;

@Tag(name = " Jamila l Jamila ")

@RestController
@RequestMapping("Assurance")
@AllArgsConstructor

public class AssuranceRestController {
    IAssuranceService assuranceService;

    @PostMapping("/add_Assurance")
    public Assurance ajouterAssurance(@RequestBody Assurance a) {
    return assuranceService.ajouterAssurance(a);}



}