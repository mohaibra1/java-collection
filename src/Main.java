import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.ListIterator;
import java.util.Set;
import java.util.Stack;
import java.util.TreeSet;

public class Main{


    public static void main(String[] args) {

        Stack<Integer> stack = new Stack<>();

        stack.push(2);
        stack.push(3);
        stack.push(4);
        
        Set<String> set = new TreeSet<>();    
       
        String[] str = {"Love", "Joke", "Hence", "You", "You","Hence","Joke"};
         ArrayList<String> arr = new ArrayList<>(Arrays.asList(str));

         arr.stream().map(s -> set.add(s))
         .forEach(System.out::println);

         set.stream().map(s -> s + " ")
         .forEach(System.out::print);
         System.out.println();

        LinkedHashSet<String> linkedHashSet = new LinkedHashSet<>();

        arr.stream().map(s -> linkedHashSet.add(s))
        .forEach(System.out::print);
        System.out.println();
        linkedHashSet.stream().map(s -> s + " ")
        .forEach(System.out::print);
        System.out.println();


        
        System.out.println(stack.pop() + " " + stack.pop() + " " + stack.peek());
    }
}