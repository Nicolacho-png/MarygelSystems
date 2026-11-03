package marygelsystems;
import java.util.ArrayList;

public class Venta {
    
    private int id;
    private Cliente cliente;
    private ArrayList<DetalleVenta> detalles;
    private double total;
    
    public Venta(int id, Cliente cliente){
        
        this.id = id;
        this.cliente = cliente;
        this.detalles = new ArrayList<>();
        this.total = 0.0;
        
    }
    
    //getter and setter para id
    
    public int getId(){
        return id;
    }
    
    public void setId(int id){
        this.id = id;
    }
    
    //getter and setter para cliente
    
    public Cliente getCliente(){
        return cliente;
    }
    
    public void setCliente(Cliente cliente){
        this.cliente = cliente;
    }
    
    //getter and setter para detalles
    
    public ArrayList<DetalleVenta> getDetalles(){
        return detalles;
    }
    
    public void setDetalles(ArrayList<DetalleVenta> detalles){
        this.detalles = detalles;
    }
    
    //getter and setter para total
    
    public double getTotal(){
        return total;
    }
    
    public void setTotal(double total){
        this.total = total;
    }
}
