/*  
LINK : https://www.hackerrank.com/challenges/tree-huffman-decoding
   class Node
      public  int frequency; // the frequency of this tree
       public  char data;
       public  Node left, right;   
*/ 
void decode(String S ,Node root)
    {   
      Node move = root;
        String ans = "";
        for(int i=0;i<S.length();i++)
        {
            if(S.charAt(i)=='1')
                move = move.right;
            else
                move = move.left;
            if(move.data !='\0')
            {
                ans += move.data;
                move = root;
            }       
        }
        System.out.println(ans); 
    }
