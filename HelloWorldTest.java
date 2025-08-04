import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class HelloWorldTest {

    @Test
    public void testMessage() {
        String message = "Hello, GitHub Actions!";
        assertEquals("Hello, GitHub Actions!", message);
    }
}
