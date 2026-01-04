import java.util.ArrayList;
import java.util.List;

public class FiltreCharacter {
    private List<Character> charaList = new ArrayList<>();

    public int getTaille(){
        return charaList.size();
    }

    public void add(Character c) {
        charaList.add(c);
    }

    public void vider(){
        charaList.clear();
    }

    public List<Character> result(){
        return charaList;
    }
}
