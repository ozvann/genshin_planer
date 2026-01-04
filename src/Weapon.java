public class Weapon {
    String id;
    String name;
    String type;
    String main_stat;
    String[] sources;
    int rarity;

    public String toString(){
        return this.id + " || " + this.name + " || " + this.type + " || " + this.main_stat + " ||" + "|| " + this.sources[0] + " || " + " (" + this.rarity + "*)";
    }
}
