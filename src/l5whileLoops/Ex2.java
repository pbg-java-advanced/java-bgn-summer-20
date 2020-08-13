package l5whileLoops;

import java.util.Iterator;

public class Ex2 {
    public static void main(String[] args) {
        int n = 10;

        int i = 1;
        while(i <= n){
            System.out.println(i);
            i++;
        }


        for (i = 1; i <= n; i++) {
            System.out.println(i);
        }
    }
}
