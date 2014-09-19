import java.util.Iterator;
public class Bag<Item> implements Iterable<Node<Item>>{
   private Node<Item> first;
   private int N;

   @SuppressWarnings("unchecked")
   public void add(Node<Item> newNode){
      if(isEmpty())
        first = newNode;
      else{
         Node<Item> oldFirst = first;
         first = newNode;
         first.setNext(oldFirst);
      }
      N++;
   }
   public boolean isEmpty(){
      return first == null;
   }
   
   public int size(){

      return N;
   }
   
   public Iterator<Node<Item>> iterator(){
      return new BagIterator();
   }

   private class BagIterator implements Iterator<Node<Item>>{
      private Node<Item> current = first;
      public boolean hasNext(){
         return current != null;
      }
       
      @SuppressWarnings("unchecked")
      public Node<Item> next(){
         Node<Item> node = current;
         current = current.getNext();
         return node;
      }
      public void remove(){}
   }//BagIterator
}
