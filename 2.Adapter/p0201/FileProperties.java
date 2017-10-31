import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.util.Properties;

public class FileProperties extends Properties implements FileIO{

  @Override
  public void readFromFile(String fileName) throws IOException{
    load(new FileInputStream(fileName));
  }

  @Override
  public void writerFile(String fileName) throws IOException{
    store(new FileOutputStream(fileName),"test");
  }

  @Override
  public void setValues(String key,String values){
    setProperty(key,values);
  }

  @Override
  public String getValues(String key) {
    return getProperty(key);
  }
}
