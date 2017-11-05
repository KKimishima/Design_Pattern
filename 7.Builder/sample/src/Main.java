public class Main {
  public static void main(String[] args) {
    TextBuilder tex = new TextBuilder();
    Director    di  = new Director(tex);
    di.construct();
    String reslut = tex.getBuffer();
    System.out.print(reslut);

    HTMLBuilder html = new HTMLBuilder();
    Director hdir = new Director(html);
    hdir.construct();
  }
}
