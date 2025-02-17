import static org.junit.Assert.*;
import org.junit.*;

public class ArrayTests {
	@Test 
	public void testReverseInPlace() {
    int[] input1 = { 3 };
    ArrayExamples.reverseInPlace(input1);
    assertArrayEquals(new int[]{ 3 }, input1);

    int[] input2 = {3, 2};
    ArrayExamples.reverseInPlace(input2);
    assertArrayEquals(new int[]{2, 3}, input2);


  }

  @Test 
  public void testReverseInPlace2(){
    int[] input3 = {4};
    ArrayExamples.reverseInPlace(input3);
    assertArrayEquals(new int[]{4}, input3);
  }


  @Test
  public void testReversed() {
    int[] input1 = { };
    assertArrayEquals(new int[]{ }, ArrayExamples.reversed(input1));

    int[] input2 = {3, 2, 1};
    assertArrayEquals(new int[]{1, 2, 3}, ArrayExamples.reversed(input2));

  }

  @Test 
  public void testAverage(){
    double[] input1 = {1.0, 2.0, 3.0, 1.0};
    assertEquals(2.5, ArrayExamples.averageWithoutLowest(input1), 0.001);
  }



}
