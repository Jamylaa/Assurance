package tn.esprit.AssuranceJamila.Entities;

import jakarta.persistence.*;
import lombok.*;
import org.springframework.boot.autoconfigure.web.WebProperties;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Assurance {

    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private  int idAssurance;

    public int getIdAssurance() {return idAssurance;}
    public void setIdAssurance(int idAssurance) {this.idAssurance = idAssurance;}

    private  String designation;
    private  float montant;

    public float getMontant() {return montant;}

    public void setMontant(float montant) {this.montant = montant;}

    public String getDesignation() {return designation;}

    public void setDesignation(String designation) {this.designation = designation;}


    //public Contrat getContrat() {return contrat;}
    //  public void setContrat(Contrat contrat) {this.contrat = contrat;}

    @ManyToOne
// //(cascade = CascadeType.ALL)
private Contrat contrat;

@ManyToOne
// //(cascade = CascadeType.ALL)
private Beneficiaire beneficiaire;

}