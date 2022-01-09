
import java.util.Random;
public class RandomizedBSTNode {
    RandomizedBSTNode left, right;

    int priority, element;



    /** Constructor **/    

    public RandomizedBSTNode()

    {

        this.element = 0;

        this.left = this;

        this.right = this;

        this.priority = Integer.MAX_VALUE;

    }    


    /** Constructor **/    

    public RandomizedBSTNode(int ele)

    {

        this(ele, null, null);

    } 



    /** Constructor **/

    public RandomizedBSTNode(int ele, RandomizedBSTNode left, RandomizedBSTNode right)

    {

        this.element = ele;

        this.left = left;

        this.right = right;

        this.priority = new Random().nextInt( );

    }    

   //performs a right rotation at the node and returns the new root
   static RandomizedBSTNode rightRotation(RandomizedBSTNode node) {
    if (node == null) {
        return null;
    }
    if (node.left == null) {
        return node;
    }
    RandomizedBSTNode temp = node;
    node = node.left;
    temp.left = node.right;
    node.right = temp;

    return node;
}
//performs a left rotation at the node and returns the new root
static RandomizedBSTNode leftRotation(RandomizedBSTNode node) {
    if (node == null) {
        return null;
    }
    if (node.right == null) {
        return node;
    }
    RandomizedBSTNode temp = node;
    node = node.right;
    temp.right = node.left;
    node.left = temp;

    return node;
}
    


}