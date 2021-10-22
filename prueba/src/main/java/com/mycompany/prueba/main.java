
package com.mycompany.prueba;


public class main {

    public static void main(String[] args) {
        estudiante est1 = new estudiante("jeff the killer xd", "C5555", "Info empresa..", "ni idea xd");
        empleado emp1 = new empleado("mau","A5", "concerje xd");
        consulta cons1 = new consulta("libro", "1-7-2080", "" );
        
        String nombre = "El nombre es:"+est1.getNombre()+"\nEl Carne es:"+est1.getCarne();
        
        cons1.informacionEstudiante(nombre);
  
    }
    
}
