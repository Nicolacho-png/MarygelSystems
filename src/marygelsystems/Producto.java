package marygelsystems;

public class Producto {
    
    private int id;
    private String nombre;
    private double precio;
    private int stock;
    
    public Producto(int id, String nombre, double precio, int stock){
        
        this.id = id;
        this.nombre = nombre;
        this.precio = precio;
        this.stock = stock;
    }
    
    //getter and setter para nombre 
    
    public String getNombre(){
     return nombre;   
    }
    
    public void setNombre(String nombre){
     this.nombre = nombre;
    }
    
    //getter and setter para id
    
    public int getId(){
     return id;   
    }
    
    public void setId(int id){
     this.id = id;
    }
     
    //getter and setter para precio
    
    public double getPrecio(){
        return precio;
    }
    
    public void setPrecio(double precio){
     this.precio = precio; 
    }
    
    //getter and setter para stock
    
    public int getStock(){
        return stock;
    }
    
    public void setStock(int stock){
     this.stock = stock; 
    }
}

