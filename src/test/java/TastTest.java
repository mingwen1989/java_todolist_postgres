import org.junit.*;
import static org.junit.Assert.*;

public class TaskTest {

  @Test
  public void methodWeAreTesting_behaviorWeAreTesting_expectedResult() {
    MainClassName testMainClassName = new MainClassName();
    String expected = "This" ;
    assertEquals(expected, testMainClassName.methodName("test"));
  }
}
