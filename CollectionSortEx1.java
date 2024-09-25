
import java.util.ArrayList;
import java.util.Collections;


public class CollectionSortEx1 {
    public static void main(String[] args) {
        ArrayList <String> list1 = new ArrayList <String>();
        list1.add("TT");
        list1.add("SS");
        list1.add("RR");
        list1.add("BB");
        list1.add("AA");
        list1.add("CC");

        System.out.println(list1);

        Collections.sort(list1);
        System.out.println("List after Collection.sort(list1):\n"+list1);

        Collections.sort(list1, Collections.reverseOrder());
        System.out.println("List after Collection.sort and reverseOrder():\n"+list1);
    }
}
