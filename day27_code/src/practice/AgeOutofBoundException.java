package practice;

/**
 * @author: Java_cmr
 * @Date: 2023/1/4 - 19:10
 */
public class AgeOutofBoundException extends RuntimeException{
    public AgeOutofBoundException() {
    }

    public AgeOutofBoundException(String message) {
        super(message);
    }
}
