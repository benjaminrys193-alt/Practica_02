public class Ticket{
   private Producto producto1;
   private Producto producto2;
   private double total;
   private double dineroRecibido;
   private double cambioRecibido;
   public Ticket(Producto producto1, Producto producto2, double dineroRecibido) {
    this.producto1 = producto1;
    this.producto2 = producto2;
    this.dineroRecibido = dineroRecibido;
    this.total = producto1.getPrecio() + producto2.getPrecio();
    this.cambioRecibido = dineroRecibido - this.total;
}
public Producto getProducto1() {
    return producto1;
}
   public void setProducto1(Producto producto1) {
    this.producto1 = producto1;
   }
   public Producto getProducto2() {
    return producto2;
   }
   public void setProducto2(Producto producto2) {
    this.producto2 = producto2;
   }
   public double getTotal() {
    return total;
   }
   public double getDineroRecibido() {
    return dineroRecibido;
   }
   public void setDineroRecibido(double dineroRecibido) {
    this.dineroRecibido = dineroRecibido;
   }
   public double getCambioRecibido() {
    return cambioRecibido;
   }
@Override
public String toString() {
    return "========== TICKET DE COMPRA ==========\n" +
           "Articulo 1: " + this.producto1 + "\n" +
           "Articulo 2: " + this.producto2 + "\n" +
           "--------------------------------------\n" +
           "TOTAL:            $" + this.total + "\n" +
           "EFECTIVO:         $" + this.dineroRecibido + "\n" +
           "SU CAMBIO:        $" + this.cambioRecibido + "\n" +
           "======================================";
}
}