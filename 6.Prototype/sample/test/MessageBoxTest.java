import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * mo
 */

class MessageBoxTest {

  @Test
  void use() {
    MessageBox msg = new MessageBox('-');
    String testStr = "testStr";
    msg.use(testStr);
  }

  @Test
  void createClone() {
  }

}