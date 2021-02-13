class Node {
   //properties
 public String data; //data in node
  public Node previous; //points to next node in list
  public Node next; //points to previous node in list 
  
  //Constructors
  public Node(String data) {
    this.data = data;
    
  } //
  
  //display nodes data
  public void displayNode() {
    System.out.print(data + "");
  }
