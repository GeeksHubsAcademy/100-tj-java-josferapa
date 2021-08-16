package es.geekshubs.academy;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class FizzBuzzTest {

  private FizzBuzz fizzBuzz;

  @Before
  public void setUp() throws Exception {
    this.fizzBuzz = new FizzBuzz();
  }

  @After
  public void tearDown() throws Exception {
    this.fizzBuzz = null;
  }

  @Test
  public void apply_3() {
    final String expected = "1\n2\nGeeks\n";
    final String result = fizzBuzz.apply(3);
    assertEquals(expected,result);
  }

  @Test
  public void apply_30() {
    final String expected = "1\n2\nGeeks\n4\nHubs\nGeeks\n7\n8\nGeeks\nHubs\n11\nGeeks\n13\n14\nGeeksHubs\n16\n17\nGeeks\n19\nHubs\nGeeks\n22\n23\nGeeks\nHubs\n26\nGeeks\n28\n29\nGeeksHubs\n";
    final String result = fizzBuzz.apply(30);
    assertEquals(expected,result);
  }

  @Test
  public void apply_60() {
    final String expected = "1\n2\nGeeks\n";
    final String result = fizzBuzz.apply(3);
    assertEquals(expected,result);
  }

  @Test
  public void apply_100() {
    final String expected = "1\n2\nGeeks\n4\nHubs\nGeeks\n7\n8\nGeeks\nHubs\n11\nGeeks\n13\n14\nGeeksHubs\n16\n17\nGeeks\n19\nHubs\nGeeks\n22\n23\nGeeks\nHubs\n26\nGeeks\n28\n29\nGeeksHubs\n";
    final String result = fizzBuzz.apply(30);
    assertEquals(expected,result);
  }

}