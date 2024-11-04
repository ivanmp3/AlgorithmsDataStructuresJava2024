package util;

import gamelogic.GameLogic;
import TargetNumMethods.DataSource;

public class InputHandler {
    public static void inputHandler(GetInput getInput, DataSource target, GameLogic gameLogic) {
        int targetNumber = target.getInput();
        int attempts = 0;
        boolean guessed = false;

        System.out.println("Угадайте 4-значное число!");

        // Цикл продолжается до тех пор, пока не будет угадано число
        while (!guessed) {
            int guess = GetInput.getInput(4);  // Используем getInput() для ввода
            attempts++;

            if (guess == targetNumber) {
                System.out.println("Поздравляю! Вы угадали число " + targetNumber + " за " + attempts + " попыток.");
                guessed = true;
            } else {
                int[] result = gameLogic.checkBC(guess, targetNumber);
                System.out.println("Быки: " + result[0] + " Коровы: " + result[1]);
                System.out.println("Попробуйте снова!");
            }
        }

        getInput.closeScanner();  // Закрываем сканер через объект Input
    }
}

