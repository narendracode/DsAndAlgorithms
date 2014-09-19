public class LinkedList<Item>{
   private Node head;
   public LinkedList(){
        head = new Node<Item>();
   }
  public void insertAtEnd(Node<Item> newNode){
      if(head.getNext() == null){
        head.setNext(newNode);
      }else{
         Node node = head.getNext();
        while(node.getNext()!=null){
           node = node.getNext();
        }//while
        node.setNext(newNode);
      }//else
   }

  public void insertAtBegining(Node<Item> newNode){
     if(this.isEmpty()){
        insertAtEnd(newNode);
     }else{
        newNode.setNext(head.getNext());
        head.setNext(newNode);
     }
  }

   public void deleteAtEnd(){
      if(isEmpty())
         System.out.println("List is empty.");
      else if(size()==1){
         head.setNext(null);
      }else{
         Node node = head.getNext();
         Node prevNode = null;
         while(node.getNext()!=null){
            prevNode = node;
            node = node.getNext();
         }
         prevNode.setNext(null);
      }
   }

   public void deleteAtBegining(){
      Node node = head.getNext().getNext();
      head.setNext(node);
   }
   public void traverseList(){
        Node node = head.getNext();
        if(node!=null){
           System.out.println("value:"+node.getItem());
           while(node.getNext()!=null){
              node = node.getNext();
              System.out.println("value:"+node.getItem());
           }
        }
   }//traverseList()

   public int size(){
        int size = 0;
        if(head.getNext()!=null){
           Node node = head.getNext();
           while(node!=null){
                node = node.getNext();
                size++;
           }
        }
        return size;
   }

   public boolean isEmpty(){
      if(head.getNext()==null)
         return true;
      else
         return false;
   }
}
