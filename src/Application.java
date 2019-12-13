import java.util.ArrayList;
import java.util.Scanner;

public class Application {

	private ArrayList<Connectable> appareils;
	private MonConstructeur ctr;
	
	Application()
	{
		this.appareils = new ArrayList<Connectable>();
		this.ctr = new MonConstructeur();
	}
	
	public static void main(String[] args) throws InstantiationException, IllegalAccessException {
		Application app = new Application();
		String input;
		Scanner s = new Scanner(System.in);
		
		while(true)
		{
			System.out.println("Entrez le nom du connectable a instancier (ligne vide pour quitter) :");
			input=s.nextLine();
			if(input.isEmpty())	break;
			try {
				Connectable c=app.ctr.creer(input);
				if(c!=null)	app.appareils.add(c);
			} catch (ClassNotFoundException e) {
				System.out.println("La classe '"+input+"' n'existe pas !");
			}
			 catch (InstantiationException | IllegalAccessException e) {
				e.printStackTrace();
			}
		}
		s.close();
	}

}
