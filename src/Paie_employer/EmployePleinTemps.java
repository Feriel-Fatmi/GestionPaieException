package Paie_employer;

import GestionExecptionPersonnel.MontantInvalid;

public class EmployePleinTemps extends Employe {
	private double montantheb;
	private double prime;

	public double getPrime() {
		return prime;
	}

	public void setPrime(double prime) throws GestionExecptionPersonnel.MontantInvalid {
		if (prime >= 0) {
			this.prime = prime;
		} else {
			throw new MontantInvalid("montant negatie");
		}
	}

	public double getMontantheb() {

		return montantheb;
	}

	public void setMontantheb(double montantheb) throws GestionExecptionPersonnel.MontantInvalid {
		if (montantheb >= 0) {
			this.montantheb = montantheb;
		} else {
			throw new MontantInvalid("montant negatie");
		}
	}

	public EmployePleinTemps(String nom, String job) {
		super(nom, job);

	}

	@Override
	public double calculerPaie() {
		try {
			setSalaire((montantheb * 4 + prime));
		} catch (MontantInvalid e) {

			System.out.println(e.getMessage());
		}
		return getSalaire();
	}
}
