import java.util.Scanner;

/**
 * 
 */

/**
 * @author melo
 *
 */
public class ShipArray {

	int[] locationCells;
	int numOfHits = 0;
	

	void setLocationCells(int[] locs) {

		locationCells = locs;

	}// end seLocationCells

	public String checkYourself(String stringGuess) {

		int guess = Integer.parseInt(stringGuess);
		
		String result = "miss";
		
		for(int cell : locationCells) {
			
			if (guess == cell ) {
				
				result =  "hit";
				numOfHits++;
			} // end if
			
			if(numOfHits == locationCells.length) {
				return "kill";
			}//end if
			
		}
		
		return result;
			
		
	}// end checYourself
	
}
