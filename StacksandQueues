//class that contains methods
public class StacksandQueues { 
 private Node first;  //ref to first link on linkedlist
  private Node last; //red to last link on linkedlist 
    
    //constructor
    public LinkedList() {
    first = null;
  }
    
    //insert new node of doubly linked list 
    public void insertFirst(String data) {
      Node newNode = new Node(data); //creating new node
      if(first == null) 
        last = newNode; 
      else
        first.previous = newNode; 
        newNode.next = first;
        first = newNode;
    }
    //deletes a node from the list
    public Node deleteFirst() {
      if(first == null){
        throw new LinkedListEmptyException("Linked list doesnt contain any nodes");  
      }
      Node tempNode = first;
      if(first.next == null)
        last = null;
      else
        first.next.previous = null;
      first = first.next;
      return tempNode;
    }
       //Display in alphabetical orderr
    public void displayABC() {
      System.out.print("Displaying in Alphabetical order");
      Node tempDisplay = first;
      while(tempDisplay != null) {
        tempDisplay.displayNode();
        tempDisplay = tempDisplay.next;
      }
      System.out.println("");
    }
    //Display lists forward and print 
    public void displayFrwd() {
      System.out.print("Displaying in forward direction");
      Node tempDisplay = first;
      while(tempDisplay != null) {
        tempDisplay.displayNode();
        tempDisplay = tempDisplay.next;
      }
      System.out.println("");
    }
    
    //Display list backwards
    public void displayBckwrd() {
      System.out.print("Display in backward direction");
      Node tempDisplay = last;
      while(tempDisplay !=null) {
        tempDisplay.displayNode();
        tempDisplay = tempDisplay.previous;
      }
      System.out.println("");
    }
    //method to compare a node to a string 
    public void match() {
    String str1 = "orange";
    String str4 = "apple";
    int result = str1.compareTo( str4 );
    System.out.print(result);
    }
    

}
      
