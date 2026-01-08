import java.util.ArrayList;
import java.util.List;

public class GestionFiltre{
    private List<String> listaffiliation = new ArrayList<>();
    private List<String> listarmes = new ArrayList<>();
    private List<String> listelements = new ArrayList<>();
    private List<Integer> listrarete = new ArrayList<>();

    public Boolean PersoOK(Character c){
        if (!AffiliationTest(c.affiliation)) return false;
        if (!WeaponTest(c.weapon)) return false;
        if (!ElementTest(c.element)) return false;
        if (!RarityTest(c.rarity)) return false;
        return true;
    }

    public void AddAffiliation(String affil){
        listaffiliation.add(affil);
    }

    public void AddArmes(String e){
        listarmes.add(e);
    }

    public void AddElement(String e){
        listelements.add(e);
    }

    public void AddRarete(int r){
        listrarete.add(r);
    }

    public void Vider(){
        listaffiliation.clear();
        listarmes.clear();
        listelements.clear();
        listrarete.clear();
    }

    public void removeAffiliation(String affil){
        listaffiliation.remove(affil);
    }

    public void removeArmes(String e){
        listarmes.remove(e);
    }

    public void removeElement(String e){
        listelements.remove(e);
    }
    
    public void removeRarete(int r){
        listrarete.remove(Integer.valueOf(r));
    }

    private Boolean AffiliationTest(String affil){
        if (this.listaffiliation.size() == 0){
            return true;
        }
        return (this.listaffiliation.contains(affil));
    }

    private Boolean WeaponTest(String armes){
        if (this.listarmes.size() == 0){
            return true;
        }
        return (this.listarmes.contains(armes));
    }

    private Boolean ElementTest(String[] element){
        if (this.listelements.size() == 0){
            return true;
        }
        for (String e : element){             // Boucle permettant d'enregistrer toutes les entrées des éléments d'un personnage
            return (this.listelements.contains(e));
        }
        return false;
    }

    private Boolean RarityTest(int rarity){
        if (this.listrarete.size() == 0){
            return true;
        }
        return (this.listrarete.contains(rarity));
    }
}