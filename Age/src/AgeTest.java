import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

public class AgeTest {
	
Age age;	
@Before
public void intialize()
{
	age=new Age();
}

	@Test
	public void test() {	
		assertEquals("Age is Valid to Vote",age.AgeValidation(19));
	}
	@Test
	public void test1() {
		assertEquals("Age is not Valid",age.AgeValidation(11));
		
	}
}
