public class Node<Item>{
      Item item;
      Node next;
      public Node(Item item){
         this.item = item;
         this.next = null;
      }

      public Node(){
         this.next = null;
      }
      public void setNext(Node newNode){
         this.next = newNode;
      }
      public Node getNext(){
        return this.next;
      }
      public void setItem(Item item){
         this.item = item;
      }
      public Item getItem(){
         return this.item; 
      }
   }

