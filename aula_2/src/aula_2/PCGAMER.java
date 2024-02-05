package aula_2;

public class PCGAMER { 

	public String marca;
	public String modelo;
	public int lancamento;
	public int preco;
	
	public void Latir(){
			System.out.println("o PC explodiu: "
	+ marca + "ligou");		
	}
	
	public void GetPLACAMAE(){
		System.out.println(
				"marca: " + marca +
				"\nmodelo:" + modelo +
				"\nlancamento: " + lancamento +
				"\npreco: " + preco
				);
	}
	
}