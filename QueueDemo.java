public class QueueDemo{
   public static void main(String[] args){
      Queue<Integer> queue = new Queue<Integer>();
      queue.enqueue(new Node<Integer>(1));
      queue.enqueue(new Node<Integer>(2));
      queue.enqueue(new Node<Integer>(3));
      System.out.println("After enqueue..... size of Queue:"+queue.size());
      queue.iterate();

      System.out.println("After dequeue 1....");
      queue.dequeue();
      System.out.println("Size of queue:"+queue.size());
      queue.iterate();

      System.out.println("After dequeue 2....");
      queue.dequeue();
      System.out.println("Size of queue:"+queue.size());
      queue.iterate();
   }

}
