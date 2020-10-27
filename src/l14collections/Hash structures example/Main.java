import java.util.*;

public class Main {
    public static void main(String[] args) {
        Person p1 = new Person("Ivan1", "Ivanov", 25);
        Person p2 = new Person("Ivan2", "Ivanov", 27);
        //Person p2 = p1;

        //System.out.println("The p1 hashCode is: " + p1.hashCode());
        //System.out.println("The p2 hashCode is: " + p2.hashCode());

        //System.out.println(p1.equals(p2));

        String name1 = new String("test");
        String name2 = new String("test");

        //System.out.println(name1.equals(name2));
//
//        System.out.println(name1.hashCode());
//        System.out.println(name2.hashCode());

        Person p3 = new Person("Ivan3", "Ivanov", 27);

        HashMap<Person, String> mapOfUsers = new HashMap<>();
        mapOfUsers.put(p1, "Person 1");
        mapOfUsers.put(p2, "Person 2");
        mapOfUsers.put(p3, "Person 3");

        //mapOfUsers.remove(p2);

        //System.out.println("User: " + mapOfUsers.get(p3));
        //System.out.println("Size of the map: " + mapOfUsers.size());

        HashMap<Integer, String> mapOfUsersByIndex = new HashMap<>();
        mapOfUsersByIndex.put(1, "User 1");
        mapOfUsersByIndex.put(2, "User 2");
        mapOfUsersByIndex.put(1, "User 3");

        //System.out.println("User: " + mapOfUsersByIndex.get(1));

        for(Integer key : mapOfUsersByIndex.keySet()){
            System.out.println("Key: " + key);
        }
        for(String value: mapOfUsersByIndex.values()){
            System.out.println("Value: " + value);
        }
        for(Map.Entry<Integer, String> entry: mapOfUsersByIndex.entrySet()){

            if(entry.getKey().equals(new Integer(1))){
                System.out.println(entry.getValue());
            }

        }

        //showForEachLoop();

        // Create a HashSet
        HashSet<Integer> hs = new HashSet<>();

        // add elements to HashSet
        hs.add(1);
        hs.add(2);
        hs.add(3);
        hs.add(4);

        // Duplicate removed
        hs.add(4);

        // Displaying HashSet elements
        for (Integer temp : hs) {
          //  System.out.print(temp + " ");
        }
    }

    public static void showForEachLoop(){

        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(138);
        numbers.add(543);
        numbers.add(4938);

        for(int i=0; i<numbers.size(); i++){
        }
        /*
        while(true){
        }*/

        Person p = new Person("Ivan", "Ivanov", 25);
        LinkedList<Person> people = new LinkedList<>();
        people.add(p);

        for(Integer number: numbers){
            System.out.println("Number: " + number);
        }

        for(Person person:people){
            System.out.println(person.getFirstName() + " " + person.getFamilyName());
        }


    }


}
