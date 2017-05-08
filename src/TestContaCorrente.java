import static org.junit.Assert.*;
import org.junit.Test;

public class TestContaCorrente
{
	@Test
	public void testBancoBrasil()
	{
		VerificadorDigitosBancario verificador = new VerificadorDigitosBancario();
		assertTrue(verificador.verificaAgencia("1254-8"));
		assertTrue(verificador.verificaAgencia("4684-1"));
		
		assertFalse(verificador.verificaAgencia("1254-2"));
		assertFalse(verificador.verificaAgencia("4684-X"));

		assertFalse(verificador.verificaAgencia("125422-2"));
		assertFalse(verificador.verificaAgencia("46X"));

		assertTrue(verificador.verificaContaCorrente("13798-7"));
		assertTrue(verificador.verificaContaCorrente("18530-2"));
		assertTrue(verificador.verificaContaCorrente("05473-9"));

		assertTrue(verificador.verificaAgencia("1222-X"));
	}
}