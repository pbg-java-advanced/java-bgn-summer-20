import java.util.*;

public class Main {

    public static void main(String[] args) {
        //exampleList();
        //exampleArrayList();
        //exampleStack();
        //exampleQueue();

        ArrayList<Integer> names = new ArrayList<>();
        names.add(1);
        names.add(2);

        ArrayList<Integer> names1 = new ArrayList<>();
        names1.add(1);
        names1.add(2);

        System.out.println("Name: " + names);
        System.out.println("Names1: " + names1);

        names1.set(1, 3);
        System.out.println();

        System.out.println("Name: " + names);
        System.out.println("Names1: " + names1);
    }

    public static void exampleArrayList(){

        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(10);
        numbers.add(15);
        numbers.add(32);
        numbers.add(35);

        for (int i=0; i < numbers.size(); i++){
            System.out.println("Element on position: " + i + " is: " + numbers.get(i));
        }

        System.out.println(numbers);
        System.out.println(numbers.get(3));
        numbers.remove(2);
        System.out.println(numbers.get(2));
        System.out.println(numbers);
        numbers.add(2, 48);

        for (int i=0; i < numbers.size(); i++){
            System.out.println("Element on position: " + i + " is: " + numbers.get(i));
        }

    }

    public static void exampleList(){
        LinkedList<Integer> numbers = new LinkedList<>();
        numbers.add(5);
        numbers.add(14);
        numbers.add(20);
        numbers.add(0);

        for(int i=0; i < numbers.size(); i++){
            System.out.println("Element on position: " + i + " is: " + numbers.get(i));
        }

        numbers.set(1, 3);

        System.out.println(numbers.indexOf(20));
        numbers.remove(1);
        System.out.println(numbers.indexOf(20));

        System.out.println();
        for(int i=0; i < numbers.size(); i++){
            System.out.println("Element on position: " + i + " is: " + numbers.get(i));
        }

    }

    public static void exampleStack(){

        Stack<Integer> numbers = new Stack<>();
        numbers.push(10);
        numbers.push(35);
        numbers.push(32);

        System.out.println(numbers.toString());
        System.out.println(numbers.peek());
        System.out.println(numbers.pop());
        System.out.println(numbers.toString());
        System.out.println(numbers.pop());
        System.out.println(numbers.toString());

        System.out.println(numbers.search(10));
    }

    public static void exampleQueue(){

        Queue<Integer> numbers = new LinkedList<>();
        numbers.offer(5);
        numbers.offer(30);
        numbers.offer(32);
        numbers.offer(35);

        System.out.println(numbers.toString());
        System.out.println(numbers.poll());
        System.out.println(numbers.toString());

    }
}
