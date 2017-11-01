package KKimishima;

// インスタンス一つしかないことを保証
public class Singleton {
  private static Singleton sn = new Singleton();
  private Singleton(){
    System.out.println("シングルトンが生成されました");
  }
  public static Singleton getInstance(){
    return sn;
  }
}
