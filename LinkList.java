import java.util.Collections;
import java.util.LinkedList;

 

public class LinkList{

 

    public static void main(String[] args) {

 

        LinkedList<String> data = new LinkedList<String>();
        data.add("Ganga");
        data.add("Narmada");
        data.add("Yamuna");

 

        System.out.println("List : " + data);
        System.out.println();

 

        Collections.reverse(data);
        System.out.println("Reverse List : " + data);
    }

 

}