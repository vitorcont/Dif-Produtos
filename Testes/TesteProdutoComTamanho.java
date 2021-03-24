import static org.junit.Assert.*;

import org.junit.Test;

public class TesteProdutoComTamanho {

	@Test
	public void test1() {
		ProdutoComTamanho p = new ProdutoComTamanho("Meia", 30, 40,10);
		ProdutoComTamanho p1 = new ProdutoComTamanho("Camiseta", 32, 40,30);
		assertEquals(p.equals(p1), p1.equals(p));
	}
	@Test
	public void test2() {
		ProdutoComTamanho p = new ProdutoComTamanho("Meia", 30, 40,10);
		ProdutoComTamanho p1 = new ProdutoComTamanho("Camiseta", 32, 40,10);
		assertEquals(p.hashCode(), p1.hashCode());
	}

}
