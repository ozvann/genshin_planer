import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.Reader;
import com.google.gson.Gson;


// Pour complier (a la racine du projet) : javac -cp "./lib/gson-2.13.1.jar" src/*.java

// Pour executer (a la racine du projet) : java -cp "./lib/gson-2.13.1.jar:src" Main



public class Main {
	public static void main(String[] args) {
		Accueil accueil = new Accueil();
		accueil.window.setVisible(true);
		Reader reader = null;

		FiltreCharacter tabfiltre = new FiltreCharacter();

		try { // Lecture du fichier json
			reader = new FileReader("./json/Character.json");
		} catch (FileNotFoundException e) {
			System.err.println("Erreur : Le fichier Character.json est introuvable. Vérifie le chemin : " + e.getMessage());
		}

		Gson gson = new Gson();			 // Initialisation du parsage avec Gson

		GenshinData data = gson.fromJson(reader, GenshinData.class);		// Convertion json vers une classe java

		System.out.println("Version: " + data.version);
		
		GestionFiltre persook = new GestionFiltre();

		persook.AddAffiliation("mondstadt");
		persook.AddAffiliation("otherworld");
		persook.AddArmes("sword");
		persook.AddElement("pyro");
		persook.AddArmes("claymore");

		for (Character c : data.characters) {
			if (persook.PersoOK(c) == true){
				tabfiltre.add(c);
			}
		}

		persook.removeAffiliation("otherworld");

		for (Character c : data.characters) {
			if (persook.PersoOK(c) == true){
				tabfiltre.add(c);
			}
		}

		persook.Vider();
		persook.AddRarete(5);
		persook.AddArmes("sword");
		persook.AddElement("anemo");
		persook.AddAffiliation("mondstadt");

		for (Character c : data.characters) {
			if (persook.PersoOK(c) == true){
				tabfiltre.add(c);
			}
		}
		System.out.println(tabfiltre.result());
	}
}
