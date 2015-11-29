
public class ReverseSinglyLinkedLists {
	
	public static ListNode ReverseLinkedLists(ListNode node){
		
		ListNode currentNode= node;
		ListNode nextNode= node.next;
		currentNode.next=null; //head's one
		while(nextNode!=null){
			ListNode temp= nextNode.next;
			nextNode.next=currentNode;
			currentNode= nextNode;
			nextNode=temp;
		}
		
		return currentNode;
	}

}
