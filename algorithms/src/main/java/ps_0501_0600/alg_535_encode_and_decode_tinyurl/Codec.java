package ps_0501_0600.alg_535_encode_and_decode_tinyurl;

import java.util.Map;
import java.util.UUID;
import java.util.concurrent.ConcurrentHashMap;

/**
 * https://leetcode.com/problems/encode-and-decode-tinyurl
 */
public class Codec {
    private final Map<String, String> longToShort = new ConcurrentHashMap<>();
    private final Map<String, String> shortToLong = new ConcurrentHashMap<>();

    // Encodes a URL to a shortened URL.
    public String encode(String longUrl) {
        if (longToShort.containsKey(longUrl)) {
            return longToShort.get(longUrl);
        }

        String uuid = UUID.randomUUID().toString();
        longToShort.put(longUrl, uuid);
        shortToLong.put(uuid, longUrl);
        return uuid;
    }

    // Decodes a shortened URL to its original URL.
    public String decode(String shortUrl) {
        return shortToLong.get(shortUrl);
    }
}
