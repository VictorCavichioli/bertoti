import java.util.ArrayList;


public class Escola implements Subject{
	
	private ArrayList observers;
	private Aluno a;
	
	public Escola(){
		observers = new ArrayList();
	}
	
	public void registerObserver(Observar o){
		observers.add(o);
	}
	
	public void removeObserver(Observar o){
		int i = observers.indexOf(o);
		if (i >= 0) {
			observers.remove(i);
		}
	}
	
	public void notifyObservers(double novaNota){
		for (int i = 0; i < observers.size(); i++) {
			Observer observer = (Observer)observers.get(i);
			observer.update(novaNota);
		}
	}
	
	public double negativar(Aluno a, double valor){
		
		a.nota = a.nota - valor;
		
		notifyObservers(a.nota);
		return a.nota;
		
	}

}