package lab10sepackage;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class testaddstring {

	@Test
	void test() {
		lab10fuctions junitString = new lab10fuctions();
		String result = junitString.addString("lab10", "project");
		assertEquals("lab10project",result);
	}

}
