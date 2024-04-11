public class Ejemplo01 {
    public static void main(String[] args) {
        Venado bambi = new Venado();
        Herbivoro h = bambi;
        Animal a = bambi;
        Object o = bambi;

        System.out.println("Venado: " + (bambi instanceof Venado));
        System.out.println("Herbivoro: " + (bambi instanceof Herbivoro));
        System.out.println("Animal: " + (bambi instanceof Animal));
        System.out.println("Objeto: " +(bambi instanceof Object) );

    }
}
