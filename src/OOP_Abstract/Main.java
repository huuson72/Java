package OOP_Abstract;

public class Main {
  public static void main(String[] args) {
    Shape c = new Circle("Xanh", false);
    Shape r = new Rectangle("Red", false);
    Shape sq = new Square("Black", true);
    System.out.println(c.toString());
    System.out.println(r.toString());
    System.out.println(sq.toString());
  
  } 
    
 
}
