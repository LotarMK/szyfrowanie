import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;

class CipherTest {

    private Cipher cipher = new Cipher();

    @BeforeEach
    public void init() {
        cipher = new Cipher();
    }

    @Test
    public void encryptTest() {
        Assertions.assertEquals("BCD", cipher.encrypt("ABC"));
    }

    @Test
    public void encryptPositiveKey() {
        cipher.setKey(3);
        Assertions.assertEquals("DEF", cipher.encrypt("ABC"));
    }

    @Test
    public void encryptRightBound() {
        Assertions.assertEquals("YZA", cipher.encrypt("XYZ"));

        cipher.setKey(3);
        Assertions.assertEquals("ABC", cipher.encrypt("XYZ"));

        cipher.setKey(3 + 5*26);
        Assertions.assertEquals("ABC", cipher.encrypt("XYZ"));
    }

    @Test
    public void encryptCustomAlpha() {
        cipher = new Cipher("ABCDEF");
        Assertions.assertEquals("", cipher.encrypt("EFG"));
    }

    @Test
    public void decryptCustomAlpha() {
        cipher = new Cipher("ABCDEF");
        Assertions.assertEquals("", cipher.decrypt("EFG"));
    }

}