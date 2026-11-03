package marygelsystems;

public class MarygelSystems {

    public static void main(String[] args) {
        
        Cliente miCliente = new Cliente("1112904785","Nicolas Correa",true);
        
        Producto miProducto = new Producto(1 ,"Cafe Especial Marygel", 18500.0, 50);
        
        DetalleVenta miDetalle = new DetalleVenta(miProducto, 2);
        
        Venta miVenta = new Venta(1001, miCliente);
        
        miVenta.getDetalles().add(miDetalle);
        
        double totalCalculado = miDetalle.getCantidad()* miDetalle.getProducto().getPrecio();
        miVenta.setTotal(totalCalculado);
        
        System.out.println("=========================================");
        System.out.println("        FACTURA - MARYGEL SYSTEMS        ");
        System.out.println("=========================================");
        System.out.println("Nro. de venta     : " + miVenta.getId());
        System.out.println("Cliente           : " + miCliente.getNombre());
        System.out.println("Cedula            : " + miCliente.getCedula());
        System.out.println("¿Es VIP?          : " + (miCliente.getEsVip() ? "Si" : "No"));
        System.out.println("-----------------------------------------");
        
        for(DetalleVenta detalle : miVenta.getDetalles()){
            System.out.println(" * " + detalle.getProducto().getNombre() + 
                    " | Cantidad: " + detalle.getCantidad() + 
                    " | Precio Unit: $" + detalle.getProducto().getPrecio());
        }
        
        System.out.println("-----------------------------------------");
        System.out.println("TOTAL A PAGAR : " + miVenta.getTotal());
        
    }
    
}
