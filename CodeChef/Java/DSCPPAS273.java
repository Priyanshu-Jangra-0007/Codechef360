import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

// Link list Node
class Node {
    int data;
    Node next;
    
    Node(int x) {
        data = x;
        next = null;
    }
}

public class Main {

    // Function to find intersection point in Y shaped Linked Lists
    public static int intersectPoint(Node head1, Node head2) {
        // Create a set to store the nodes of the first list
        Set<Node> nodes = new HashSet<>();
        
        // Traverse the first list and store each node in the set
        Node temp1 = head1;
        while (temp1 != null) {
            nodes.add(temp1);
            temp1 = temp1.next;
        }
        
        // Traverse the second list and check for intersection
        Node temp2 = head2;