import java.util.ArrayList;
import java.util.List;

public class FiltreWeapon {
	private List<Weapon> weaponList = new ArrayList<>();
	
	public int getTaille(){
		return weaponList.size();
	}

	public void add(Weapon w) {
		weaponList.add(w);
	}

	public void vider(){
		weaponList.clear();
	}

	public List<Weapon> result(){
		return weaponList;
	}
}
