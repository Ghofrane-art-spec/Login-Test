package EMC.Web.emc.entities;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.Id;
import javax.persistence.Table;

@Table
@Entity
public class User implements Serializable {
	@Id
	private Long matricule;
    private String pwd;
    private String nom;
	private String prenom;
    @Enumerated(EnumType.STRING)
    private Role role;
	public User(Long matricule, String pwd, String nom, String prenom, Role role) {
		super();
		this.matricule = matricule;
		this.pwd = pwd;
		this.nom = nom;
		this.prenom = prenom;
		this.role = role;
	}
	public User() {
		super();
	}
	public Long getMatricule() {
		return matricule;
	}
	public void setMatricule(Long maricule) {
		this.matricule = maricule;
	}
	public String getPwd() {
		return pwd;
	}
	public void setPwd(String pwd) {
		this.pwd = pwd;
	}
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public String getPrenom() {
		return prenom;
	}
	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}
	public Role getRole() {
		return role;
	}
	public void setRole(Role role) {
		this.role = role;
	}
	@Override
	public String toString() {
		return "User [matricule=" + matricule + ", pwd=" + pwd + ", nom=" + nom + ", prenom=" + prenom + ", role=" + role
				+ "]";
	}
	
}
