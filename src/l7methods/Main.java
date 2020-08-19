public class Main {

    public static void main(String... args) {
        method(5, "MethodExample");
        int number = method1();
        number = method(20, "TestName");
        System.out.println("Number from main method: " + number);

        multipleVariablesMethod( 5, "TestName", "TestName1");

    }

    public static void multipleVariablesMethod( int number, String... name){
        for(int i=0;i<name.length;i++){
            System.out.println(name[i]);
        }
    }


    public static int method(int number, String name){
        System.out.println("Number from method: " + number);
        number = method1();
        return number;
    }

    public static int method1(){
        int number = 10;
        System.out.println("Number from method1: " + number);
        return number;
    }


}