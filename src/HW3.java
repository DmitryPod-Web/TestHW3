import java.util.Scanner;

public class HW3 {
    public static void main(String[] args) {

        //        1 Написать программу, чтобы она:
//        - выводил на экран строку "Число меньше 5", если число, которое мы ей подадим меньше 5,
//                - выводил строку "Число больше 5", если число, которое мы ей подадим больше 5,
//                - выводил строку "Число равно 5", если число, которое мы ей подадим равен 5.

        System.out.println("Введите число, что бы узнать оно больше, меньше или равно 5.");

        Scanner input = new Scanner(System.in);

        int digit = input.nextInt();

        if (digit == 5) {
            System.out.println("Число равно 5");
        } else if (digit < 5) {
            System.out.println("Число меньше 5");
        } else if (digit > 5) {
            System.out.println("Число больше 5");
        }


//        2 Напиши программу. которая будет проверять попало ли целое число, которое мы ей подадим
//        в интервал от 50 до 100 и сообщить результат на экран в следующем виде:
//        "Число number не содержится в интервале." или "Число number содержится в интервале.", где number - число, которое мы ей подадим.


        System.out.println("Введите целое число:");

        Scanner scanner = new Scanner(System.in);

        int aq = scanner.nextInt();

        if (aq <= 100 && aq >= 50) {
            System.out.println("Число " + aq + " содержится в интервале");
        } else {
            System.out.println("Число " + aq + " не содержится в интервале");
        }


//        3 Напиши программу, которая по номеру месяца должна определить время года (зима, весна, лето, осень) и вывести на экран.
//
//        Пример для номера месяца 2:
//        зима
//
//        Пример для номера месяца 5:
//        весна

//        Январь Февраль Март Апрель Май Июнь Июль Август Сентябрь Октябрь Ноябрь Декабрь
//        int January = 1; int february = 2; int december = 12;
//        int March = 3; int April = 4; int May = 5;
//        int June = 6; int July = 7; int August = 8;
//        int September = 9; int October = 10; int November = 11;

        System.out.println("6 месяц это:");

        int month_number = 6;

        if (month_number == 1 || month_number == 2 || month_number == 12) {
            System.out.println("Зима");
        } else if (month_number == 3 || month_number == 4 || month_number == 5) {
            System.out.println("Весна");
        } else if (month_number == 6 || month_number == 7 || month_number == 8) {
            System.out.println("Лето");
        } else if (month_number == 9 || month_number == 10 || month_number == 11) {
            System.out.println("Осень");
        } else {
            System.out.println("Нет такого времени года!");
        }

//        ИЛИ
        System.out.println("12 месяц это:");

        int month_number1 = 12;

        switch (month_number1) {
            case (1):
                System.out.println("Зима");
                break;
            case (2):
                System.out.println("Зима");
                break;
            case (3):
                System.out.println("Весна");
                break;
            case (4):
                System.out.println("Весна");
                break;
            case (5):
                System.out.println("Весна");
                break;
            case (6):
                System.out.println("Лето");
                break;
            case (7):
                System.out.println("Лето");
                break;
            case (8):
                System.out.println("Лето");
                break;
            case (9):
                System.out.println("Осень");
                break;
            case (10):
                System.out.println("Осень");
                break;
            case (11):
                System.out.println("Осень");
                break;
            case (12):
                System.out.println("Зима");
                break;
            default:
                System.out.println("Нет такого времени года!");
                break;
        }

//        ИЛИ

        System.out.println("Введите номер месяца:");

        Scanner month_number2 = new Scanner(System.in);

        int nom = month_number2.nextInt();

        if (nom <= 3 && nom >= 1 || nom == 12) {
            System.out.println("Зима");
        } else if (nom <= 5 && nom >= 3) {
            System.out.println("Весна");
        } else if (nom <= 8 && nom >= 6) {
            System.out.println("Лето");
        } else if (nom <= 11 && nom >= 9) {
            System.out.println("Осень");
        } else {
            System.out.println("Такого времени года нет.");
        }

//        4
//        Написать программу, которая будет проверять число, которое мы подадим ей.
//                Если число положительное, то увеличить его в два раза.
//                Если число отрицательное, то прибавить единицу.
//        Если введенное число равно нулю, необходимо вывести ноль.
//        Вывести результат в консоль.

        System.out.println("Введите число для проверки:");

        Scanner numericValue = new Scanner(System.in);

        int number = numericValue.nextInt();

        if (number > 0) {
            System.out.println(number * 2);
        } else if (number < 0) {
            System.out.println(number + 1);
        } else if (number == 0) {
            System.out.println(0);
        }



//        6
//        Написать программу, которая, в зависимости от того числа, которое мы ей подадим (год)
//                , будет определять количество дней в году. Результат вывести на экран в следующем виде:
//        количество дней в этом году: x
//                , где
//        х - 366 для високосного года,
//                х - 365 для обычного года.
//
//
//                Подсказка:
//        В високосном году - 366 дней, тогда как в обычном - 365.
//        1) если год делится без остатка на 400 это високосный год;
//        2) в оставшихся годах после этого, если год делится без остатка на 100, то это обычный год;
//        3) в оставшихся годах после этого, если год делится без остатка на 4, то это високосный год;
//        4) все оставшиеся года невисокосные.
//        Так, годы 1700, 1800 и 1900 не являются високосными, так как они кратны 100 и не кратны 400.
//        Годы 1600 и 2000 - високосные, так как они кратны 100 и кратны 400.
//        Годы 2100, 2200 и 2300 - не високосные.

        System.out.println("Введите год:");

        Scanner yearNumber = new Scanner(System.in);
        int year = yearNumber.nextInt();

        if (year % 400 == 0 || (year % 400 != 0 && year % 100 != 0 && year % 4 == 0)) {
            System.out.println("Год високосный.");
        } else {
            System.out.println("Год не високосный.");
        }

//        7
//        Объявить три переменных (a, b, c) - стороны предполагаемого треугольника.
//        Определить возможность существования треугольника по сторонам.
//        Результат вывести на экран в следующем виде:
//        "Треугольник существует." - если треугольник с такими сторонами существует.
//                "Треугольник не существует." - если треугольник с такими сторонами не существует.
//
//
//        Подсказка:
//        Треугольник существует только тогда, когда сумма двух его сторон больше третьей.
//        Требуется сравнить каждую сторону с суммой двух других.
//        Если хотя бы в одном случае сторона окажется больше либо равна сумме двух других,
//        то треугольника с такими сторонами не существует.

        Scanner scannerA = new Scanner(System.in);
        Scanner scannerB = new Scanner(System.in);
        Scanner scannerC = new Scanner(System.in);

        System.out.println("Введите сторону A");
        int longA = scannerA.nextInt();
        System.out.println("Введите сторону В");
        int longB = scannerB.nextInt();
        System.out.println("Введите сторону С");
        int longC = scannerC.nextInt();

        if ((longA + longB > longC) && (longB + longC > longA) && (longA + longC > longB)) {
            System.out.println("Треугольник существует!");
        } else {
            System.out.println("Треугольник не существует!");
        }



//        8
//        Работа светофора для пешеходов запрограммирована следующим образом:
//        в начале каждого часа в течение трех минут горит зелёный сигнал,
//                затем в течение одной минуты - жёлтый,
//                а потом в течение одной минуты - красный,
//                затем опять зелёный горит три минуты и т. д.
//                Подать программе вещественное число t, означающее время в минутах, прошедшее с начала очередного часа.
//        Определить, сигнал какого цвета горит для пешеходов в этот момент.
//        Результат вывести на экран в следующем виде:
//        "зелёный" - если горит зелёный цвет,
//                "жёлтый" - если горит жёлтый цвет,
//                "красный" - если горит красный цвет.
//
//                Пример для числа 2.5:
//        зелёный
//
//        Пример для числа 3:
//        жёлтый
//
//        Пример для числа 4:
//        красный
//
//        Пример для числа 5:
//        зелёный



        System.out.println("Введите минуты на часах:");

        Scanner minute = new Scanner(System.in);


        double timeOnTheClock = minute.nextDouble();

        double splitting = timeOnTheClock % 5;

        if (timeOnTheClock < 3) {
            System.out.println("Зеленый");
        } else if (timeOnTheClock < 4) {
            System.out.println("Желтый");
        } else {
            System.out.println("Красный");
        }
    }
}
