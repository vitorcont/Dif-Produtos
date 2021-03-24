import static org.junit.Assert.*;

import org.junit.Test;

public class TestesProduto {

	@Test
	public void test1() {
		Produtos p = new Produtos("Meia", 30, 40);
		Produtos p1 = new Produtos("Camiseta", 32, 40);
		assertEquals(p.equals(p1), p1.equals(p));
	}
	
	public void test2() {
		Produtos p = new Produtos("Meia", 30, 40);
		Produtos p1 = new Produtos("Camiseta", 32, 40);
		assertEquals(p.hashCode(), p1.hashCode());
	}
	


}
