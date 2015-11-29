import java.util.Random;

public class MergeTwoLists {
	
		public static ListNode mergeTwoSortedLists(ListNode L1,ListNode L2) {
			
			ListNode dummyHead = new ListNode();
			ListNode current = dummyHead;
			ListNode p1 = L1;
			ListNode p2 = L2;
			
			while (p1 != null && p2 != null) {
				
				if (p1.data <= p2.data) {
				current.next = p1;
				p1 = p1.next;
				} else {
				current.next = p2;
				p2 = p2.next;
				}
				current = current.next;
				
			}
			
			current.next = p1 != null ? p1 : p2;
			return dummyHead.next;
			
		}
	
	}

