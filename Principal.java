package Polimorfismo;

public class Principal {

	public static void main(String[] args) {
		
		Lobo lobo = new Lobo ("Thor", "M", "Qualquer");
		
		System.out.println("----LOBO----");
		System.out.println("Nome: "+ lobo.getNome());
		System.out.println("Sexo: "+ lobo.getSexo());
		System.out.println("Raça: "+ lobo.getRaca());
		System.out.println("\n ");
		lobo.emitirSom();
		lobo.carminhar();
		
		
		Leao leao= new Leao ("Simba", "M", "Qualquer");
		
		System.out.println("----LEÃO----");
		System.out.println("Nome: "+ leao.getNome());
		System.out.println("Sexo: "+ leao.getSexo());
		System.out.println("Raça: "+ leao.getRaca());
		System.out.println("\n ");
		leao.emitirSom();
		leao.correr();
		
		Tigre tigre = new Tigre ("Thor", "M", "Qualquer");
		
		System.out.println("----TIGRE----");
		System.out.println("Nome: "+ tigre.getNome());
		System.out.println("Sexo: "+ tigre.getSexo());
		System.out.println("Raça: "+ tigre.getRaca());
		System.out.println("\n ");
		tigre.emitirSom();
		tigre.dormir();
		
		Cachorro cachorro = new Cachorro ("Meguy", "F", "Qualquer");
		
		System.out.println("----CACHORRO----");
		System.out.println("Nome: "+ cachorro.getNome());
		System.out.println("Sexo: "+ cachorro.getSexo());
		System.out.println("Raça: "+ cachorro.getRaca());
		System.out.println("\n ");
		cachorro.emitirSom();
		
		Gato gato = new Gato ("Nebulosa", "F", "Qualquer");
		
		System.out.println("----GATO----");
		System.out.println("Nome: "+ gato.getNome());
		System.out.println("Sexo: "+ gato.getSexo());
		System.out.println("Raça: "+ gato.getRaca());
		gato.emitirSom();
		System.out.println("\n ");
	

	}

}
