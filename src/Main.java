public class Main {
    public static void main(String[] args) {
        //task 1
        int iOS = 0;
        if (iOS == 0) {
            System.out.println("Установите версию приложения для iOS по ссылке ");
        } else if (iOS == 1) {
            System.out.println("Установите версию приложения для Android по ссылке ");
        } else {
            System.out.println("Ваша iOS не поддерживается ");
        }
        //task 2
        int year = 2015;
        if (iOS == 0) {
            if (year < 2015) {
                System.out.println("Устоновите облегченную версию приложения для iOS по ссылке ");
            } else {
                System.out.println("Установите версию приложения для iOS по ссылке ");
            }
        } else if (iOS == 1) {
            if (year < 2015) {
                System.out.println("Устоновите облегченную версию приложения для Android по ссылке ");
            } else {
                System.out.println("Установите версию приложения для Android по ссылке ");
            }
        } else {
            System.out.println("Ваша iOS не поддерживается ");
        }
        //task 3
        year = 2021;
        if (year >= 1584 && (year % 4 == 0 && year % 100 != 0 || (year & 400) == 0)) {
            System.out.println(+year + " является высокосным ");
        } else {
            System.out.println(+year + " невысокосный год ");
        }
        //task 4
        int days = 0;
        int distance = 47;
        if (distance < 20) {
            days = 1;
        } else if (distance < 60) {
            days = 2;
        } else if (days < 100) {
            days = 3;
        } else {
            days = -1;
        }
        if (days >= 0) {
            System.out.println("доставка займет " + days + " дней ");
        } else {
            System.out.println(" доставка нет ");
        }

        //task 5
        int monthNumber = 11;
        switch (monthNumber) {
            case 12:
            case 1:
            case 2:
                System.out.println(" зима ");
                break;
            case 3:
            case 4:
            case 5:
                System.out.println(" весна ");
                break;
            case 6:
            case 7:
            case 8:
                System.out.println(" лето ");
                break;
            case 9:
            case 10:
            case 11:
                System.out.println(" осень ");
                break;
            default:
                System.out.println(" такого месяца нет ");
        }
    }
}