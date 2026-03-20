import java.util.ArrayList;
import java.util.Collection;

public class Main {
  public static void main(String[] args) {
    Collection<String> fruits = new ArrayList<>();
    Collection<String> redFruits = new ArrayList<>();

    fruits.add("fresa");
    fruits.add("uvas");
    fruits.add("naranja");

    print("¿Está vacía? " + fruits.isEmpty());
    print("Elementos " + fruits.size());

    print("\nAñadiendo más...\n");

    redFruits.add("manzana");
    redFruits.add("strawberry");

    fruits.addAll(redFruits);

    print("¿Está vacía? " + fruits.isEmpty());
    print("Elementos " + fruits.size());

    print("\nfruits.contains('uvas'): " + fruits.contains("uvas"));
    print("fruits.contains('sandia'): " + fruits.contains("sandia"));

    print("\nfruits.containsAll(redFruits): " + fruits.containsAll(redFruits));
    print("redFruits.containsAll(fruits): " + redFruits.containsAll(fruits));

    print("\nfruits.equals(redFruits): " + fruits.equals(redFruits));

    print("Lista actual:");
    fruits.forEach(apple -> print(apple));
    print("\nEliminando 'manzana'");
    fruits.remove("manzana");
    fruits.forEach(apple -> print(apple));
  }

  public static void print(String msg) {
    System.out.println(msg);
  }
}
