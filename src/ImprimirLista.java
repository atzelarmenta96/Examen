import java.util.ArrayList;
import java.util.List;

public class ImprimirLista {
    public static void main(String[] args){
        List<String> miLista = new ArrayList<>();
        miLista.add("Juan");
        miLista.add("Leonardo");
        miLista.add("Patricia");
        miLista.add("Diego");
        miLista.add("Elizabeth");
        miLista.add("Maria");
        miLista.add("Rosa");
        miLista.add("Luis");
        miLista.add("Mariel");

        for (String elemnto : miLista){
            System.out.println(elemnto);
        }
    }

}
