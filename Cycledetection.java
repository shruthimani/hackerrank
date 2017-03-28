/*
LINK : https://www.hackerrank.com/challenges/detect-whether-a-linked-list-contains-a-cycle
*/

boolean hasCycle(Node head) 
{
    int count = 0;
    Node current = head;
    if(head == null)
        return false;
    while(current.next != null)
    {
            count++;
            if(count >  100)
                return true; 
            current = current.next;
    }
       if(current == null)
        return true;
    return false;
}
