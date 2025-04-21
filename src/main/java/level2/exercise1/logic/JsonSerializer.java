package level2.exercise1.logic;

import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.FileWriter;
import java.io.IOException;

public class JsonSerializer {


    public static void saveToFile(Object obj, String outputPath) {
        try {
            ObjectMapper mapper = new ObjectMapper();
            String json = mapper.writerWithDefaultPrettyPrinter().writeValueAsString(obj);

            try (FileWriter fileWriter = new FileWriter(outputPath)) {
                fileWriter.write(json);
                System.out.println("JSON saved in: " + outputPath);
            }
            } catch (IOException e) {
                System.out.println("Error saving the field: " + e.getMessage());
            }
        }
    }

