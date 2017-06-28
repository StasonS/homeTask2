import java.util.Scanner;

public class Main {

    static String strQuestion(String s){
        Scanner sc = new Scanner(System.in);
        System.out.print(s);
        s = sc.nextLine();
        return s;
    }

    static Integer intQuestion(String s){
        Scanner sc = new Scanner(System.in);
        int s1;
        System.out.print(s);
        try {
            s1 = sc.nextInt();
        }
        catch (Exception e){
            System.out.println("Введи возраст в виде целого числа");
            s1 = intQuestion(s);
        }
        return s1;
    }

    static void output(String name, String city, int age, String hobby){
        System.out.println();
//        Вариант 1 (табличный):
        System.out.println("Имя: " + name + "\nГород: " + city + "\nВозоаст: " +
                "" + age + "\nХобби: " + hobby + "\n");
//        Вариант 2 (текстовый):
        System.out.println("Человек по имени " + name + " живет в городе " + city +".\n" +
                "Этому человеку " + age + " лет и любит он заниматься " + hobby + ".\n");
//        Вариант 3 (иной):
        System.out.println(name + " - имя\n" + city + " - город" +
                "\n" + age + " - возраст\n" + hobby + " - хобби");
    }

    public static void main(String[] args) {

        output(strQuestion("Привет, как тебя зовут? "),
                strQuestion("Откуда ты родом? "),
                intQuestion("Сколько тебе лет? "),
                strQuestion("Какое твоё хобби? "));
    }
}
