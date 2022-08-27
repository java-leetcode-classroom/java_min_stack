import java.util.ArrayList;

public class Solution {
  public String[] RunTest(String[] commands, int[][] payload) {
    int len = payload.length;
    ArrayList<String> result = new ArrayList<>();
    result.add("null");
    MinStack minStack = new MinStack();
    for (int pos = 1; pos < len; pos++) {
      String command = commands[pos];
      switch (command) {
        case "push":
          int data = payload[pos][0];
          minStack.push(data);
          result.add("null");
          break;
        case "pop":
          minStack.pop();
          result.add("null");
          break;
        case "top":
          int top = minStack.top();
          result.add(String.valueOf(top));
          break;
        case "getMin":
          int min = minStack.getMin();
          result.add(String.valueOf(min));
          break;
      }
    }
    return result.toArray(new String[0]);
  }
}
