import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {
  final private Solution sol = new Solution();
  @Test
  void runTestExample1() {
    assertArrayEquals(new String[]{
        "null","null","null","null","-3","null","0","-2"
    }, sol.RunTest(new String[]{
        "MinStack","push","push","push","getMin","pop","top","getMin"
    }, new int[][]{
        {}, {-2}, {0}, {-3}, {}, {}, {}, {}
    }));
  }
}