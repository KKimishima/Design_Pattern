package KKimishima;

public class Main {
  public static void main(String[] args) {
//    普通のインスタンスでは作製できない
//    Singleton test = new Singleton();

    Singleton oj1 = Singleton.getInstance();
    Singleton oj2 = Singleton.getInstance();

    if(oj1 == oj2){
      System.out.println("同じインスタンです");
    }else{
      System.out.println("違うインスタンスです");
    }

  }
}
