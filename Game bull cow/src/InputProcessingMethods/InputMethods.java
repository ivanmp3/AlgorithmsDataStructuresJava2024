package InputProcessingMethods;

import TargetNumMethods.DataSource;
import gamelogic.GameLogic;
import util.GetInput;

public interface InputMethods {
    void processInput(GetInput getInput, DataSource target, GameLogic gameLogic);
}
