public class Main {
    static void main() {
        Producto p1 = new Producto();
        Producto p2 = new Producto();

        p1.setNombre("Oreo");
        p1.setCategoria("Dulces");
        p1.setStock(96);
        p1.setPrecio(0.75);

        p2.setNombre("Switch");
        p2.setCategoria("Consola");
        p2.setStock(-96);
        p2.setPrecio(500);

        System.out.println("Producto 1");
        p1.mostrarInformacion();
        System.out.println("\nProducto 2");
        p2.mostrarInformacion();

        System.out.println("\nActualizar stock");
        p1.aumentarStock(-54);
        p2.aumentarStock(150);

        System.out.println("Producto 1");
        p1.mostrarInformacion();
        System.out.println("\nProducto 2");
        p2.mostrarInformacion();
    }
}
