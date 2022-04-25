package Exercico07;

public class Paciente {

	String convenio;
	int ficha;
	double colesterol;
	boolean doente;
	
	void consulta() {
		if(this.doente == false)
			System.out.println("Paciente Saudável");
		else
			System.out.println("Paciente necessita de cuidos medicos");
		    
	}
	
	void internar() {
		this.doente = true;
	}
	
	void darAlta() {
		this.doente = false;
	}
		

}
