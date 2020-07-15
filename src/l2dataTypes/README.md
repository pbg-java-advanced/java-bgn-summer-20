# Типове данни и променливи

## Презентации
[Типове данни и променливи](https://docs.google.com/presentation/d/1sHa3g6Or_UHYSlhBxg986pWfGbtlv23viwd_EtTdW3A/edit?usp=sharing)

## Видео
* [Типове данни 1 15.07.2020](https://youtu.be/uQmoKrsGwcI)
## Упражнения

### Упр. 1
Прегледайте Demo_1, Demo_2, Demo_3, Demo_4 и Demo_8 и помислете за всяка линия защо произвежда резултата. Прегледайте презентацията и записките си за да си припомните правилата за извършване на аритметични операции и за превръщане на типовете.

### Упр. 2
Напишете програма, която да изчислява дължината на окръжност с радиус 2.3. Формулата, която трябва да приложите е 2𝜋r, където r е радиусът, а 𝜋 е числото пи, приблизително равно на 3.14. Може вместо стойността 3.14 да използвате Math.PI. Math е системен клас от библиотеката на Java и съдържа константата 𝜋 с по-голяма прецизност.

### Упр. 3
Напишете програма, която да превръща градуси по Целзий в градуси по Фаренхайт. Потребителя въвежда температурата по Целзий и програмата принтира температурата по Фаренхайт. Потърсете на Гугъл формулата за превръщането. Може да използвате например следното търсене: formula to convert celsius to fahrenheit. Demo_9 и Demo_10 могат да ви припомнят как се въвеждат данни от конзолата.

### Упр. 4
Напишете програма, която да прочете от конзолата последователно първо дължината, а след това ширината на правоъгълник. След това програмата изчислява лицето на правоъгълника и го принтира на екрана.

### Упр. 5

Следната програма има 9 грешки. 

~~~
public class Oops2 {
    public static void main(String[] args) {
        int x;
        System.out.println("x is " x);

        int x = 15.2;   // set x to 15.2
        System.out.println("x is now + x");

        int y;   // set y to 1 more than x
        y = int x + 1;
        System.out.println("x and y are " + x + and + y);
    }
}
~~~
Коригирайте грешките, така че програмата да принтира следното:
~~~
x is 0
x is now 15
x and y are 15 and 16
~~~

### Упр. 6
Следната програма има излишни повторения. Коригирайте програмата така, че да използва четири променливи. 
```java
public class ComputePay {
    public static void main(String[] args) {
        // Calculate pay at work based on hours worked each day
        System.out.println("My total hours worked:");
        System.out.println(4 + 5 + 8 + 4);

        System.out.println("My hourly salary:");
        System.out.println("$8.75");

        System.out.println("My total pay:");
        System.out.println((4 + 5 + 8 + 4) * 8.75);

        System.out.println("My taxes owed:"); // 20% tax
        System.out.println((4 + 5 + 8 + 4) * 8.75 * 0.20);
    }
}
```

### Упр. 7
Направете следния [онлайн тест](https://docs.google.com/forms/d/e/1FAIpQLSfIqqrsFhmklRvKAsvD87x0dLHi4UYj3wRR5j1YPkHtw89v6A/viewform):


### 8
Напишете програма, която дефинира две променливи. След това разменете стойностите на двете променливи. Тя трябва да изглежда приблизително така:
~~~
int a1 = 3;
int a2 = 5;
System.out.println("a1 = " + a1 + ", a2 = " + a2);

// Your code goes here

System.out.println("a1 = " + a1 + ", a2 = " + a2);
~~~
Програмата трябва да печата:
~~~
а1 = 3, а2 = 5
а1 = 5, а2 = 3
~~~
