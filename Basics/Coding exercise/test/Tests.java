import static org.junit.Assert.*;
import org.junit.Test;

public class Tests {
  @Test
  public void testSolution() {
    // put your test here
    Task t = new Task();

    assertEquals(6, t.sumOfDigits(132));
    assertEquals(21, t.sumOfDigits(786));
    assertEquals(0, t.sumOfDigits(0));
    assertEquals(81, t.sumOfDigits(999999999));
    assertEquals(5, t.sumOfDigits(-212));
    assertEquals(81, t.sumOfDigits(-999999999));
    assertEquals(46, t.sumOfDigits(Integer.MAX_VALUE));
    assertEquals(47, t.sumOfDigits(Integer.MIN_VALUE));
  }
}