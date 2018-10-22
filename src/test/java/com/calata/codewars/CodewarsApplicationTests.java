package com.calata.codewars;

import com.calata.codewars.kyu6.Opstrings;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import static org.junit.Assert.assertEquals;

@RunWith(SpringRunner.class)
@SpringBootTest
public class CodewarsApplicationTests {
	
	private static void testing(String actual, String expected) {
		assertEquals(expected, actual);
	}
	
	@Test
	public void test() {
		System.out.println("Fixed Tests vertMirror");
		String s = "hSgdHQ\nHnDMao\nClNNxX\niRvxxH\nbqTVvA\nwvSyRu";
		String r = "QHdgSh\noaMDnH\nXxNNlC\nHxxvRi\nAvVTqb\nuRySvw";
		testing(Opstrings.oper(Opstrings::vertMirror, s), r);
		s = "IzOTWE\nkkbeCM\nWuzZxM\nvDddJw\njiJyHF\nPVHfSx";
		r = "EWTOzI\nMCebkk\nMxZzuW\nwJddDv\nFHyJij\nxSfHVP";
		testing(Opstrings.oper(Opstrings::vertMirror, s), r);
		
		System.out.println("Fixed Tests horMirror");
		s = "lVHt\nJVhv\nCSbg\nyeCt";
		r = "yeCt\nCSbg\nJVhv\nlVHt";
		testing(Opstrings.oper(Opstrings::horMirror, s), r);
		s = "njMK\ndbrZ\nLPKo\ncEYz";
		r = "cEYz\nLPKo\ndbrZ\nnjMK";
		testing(Opstrings.oper(Opstrings::horMirror, s), r);
	}

}
