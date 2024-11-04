package util;
import TargetNumMethods.DataSource;
import TargetNumMethods.DataSourceConsole;
import TargetNumMethods.DataSourceRandom;
import TargetNumMethods.DataSourceConstant;

public class TargetNumSelector {
    // Метод для выбора нужной реализации TargetNum
    public static DataSource chooseTargetNum(int num) {
        if (num == 0) {
            return new DataSourceConsole(); // Используем консольный ввод
        } else if (num == 1) {
            return new DataSourceRandom();  // Используем случайное число
        } else if (num >= 2) {
            return new DataSourceConstant();         // Используем заранее заданное значение
        }
        else {return new DataSourceRandom();}
    }
}
