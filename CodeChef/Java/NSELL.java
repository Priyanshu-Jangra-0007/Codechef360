class Solution {
    public Node nextSmallerValue(Node head) {
        Stack<Node> nodeStack = new Stack<>(); // Stack to keep nodes with unresolved next 
            smaller value
        Node current = head;

        while (current != null) {
            // Pop nodes that have a larger value than the current node's value
            while (!nodeStack.isEmpty() && nodeStack.peek().val > current.val) {
                nodeStack.peek().val = current.val; // Update the value to the next smaller 
                    value
                nodeStack.pop();
            }
            // Push the current node onto the stack
            nodeStack.push(current);
            // Move to the next node
            current = current.next;
        }

        // For any remaining nodes in stack, set next smaller value to -1
        while (!nodeStack.isEmpty()) {
            nodeStack.peek().val = -1;
            nodeStack.pop();
        }

        return head; // Return the modified list
    }
}