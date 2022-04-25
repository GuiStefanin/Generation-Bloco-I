package Exercico07;

public class TestePaciente {

	public static void main(String[] args) {
	
		Paciente x = new Paciente();
		
		x.convenio = "Stefanin saúde";
		x.ficha = 12345;
		x.colesterol = 98.5;
		x.doente = true;
		
		x.consulta();
		
		if(x.doente == true) 
			System.out.println("O paciente de ficha é "+x.ficha+" assistido pelo convenio "+x.convenio+" esta com o colesterol "+x.colesterol);

	}
}