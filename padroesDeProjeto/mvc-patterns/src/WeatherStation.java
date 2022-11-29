import java.util.*;

public class WeatherStation {

	public static void main(String[] args) {
		final Model model = new Model();
		ControllerTrial controller = new ControllerTrial(model);
		Methods methods = new Methods();
		
		final Timer timer = new Timer();
	      timer.schedule(new TimerTask() {
	        public void run() {
	        	model.setMetrics(methods.printCpuUsage(), methods.printMemoryUsage(), methods.printDiskUsage("C"));
	        }
	      }, 5000);
	      
	      final Timer timer2 = new Timer();
	      timer.schedule(new TimerTask() {
	        public void run() {
	        	model.setMetrics(methods.printCpuUsage(), methods.printMemoryUsage(), methods.printDiskUsage("C"));
	        }
	      }, 30000);
		
	}
	  
}
