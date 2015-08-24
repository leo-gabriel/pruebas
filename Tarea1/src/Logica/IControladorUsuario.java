
package Logica;

import java.util.Map;


public interface IControladorUsuario {
    
    public abstract void Caso_Registro_Cliente(String nombre,String nickname, String correo,  
            String direccion, String apellido, Fecha fecha);
    
    
    
    public abstract void Caso_Registro_Restaurante(String nickname, String correo, String nombre, 
            String direccion, Map categoria);
    
    
    
    public abstract DataUsuario Caso_Ver_Cliente(String nickname);
    
    
    
    public abstract void Caso_Ver_Restaurante(String nickname, String correo);
    
    
    
    public abstract void AltaCategoria(String nombre);
    
}
