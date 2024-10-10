import java.util.Scanner;

public class test {
    public static void main(String[] args) {
        System.out.println("Введите минуты на часах:");

        Scanner minute = new Scanner(System.in);


        double timeOnTheClock = minute.nextDouble();

        double splitting = timeOnTheClock % 5;

        if (splitting < 3) {
            System.out.println("Зеленый");
        } else if (splitting < 4) {
            System.out.println("Желтый");
        } else {
            System.out.println("Красный");
        }

    }
}
