public class Stacks {
   //main class 
    public static void main(String [] args) {
      LinkedList myList = new LinkedList(); // create linked list
    
    myList.insertFirst("Oranges");
    myList.insertFirst("Chicken"); //inserting nodes
    myList.insertFirst("Banana");
    myList.insertFirst("Apples");
    myList.match(); //calling match method
     
      System.out.print("\n");
    
    myList.displayABC(); //calls alphabetical order method
    myList.displayFrwd();// calls forward method
    myList.displayBckwrd(); //calls backward method
   
    //shows deleted nodes
    System.out.print("Deleted nodes:");
      Node deletedNode = myList.deleteFirst();
    deletedNode.displayNode();
    deletedNode = myList.deleteFirst();
    deletedNode.displayNode();
    
    System.out.println("");
    
    
    
    

  }
}