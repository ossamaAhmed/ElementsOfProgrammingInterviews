
public class TestForCyclity {
	public static ListNode TestForCyclityMethod(ListNode node){
		ListNode firstIterator= node;
		ListNode secondIterator= node;
		while (secondIterator!=null && secondIterator.next!=null 
				&& secondIterator.next.next!=null){
			firstIterator= firstIterator.next;
			secondIterator= secondIterator.next.next;
			if(firstIterator==secondIterator){
				int cycleLength=0;
				secondIterator= secondIterator.next;
				cycleLength++;
				while(firstIterator!=secondIterator){
					secondIterator= secondIterator.next;
					cycleLength++;
				}
				System.out.println("The cycle length is:  "+ cycleLength);
		        ListNode cycleLenAdvancedIter = node;
		        // cycleLenAdvancedIter pointer advances cycleLen first.
		        while (cycleLength-- > 0) {
		          cycleLenAdvancedIter = cycleLenAdvancedIter.next;
		        }

		        ListNode iter = node;
		        // Both iterators advance in tandem.
		        while (iter != cycleLenAdvancedIter) {
		          iter = iter.next;
		          cycleLenAdvancedIter = cycleLenAdvancedIter.next;
		        }
				return iter;
			}
		}
		return null;
	}
}
