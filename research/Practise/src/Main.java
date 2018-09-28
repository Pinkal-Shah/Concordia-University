import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class Main {
    public static void main(String[] args){
        Reducer obj = new Reducer<Integer, Integer>();
        List<Integer> abc = new LinkedList<Integer>();
        abc.add(new Integer(2));
        abc.add(new Integer(3));

        obj.reduce(new Integer(5), abc);
    }
}
