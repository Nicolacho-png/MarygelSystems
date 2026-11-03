package marygelsystems;

public class Cliente {
    
    private String cedula;
    private String nombre;
    private boolean esVip;
    
    public Cliente(String cedula, String nombre, boolean esVip){
    
        this.cedula = cedula;
        this.nombre = nombre;
        this.esVip = esVip;
        
    }
    
    //getter an setter para nombre
    
    public String getNombre(){
        return nombre;
    }
    
    public void setNombre(String nombre){
       this.nombre = nombre; 
    }
    
    //getter an setter para cedula
    
    public String getCedula(){
        return cedula;
    }
    
    public void setCedula(String cedula){
       this.cedula = cedula; 
    }
    
    //getter an setter para esVip
    
    public boolean getEsVip(){
        return esVip;
    }
    
    public void setEsVip(boolean esVip){
       this.esVip = esVip; 
    }
}
