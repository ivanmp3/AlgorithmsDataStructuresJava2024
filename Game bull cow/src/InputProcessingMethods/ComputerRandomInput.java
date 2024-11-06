package InputProcessingMethods;

import TargetNumMethods.DataSource;
import gamelogic.GameLogic;
import util.GetInput;

public class ComputerRandomInput implements InputMethods {
    @Override
    public void processInput(GetInput getInput, DataSource target, GameLogic gameLogic) {
        int targetNumber = target.getInput();
        int attempts = 0;
        boolean guessed = false;

        System.out.println("Компьютер пытается угадать 4-значное число...");

        while (!guessed) {
            int guess = generateComputerGuess();  // Генерация компьютерного предположения
            attempts++;

            System.out.println("Компьютер предполагает: " + guess);

            if (guess == targetNumber) {
                System.out.println("Компьютер угадал число " + targetNumber + " за " + attempts + " попыток.");
                guessed = true;
            } else {
                int[] result = gameLogic.checkBC(guess, targetNumber);
                System.out.println("Быки: " + result[0] + " Коровы: " + result[1]);
            }
        }
    }

    private int generateComputerGuess() {
        return (int) (Math.random() * 9000) + 1000;  // Число от 1000 до 9999
    }
}
