package level3.exercise1.exception;

import java.io.IOException;

public class JsonSerializationException extends IOException {

    public JsonSerializationException(String message) {
        super(message);
    }

}
