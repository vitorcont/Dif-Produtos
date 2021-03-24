import static org.junit.Assert.*;

import org.junit.Test;

public class TesteCarrinho {

	@Test
	public void test()
	{
		Produtos p = new Produtos("Meia", 30, 10);
		Produtos p1 = new Produtos("Camiseta", 32, 10);
		CarrinhoDeCompras c1 = new CarrinhoDeCompras();
		c1.adicionaProduto(p, 3);
		c1.adicionaProduto(p1, 4);
		c1.removeProduto(p1, 2);
		assertEquals(50,c1.total());
	}

}
