import java.io.IOError;
import java.io.IOException;

public interface FileIO {
  public void readFromFile(String fileName) throws IOException;
  public void writerFile(String fileNmae) throws IOException;
  public void setValues(String key,String values);
  public String getValues(String key);

}
