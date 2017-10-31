import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FieldTest {
  Field a = new Field("test",999,999);
  @Test
  void getName() {
    assertEquals("test",a.getName());
  }

  @Test
  void getPrice() {
    assertEquals(999,a.getPrice());
  }

  @Test
  void getWeight() {
    assertEquals(999,a.getWeight());
  }

}