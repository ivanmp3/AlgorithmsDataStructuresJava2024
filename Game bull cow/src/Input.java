import java.util.Scanner;

public class Input {
    private Scanner scanner;

    public Input() {
        scanner = new Scanner(System.in);
    }

    // Этот метод теперь используется для проверки, что ввод корректен
    public int getInput() {
        String input;
        while (true) {
            System.out.print("Введите 4-значное число: ");
            input = scanner.nextLine().trim();

            // Проверка: строка должна состоять только из 4 цифр
            if (input.matches("\\d{4}")) {
                return Integer.parseInt(input);  // Преобразуем строку в число
            } else {
                System.out.println("Ошибка: введите корректное 4-значное число.");
            }
        }
    }

    public void closeScanner() {
        scanner.close();
    }
}
