package Polimorfismo;

public class Medico extends ProfissionaisSaude {

	String crm;

	public  Medico ( String nome, String especialidade,int valorConsulta, String crm)  {
		super(nome, especialidade, valorConsulta);
		this.crm = crm;
	}		

	public String getCrm() {
		return crm;
	}

	public void setCrm(String crm) {
		this.crm = crm;
	}

	@Override	
	public void agendarConsulta() {
		System.out.println("Agendando consulta com um médico");
	}







}

