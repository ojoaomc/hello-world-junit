import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class OlaMundoTeste {

	@Test
	void testOlaMundo() {
		OlaMundo olaMundo = new OlaMundo();
		assertEquals("Hello, World!", olaMundo.olaMundo());
	}

}
