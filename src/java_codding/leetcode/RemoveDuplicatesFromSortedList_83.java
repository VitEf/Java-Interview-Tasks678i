package java_codding.leetcode;

import java.util.ArrayList;
import java.util.List;

public class RemoveDuplicatesFromSortedList_83 {
    public static class ListNode {
        int val;
        ListNode next;

        ListNode() {
        }

        ListNode(int val) {
            this.val = val;
        }

        ListNode(int val, ListNode next) {
            this.val = val;
            this.next = next;
        }
    }


    public static ListNode deleteDuplicates(ListNode head) {
        ListNode list = head;
        while (list != null) {
            if (list.next == null) break;
            if (list.val == list.next.val) list.next = list.next.next;
            else list = list.next;
        }
        return head;
    }



}
