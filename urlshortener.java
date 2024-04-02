import java.util.HashMap;
import java.util.Map;
import java.util.Random;
import java.util.Scanner;

public class URLShortener {
    private static final String BASE_URL = "https://short.url/";

    private static final Map<String, String> urlMapping = new HashMap<>();

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your long URL:");
        String longUrl = scanner.nextLine();

        String shortUrl = generateShortUrl();
        urlMapping.put(shortUrl, longUrl);
        
        System.out.println("Short URL: " + BASE_URL + shortUrl);
    }

    private static String generateShortUrl() {
        String chars = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789";
        StringBuilder shortUrl = new StringBuilder();
        Random random = new Random();

        for (int i = 0; i < 6; i++) {
            shortUrl.append(chars.charAt(random.nextInt(chars.length())));
        }

        return shortUrl.toString();
    }
}
