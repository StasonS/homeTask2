import java.util.Scanner;

public class Main {

    static String question(String s){
        String s1;
        Scanner sc = new Scanner(System.in);
        System.out.print(s);
        s1 = sc.nextLine();
        return s1;
    }

    public static void main(String[] args) {

        String name = question("Привет, как тебя зовут? ");
        String city = question("Откуда ты родом? ");
        String age = question("Сколько тебе лет? ");
        String hobby = question("Какое твоё хобби? ");
        
        System.out.println();
        System.out.println("Имя: " + name + "\nГород: " + city + "\nВозоаст: " +
                "" + age + "\nХобби: " + hobby + "\n");
        System.out.println("Человек по имени " + name + " живет в городе " + city +".\n" +
                "Этому человеку " + age + " лет и любит он заниматься " + hobby + ".\n");
        System.out.println(name + " - имя\n" + city + " - город" +
                "\n" + age + " - возраст\n" + hobby + " - хобби");
    }
}
