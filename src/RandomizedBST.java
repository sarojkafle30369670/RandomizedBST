public class RandomizedBST {
    private RandomizedBSTNode root;

    private static RandomizedBSTNode nil = new RandomizedBSTNode();



    /** Constructor **/

    public RandomizedBST()

    {

        root = nil;

    }



    /** Function to check if tree is empty **/

    public boolean isEmpty()

    {

        return root == nil;

    }



    /** Make the tree logically empty **/

    public void makeEmpty()

    {

        root = nil;

    }



    /** Functions to insert data **/
    


    public void insert(int X)

    {

        root = insert(X, root);

    }

    private RandomizedBSTNode insert(int X, RandomizedBSTNode T)

    {

        if (T == nil)

            return new RandomizedBSTNode(X, nil, nil);

        else if (X < T.element)

        {

            T.left = insert(X, T.left);

            if (T.left.priority < T.priority)

            {

                 RandomizedBSTNode L = T.left;

                 T.left = L.right;

                 L.right = T;

                 return L;

             }    

        }

        else if (X > T.element)

        {

            T.right = insert(X, T.right);

            if (T.right.priority < T.priority)

            {

                RandomizedBSTNode R = T.right;

                 T.right = R.left;

                 R.left = T;

                 return R;

            }

        }

        return T;

    }



    /** Functions to count number of nodes **/

    public int countNodes()

    {

        return countNodes(root);

    }

    private int countNodes(RandomizedBSTNode r)

    {

        if (r == nil)

            return 0;

        else

        {

            int l = 1;

            l += countNodes(r.left);

            l += countNodes(r.right);

            return l;

        }

    }



    /** Functions to search for an element **/

    public boolean search(int val)

    {

        return search(root, val);

    }

    private boolean search(RandomizedBSTNode r, int val)

    {

        boolean found = false;

        while ((r != nil) && !found)

        {

            int rval = r.element;

            if (val < rval)

                r = r.left;

            else if (val > rval)

                r = r.right;

            else

            {

                found = true;

                break;

            }

            found = search(r, val);

        }

        return found;

    }



    /** Function for inorder traversal **/

    public void inorder()

    {

        inorder(root);

    }

    private void inorder(RandomizedBSTNode r)

    {

        if (r != nil)

        {

            inorder(r.left);

            System.out.print(r.element +" ");

            inorder(r.right);

        }

    }



    /** Function for preorder traversal **/

    public void preorder()

    {

        preorder(root);

    }

    private void preorder(RandomizedBSTNode r)

    {

        if (r != nil)

        {

            System.out.print(r.element +" ");

            preorder(r.left);             

            preorder(r.right);

        }

    }



    /** Function for postorder traversal **/

    public void postorder()

    {

        postorder(root);

    }

    private void postorder(RandomizedBSTNode r)

    {

        if (r != nil)

        {

            postorder(r.left);             

            postorder(r.right);

            System.out.print(r.element +" ");

        }

    }         
}
