public class TransferPrintBanner extends TransferPrint{
  private Banner ban;

  public TransferPrintBanner(String str){
    this.ban  = new Banner(str);
  }

  @Override
  public void PrintWeek(){
    this.ban.showWithParen();
  }

  @Override
  public void PrintStrong() {
    this.ban.showWithAster();
  }
}
