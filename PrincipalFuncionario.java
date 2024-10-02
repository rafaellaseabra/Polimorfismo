package Polimorfismo;

public class PrincipalFuncionario {

	public static void main(String[] args) {

		Funcionario funcionario = new Funcionario (1, "João", "998909090",1234, "Rua: Vila doce encanto,204");


		System.out.println("----Funcinário----");
		System.out.println("Nome: "+ funcionario.getNome());
		System.out.println("ID: "+ funcionario.geId());
		System.out.println("Telefone "+ funcionario.getTelefone());
		System.out.println("Matricula "+ funcionario.getMatricula());
		System.out.println("Endereço "+ funcionario.getEndereco());
		System.out.println("Salário total do João: ");
		System.out.println(funcionario.CalcularSalario(12000, 1000));
		System.out.println("\n ");

		Horista funcionarioHorista = new Horista (2, "Joaquim", "998964390",124, "Rua: Vila encanto,24");


		System.out.println("----Horista----");
		System.out.println("Nome: "+ funcionarioHorista.getNome());
		System.out.println("ID: "+ funcionarioHorista.geId());
		System.out.println("Telefone "+ funcionarioHorista.getTelefone());
		System.out.println("Matricula "+ funcionarioHorista.getMatricula());
		System.out.println("Endereço "+ funcionarioHorista.getEndereco());
		System.out.println("Salario total do Joaquim: ");
		System.out.println(funcionarioHorista.CalcularSalario(120, 200));
		System.out.println("\n ");

		Jornada funjornada= new Jornada (3, "Cecília", "994976080",134, "Rua: Vila aurora,4");


		System.out.println("----Jornada----");
		System.out.println("Nome: "+ funjornada.getNome());
		System.out.println("ID: "+ funjornada.geId());
		System.out.println("Telefone "+ funjornada.getTelefone());
		System.out.println("Matricula "+ funjornada.getMatricula());
		System.out.println("Endereço "+ funjornada.getEndereco());
		System.out.println("Salario total da Cecília: ");
		System.out.println(funjornada.CalcularSalario(150, 200));
		System.out.println("\n ");
		
		ConsultorPj funPJ= new ConsultorPj (4, "Rafael", "994911180",123, "Rua: Vila rio preto,78");


		System.out.println("----Consultor Pj----");
		System.out.println("Nome: "+ funPJ.getNome());
		System.out.println("ID: "+ funPJ.geId());
		System.out.println("Telefone "+ funPJ.getTelefone());
		System.out.println("Matricula "+ funPJ.getMatricula());
		System.out.println("Endereço "+ funPJ.getEndereco());
		System.out.println("Salario total do Rafael ");
		System.out.println(funPJ.CalcularSalario(40000, 5000));
		System.out.println("\n ");




	}

}
