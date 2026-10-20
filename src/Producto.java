public class Producto {
    private String nombre;
    private double precio;
    private int stock;
    private String categoria;

    //Setters

    public void setNombre(String nombre) {
        if (nombre != null && !nombre.isBlank()) {
            this.nombre = nombre;
        }
    }

    public void setPrecio(double precio) {
        if (precio >= 0) {
            this.precio = precio;
        }
    }

    public void setStock(int stock) {
        if (stock >= 0) {
            this.stock = stock;
        }
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    //Getters

    public String getNombre() {
        return nombre;
    }

    public String getCategoria() {
        return categoria;
    }

    public int getStock() {
        return stock;
    }

    public double getPrecio() {
        return precio;
    }

    public void aumentarStock(int cantidad){
        if (cantidad>=0){
            stock +=cantidad;
        }
    }

    public void mostrarInformacion(){
        System.out.println("Nombre: " +getNombre()+ "\nPrecio por unidad: " +getPrecio()+ "\nStock: " +getStock()+ "\nCategoria: " +getCategoria());
    }
}