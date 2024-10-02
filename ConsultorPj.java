package Polimorfismo;

public class ConsultorPj extends Funcionario {

	public  ConsultorPj (int id, String nome, String telefone, int matricula, String endereco)  {
	      super(id, nome, telefone, matricula, endereco);
		
	}
	
	@Override
	public double CalcularSalario(double valorTotal, double Imposto) {
		return valorTotal- Imposto;
		
	}
}
