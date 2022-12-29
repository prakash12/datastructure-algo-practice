package collectionspoc;

import java.util.ArrayList;
import java.util.List;

public class ListApiPoc {
    public static void main(String[] args) {
        List<Integer> li = new ArrayList<>();
        for(int i=0;i<11;i++) li.add(i);
        System.out.println("li element:"+li);
        li.add(1,50);
        System.out.println("li element:"+li);
    }
}
