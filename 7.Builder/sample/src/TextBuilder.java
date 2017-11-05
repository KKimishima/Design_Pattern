/**
 *
 */

public class TextBuilder implements Builder{
  // このフィールドに文章を作製していく
  private StringBuffer buffer = new StringBuffer();

  @Override
  public void makeTile(String tile){
    // 飾り
    this.buffer.append("===================\n");
    // カッコつきタイトル
    this.buffer.append("["+tile+"]\n");
    // 空行
    this.buffer.append("\n");
  }
  @Override
  public void makeString(String str){
    this.buffer.append("# "+str+"\n");
  }

  @Override
  public void makeItems(String[] items){
    for (int i = 0;i < items.length;i++){
      this.buffer.append("  -"+items[i]+"\n");
    }
    this.buffer.append("\n");
  }

  @Override
  public void close(){
    this.buffer.append("===================\n");
  }

  public String getBuffer() {
    return this.buffer.toString();
  }
}
