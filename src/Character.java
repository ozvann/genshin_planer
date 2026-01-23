public class Character {
	String id;
	String name;
	String[] element;
	String weapon;
	String affiliation;
	int rarity;

	public String toString(){
		return this.id + " || " + this.name + " || " + this.weapon + " || " + this.element[0] + " ||" + " (" + this.rarity + "*) || " + this.affiliation;
	}
}
