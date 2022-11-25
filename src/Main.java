import java.util.HashSet;
import java.util.Set;

public class Main {
    public static void main(String[] args) {

        HashSet<Products> products = new HashSet<>();

        Products bananas = new Products("Бананы", 100, 5);
        products.add(bananas);
        Products mandarin = new Products("Мандарины", 90, 2);
        products.add(mandarin);
        Products orange = new Products("Апельсины", 125, 3);
        products.add(orange);
        Products apple = new Products("Яблоки", 150, 4);
        products.add(apple);
        Products pineapple = new Products("Ананас", 120, 7);
        products.add(pineapple);
        Products potatos = new Products("Картофель", 50, 1);
        products.add(potatos);
        products.add(new Products("Молоко", 2, 1));

        for (Products product : products) {
            System.out.println(product);
        }
        products.remove(potatos);
        System.out.println();
        for (Products product : products) {
            System.out.println(product);
        }




    }

    public static void productChecked(Products products) {

    }

}