class Solution {
    public Node rearrange(Node head) {
        if (head == null || head.next == null) {
            return head;
        }

        Node evenHead = new Node(0);
        Node oddHead = new Node(0);
        Node even = evenHead;
        Node odd = oddHead;
        Node current = head;

        while (current != null) {
            if (current.val % 2 == 0) {
                even.next = current;
                even = even.next;
            } else {
                odd.next = current;
                odd = odd.next;
            }
            current = current.next;
        }

        // Terminate the odd list
        odd.next = null;
        
        // Connect even list to odd list
        even.next = oddHead.next;

        // If no even nodes were found, return the start of the odd list
        return (evenHead.next != null) ? evenHead.next : oddHead.next;