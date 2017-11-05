import java.io.FileWriter;
import java.io.IOException;

public class HTMLBuilder implements Builder{
  private String filename;
  private String path  = "/Volumes/data/Repo/Design_Pattern/7.Builder/sample/file/";
  private FileWriter file;

  public void makeTile(String tile){
    try{
      this.file = new FileWriter(this.path + tile + ".html");
      this.file.write("<html lang=\"ja\"><head><meta charset=\"UTF-8\"><title>" + tile + "</title></head><body>");
    }catch (IOException e){
      e.printStackTrace();
    }
  }

  @Override
  public void makeString(String str) {
    try{
      this.file.write("<h1>" + str +"<h1>");
    }catch (IOException e){
      e.printStackTrace();
    }
  }

  @Override
  public void makeItems(String[] items) {
    try{
      this.file.write("<ul>");
      for(int i = 0;i < items.length;i++){
        this.file.write("<li>"+items[i] +"</li>");
      }
      this.file.write("</ul>");
    }catch (IOException e){
      e.printStackTrace();
    }
  }
  @Override
  public void close(){
    try{
      this.file.write("</body></html>");
      this.file.flush();
    }catch (IOException e){
      e.printStackTrace();
    }finally {
      try{
        this.file.close();
      }catch (IOException e){
        e.printStackTrace();
      }
    }
  }
}
