package myAntObserver;

public class TelaCelular extends Notificacao{
    
    public String update(String nota){
		
		String retorno = notificar(nota);
		
        return retorno;
	}
	
	public void display(double n){
		
		System.out.println("Tela do Celular");
		System.out.println("Sua nota foi atualizada e agora é: "+n);
	}

}
