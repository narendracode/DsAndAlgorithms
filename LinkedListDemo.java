public class LinkedListDemo{
        public static void main(String[] args){
           LinkedList<Integer> list = new LinkedList<Integer>();
           list.insertAtBegining(new Node<Integer>(1)); 
           list.insertAtBegining(new Node<Integer>(2)); 
           list.insertAtBegining(new Node<Integer>(3)); 
           list.insertAtBegining(new Node<Integer>(4)); 

           System.out.println("Total Number of elements in list:"+list.size());

           list.insertAtEnd(new Node<Integer>(5));
           list.traverseList();
           
           System.out.println("######## Deletion Test End  ########");
           list.deleteAtEnd();
           list.traverseList();
           System.out.println("######## Deletion Test Start ########");

           list.deleteAtBegining();
           list.traverseList();

        }
}
