import java.util.Iterator;
public class BagDemo{
   
   @SuppressWarnings("unchecked")
   public static void main(String[] args){
      Bag<Integer> bag = new Bag<Integer>();
      bag.add(new Node<Integer>(1));
      bag.add(new Node<Integer>(2));
      bag.add(new Node<Integer>(3));
      bag.add(new Node<Integer>(4));
      bag.add(new Node<Integer>(5));

      Iterator i = bag.iterator();
      while(i.hasNext()){
         Node<Integer> node = (Node<Integer>)i.next();
         System.out.println(node.getItem());
      }
   }
}
