public class Cajero {
    public static void main(String[] args) {
       System.out.println("Prueba para valores invalidos");
       Producto pvacio = new Producto(" ", 4, 25.0);
       Producto pespacio = new Producto(" ", 4, 30.0);
       System.out.println("Caso vacio: "+pvacio.getNombre());
       System.out.println("Caso vacio: "+pespacio.getNombre());

       System.out.println("Pureba para precios ivalidos");
       Producto pinvalido = new Producto("leche", 4, 0);
       Producto pinval = new Producto("Celular", 2, -15.0);
       System.out.println("Caso de precio cero: "+pinvalido.getPrecio());
       System.out.println("Caso de precio cero: "+pinval.getPrecio());
       
       System.out.println("Prueba para opcion de departamento");
       Producto pdep1 = new Producto("Palyera", 1, 500.0);
       Producto pdep2 = new Producto("Audifonos", 2, 900.0);
       Producto pdep3 = new Producto("Shampoo", 3, 85.0);
       Producto pdep4 = new Producto("Manzanas", 4, 50.0);
       Producto pdepdif = new Producto("Cubo rubik", 5, 300.0);
       System.out.println(pdep1);
       System.out.println(pdep2);
       System.out.println(pdep3);
       System.out.println(pdep4);
       System.out.println(pdepdif);


    }
}
