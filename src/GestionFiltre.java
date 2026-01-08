public class GestionFiltre{
    private String[] affiliation;
    private String[] armes;
    private String[] elements;
    private int[] rarete;

    public Boolean PersoOK(Character c){
        if (!AffiliationTest(c.affiliation)) return false;
        if (!WeaponTest(c.weapon)) return false;
        if (!ElementTest(c.element)) return false;
        if (!RarityTest(c.rarity)) return false;
        return true;
    }

    private Boolean AffiliationTest(String affil){
        return false;
    }

    private Boolean WeaponTest(String armes){
        return false;
    }

    private Boolean ElementTest(String[] element){
        for (String e : element){             // Boucle permettant d'enregistrer toutes les entrées des éléments d'un personnage
            if (filtre3.equals(e)){
                break;
            }
        }
    }

    private Boolean RarityTest(int rarity){
        return false;
    }
}