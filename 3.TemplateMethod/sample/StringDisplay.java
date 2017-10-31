public class StringDisplay extends AbstractDisplay{
  private String str;
  private int width;
  public StringDisplay(String str){
    this.str = str;
    this.width = str.getBytes().length;
  }

  private void PrintLine(){
    System.out.print("+");

    for (int i=0; i<width; i++){
      System.out.print("-");
    }
    System.out.println("+");
  }

  @Override
  public void Open(){
    PrintLine();
  }

  @Override
  public void Print(){
    System.out.println("|" + str + "|");
  }
  @Override
  public void Close(){
    PrintLine();
  }
}
