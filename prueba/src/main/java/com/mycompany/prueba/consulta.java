
package com.mycompany.prueba;

/**
 *
 * @author mquir
 */
public class consulta {
    private String tipoDocumento;
    private String fecha;
    private String datosAlumnos;

    public consulta(String tipoDocumento, String fecha, String datosAlumnos) {
        this.tipoDocumento = tipoDocumento;
        this.fecha = fecha;
        this.datosAlumnos = datosAlumnos;
    }

    public String getTipoDocumento() {
        return tipoDocumento;
    }

    public String getFecha() {
        return fecha;
    }

    public String getDatosAlumnos() {
        return datosAlumnos;
    }
    
    public void informacionEstudiante(String datos){
        System.out.println(datos);
    }
}
