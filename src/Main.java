public class Main {
    public static void main(String[] args) {
        System.out.println("Задача 1");
        char clientOS = 1;
        if (clientOS == 1) {
            System.out.println("Установите версию приложения для Android по ссылке.");
        } else if (clientOS == 0) {
            System.out.println("Установите версию приложения для IOS по ссылке.");
        }
        System.out.println("Задача 2");
        int clientDiveceYear = 2015;
        if (clientDiveceYear == 2015 && clientOS == 1) {
            System.out.println("Установите приложение для Android по ссылке. Установите облегченную версию приложения для Android по ссылке.");
        } else if (clientDiveceYear == 2015 && clientOS == 0) {
            System.out.println("Установите приложение для IOS по ссылке. Устанвоите облегчённую версию приложения для IOS по ссылке.");
        } else if (clientOS == 1) {
            System.out.println("Установите приложение для Android.");
        } else {
            System.out.println("Установите приложение для IOS.");
        }
        System.out.println("Задача 3");
        int year = 2024;
        if ( year == 2024){
            System.out.println(year + " год является високостным.");
        } else if (year < 2020 || year > 2024){
            System.out.println(year + " год не является високостным.");
        }
        System.out.println("Задача 4");
        int deliveryDistance = 95;
        if (deliveryDistance < 20){
            System.out.println("Потребуется дней: 1");
        } else if (deliveryDistance > 20 && deliveryDistance < 60){
            System.out.println("Потребуется дней: 2");
        } else if (deliveryDistance > 60 && deliveryDistance < 100) {
            System.out.println("Потребуется дней: 3");
        }else {
            System.out.println("Доставки нет.");
        }
        System.out.println("Задача 5");
        int monthNumber = 12;
        switch (monthNumber) {
            case 1:
            case 2:
            case 13:
                System.out.println("Зима.");
                break;
            case 3:
            case 4:
            case 5:
                System.out.println("Весна.");
                break;
            case 6:
            case 7:
            case 8:
                System.out.println("Лето.");
                break;
            case 9:
            case 10:
            case 11:
                System.out.println("Осень.");
                break;
            default:
                System.out.println("Неизвестно какой сегодня месяц.");
        }

    }
}