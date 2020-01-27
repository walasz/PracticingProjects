package sorting;



public class Main {
	
	


	
	public static void main(String[] args) {
		Lottery lotto = new Lottery();
		
		int[]lotteryNums=lotto.lottery();
		
	//	for(int i : lotteryNums) {
	//		System.out.print(i+" ");
	//	}
		
		CharacterShorter cs = new CharacterShorter();
		String smth="This is a great practice and i solved it";
//		
		System.out.println(cs.shorter(smth));
//		for(int i = 0;i<smth.length();i++)
//		System.out.print(" "+smth.codePointAt(i));
//		char z = 'z';
		
	//	char[]result=cs.shorter(smth);
	//	for(char i: result)
	//	System.out.print(i);
		
	}

}
