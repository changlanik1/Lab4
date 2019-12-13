/**
 * This class implements the LRU page-replacement strategy.
 */

public class LRU extends ReplacementAlgorithm
{
	// LRU list of page frames
	private LRUList frameList;

	/**
	 * @param pageFrameCount - the number of physical page frames
	 */
	public LRU(int pageFrameCount) {
		super(pageFrameCount);
		frameList = new LRUList(pageFrameCount);
	}

	/**
	 * Insert a page into a page frame.
	 */
	public void insert(int pageNumber) {
	/*	frameList.insert(pageNumber);
		if (System.getProperty("debug") != null) {
			System.out.print("Inserting " + pageNumber);
			frameList.dump();
			System.out.println();
		}
          */
	}
		
	class LRUList
	{
		// the page frame list
		int[] pageFrameList;

		// the number of elements in the page frame list
		int elementCount;



		LRUList(int pageFrameCount) {
			pageFrameList = new int[pageFrameCount];
			elementCount = 0;
		}

		/**
		 * @param pageNumber the number of the page to be 
		 *	inserted into the page frame list.
		 */
		void insert(int pageNumber) {
                /*  		
			int searchVal;

			// if we didn't find it, replace the LRU page
			if ((searchVal = search(pageNumber)) == -1) { 
				if (System.getProperty("debug") != null)
					System.out.print("*");

			}
			else if (pageNumber != lastInserted) 
				/**
				 * We only update the page table if the page being
				 * referenced was not the last one referenced.
				 * If it was the last page referenced, leave the
				 * page table as is.
				 */
		//		updatePageTable(searchVal);
                  
		}

		/**
		 * @param int searchVal - the index to be updated
		 */
		void updatePageTable(int searchVal) {



		}

		void dump() {
			for (int i = 0; i < pageFrameList.length; i++)
				System.out.print("["+i+"]"+pageFrameList[i]+", ");
			System.out.print(" element count = " + elementCount);
		}


		/**
		 * Searches for page pageNumber in the page frame list
		 * @return non-negative integer if pageNumber was found
		 * @return -1 if pageNumber was not found
		 */
		int search(int pageNumber) {

			
			
			//return pageNumber
				return pageNumber;

		}
	}
}