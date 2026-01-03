import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.Reader;
import com.google.gson.Gson;


// Pour complier (a la racine du projet) : javac -cp "./lib/gson-2.13.1.jar" src/*.java

// Pour executer (a la racine du projet) : java -cp "./lib/gson-2.13.1.jar;src" Main

public class Main {
    public static void main(String[] args) {
        String filtre = "mondstadt";
        Reader reader = null;

        if (args[0].equals("perso")){
            try { // Lecture du fichier json (obligation du try catch)
                reader = new FileReader("./json/Character.json");
            } catch (FileNotFoundException e) {
                System.err.println("Erreur : Le fichier Character.json est introuvable. Vérifie le chemin : " + e.getMessage());
            }

            Gson gson = new Gson();             // Initialisation du parsage avec Gson
            System.out.println("Gson OK");

            GenshinData data = gson.fromJson(reader, GenshinData.class);        // Convertion json vers une classe java

            System.out.println("Version: " + data.version);             // Test simple d'affichage
            for (Character c : data.characters) {
                System.out.println(c.id + " || " + c.name + " || " + c.weapon + " || " + c.element[0] + " ||" + " (" + c.rarity + "*) || " + c.affiliation);
            }
        }else if (args[0].equals("weapon")){
            try { // Lecture du fichier json (obligation du try catch)
                reader = new FileReader("./json/Weapon.json");
            } catch (FileNotFoundException e) {
                System.err.println("Erreur : Le fichier Weapon.json est introuvable. Vérifie le chemin : " + e.getMessage());
            }
            Gson gson = new Gson();             // Initialisation du parsage avec Gson
            System.out.println("Gson OK");

            GenshinData data = gson.fromJson(reader, GenshinData.class);        // Convertion json vers une classe java

            System.out.println("Version: " + data.version);             // Test simple d'affichage
            for (Weapon w : data.weapon) {
                System.out.println(w.id + " || " + w.name + " || " + w.type + " || " + w.main_stat + " ||" + " (" + w.rarity + "*) || " + w.sources[0]);
            }
        }
	}
}