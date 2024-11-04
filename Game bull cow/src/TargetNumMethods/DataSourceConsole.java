package TargetNumMethods;
import util.GetInput;
public class DataSourceConsole implements DataSource {
    @Override
    public int getInput() {
        System.out.print("Задывайте число ниже:\n");
        return GetInput.getInput(4);
    }
}
