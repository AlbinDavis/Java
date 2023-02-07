package problems.programs;

import java.util.ArrayList;
import java.util.List;

public class MyList extends ArrayList {


    public <T> MyList(List<T> asList) {
        for(T i:asList){
            this.add((int)i);
        }
    }

    public Object get(int i){
        return i+3;
    }
}
