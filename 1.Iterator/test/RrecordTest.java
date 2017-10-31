import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RrecordTest {
  Rrecord record = new Rrecord(4);
  Field field = new Field("test",999,999);

  @Test
  void getlength() {
    assertEquals(0,record.getlength());
  }

  @Test
  void getRecord() {
    //assertEquals(this.field,record.getRecord(1));
  }

  @Test
  void addFieds() {

    //assertEquals(0,);
  }

  @Test
  void itretator() {
  }

}