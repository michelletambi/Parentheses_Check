import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class Main {
    public static void main(String[] args) {
        LinkedList<String> allMethodsAvailable = new LinkedList<>();

        List<String> listMethodsOnly = allMethodsAvailable;

        Queue<String> queueMethodsOnly = allMethodsAvailable;

        System.out.println(allMethodsAvailable);
        System.out.println(listMethodsOnly);
        System.out.println(queueMethodsOnly);

        allMethodsAvailable.add("a test");

        System.out.println(allMethodsAvailable);
        System.out.println(listMethodsOnly);
        System.out.println(queueMethodsOnly);
    }
}
