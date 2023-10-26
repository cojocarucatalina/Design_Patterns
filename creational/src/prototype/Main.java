package prototype;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args){

        List<Prototype> copii = new ArrayList<>();

        for (Prototype s : copii){
            copii.add(s.clone());
        }

    }
}
