public class Main {
  public static void main(String[] args) {
    AbstractDisplay ch = new CharDisplay("C");
    ch.Display();

    AbstractDisplay str = new StringDisplay("Hellow");
    str.Display();

    AbstractDisplay str2 = new StringDisplay("HELP");
    str2.Display();
  }
}
