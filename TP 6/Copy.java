import java.io.*;
public class Copy {
  public static void main(String[] args) {
    try {
      File first = new File(args[0]);
      FileReader input = new FileReader(first);
      int size = (int) first.length();
      char[] c = new char[size];
      input.read(c);
      String s = new String(c);
      input.close();
      File second = new File(args[1]);
      FileWriter myWriter = new FileWriter(second);
      myWriter.write(s);
      myWriter.close();
    } catch (IOException e) {
    }
  }
}
