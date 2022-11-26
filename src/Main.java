import java.util.HashSet;
import java.util.Set;
import java.util.*;

public class Main {
    public static void main(String[] args) {

        Set<Products> productsList = new HashSet<>();

        Products bananas = new Products("Бананы", 99, 1);
        Products orange = new Products("Апельсины", 130, 1);
        Products mandarin = new Products("Мандарины", 120, 1);
        Products apple = new Products("Яблоки", 100, 1);
        Products pineapple = new Products("Ананас", 200, 1);
        Products tomato = new Products("Томаты", 80, 1);

        ServiceProducts products = new ServiceProducts();
        products.add(bananas);
//        products.add(bananas);
        products.add(orange);
        products.add(mandarin);
        products.add(apple);
        products.add(pineapple);
        products.add(tomato);

        tomato.setChecked();

        products.delete(orange);

        System.out.println(products.toString());

        Set<Products> fruits = new HashSet<>();

        Recipe fruitSalad = new Recipe("Фруктовый салат", fruits);
        fruits.add(orange);
        fruits.add(mandarin);
        fruits.add(apple);

        System.out.println();
        System.out.println(fruitSalad);
        System.out.println(fruitSalad.getSum());


    }
}