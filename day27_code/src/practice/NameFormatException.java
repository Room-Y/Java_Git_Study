package practice;

/**
 * @author: Java_cmr
 * @Date: 2023/1/4 - 19:09
 */
public class NameFormatException extends RuntimeException{
    public NameFormatException() {
    }

    public NameFormatException(String message) {
        super(message);
    }
}
