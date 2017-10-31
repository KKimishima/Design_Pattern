public class CharDisplay extends AbstractDisplay{
  private String str;
  public CharDisplay(String str){
    super();
    this.str = str;
  }
  @Override
  public void Open(){
    System.out.print("<<");
  }
  @Override
  public void Print(){
    System.out.print(str);
  }
  @Override
  public void Close(){
    System.out.println(">>");
  }
}
