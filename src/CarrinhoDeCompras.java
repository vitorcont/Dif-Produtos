import java.util.HashMap;
import java.util.Map;

public class CarrinhoDeCompras {
	private Map<Produtos, Integer> cart = new HashMap<>();
	private int quantidade;
	private int total;
	
	public CarrinhoDeCompras() {
		// TODO Auto-generated constructor stub
	}
	
	public void adicionaProduto(Produtos novo, int quantidade)
	{
		if(cart.containsKey(novo))
		{
			int valor = cart.get(novo);
			valor+=quantidade;
			this.quantidade=quantidade;
			cart.put(novo, valor);
		}
		else
		{
			this.quantidade=quantidade;
			cart.put(novo, quantidade);
		}
	}
	
	public void removeProduto(Produtos atual, int quantidade)
	{
		if(cart.containsKey(atual))
		{
			if(cart.get(atual)-quantidade<1)
				cart.remove(atual);
				
			else
			{
				int valor = cart.get(atual);
				this.quantidade=valor-quantidade;
				cart.put(atual, this.quantidade);
			}
		}
	}
	
	public int total()
	{
		for(Produtos carrinho  : cart.keySet())
		{
			total+=carrinho.getValor()*cart.get(carrinho);
		}
		return total;
	}
}
