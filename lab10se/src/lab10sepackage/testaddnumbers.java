package lab10sepackage;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class testaddnumbers {

	@Test
	void test() {
		lab10fuctions junit = new lab10fuctions();
		int result = junit.addnumbers(100, 200);
		assertEquals(300,result);
	}

}
