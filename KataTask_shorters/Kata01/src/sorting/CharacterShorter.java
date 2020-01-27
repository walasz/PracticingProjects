package sorting;



public class CharacterShorter {
	
	String result;
	char temp;
	
	
	public CharacterShorter() {
		
	}
	
	
	/**The method removes all white space from the text and makes ever
	 * letter lower case.
	 * 
	 * @param text - input which ha to be formatted
	 * @return result - returns the formatted text
	 */
	public String format(String text) {
		result=text.replaceAll(" ", "").toLowerCase();
		
		return result;
	}
	
	
	/**Converts the given character array to a String.
	 * 
	 * @param array - convertible character array.
	 * @return result - returns the converted array in String form.
	 */
	public String converter(char[] array) {
		
		
		result=String.copyValueOf(array);

		return result;
	}
	
	/**The method that sorts the given string in ascending order.
	 * 
	 * @param text - String to be sorted
	 * @return result - returns the formatted(everything casted to lower case,
	 *  and without white space) and sorted String.
	 */
	public String shorter(String text) {
		
		result=format(text);
		char[] characters = result.toCharArray();
		
		for(int i =0;i<result.length();i++) {
			for(int j =0;j<result.length();j++) {
				if(characters[i]<characters[j]) {
					temp=characters[i];
					characters[i]=characters[j];
					characters[j]=temp;
				}
			}
		}
		
		result=converter(characters);
		
		return result;
	}


	

}
