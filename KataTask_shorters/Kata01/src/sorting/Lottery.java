package sorting;

import java.util.Random;

public class Lottery {

	private final int lotteryNumberCount=60;
	private Random rand;
	private int [] balls;
	private int temporary;

	
	public Lottery() {
		
	}
	
	/** This method returns a int[] array with the drawn lottery balls.
	 * 
	 *
	 * 
	 * @return balls
	 */
	public  int[] lottery() {
		rand = new Random();
		balls = new int[rand.nextInt(10)+3];
		balls=lotteryDrawn(balls,rand);
		sorter(balls);
		
		return balls;
	}
	
	
	/**This method which actually draws the balls for our lottery program.
	 * 
	 * 
	 * @param array an array to store the drawn numbers
	 * @param rand random number generator
	 * @return the array with filled up random numbers
	 */
	public  int[] lotteryDrawn(int [] array, Random rand) {
		
		for(int i = 0;i<array.length;i++) {
			temporary = rand.nextInt(lotteryNumberCount);
			for(int j=0;j<array.length;j++) {
				if(temporary==array[j]) {
					temporary = rand.nextInt(lotteryNumberCount);
					array[i]=temporary;
				}else array[i]=temporary;
			}
		}
		
		return array;
	}
	

	 /**A method which sorts the given array.
	  * 
	  * @param array - array which has to be sorted.
	  */
	 public  void sorter(int[] array) {
		for(int i = 0; i<array.length-1;i++) {
			for(int j = i+1;j<array.length;j++) {
			if(array[j]==array[i]) {
				lottery();
			}
				
			if(array[j]<array[i]) {
				temporary=array[i];
				array[i] = array[j];
				array[j]=temporary;
			}
			}
		}
	}
}
