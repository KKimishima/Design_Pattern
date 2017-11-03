package KKimishima;

public class Triple {
  private static Triple[] tr = new Triple[]{
      new Triple(0),
      new Triple(1),
      new Triple(2),

  };
  private int id;

  private Triple (int id){
    System.out.println(id + "番目のインスタンスが生成されました");
  }

  public static Triple getTriple(int id){
    return tr[id];
  }

}
