package Polimorfismo;

public class PrincipalSaude {

	public static void main(String[] args) {

		ProfissionaisSaude prof= new ProfissionaisSaude ( "João", "Saúde",400);


		System.out.println("----Profissional----");
		prof.agendarConsulta();
		System.out.println("Nome: "+ prof.getNome());
		System.out.println("Especialidades: "+ prof.getEspecialidade());
		System.out.println("Valor da consulta: "+ prof.getValorConsulta());
		System.out.println("\n ");



		Medico med= new Medico ( "Noah", "Saude",480,"123");


		System.out.println("----Médico----");
		med.agendarConsulta();
		System.out.println("Nome: "+ med.getNome());
		System.out.println("Especialidade: "+ med.getEspecialidade());
		System.out.println("Valor da consulta: "+ med.getValorConsulta());
		System.out.println("CRM: "+ med.getCrm());

		System.out.println("\n ");





		Dentista dent= new Dentista ( "Carol", "Saude",485,"3456");

		System.out.println("----Dentista----");
		dent.agendarConsulta();

		System.out.println("Nome: "+ dent.getNome());
		System.out.println("Especialidade: "+ dent.getEspecialidade());
		System.out.println("Valor da consulta: "+ dent.getValorConsulta());
		System.out.println("CRO: "+ dent.getCro());



		Fisioterapeuta fisio = new Fisioterapeuta ( "Sophia", "Saude",550,"098");

		System.out.println("----Fisioterapeuta----");
		fisio.agendarConsulta();

		System.out.println("Nome: "+ fisio.getNome());
		System.out.println("Especialidade: "+ fisio.getEspecialidade());
		System.out.println("Valor da consulta: "+ fisio.getValorConsulta());
		System.out.println("CREFITO: "+ fisio.getCrefito());







	}

}
