package ps_0501_0600.alg_535_encode_and_decode_tinyurl;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;

public class CodecTest {

    @Test
    public void testNormalCase() {
        Codec codec = new Codec();

        String origin = "http://google.com/ncr";
        String shortedUrl = codec.encode(origin);

        assertNotEquals(origin, shortedUrl);
        assertEquals(origin, codec.decode(shortedUrl));
    }
}