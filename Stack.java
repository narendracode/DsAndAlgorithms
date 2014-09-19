public class Stack<Item>{
   private Node<Item> first;  //top of stack(Most recently added Node)
   private int N;       // Number of Items

   public void push(Node<Item> newNode){
      if(isEmpty())
         first = newNode;
      else{
         Node<Item> oldFirst = first;
         first = newNode;
         first.setNext(oldFirst);
      }
      N++;
   }

   @SuppressWarnings("unchecked")
   public void iterate(){
        Node<Item> node = first;
        if(node!=null){
           System.out.println(""+node.getItem());
           while(node.getNext()!=null){
              node = node.getNext();
              System.out.println(""+node.getItem());
           }
        }
   }

   @SuppressWarnings("unchecked")
   public Node<Item> pop(){
        Node<Item> node = first;
        first = (Node<Item>)first.getNext();
        N--;
        return node;
   }
   public boolean isEmpty(){return first == null;}
   public int size(){ return N;}
}
