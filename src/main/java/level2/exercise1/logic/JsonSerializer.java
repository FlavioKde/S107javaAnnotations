package level2.exercise1.logic;

import com.fasterxml.jackson.databind.ObjectMapper;
import level2.exercise1.exception.JsonSerializationException;

import java.io.FileWriter;
import java.io.IOException;

public class JsonSerializer {


    public static void saveToFile(Object obj, String outputPath) throws  JsonSerializationException{

        ObjectMapper mapper = new ObjectMapper();

        try (FileWriter fileWriter = new FileWriter(outputPath)) {
            String json = mapper.writerWithDefaultPrettyPrinter().writeValueAsString(obj);

            fileWriter.write(json);
            System.out.println("JSON saved in: " + outputPath);

        } catch (IOException e) {
            throw new JsonSerializationException("Error saving Json field: " + e.getMessage());
        }
    }
}

