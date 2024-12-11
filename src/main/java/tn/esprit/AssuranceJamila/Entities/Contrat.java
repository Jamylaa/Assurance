package tn.esprit.AssuranceJamila.Entities;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import java.util.Date;
import java.util.List;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Contrat {

    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private  int idContrat;

    private  String matricule;

    @Temporal(TemporalType.DATE)
    private Date dateEffet;

    @Enumerated(EnumType.STRING)
    private  TypeContrat TypeContrat;

    public tn.esprit.AssuranceJamila.Entities.TypeContrat getTypeContrat() {return TypeContrat;}
    public void setTypeContrat(tn.esprit.AssuranceJamila.Entities.TypeContrat typeContrat) {TypeContrat = typeContrat;}
    public String getMatricule() {return matricule;}
    public void setMatricule(String matricule) {this.matricule = matricule;}
    public int getIdContrat() {return idContrat;}
    public void setIdContrat(int idContrat) {this.idContrat = idContrat;}
    public Date getDateEffet() {return dateEffet;}
    public void setDateEffet(Date dateEffet) {this.dateEffet = dateEffet;}



}