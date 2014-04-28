package zx.soft.sent.web.sentiment;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class SearchingDataTest {

	@Test
	public void testTransFq() {
		String fqs = SearchingData.transFq("a:b,c,d");
		assertEquals(fqs, "a:b OR a:c OR a:d");

		fqs = SearchingData.transFq("-a:b,c,d");
		assertEquals(fqs, "-a:b AND -a:c AND -a:d");
	}

}
