package Data;
import java.io.ObjectInputStream.GetField;

import Data.IOperatoerDAO.DALException;

/*
 * This is the runable applikation
 * From here we will build up the applikation so that the entire project works
 * Here we are to create the UI and get userinputs
 * Userinputs are used in the IFunk and through this send through the system
 * 
 */
public class Applikation extends Funktionalitet  {

	public static void main(String[] args) throws DALException {
		// TODO Auto-generated method stub

		Funktionalitet funktion = new Funktionalitet();
		java.util.Scanner tastatur = new java.util.Scanner(System.in);


		System.out.println("______________________________________");
		System.out.println();
		System.out.println("Pick admin or operator");
		System.out.println("For admin, enter 10");
		System.out.println("For operator, enter 11");
		System.out.println();
		System.out.println("Exit program, enter 20");

		while(tastatur.hasNext()){

			String valg = tastatur.nextLine();	

			if(valg.equals("10")){
				System.out.println("Enter password.");
				valg = tastatur.nextLine();
				if(valg.equals("02324it")){
					funktion.adminLogin = true;
					System.out.println("____________________________________________");
					System.out.println();
					System.out.println("Welcome back, admin! What do you want to do?");
					System.out.println();
					System.out.println("List of operators, press 1");
					System.out.println("Delete operator(s), press 2");
					System.out.println("Update operator, press 3");
					System.out.println();
					System.out.println("Logout, press 4");
					valg = tastatur.nextLine();		
				}
				else{
					System.out.println("Wrong password, try again.");
				}
				if(valg.equals("1")){
					System.out.println(funktion.OPdata.getOperatoerList());
				}
				else if(valg.equals("2")){
					System.out.println("Please enter the oprID for the operator you want to delete.");
					funktion.deleteOperator(funktion.getOperatoer(Integer.parseInt(valg)));
				}
				else if(valg.equals("3")){
					System.out.println("Please enter the oprID for the operator you want to update.");
					funktion.updateOperator(funktion.getOperatoer(Integer.parseInt(valg)));
				}
				else if(valg.equals("4")){
					System.out.println("Goodbye admin.");
					funktion.adminLogin = false;
				}


			}
		}
	}
}



