package util;

import gamelogic.CheckBC;
import gamelogic.GameLogic;
import number.TargetNum;

public class InputHandler {
    public static void inputHandler(TargetNum targetNum) {
        GetInput getInput = new GetInput();
        int targetNumber = targetNum.targetInput();//TargetNum.targetNum(ChouseInput.chouseInput());  // Даем вібрать input
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
                GameLogic gameLogic = new CheckBC();
                int[] result = gameLogic.checkBC(guess, targetNumber);
                System.out.println("Быки: " + result[0] + " Коровы: " + result[1]);
                System.out.println("Попробуйте снова!");
            }
        }

        getInput.closeScanner();  // Закрываем сканер через объект Input
    }
}
