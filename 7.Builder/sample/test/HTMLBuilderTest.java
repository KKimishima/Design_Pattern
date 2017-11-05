import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class HTMLBuilderTest {
  @Test
  void close() {
    HTMLBuilder test = new HTMLBuilder();
    test.makeTile("タイトルテスト");
    test.makeString("文字列テスト");
    test.makeItems(new String[]{
        "アイテムテスト1",
        "アイテムテスト2",
        "アイテムテスト3",
    });
    test.close();
  }

}