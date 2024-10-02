package Polimorfismo;

public class Dentista extends ProfissionaisSaude {

	String cro;

	public  Dentista ( String nome, String especialidade,int valorConsulta, String cro)  {
		super(nome, especialidade, valorConsulta);
		this.cro = cro;
	}		
	
	public String getCro() {
		return cro;
	}

	public void setCro(String cro) {
		this.cro = cro;
	}

	@Override	
	public void agendarConsulta() {
		System.out.println("Agendando consulta com um Dentista");
	}
}
