import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;

public class SubstringTest {
	    
	    @Test
	    public void testSubstringStartIndex_ExactMatch() {
	        String mainString = "Hello World";
	        String subString = "Hello World";
	        int expectedStartIndex = 0;
	        int actualStartIndex = mainString.indexOf(subString);
	        assertEquals(expectedStartIndex, actualStartIndex);
//	    }
//	    
//	    @Test
//	    public void testSubstringStartIndex_SubstringAtBeginning() {
//	        String mainString = "Hello World";
//	        String subString = "Hello";
//	        int expectedStartIndex = 0;
//	        int actualStartIndex = mainString.indexOf(subString);
//	        assertEquals(expectedStartIndex, actualStartIndex);
//	    }
//	    
//	    @Test
//	    public void testSubstringMatching_PartialMatch() {
//	        String mainString = "Hello World";
//	        String subString = "He";
//	        boolean expectedMatching = true;
//	        boolean actualMatching = mainString.contains(subString);
//	        assertEquals(expectedMatching, actualMatching);
//	    }
//	    
//	    @Test
//	    public void testSubstringMatching_ExactMatch() {
//	        String mainString = "Hello World";
//	        String subString = "Hello World";
//	        boolean expectedMatching = true;
//	        boolean actualMatching = mainString.contains(subString);
//	        assertEquals(expectedMatching, actualMatching);
//	    }
//	    
//	    @Test
//	    public void testSubstringMatching_SubstringMismatch() {
//	        String mainString = "Hello World";
//	        String subString = "Goodbye";
//	        boolean expectedMatching = false;
//	        boolean actualMatching = mainString.contains(subString);
//	        assertEquals(expectedMatching, actualMatching);
//	    }
//	    
//	    @Test
//	    public void testSubstringMatching_SingleCharacter() {
//	        String mainString = "Hello World";
//	        String subString = "H";
//	        boolean expectedMatching = true;
//	        boolean actualMatching = mainString.contains(subString);
//	        assertEquals(expectedMatching, actualMatching);
	    }
	}
