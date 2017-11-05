public class TexBuilder extends Builder {
  private StringBuffer buffer = new StringBuffer();

  @Override
  protected void buildTitle(String title) {
    this.buffer.append("==================\n");
    this.buffer.append("["+title+"]\n");
    this.buffer.append("\n");
  }

  @Override
  protected void buildString(String str) {
    this.buffer.append("#"+str+"\n");
  }

  @Override
  protected void buildItems(String[] items) {
    for(int i = 0;i < items.length;i++){
      this.buffer.append("- "+ items[i] + "\n");
    }
    buffer.append("\n");
  }

  @Override
  protected void buildclose() {
    this.buffer.append("==================\n");
  }

  public StringBuffer getResult(){
    return this.buffer;
  }
}
