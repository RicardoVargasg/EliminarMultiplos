import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class EliminarMultiplos {
    public static void main(String[] args) {

        List<Integer> numeros = new ArrayList<>();
        numeros.add(10);
        numeros.add(67);
        numeros.add(15);
        numeros.add(41);
        numeros.add(30);
        numeros.add(61);

        int divisor = 5;

        System.out.println("Lista: " + numeros);

        Iterator<Integer> it = numeros.iterator();

        while (it.hasNext()) {
            Integer num = it.next();

            if (num % divisor == 0) {
                it.remove();
            }
        }

        System.out.println("Lista sin múltiplos de " + divisor + ": " + numeros);
    }
}