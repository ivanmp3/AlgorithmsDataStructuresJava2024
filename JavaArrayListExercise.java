import java.util.ArrayList;
import java.util.Collections;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Ideone {
  public static void main(String[] args) throws java.lang.Exception {
    ArrayList < String > colors = new ArrayList < String > ();
    colors.add("red");
    colors.add("green");
    colors.add("grey");
    colors.add("purple");
    for (int i = 0; i < colors.size(); i++) {
      System.out.println(colors.get(i));
    }
    colors.add(0, "pink");
    colors.get(2);
    colors.set(3, "yellow");
    colors.remove(3);
    boolean areBlackPresent = colors.contains("black");
    Collections.sort(colors);
    ArrayList < String > sortedColors = new ArrayList < String > ();
    sortedColors = (ArrayList) colors.clone();
    Collections.reverse(colors);
    boolean areEqual = colors.equals(sortedColors);
    int size = colors.size();
    colors.clear();
    if (colors.isEmpty()) {
    System.out.println("Список colors пустой");
} else {
    System.out.println("Список colors не пустой");
}
    size = colors.size();
    System.out.println(size);
    colors.ensureCapacity(50);
    sortedColors.trimToSize();
  }
}
