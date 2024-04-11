import java.util.ArrayList;
import java.util.List;

public class Ejemplo03 {
    public static void main(String[] args) {
        List<String> compras = new ArrayList<>();
        compras.add("leche");
        compras.add("huevo");
        compras.add("jamon");
        compras.add("azucar");

        for (int i = 0; i < compras.size(); i++){
            System.out.println(compras.get(i));

        }
        List<Integer> calificaciones = new ArrayList<>();
        calificaciones.add(10);
        calificaciones.add(8);
        calificaciones.add(9);

        for (int i = 0; i < calificaciones.size(); i++){
            System.out.println(compras.get(i));
        }

    }

}
