
public class Node {
    //    private int value;
//    private Node left;
//    private Node right;
    
    public int value;
    public Node left;
    public Node right;

    public Node(int value) {
        this.value = value;
        this.left = null;
        this.right = null;
    }
    //in order to follow the rules we would need to add getters and setters 
    //we changed from private to public here to access every individual node
}
