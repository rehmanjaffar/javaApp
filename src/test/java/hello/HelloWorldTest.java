import static org.junit.Assert.assertEquals;
import org.joda.time.LocalTime;
import org.junit.Test;
import hello.Greeter;
import hello.HelloWorld; // Add this import statement

public class HelloWorldTest {

    @Test
    public void testCurrentTime() {
        LocalTime currentTime = new LocalTime();
        String expected = "The current local time is: " + currentTime;
        String actual = HelloWorld.getCurrentTimeMessage(currentTime);
        assertEquals(expected, actual);
    }

    @Test
    public void testGreeter() {
        Greeter greeter = new Greeter();
        String expected = "DevOps Project for Systems Limited ";
        String actual = greeter.sayHello();
        assertEquals(expected, actual);
    }
}
