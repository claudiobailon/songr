package com.claudiobailon.songr;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import static org.junit.jupiter.api.Assertions.*;


@SpringBootTest
class SongrApplicationTests {

	@Test
	void contextLoads() {
	}
	@Test public void testAlbumConstructor(){
		Album test = new Album("Claudio's Best Hits", "Claudio", 10, 2213,
				"https://thisismypic.com");
		assertEquals("Claudio's Best Hits", test.getTitle());
		assertEquals("Claudio", test.getArtist());
		assertEquals(10, test.getSongCount());
		assertEquals(2213, test.getLength());
		assertEquals("https://thisismypic.com", test.getImageURL());

	}

}
