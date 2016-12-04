package Paie_employer;

import GestionExecptionPersonnel.MontantInvalid;

public class EmployeTempsPartiel extends Employe {
	private double montantHeure;
	final int heure = 35;

	public double getMontantHeure() {
		return montantHeure;
	}

	public void setMontantHeure(double montantHeure) throws GestionExecptionPersonnel.MontantInvalid {
		if (montantHeure >= 0) {
			this.montantHeure = montantHeure;
		} else {
			throw new MontantInvalid("montant negative");
		}
	}

	public EmployeTempsPartiel(String nom, String job) {
		super(nom, job);

	}

	@Override
	public double calculerPaie() {
		try {
			setSalaire((montantHeure * heure));
		} catch (MontantInvalid e) {
			System.out.println(e.getMessage());
		}
		return getSalaire();
	}
}
