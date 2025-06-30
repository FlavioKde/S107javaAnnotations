package level3.exercise1.logic;


import com.fasterxml.jackson.databind.ObjectMapper;
import level3.exercise1.exception.JsonSerializationException;
import level3.exercise1.annotation.JsonSerializableField;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.lang.reflect.Field;

public class JsonSerializer {


    public static void readAndSaveToFile(Object obj)throws  JsonSerializationException {

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
/*
                    try (FileWriter fileWriter = new FileWriter(directory)) {
                        fileWriter.write(json);
                        fileWriter.flush();
                        System.out.println("JSON saved in: " + directory);

 */
                    try (FileWriter fileWriter = new FileWriter(file)) {
                        fileWriter.write(json);
                        System.out.println("JSON saved in: " + file.getAbsolutePath());

                    }

                } catch (IOException | IllegalAccessException e) {
                    throw new JsonSerializationException("Error saving the field: " + e.getMessage());
                }
            }
        }

    }
}
