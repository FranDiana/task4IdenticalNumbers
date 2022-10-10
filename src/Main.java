
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Integer> first  = new ArrayList<Integer>();
        ArrayList<Integer> second = new ArrayList<Integer>();

        first.add(36);
        first.add(30);
        first.add(-12);
        first.add(42);
        first.add(92);


        second.add(-12);
        second.add(89);
        second.add(52);
        second.add(42);
        second.add(92);

        second.retainAll(first);
        System.out.println(second);
    }


}