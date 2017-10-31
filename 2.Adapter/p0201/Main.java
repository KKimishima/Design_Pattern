import java.io.IOException;

public class Main {
  public static void main(String[] args) {
    FileIO f = new FileProperties();
    try{
      f.readFromFile("/Volumes/data/Repo/Design_Pattern/2.Adapter/p0201/read.txt");
      f.setValues("test1","1");
      f.setValues("test2","2");
      f.writerFile("/Volumes/data/Repo/Design_Pattern/2.Adapter/p0201/writer.txt");
    }catch (IOException e){
      e.printStackTrace();
    }
  }
}
