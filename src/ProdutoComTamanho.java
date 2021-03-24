
public class ProdutoComTamanho extends Produtos {
	private int tamanho;
	public ProdutoComTamanho(String nome, int codigo, int valor, int tamanho) {
		super(nome, codigo, valor);
		this.tamanho=tamanho;
	}
	
	@Override
	public boolean equals(Object objeto)
	{
		if(!(objeto instanceof ProdutoComTamanho))
			return false;
		ProdutoComTamanho other = (ProdutoComTamanho) objeto;
		if(this.hashCode() == other.hashCode())
			return true;
		return false;
		
	}
	
	@Override
	public int hashCode()
	{
		final int prime = 31;
	    int result = 1;
	    result = prime*result+tamanho;
	    return result;
	}
	

}
