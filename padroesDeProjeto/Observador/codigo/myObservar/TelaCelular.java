package myObservar;

public class TelaCelular implements Observar{
	
	public void update(double nota){
		
		display(nota);
		
	}
	
	public void display(double n){
		
		System.out.println("Tela do Celular");
		System.out.println("Sua nota foi atualizada e agora é: "+n);
	}

}

