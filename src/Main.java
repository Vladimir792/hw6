public class Main {
    public static void main(String[] args) {
        System.out.println("Задача 1:");
        for (int i = 1; i <= 10; i++) {
            System.out.print(i);
        }
        System.out.println();

        System.out.println("Задача 2:");
        for (int i = 10; i >= 1; i--) {
            System.out.print(i);
        }
        System.out.println();

        System.out.println("Задача 3:");
        for (int i = 0; i <= 17; i += 2) {
            System.out.print(i);
        }
        System.out.println();

        System.out.println("Задача 4:");
        for (int i = 10; i >= -10; i--) {
            System.out.print(i);
        }
        System.out.println();

        System.out.println("Задача 5:");
        for (int year = 1904; year <= 2096; year += 4) {
            System.out.println(year + " год является високосным");
        }

        System.out.println("Задача 6:");
        for (int i = 7; i <= 98; i += 7) {
            System.out.print(i);
        }
        System.out.println();

        System.out.println("Задача 7:");
        int num = 1;
        for (int i = 0; i < 10; i++) {
            System.out.print(num);
            num *= 2;
        }
        System.out.println();

        System.out.println("Задача 8:");
        int monthlySavings = 29000;
        int totalSavings = 0;
        for (int month = 1; month <= 12; month++) {
            totalSavings += monthlySavings;
            System.out.println("Месяц " + month + ", сумма накоплений равна " + totalSavings + " рублей.");
        }

        System.out.println("Задача 9:");
        double savingsWithInterest = 0;
        double interestRate = 0.01;
        for (int month = 1; month <= 12; month++) {
            savingsWithInterest += monthlySavings;
            savingsWithInterest += savingsWithInterest * interestRate;
            System.out.printf("Месяц %d, сумма накоплений равна %.2f рублей.", month, savingsWithInterest);
        }

        System.out.println("Задача 10:");
        for (int i = 1; i <= 10; i++) {
            System.out.println("2 * " + i + " = " + (i * 2));
        }
    }
}