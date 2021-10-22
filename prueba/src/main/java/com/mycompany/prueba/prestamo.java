
package com.mycompany.prueba;

/**
 *
 * @author mquir
 */
public class prestamo {
    private String fecha;
    private String tipoDocumento;
    private String datosAlumno;
    private String datosEmpleado;

    public prestamo(String fecha, String tipoDocumento, String datosAlumno, String datosEmpleado) {
        this.fecha = fecha;
        this.tipoDocumento = tipoDocumento;
        this.datosAlumno = datosAlumno;
        this.datosEmpleado = datosEmpleado;
    }

    public String getFecha() {
        return fecha;
    }

    public String getTipoDocumento() {
        return tipoDocumento;
    }

    public String getDatosAlumno() {
        return datosAlumno;
    }

    public String getDatosEmpleado() {
        return datosEmpleado;
    }
    
    public void prestamo(){
    }
    public void informacionPrestamo(){
    }
}
