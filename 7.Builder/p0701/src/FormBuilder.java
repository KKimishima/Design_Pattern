import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class FormBuilder extends Builder implements ActionListener {
  private JFrame fr  = new JFrame();
  private Box    box = new Box(BoxLayout.Y_AXIS);

  @Override
  protected void buildTitle(String str) {
    fr.setTitle(str);
  }

  @Override
  protected void buildString(String str) {
    box.add(new JLabel(str));
  }

  @Override
  protected void buildItems(String[] items) {
    Box innerBox = new Box(BoxLayout.Y_AXIS);
    for(int i = 0;i < items.length;i++){
      JButton button = new JButton(items[i]);
      button.addActionListener(this);
      innerBox.add(button);
    }
    box.add(innerBox);
  }

  @Override
  protected void buildclose() {
    fr.getContentPane().add(box);
    fr.pack();
    fr.addWindowListener(new WindowAdapter(){
      public void windowClosing(WindowEvent e){
        System.exit(0);
      }
    });
  }

  public JFrame getFr() {
    return fr;
  }

  @Override
  public void actionPerformed(ActionEvent e){
    System.out.println(e.getActionCommand());
  }
}
