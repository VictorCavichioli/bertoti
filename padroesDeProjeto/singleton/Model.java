import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Model {
    private static Model model;
    public String value;

    private Model (String value){
        try {
            Thread.sleep(1000);
        } catch (InterruptedException ex) {
            ex.printStackTrace();
        }
        this.value = value;
    }

    public static Model getInstance(String value){
        if(model == null){
            model = new Model(value);
        }
        return model;
    }

    public static void main(String[] args) {

        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");
        
        System.out.println("If you see the same value, then Model was reused (yay!)" + "\n" +
                "If you see different values, then 2 Models were created (booo!!)" + "\n\n" +
                "RESULT:" + "\n");

        Model model = Model.getInstance(dtf.format(LocalDateTime.now()));
        Model anotherModel = Model.getInstance(dtf.format(LocalDateTime.now()));
        System.out.println(model.value);
        System.out.println(anotherModel.value);
    }
}