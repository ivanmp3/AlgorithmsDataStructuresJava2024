package InputProcessingMethods;

import TargetNumMethods.DataSource;
import gamelogic.GameLogic;
import util.GetInput;

public class HumanInput implements InputMethods {
    @Override
    public void processInput(GetInput getInput, DataSource target, GameLogic gameLogic) {
        int targetNumber = target.getInput();
        int attempts = 0;
        boolean guessed = false;

        System.out.println("Угадайте 4-значное число!");

        while (!guessed) {
            int guess = getInput.getInput(4);  // Получаем пользовательский ввод через getInput
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

        getInput.closeScanner();  // Закрываем сканер после завершения игры
    }
}
