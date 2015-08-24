
package Logica;

import java.util.HashMap;
import java.util.Map;


public class ManejadorPedido {
    private Map<Integer, Pedido> ColeccionPedido = new HashMap<Integer, Pedido>();
    //SINGLENTON
    private static ManejadorPedido instancia = null;
    
    public static ManejadorPedido getinstance() {
        if (instancia == null) {
            instancia = new ManejadorPedido();
        }
        return instancia;
    }
    //FUNCIONES COLECCION PEDIDOS
    
}
