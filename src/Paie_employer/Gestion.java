package Paie_employer;

import java.util.InputMismatchException;
import java.util.Scanner;
import GestionExecptionPersonnel.*;

public class Gestion {

	public static void main(String args[]) {
		try {
			Employe ep[] = new Employe[3];
			ep[0] = new Employe("kadour", "pdg");
			ep[1] = new EmployeTempsPartiel("adam", "cuisinier");
			ep[2] = new EmployePleinTemps("haouari", "plombier");
			Scanner lire = new Scanner(System.in);
			System.out.println("saisire salaire");
			ep[0].setSalaire(lire.nextDouble());
			System.out.print(ep[0].afficheCheque());
			System.out.print("=================");
			System.out.println("saisire salaire");
			((EmployeTempsPartiel) ep[1]).setMontantHeure(lire.nextDouble());
			((EmployeTempsPartiel) ep[1]).calculerPaie();
			System.out.print(ep[1].afficheCheque());
			System.out.print("================");
			System.out.println("saisire salaire");
			((EmployePleinTemps) ep[2]).setMontantheb(lire.nextDouble());
			System.out.println("saisire salaire");
			((EmployePleinTemps) ep[2]).setPrime(lire.nextDouble());
			((EmployePleinTemps) ep[2]).calculerPaie();
			System.out.print(ep[2].afficheCheque());
		} catch (MontantInvalid e) {
			System.out.println(e.getMessage());
		} catch (InputMismatchException ex) {
			System.out.println("charctère a la palce de double");
		}
	}
}
