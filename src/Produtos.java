public class Produtos {
	protected String nome;
	protected int codigo;
	protected int valor;
	
	public Produtos(String nome, int codigo, int valor) {
		super();
		this.nome = nome;
		this.codigo = codigo;
		this.valor = valor;
	}

	@Override
	public boolean equals(Object objeto)
	{
		if(!(objeto instanceof Produtos))
			return false;
		Produtos other = (Produtos) objeto;
		if(this.hashCode() == other.hashCode())
			return true;
		return false;
	}
	
	@Override
	public int hashCode()
	{
		final int prime = 31;
	    int result = 1;
	    result = prime*result+codigo;
	    return result;
	}
	
	public double getValor()
	{
		return valor;
	}
	
	
}
