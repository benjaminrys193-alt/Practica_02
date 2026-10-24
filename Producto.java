public class Producto{
    private String nombre;
    private String departamento;
    private double precio;
    public Producto (String nombre, int codigoDepartamento, double precio){
        this.nombre = validarNombre(nombre);
        this.departamento = determinarDepartamento(codigoDepartamento);
        this.precio = validarPrecio(precio);
}
private String validarNombre(String nombrerecb){
    if(nombrerecb.equals("") || nombrerecb.equals(" ")){
        return "Producto desconocido";
    }
    return nombrerecb;
}
private double validarPrecio(double preciorecb){
    if(preciorecb<=0){
        return 100.0;
    }
    return preciorecb;
}
private String determinarDepartamento(int opcion){
    switch (opcion) {
        case 1: return "Ropa";
        case 2: return "Electronica y tecnología";
        case 3: return "Higiiene y cuidado personal";
        case 4: return "Alimentos";
        default: return "Departamento desconocido";
            
    }
}
public String getNombre(){
    return nombre;
}
public void setNombre(String nombre){
    this.nombre=validarNombre(nombre);
}
public String getDepartamento(){
    return departamento;
}
public void setDepartamento(int codigoDepartamento){
     this.departamento=determinarDepartamento(codigoDepartamento);
} 
public double getPrecio(){
    return precio;
}
public void setPrecio(double precio){
    this.precio=validarPrecio(precio);
}
@Override 
public String toString(){
    return "Nombre: "+this.nombre+ " Departaento: "+this.departamento+ " Precio:$"+this.precio;
}
}