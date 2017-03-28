/*
LINK : https://www.hackerrank.com/challenges/detect-whether-a-linked-list-contains-a-cycle
*/

boolean hasCycle(Node node) {
        Node slow = node, fast = node;
        while (slow != null && fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
 
            // If slow and fast meet at same point then loop is present
            if (slow == fast) {
                return true;
            }
        }
    return false;
}
