public class TargetNum {
    public static int targetNum(int i) {
        if (i == 1) {
            return GetRand.genRand();
        } else if (i == 2) {
            return ConstInput.constInput();
        } else {
            return UIinput.uiInput();
        }
    }
}
