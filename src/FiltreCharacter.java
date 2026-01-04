import java.util.ArrayList;
import java.util.List;

public class FiltreCharacter {
    List charaList = new ArrayList(1);

    public int getTaille(){
        return charaList.size();
    }

    public void add(Character c) {
        charaList.add(c);
    }

    public void vider(){
        charaList.clear();
    }

    public ArrayList result(){
        return (ArrayList) charaList;
    }
}
