package KKimishima;

public class Triple {
  private static Triple[] tr = new Triple[3];
  private Triple (){
    System.out.println("インスタンスが3つだけ生成されました");
  }
  public static Triple getTriple(int id){
    //(id)0 <= 2
    //(id)1 <= 2
    //(id)5 <= 2
    if(id <= 2){
      return tr[id];
    }else{
      return null;
    }
  }
}
