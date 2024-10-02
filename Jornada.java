package Polimorfismo;

public class Jornada extends Funcionario {

	public  Jornada(int id, String nome, String telefone, int matricula, String endereco)  {
		super(id, nome, telefone, matricula, endereco);

	}

	@Override
	public double CalcularSalario(double salarioHora, double horaTrabalhada ) {
		return salarioHora * horaTrabalhada  ;

	}
}
