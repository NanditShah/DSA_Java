package DSASheet.Maths.Medium;

import java.util.HashMap;
import java.util.Random;

public class EncodeAndDecodeTinyURL {
    public static void main(String[] args) {
        System.out.println("Encode and Decode TinyURL");
    }

    public class Codec {
        private final String alphabets =
                "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789";
        HashMap<String,String> codeToUrl = new HashMap<>();
        HashMap<String,String> urlToCode = new HashMap<>();

        // Encodes a URL to a shortened URL.
        public String encode(String longUrl) {
            if(!urlToCode.containsKey(longUrl)){
                Random random = new Random();
                String code = "";
                for(int i = 0;i<6;i++){
                    code += alphabets.charAt(random.nextInt(alphabets.length()));
                }
                codeToUrl.put(code,longUrl);
                urlToCode.put(longUrl,code);
                return "http://tinyurl.com/" + code;
            }

            throw new IllegalArgumentException();
        }

        // Decodes a shortened URL to its original URL.
        public String decode(String shortUrl) {
            String code = shortUrl.substring(19);
            return codeToUrl.get(code);
        }
    }
}
