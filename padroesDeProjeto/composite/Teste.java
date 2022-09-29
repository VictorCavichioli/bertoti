import java.util.ArrayList;
import java.util.List;

public class Teste {

    public static void main(String[] args){
        List<Component> lista = new ArrayList<>();

        Leaf leaf = new Leaf();

        Composite composite = new Composite();

        composite.add(lista, leaf);

        composite.add(lista, leaf);

        composite.add(lista, leaf);

        composite.add(lista, leaf);

        composite.add(lista, leaf);

        for (Component component : lista) {
            System.out.println(component);
        }

        System.out.println(lista);
    }
    
}
