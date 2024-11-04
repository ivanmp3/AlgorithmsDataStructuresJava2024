import util.ChouseInput;
import util.GetInput;
import TargetNumMethods.DataSource;
import gamelogic.BullCowGameLogic;
import gamelogic.GameLogic;
import util.InputHandler;
import util.TargetNumSelector;

public class Main {
    public static void main(String[] args) {
        GetInput getInput = new GetInput();
        DataSource target = TargetNumSelector.chooseTargetNum(ChouseInput.chouseInput());  // Передаем желаемый способ получения числа
        GameLogic gameLogic = new BullCowGameLogic();

        InputHandler.inputHandler(getInput, target, gameLogic);
    }
}
