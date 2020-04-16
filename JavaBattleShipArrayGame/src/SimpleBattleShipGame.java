

/**
 * 
 */

/**
 * @author melo
 * this is a simple version of a battleship game
 * as shown  from the book HEAD FIRST JAVA by Kathy Siera and Bert Bates
 * 
 */
public class SimpleBattleShipGame {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*int[] locations = {3,4,5};
		
		ShipArray ship = new ShipArray();
		
		ship.setLocaionCells(locations);
		
		String result = ship.checkYourself("2");
		
		String testResult = "failed!";
		
		if(result.equals("hit") )  {
			
			testResult = "passed";
		}
		
		System.out.print(testResult); 
		*/
		
		/*// (1) define your java int array
		int[] intArray = new int[] {4,5,6,7,8};

		// (2) print the java int array
		for (int i=0; i<intArray.length; i++)
		{
		  System.out.println(intArray[i]);
		}*/
		
		int userGuessCount = 0;
		boolean gameIsAlive = true;
				
		GameHelper helper = new GameHelper();
		
		ShipArray ship = new ShipArray();
		
		int randomNum = (int) (Math.random() * 5);
		
		int[] locations = {randomNum, randomNum+1, randomNum+2};
		
		for(int element : locations) {
			System.out.print(element);
		}
		ship.setLocationCells(locations);
		
		while(gameIsAlive == true) {
			
			String guess = helper.getUserInput("type here ");
			
			String result = ship.checkYourself(guess);
			System.out.println(result);
			userGuessCount++;
			
			if(result.equals("kill")) {
				gameIsAlive = false;
				
				System.out.print("guess count is " + userGuessCount );
			}//end if
		
		}//end while
	}//end main

}//end class
