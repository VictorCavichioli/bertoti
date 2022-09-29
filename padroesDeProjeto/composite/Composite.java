import java.util.List;

public class Composite implements Component {

    public void add (List<Component> lista, Component component){
        lista.add(component);
    }
    
}
