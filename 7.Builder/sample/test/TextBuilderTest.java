import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TextBuilderTest {
  /**
   *
   */
  @Test
  void getBuffer() {
    TextBuilder test = new TextBuilder();
    test.makeTile("テストタイトル");
    test.makeString("テスト文字列");
    test.makeItems(new String[]{"テストアイテム1","テストアイテム2"});
    test.close();
    String testStr = "===================\n[テストタイトル]\n\n# テスト文字列\n  -テストアイテム1\n  -テストアイテム2\n\n===================\n";
    assertEquals(testStr,test.getBuffer());
  }

}