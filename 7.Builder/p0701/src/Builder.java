public abstract class Builder {
  private boolean init = false;

  public void makeTitle(String title){
    if(!this.init){
      buildTitle(title);
      this.init = true;
    }
  }

  public void makeString(String str){
    if(this.init){
      buildString(str);
    }
  }

  public void makeItems(String[] items){
    if(this.init){
      buildItems(items);
    }
  }

  public void close(){
    if(this.init){
      buildclose();
    }
  }

  protected abstract void buildTitle(String str);
  protected abstract void buildString(String str);
  protected abstract void buildItems(String[] items);
  protected abstract void buildclose();
}
