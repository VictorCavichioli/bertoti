import java.util.*;

public class Model implements Subject {
	private ArrayList observers;
	private String cpu;
	private String memory;
	private String disk;

	public Model() {
		observers = new ArrayList();
	}

	public void registerObserver(Observer o) {
		observers.add(o);
	}

	public void removeObserver(Observer o) {
		int i = observers.indexOf(o);
		if (i >= 0) {
			observers.remove(i);
		}
	}

	public void notifyObservers() {
		for (int i = 0; i < observers.size(); i++) {
			Observer observer = (Observer)observers.get(i);
			observer.update(cpu, memory, disk);
		}
	}

	public void metricsChanged() {
		notifyObservers();
	}

	public void setMetrics(String cpu, String memory, String disk) {
		this.cpu = cpu;
		this.memory = memory;
		this.disk = disk;
		metricsChanged();
	}

	public String getCpu() {
		return cpu;
	}

	public String getMemory() {
		return memory;
	}

	public String getDisk() {
		return disk;
	}
}
