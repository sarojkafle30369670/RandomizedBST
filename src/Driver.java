import java.util.Scanner;
public class Driver {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        /** Creating object of RandomizedBST **/

        RandomizedBST trpt = new RandomizedBST(); 

        System.out.println("RandomizedBST Test\n");          

        char ch;

        /**  Perform tree operations  **/
         

        do    

        {

            System.out.println("\nRandomizedBST Operations\n");

            System.out.println("1. insert ");

            System.out.println("2. search");

            System.out.println("3. count nodes");

            System.out.println("4. check empty");

            System.out.println("5. clear");

 

            int choice = scan.nextInt();            

            switch (choice)

            {

            case 1 : 

                System.out.println("Enter integer element to insert");

                trpt.insert( scan.nextInt() );                    

                break;                          

            case 2 : 

                System.out.println("Enter integer element to search");

                System.out.println("Search result : "+ trpt.search( scan.nextInt() ));

                break;                                          

            case 3 : 

                System.out.println("Nodes = "+ trpt.countNodes());

                break;     

            case 4 : 

                System.out.println("Empty status = "+ trpt.isEmpty());

                break;

            case 5 : 

                System.out.println("\nRandomizedBST Cleared");

                trpt.makeEmpty();

                break;            

            default : 

                System.out.println("Wrong Entry \n ");

                break;   

            }
            

            /**  Display tree  **/ 

            System.out.print("\nPost order : ");

            trpt.postorder();

            System.out.print("\nPre order : ");

            trpt.preorder();    

            System.out.print("\nIn order : ");

            trpt.inorder();

 

            System.out.println("\nDo you want to continue (Type y or n) \n");

            ch = scan.next().charAt(0);                    

        } while (ch == 'Y'|| ch == 'y');                 
    }
    // RandomizedBSTNode n = new RandomizedBSTNode(10);
    //     RandomizedBST tree = new RandomizedBST(n);

    //     tree.nodeInsert(5);
    //     tree.nodeInsert(15);
    //     tree.nodeInsert(2);
    //     tree.nodeInsert(6);
    //     tree.nodeInsert(14);
    //     tree.nodeInsert(20);
    //     tree.nodeInsert(21);
    //     tree.nodeInsert(19);
    //     tree.nodeInsert(17);
    //     tree.nodeInsert(18);

    //     tree.printPreorder();
    //     System.out.println();
    //     tree.nodeDelete(15);
    //     tree.printPreorder();
    //     System.out.println();

    //     tree.rootInsert(11);
    //     tree.printPreorder();
    //     System.out.println();
        
    //     tree.rootSearch(14);
    //     tree.printPreorder();
    //     System.out.println();
}
