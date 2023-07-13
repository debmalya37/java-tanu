package bookSolved;

class StringManipulator {

  public void Joystring(String s, char ch1, char ch2) {
    String result = s.replace(ch1, ch2);
    System.out.println(result);
  }

  public void Joystring(String s) {
    int firstIndex = s.indexOf(' ');
    int lastIndex = s.lastIndexOf(' ');
    System.out.println("First index: " + firstIndex);
    System.out.println("Last index: " + lastIndex);
  }

  public void Joystring(String s1, String s2) {
    String result = s1 + " " + s2;
    System.out.println(result);
  }
}

public class P1 {
  public static void main(String[] args) {
    StringManipulator manipulator = new StringManipulator();

    // Example 1
    String s1 = "TECHNALAGY";
    char ch1 = 'A';
    char ch2 = 'O';
    manipulator.Joystring(s1, ch1, ch2);

    // Example 2
    String s2 = "Cloud computing means Internet based computing";
    manipulator.Joystring(s2);

    // Example 3
    String s3 = "COMMON WEALTH";
    String s4 = "GAMES";
    manipulator.Joystring(s3, s4);
  }
}
