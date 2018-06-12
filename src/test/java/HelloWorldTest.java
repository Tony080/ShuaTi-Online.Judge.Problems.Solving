import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

public class HelloWorldTest {
  private final ByteArrayOutputStream outContent = new ByteArrayOutputStream();

  @Before
  public void setUpStreams() {

    System.setOut(new PrintStream(outContent));
  }

  @After
  public void restoreSteams() {
    System.setOut(System.out);
  }

  @Test
  public void testHelloWorld() {
    HelloWorld helloWorld = new HelloWorld();
    helloWorld.helloWorld();
    Assert.assertEquals("Hello World!\n", outContent.toString());
  }
}