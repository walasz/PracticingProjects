package sortingTest;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import sorting.CharacterShorter;

class CharacterSorterTest {
	
	
		CharacterShorter cs = new CharacterShorter();
	
	
	//Test for format method from CharacterShorter class.
	@Test
	public void testFormat() {
		assertEquals("whyareyousoserious?",cs.format("Why are you so serious?"));
	}
	
	//Test for converter method from CharacterShorter class.
	@Test
	public void testConverter() {
		char[] material = {'z','s','e','b'};
		String expected="zseb";
		assertEquals(expected,cs.converter(material));
	}
	
	//Test for sorter method from CharacterShorter class.
	@Test
	public void testShorter() {
		String expected="abdyz";
		assertEquals(expected,cs.shorter("dbayz"));
	}
	
	

}
