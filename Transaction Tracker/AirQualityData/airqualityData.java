package AirQualityData;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

public class airqualityData {

    public static void main(String[] args) {
        // Define the API endpoint and parameters
        String apiKey = "d77531b503883105e7fa96c9bea044e7";
        String lat = "-1.292066";  // Latitude for Nairobi
        String lon = "36.821945";   // Longitude for Nairobi
        String urlString = String.format("https://api.openweathermap.org/data/2.5/air_pollution?lat=%s&lon=%s&appid=%s", lat, lon, apiKey);

        try {
            // Create a URL object
            URL url = new URL(urlString);

            // Open an HTTP connection
            HttpURLConnection connection = (HttpURLConnection) url.openConnection();
            connection.setRequestMethod("GET");

            // Check the response code
            int responseCode = connection.getResponseCode();
            if (responseCode == 200) { // HTTP OK
                // Read the response
                BufferedReader in = new BufferedReader(new InputStreamReader(connection.getInputStream()));
                StringBuilder response = new StringBuilder();
                String line;

                while ((line = in.readLine()) != null) {
                    response.append(line);
                }

                // Close the reader
                in.close();

                // Print the JSON response
                System.out.println("Air Quality Data:");
                System.out.println(response.toString());

                // Write the JSON response to a file
                try (BufferedWriter writer = new BufferedWriter(new FileWriter("pm2_5data.json"))) {
                    writer.write(response.toString());
                }

                System.out.println("Air Quality Data has been written to pm2_5data.json");

            } else {
                System.out.println("Error: Received HTTP response code " + responseCode);
            }

            // Disconnect the connection
            connection.disconnect();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}