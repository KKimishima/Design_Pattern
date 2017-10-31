// アダプター(ラッパー)で変換する
// その際,継承を行い
public class PrintBanner extends Banner implements Print{
  public PrintBanner(String str){
    super(str);
  }

  // 変換を行うラッパー
  @Override
  public void printWeek(){
    super.showWithParen();
  }
  @Override
  public void printStrong(){
    super.showWithAster();
  }
}
