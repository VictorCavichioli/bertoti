package myAntObserver;

public class TelaPc extends Notificacao{
    
    public String update(String nota){
		
		String retorno = notificar(nota);
		
        return retorno;
	}
	
	public void display(double n){
		
		System.out.println("Tela do Pc");
		System.out.println("Sua nota foi atualizada e agora é: "+n);
	}

}
