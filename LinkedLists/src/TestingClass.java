
public class TestingClass {
	
	public static void main(String[] args){
		ListNode myHead1= new ListNode(21); //third
		ListNode nodeOne1= new ListNode(9); //second
		ListNode nodeTwo1= new ListNode(7); //first
		ListNode nodeThree1= new ListNode(30); //fourth
		ListNode nodeFour1= new ListNode(31); //fifth
		
		ListNode myHead2= new ListNode(17); //fourth
		ListNode nodeOne2= new ListNode(1); //first
		ListNode nodeTwo2= new ListNode(3); //second
		ListNode nodeThree2= new ListNode(12); //third
		ListNode nodeFour2= new ListNode(40); //fifth
		
		//cycle
		ListNode myHead3= new ListNode(17); //fourth
		ListNode nodeOne3= new ListNode(1); //first
		ListNode nodeTwo3= new ListNode(3); //second
		ListNode nodeThree3= new ListNode(12); //third
		ListNode nodeFour3= new ListNode(40); //fifth
		//Testing merging two sorted lists
		nodeTwo1.next= nodeOne1;
		nodeOne1.next= myHead1;
		myHead1.next= nodeThree1;
		nodeThree1.next= nodeFour1;
		
		nodeOne2.next= nodeTwo2;
		nodeTwo2.next= nodeThree2;
		nodeThree2.next= myHead2;
		myHead2.next= nodeFour2;
		
		nodeOne3.next= nodeTwo3;
		nodeTwo3.next= nodeThree3;
		nodeThree3.next= myHead3;
		myHead3.next= nodeTwo3;
		
		//ReverseSinglyLinkedLists.ReverseLinkedLists(nodeTwo1).PrintNode();
		TestForCyclity.TestForCyclityMethod(nodeTwo3);
		



		
	}

}
