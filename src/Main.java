import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.Reader;
import com.google.gson.Gson;


// Both Pour complier (a la racine du projet) : javac -cp "./lib/gson-2.13.1.jar" src/*.java

// Window Pour executer (a la racine du projet) : java -cp "./lib/gson-2.13.1.jar;src" Main

// Linux Pour executer (a la racine du projet) : java -cp "./lib/gson-2.13.1.jar:src" Main


public class Main {
    public static void main(String[] args) {
        String filtre = "mondstadt", filtre1 = "otherworld", filtre2 = "sword", filtre3 = "pyro", filtre4 = "claymore";
        Reader reader = null;

        FiltreCharacter tabfiltre = new FiltreCharacter();

        try { // Lecture du fichier json (obligation du try catch)
            reader = new FileReader("./json/Character.json");
        } catch (FileNotFoundException e) {
            System.err.println("Erreur : Le fichier Character.json est introuvable. Vérifie le chemin : " + e.getMessage());
        }

        Gson gson = new Gson();             // Initialisation du parsage avec Gson

        GenshinData data = gson.fromJson(reader, GenshinData.class);        // Convertion json vers une classe java

        System.out.println("Version: " + data.version);
        
        // for (Character c : data.characters) {
        //     if ((filtre.equals(c.affiliation) || filtre1.equals(c.affiliation)) && (filtre2.equals(c.weapon) || filtre4.equals(c.weapon)) && c.rarity == 5) {
        //         for (String e : c.element){             // Boucle permettant d'enregistrer toutes les entrées des éléments d'un personnage
        //             if (filtre3.equals(e)){
        //                 tabfiltre.add(c);
        //                 break;
        //             }
        //         }
        //     }
        // }

        GestionFiltre persook = new GestionFiltre(affiliations, armes, elements, rarete);

        for (Character c : data.characters) {
            if (persook.PersoOK(c) == true){
                tabfiltre.add(c);
            }
        }
        System.out.println(tabfiltre.result());
    }
}