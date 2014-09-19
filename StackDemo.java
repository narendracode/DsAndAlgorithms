public class StackDemo{
   public static void main(String[] args){
      Stack<Integer> stack = new Stack<Integer>();
      stack.push(new Node<Integer>(1));   
      stack.push(new Node<Integer>(2)); 
      stack.push(new Node<Integer>(3)); 
      stack.push(new Node<Integer>(4));

      stack.iterate();
      stack.pop();
      stack.iterate();
   }
}
