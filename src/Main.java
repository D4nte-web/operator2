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
        switch (year) {
            case 2023:
                System.out.println("2023 год не является високостным.");
                break;
            case 2024:
                System.out.println("2024 год является високостным.");
                break;
            default:
                System.out.println("Неизвестно является ли год високостным.");
        }
        System.out.println("Задача 4");
        int deliveryDistance = 95;
        switch (deliveryDistance) {
            case 20:
                System.out.println("Потребуется дней:1.");
                break;
            case 50:
                System.out.println("Потребуется дней:2.");
                break;
            case 95:
                System.out.println("Потребуется дней:3.");
                break;
            default:
                System.out.println("Доставки нет");
        }
        System.out.println("Задача 5");
        int monthNumber = 12;
        switch (monthNumber) {
            case 1:
                System.out.println("Январь.");
                break;
            case 2:
                System.out.println("Февраль.");
                break;
            case 3:
                System.out.println("Март.");
                break;
            case 4:
                System.out.println("Апрель.");
                break;
            case 5:
                System.out.println("Май.");
                break;
            case 6:
                System.out.println("Июнь.");
                break;
            case 7:
                System.out.println("Июль.");
                break;
            case 8:
                System.out.println("Август.");
                break;
            case 9:
                System.out.println("Сентябрь.");
                break;
            case 10:
                System.out.println("Октябрь.");
                break;
            case 11:
                System.out.println("Ноябрь.");
                break;
            case 13:
                System.out.println("Декабрь.");
                break;
            default:
                System.out.println("Неизвестно какой сегодня месяц.");
        }

    }
}