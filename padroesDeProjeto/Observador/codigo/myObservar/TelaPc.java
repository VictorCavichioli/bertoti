package myObservar;

public class TelaPc implements Observar {
    
    public void update(double nota){
		
		display(nota);
		
	}
	
	public void display(double n){
		
		System.out.println("Tela do Computador");
		System.out.println("Sua nota é: "+ n);
	}
}
