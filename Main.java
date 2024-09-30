import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введіть ціле число:");
        int integerValue = scanner.nextInt();

        System.out.println("Введіть число з плаваючою точкою:");
        double doubleValue = scanner.nextDouble();

        System.out.println("Введіть строку:");
        String stringValue = scanner.next();

        System.out.println("Введіть логічне значення (true або false):");
        boolean booleanValue = scanner.nextBoolean();

        System.out.println("\nВиведення даних у різних форматах:");

        System.out.printf("Ціле число (десятковий формат): %d%n", integerValue);

        System.out.printf("Ціле число (шістнадцятковий формат): %x%n", integerValue);

        System.out.printf("Ціле число (вісімковий формат): %o%n", integerValue);

        System.out.printf("Число з плаваючою точкою (2 знаки після коми): %.2f%n", doubleValue);

        System.out.printf("Число з плаваючою точкою (експоненціальний формат): %e%n", doubleValue);

        System.out.printf("Логічне значення: %b%n", booleanValue);

        System.out.printf("Строка: %s%n", stringValue);

        System.out.printf("Строка (перші 10 символів): %.10s%n", stringValue);

        System.out.printf("Строка у полі шириною 15 символів: %15s%n", stringValue);

        System.out.printf("Строка у полі шириною 15 символів (вирівняна вліво): %-15s%n", stringValue);

        scanner.close();
    }
}
