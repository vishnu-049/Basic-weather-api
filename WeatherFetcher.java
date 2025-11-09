import java.net.*;
import java.io.*;
import java.util.Scanner;

public class WeatherFetcher {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Get user input
        System.out.print("Enter city name (e.g., London): ");
        String city = scanner.nextLine();

        String apiKey = "f8a04e4ef50a4215c1e561f270572584"; 
        String urlStr = "https://api.openweathermap.org/data/2.5/weather?q=" + city +
                        "&appid=" + apiKey + "&units=metric";

        try {
            URL url = new URL(urlStr);
            HttpURLConnection conn = (HttpURLConnection) url.openConnection();
            conn.setRequestMethod("GET");

            BufferedReader reader = new BufferedReader(
                    new InputStreamReader(conn.getInputStream())
            );
            StringBuilder response = new StringBuilder();
            String line;
            while ((line = reader.readLine()) != null) {
                response.append(line);
            }
            reader.close();

            String result = response.toString();
            System.out.println("API Response: " + result);

            // Extract temperature using simple search
            String tempKey = "\"temp\":";
            int tempIndex = result.indexOf(tempKey);
            if (tempIndex != -1) {
                int endIndex = result.indexOf(",", tempIndex);
                String tempStr = result.substring(tempIndex + tempKey.length(), endIndex).trim();
                double temperature = Double.parseDouble(tempStr);

                System.out.println("Current temperature in " + city + ": " + temperature + "°C");
            } else {
                System.out.println("City not found or API error.");
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
