import javax.swing.*;

public class Main{
  public static void main(String[] args) {
    TexBuilder tx = new TexBuilder();
    Director di = new Director(tx);

    di.construct();
    System.out.println(tx.getResult());

    FormBuilder fb = new FormBuilder();
    Director di2 = new Director(fb);
    di2.construct();
    JFrame jf = fb.getFr();
    jf.setVisible(true);

  }

}
