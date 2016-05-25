import static org.junit.Assert.*;

import java.util.UUID;

import org.junit.Test;

public class UUIDTest {

	@Test
	public void test() {
		
		String id = "1229";
		String uuid = UUID.nameUUIDFromBytes(id.getBytes()).toString();
		assertEquals("310ce61c-90f3-346e-b40e-e8257bc70e93", uuid);
	}

}
