public class MinStack {
  static class Node {
    final int val;
    int min;
    Node next = null;
    Node(int val, int min) {
      this.val = val;
      this.min = min;
    }
  }
  Node head = null;
  public MinStack() {

  }
  public void push(int val) {
    Node node = new Node(val, val);
    if (this.head != null) {
      if (node.min > this.head.min) {
        node.min = this.head.min;
      }
      node.next = this.head;
    }
    this.head = node;
  }
  public void pop() {
    if (this.head != null) {
      this.head = this.head.next;
    }
  }
  public int top() {
    return this.head.val;
  }
  public int getMin() {
    return this.head.min;
  }
}
