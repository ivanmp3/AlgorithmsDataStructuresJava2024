package LinkedList;


class Solution {
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode listR = new ListNode(0);
        ListNode result = listR;

        while (list1 != null && list2 != null) {
            if (list1.val <= list2.val) {
                listR.next = new ListNode(list1.val);
                list1 = list1.next;
            } else {
                listR.next = new ListNode(list2.val);
                list2 = list2.next;
            }
            listR = listR.next;
        }

        if (list1 != null) {
            listR.next = list1;
        } else if (list2 != null) {
            listR.next = list2;
        }

        return result.next;
    }
}
