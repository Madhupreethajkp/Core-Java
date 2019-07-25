import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class JUnitExample {

	@Test
	void test() {
		
		String str1=new String("HEllo");
		String str2=new String("HEllo");
		String str3=null;
		String str4="HEllo";
		String str5="HEllo";
		int a=5,b=6;
		assertEquals(str1,str2);
		assertTrue(a<b);
		assertFalse(a>b);
		assertNotNull(str1);
		assertNull(str3);
		assertSame(str4,str5);
	}

}
