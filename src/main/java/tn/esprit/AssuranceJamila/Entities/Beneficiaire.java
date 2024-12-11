package tn.esprit.AssuranceJamila.Entities;
import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.*;
import java.util.List;


@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Beneficiaire {

    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private  int idBenef;

    private  int cinBf;
    private  String nom;
    private  String prenom;
    private  String profession;
    private  float salaire;

    public float getSalaire() {return salaire;}

    public void setSalaire(float salaire) {this.salaire = salaire;}

    public String getProfession() {return profession;}

    public void setAssurances(List<Assurance> assurances) {
        this.assurances = assurances;
    }

    public void setProfession(String profession) {this.profession = profession;}

    public String getPrenom() {return prenom;}

    public void setPrenom(String prenom) {this.prenom = prenom;}

    public String getNom() {return nom;}

    public void setNom(String nom) {this.nom = nom;}

    public int getIdBenef() {return idBenef;}

    public void setIdBenef(int idBenef) {this.idBenef = idBenef;}

    public int getCinBf() {return cinBf;}

    public void setCinBf(int cinBf) {this.cinBf = cinBf;}

    public List<Assurance> getAssurances() {return assurances;}

   // public void setAssurances(List<Assurance> assurances) {this.assurances = assurances;}

    //@OneToMany(mappedBy = "beneficiare", cascade = CascadeType.ALL)
    @OneToMany(mappedBy = "beneficiaire")
private List<Assurance> assurances;

}