# 7. Методи

## Презентации

* [Методи](https://docs.google.com/presentation/d/1Kq_p5I5QPulYe1NF6VgXq57QZwnnqrU5xqMcFwl_Sf0/edit#slide=id.p)

## Видео
* [Задачи с цикли](https://drive.google.com/file/d/1lONtl0zG_N4-OuVfS2184K8kVnjIbVnM/view?usp=sharing)

## Упражнения

Упр. 1. Следната програма рисува две кутии. Оптимизирайте я, така че да няма повторение на код. Първоначално може да създадем метод, който да рисува кутия. След това може да разбием нещата дори повече, като направим отделни методи за рисуването на хоризонтална черта и страничните черти.

```java
/**
 * A program that draws two boxes
 */
public class PrintBoxes {
    public static void main(String[] args) {
        System.out.println("+------+");
        System.out.println("|      |");
        System.out.println("|      |");
        System.out.println("+------+");
        System.out.println();
        System.out.println("+------+");
        System.out.println("|      |");
        System.out.println("|      |");
        System.out.println("+------+");
    }
}
```


### Упр. 2. 

Следната програма има десетина грешки. Копирайте в IntelliJ, коригирайте и изпълнете програмата.
~~~
public class LotsOf Errors {
    public static main(String args) {
        System.println(Hello, world!);
        message()
    }

    public static void message {
        System.out println("This program surely cannot ";
        System.out.println("have any "errors" in it");
    }
~~~

Очакван резултат:
~~~
Hello, world!
This program surely cannot 
have any "errors" in it
~~~


### Упр. 3. 
Проследете изпълнението на следния код и помислете какво ще се принтира на конзолата. След това изпълнете програмата и проверете предположението си.

```java
public class Tricky {
	public static void main(String[] args) {
		message1();
		message2();
		System.out.println("Done with main.");
	}

	public static void message1() {
		System.out.println("This is message1.");
	}

	public static void message2() {
		System.out.println("This is message2.");
		message1();
		System.out.println("Done with message2.");
	}
}
```

### Упр. 4. 
Проследете изпълнението на следния код и помислете какво ще се принтира на конзолата. След това изпълнете програмата и проверете предположението си.

```java
public class Strange {
	public static void main(String[] args) {
		first();
		third();
		second();
		third();
	}

	public static void first() {
		System.out.println("Inside first method.");
	}

	public static void second() {
		System.out.println("Inside second method.");
		first();
	}

	public static void third() {
		System.out.println("Inside third method.");
		first();
		second();
	}
}
```

### Упр. 5. 
Създайте метод, който да може да печата линии с различна дължина. Начертайте следната фигура с три последователни повиквания на метода:

~~~
*************
******
*************************
~~~


### Упр. 6. 
Създайте метод, наречен chant, който да печата скандирането “I am a great coder” определен брой пъти. Този брой да е входен параметър за метода. Извикайте този метод с параметър 5, след което принтирайте “I am the greatest coder”. 


### Упр. 7. 
Напишете метод, който да чертае правоъгълник по дадени  ширина и височина. Използвайте и методите от упр. 5.

~~~
******************
*                *
*                *
*                *
******************
~~~


### Упр. 8. 
Разгледайте следната програма и се опитайте да предскажете какво ще отпечата. Изпълнете я и проверете дали прогнозата и разбирането ви са правилни.

```java
/**
 * Illustrates parameter pass by value - changes to a parameter
 * variable inside the method are not visible outside the method.
 */
public class LocalChange {

    public static void main(String[] args) {
        int x = 5;
        modifier(x);
        System.out.println("x in the end of main is " + x);
    }

    public static void modifier(int x){
        x = 2 * x;
        System.out.println("x inside modifier is " + x);
    }

}
```


### Упр. 9. 
Следната програма има 9 грешки. Коригирайте ги, така че да постигнете желания резултат по-долу.

~~~
public class Oops3 {
    public static void main() {
        double bubble = 867.5309;
        double x = 10.01;
        printer(double x, double y);
        printer(x);
        printer("barack", "obama");
        System.out.println("z = " + z);
    }

    public static void printer(x, y double) {
        int z = 5;
        System.out.println("x = " + double x + " and y = " + y);
        System.out.println("The value from main is: " + bubble);
    }
}
~~~
~~~
Желан резултат:

x = 10.01 and y = 8.0
x = 10.01 and y = 867.5309
The value from main is: 867.5309
z = 5
~~~

### Упр. 10. 
Напишете метод с име printStrings, така че да приема низ и броя на повторенията като параметри и след това да напише низа дадения брой пъти. Например, извикването на метода със следните параметри:

~~~
printStrings(“abc”, 5);
~~~
ще принтира
~~~
abcabcabcabcabc
~~~


### Упр. 11 
Следната програма има няколко грешки. Коригирайте ги така, че тя да работи правилно и да произведе очаквания резултат по-долу:

```java
public class Temperature {
    public static void main(String[] args) {
        double tempf = 98.6;
        double tempc = 0.0;
        ftoc(tempf, tempc);
        System.out.println("Body temp in C is: " + tempc);
    }

    // converts Fahrenheit temperatures to Celsius
    public static void ftoc(double tempf, double tempc) {
        tempc = (tempf - 32) * 5 / 9;
    }
}
```

Очакван резултат:
~~~
Body temp in C is: 37.0
~~~

### Упр. 12. 
Напишете програма, която да чете име от конзолата и да отговаря с “Hello, name”. Направете програмата да се връща отново в начално състояние след като е поздравила и отново да пита за име. Нека прави това безброй пъти, или докато е прекъсната от бутона “Стоп” в IntelliJ. Използвайте метод, който да получава името като параметър и да принтира поздрава. Може да създадете безкраен цикъл, като го декларирате така:

~~~
for(;;){
  ...
}
~~~

Примерен диалог с потребителя:
~~~
Please enter a name: John
Hello, John!
Please enter a name: Jane
Hello, Jane!
Please enter a name: Kathy
Hello, Kathy!
~~~

### Упр. 13. 
Напишете метод, който да повтаря даден низ определен брой пъти:
~~~
public static void repeat( String s, int count );
~~~
Например repeat( “*”, 10 ) ще начертае линия с десет звездички:
~~~
**********
~~~
Използвайте този метод и напишете програма, която да чертае следното:

![](box.png)


### Упр. 14. 
Разгледай следната програма и се опитай да я разбереш в детайли. Тя демонстрира връщането на стойност с различни типове от методи.

```java
/**
 * Illustrates methods returning values.
 */
public class Demo_5 {
    public static void main(String[] args) {

        System.out.print("The hypotenuse of a triangle with legs 5 and 6 is ");
        System.out.println(hypotenuse(5, 6));

        System.out.print("60 degrees Fahrenheit is equal to ");
        System.out.print(fToC(60));
        System.out.println(" Celsius");

        System.out.print("2 to the power of 10 is ");
        System.out.println(power2(10 ));
    }

    public static double hypotenuse(int a, int b) {
        double c = Math.sqrt(a * a + b * b);
        return c;
    }

    public static double fToC(double degreesF) {
        // note form:  return expression
        return 5.0 / 9.0 * (degreesF - 32);          
    }

    public static int power2(int p){
        // without casting (int) we get error
        return (int) Math.pow(2, p);    
    }
}
```

