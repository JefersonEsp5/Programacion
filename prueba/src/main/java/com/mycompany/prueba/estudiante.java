
package com.mycompany.prueba;

/**
 *
 * @author mquir
 */
public class estudiante {
    private String nombre;
    private String carne;
    private String carrera;
    private String direccion;

    public estudiante(String nombre, String carne, String carrera, String direccion) {
        this.nombre = nombre;
        this.carne = carne;
        this.carrera = carrera;
        this.direccion = direccion;
    }

    public String getNombre() {
        return nombre;
    }

    public String getCarne() {
        return carne;
    }

    public String getCarrera() {
        return carrera;
    }

    public String getDireccion() {
        return direccion;
    }
    
    
}
