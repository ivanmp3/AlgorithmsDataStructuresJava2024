import InputProcessingMethods.InputMethods;
import util.ChouseInput;
import util.GetInput;
import TargetNumMethods.DataSource;
import gamelogic.BullCowGameLogic;
import gamelogic.GameLogic;
import util.TargetNumSelector;
import util.GameModeSelector;

public class Main {
    public static void main(String[] args) {
        GetInput getInput = new GetInput();

        // Инициализируем логику игры
        GameLogic gameLogic = new BullCowGameLogic();

        // Выбираем режим игры
        InputMethods inputHandler = GameModeSelector.chooseGameMode();

        // Выбираем, как будет сгенерировано загаданное число
        DataSource target = TargetNumSelector.chooseTargetNum(ChouseInput.chouseInput());

        // Запуск игры с выбранным обработчиком
        inputHandler.processInput(getInput, target, gameLogic);
    }
}
