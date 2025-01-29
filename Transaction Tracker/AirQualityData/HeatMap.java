package AirQualityData;
import java.io.File;
import java.io.IOException;
import java.util.List;
import java.util.Map;

public class HeatMap extends Application {

    private static final int CELL_SIZE = 50; // Size of each cell in the heatmap
    private static final String JSON_FILE = "pm2_5data.json"; // Path to the JSON file

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws IOException {
        // Parse JSON data
        List<Map<String, Object>> data = loadJsonData(JSON_FILE);

        // Calculate heat map dimensions
        int maxX = data.stream().mapToInt(d -> (int) d.get("x")).max().orElse(0);
        int maxY = data.stream().mapToInt(d -> (int) d.get("y")).max().orElse(0);

        Canvas canvas = new Canvas((maxX + 1) * CELL_SIZE, (maxY + 1) * CELL_SIZE);
        GraphicsContext gc = canvas.getGraphicsContext2D();

        // Draw heat map
        for (Map<String, Object> point : data) {
            int x = (int) point.get("x");
            int y = (int) point.get("y");
            double value = (double) point.get("value");

            // Map value to a color
            Color color = mapValueToColor(value, 0, 20); // Assuming values range from 0 to 20
            gc.setFill(color);
            gc.fillRect(x * CELL_SIZE, y * CELL_SIZE, CELL_SIZE, CELL_SIZE);
        }

        // Set up the stage
        primaryStage.setScene(new Scene(new javafx.scene.Group(canvas)));
        primaryStage.setTitle("Heat Map Example");
        primaryStage.show();
    }

    // Load JSON data
    private List<Map<String, Object>> loadJsonData(String filePath) throws IOException {
        ObjectMapper objectMapper = new ObjectMapper();
        return objectMapper.readValue(new File(filePath), new TypeReference<>() {});
    }

    // Map a value to a color gradient (e.g., from blue to red)
    private Color mapValueToColor(double value, double minValue, double maxValue) {
        double ratio = (value - minValue) / (maxValue - minValue);
        return Color.color(ratio, 0, 1 - ratio); // Blue to Red gradient
    }
}