public class Queue<Item>{
   private Node<Item> first;
   private Node<Item> last;
   private int N;

   @SuppressWarnings("unchecked")
   public void enqueue(Node<Item> newNode){
      if(N==0){
         first = newNode;
         last = first;
      }else{
         newNode.setNext(first);
         first = newNode;
      }
      N++;
   }
   @SuppressWarnings("unchecked")
   public Node<Item>  dequeue(){
      if(size()==0){
         return new Node<Item>();
      }else if(size()==1){
         Node<Item> node = first;
         first = null;
         last = null;
         return node;
      }else{
         Node<Item> node = first;
         Node<Item> prevNode = null;
         while(node.getNext()!=last){
            prevNode = node;
            node = node.getNext();
         }
         Node<Item> result = node.getNext();
         last = node;
         N--;
         return result;
      }
   }
   @SuppressWarnings("unchecked")
   public void iterate(){
      Node<Item> node = first;
        while(node!=last){
           System.out.println(node.getItem());
           node = node.getNext();
        }
        if(node!=null)
           System.out.println(node.getItem());
   }

   public boolean isEmpty(){
        return N == 0;
   }
   public int size(){ return N;}
}
