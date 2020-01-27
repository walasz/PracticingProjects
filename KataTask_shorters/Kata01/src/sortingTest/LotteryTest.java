package sortingTest;

import static org.junit.jupiter.api.Assertions.*;

import java.util.Random;

import org.junit.jupiter.api.Test;

import sorting.Lottery;

class LotteryTest {
	
	Lottery lotto = new Lottery();
	Random rand = new Random();
	int[] array = new int[rand.nextInt(10)+3];
	
	//Testing the sorter method from Lottery class.
	@Test
	public void testSorter() {
		int[] actual= {9,4,53,11,62,55,79};
		lotto.sorter(actual);
		assertArrayEquals(new int[] {4,9,11,53,55,62,79},actual);
	}
	
	
	//Testing if LotteryDraw gives us back a filled up array;
	@Test
	public void testLotteryDraw() {
		assertFalse(lotto.lotteryDrawn(array, rand)==null);
	}

}
