package marygelsystems;

public class DetalleVenta {

    private Producto producto;
    private int cantidad;
    
    public DetalleVenta (Producto producto, int cantidad){
        
        this.producto = producto;
        this.cantidad = cantidad;

    }
    
    // getter and setter para producto
    
    public Producto getProducto(){
        return producto;
    }
    
    public void setProducto(Producto producto){
        this.producto = producto;
    }
    
    // getter and setter para cantidad
    
    public int getCantidad(){
        return cantidad;
    }
    
    public void setCantidad(int cantidad){
        this.cantidad = cantidad;
    }
}


