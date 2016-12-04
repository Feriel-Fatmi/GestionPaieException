package Paie_employer;

import GestionExecptionPersonnel.MontantInvalid;

public class Employe {

	private String nom;
	private String job;
	private double salaire;

	public Employe(String nom, String job) {

		this.nom = nom;
		this.job = job;

	}

	public double calculerPaie() {
		return salaire;
	}

	public double getSalaire() {
		return salaire;
	}

	public void setSalaire(double salaire) throws GestionExecptionPersonnel.MontantInvalid {
		if (salaire >= 0) {
			this.salaire = salaire;
		} else {
			throw new MontantInvalid("montant negative");
		}
	}

	public String getJob() {

		return job;
	}

	public void setJob(String job) {
		this.job = job;
	}

	public String getNom() {

		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public String afficheCheque() {
		return "Employe  " + nom + "\njob  " + job + "salaire\n    " + salaire + "";
	}
}
