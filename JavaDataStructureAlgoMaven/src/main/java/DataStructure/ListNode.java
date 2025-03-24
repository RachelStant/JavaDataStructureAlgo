package DataStructure;

import java.util.HashSet;
import java.util.Set;

public class ListNode {
    int val;
    ListNode next;
    ListNode() {};
    ListNode(int val) { this.val = val; }
    ListNode(int val, ListNode next) {this.val = val; this.next = next;}


    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        Set<ListNode> visited = new HashSet<>();
        ListNode current = this;

        while(current != null) {
            if(visited.contains(current)) {
                sb.append("circular ref detected");
                break;
            }
            visited.add(current);
            sb.append(current.val);
            if (current.next != null) {
                sb.append(" -> ");
            }
            current = current.next;

        }
        return sb.toString();
    }


}
