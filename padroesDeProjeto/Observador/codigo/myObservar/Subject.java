package myObservar;
import myObservar.Observar;

public interface Subject {
    
    public void registerObserver(Observar o);
	public void removeObserver(Observar o);
	public void notifyObservers(double novoSaldo);

}
