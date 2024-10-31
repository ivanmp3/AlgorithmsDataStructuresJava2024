package util;

import java.util.Scanner;

public class GetInput {
    private static Scanner scanner;

    public GetInput() {
        scanner = new Scanner(System.in);
    }

    // Этот метод принимает количество знаков в числе и проверяет ввод на корректность
    public static int getInput(int digits) {
        String input;
        String regex = "\\d{" + digits + "}";  // Регулярное выражение для нужного количества цифр

        while (true) {
            System.out.print("Введите " + digits + "-значное число: ");
            input = scanner.nextLine().trim();

            // Проверка: строка должна содержать нужное количество цифр
            if (input.matches(regex)) {
                return Integer.parseInt(input);  // Преобразуем строку в число
            } else {
                System.out.println("Ошибка: введите корректное " + digits + "-значное число.");
            }
        }
    }

    public void closeScanner() {
        scanner.close();
    }
}

