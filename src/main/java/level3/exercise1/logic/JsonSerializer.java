package level3.exercise1.logic;


import com.fasterxml.jackson.databind.ObjectMapper;
import level3.exercise1.annotation.JsonSerializableField;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.lang.reflect.Field;

public class JsonSerializer {


    public static void readAndSaveToFile(Object obj, String defaultPath) {

        Class<?> objClass = obj.getClass();
        ObjectMapper mapper = new ObjectMapper();


        for (Field field : objClass.getDeclaredFields()) {
            if (field.isAnnotationPresent(JsonSerializableField.class)) {
                field.setAccessible(true);

                JsonSerializableField annotation = field.getAnnotation(JsonSerializableField.class);
                String directory = annotation.directory();

                try {
                    Object value = field.get(obj);
                    String json = mapper.writerWithDefaultPrettyPrinter().writeValueAsString(value);

                    File file = new File(directory);
                    file.getParentFile().mkdirs();

                    try (FileWriter fileWriter = new FileWriter(directory)) {
                        fileWriter.write(json);
                        fileWriter.flush();
                        System.out.println("JSON saved in: " + defaultPath);
                    }

                } catch (IOException | IllegalAccessException e) {
                    System.out.println("Error saving the field: " + e.getMessage());
                }
            }
        }

    }
}
