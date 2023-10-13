/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package fi.poo;

/**
 * 
 * @author Angel Maurice Zenteno Loyola
 */
// Los metodos de servicio (getters y setters) no se incluyen en los diagramas de clase
// + significa public, - es private, * es restricted, nada es default
public class POOP5 {

    public static void main(String[] args) {
        Alumno alumno = new Alumno();
        //alumno.nombre = "pedro"; Esta mal porque el atributo es privado
        alumno.setNombre("Pedro");
        alumno.setApellido("Gomez");
        Fecha fecha = new Fecha(29,9,2023);
        Alumno alum2 = new Alumno("Luis", "Perez", "Medicina", "UNAM", 4, fecha);
        Fecha fecha2 = new Fecha(9,2,2004);
        Alumno alum3 = new Alumno("Lalo","Gutierrez","Ing. Mecanica","UNAM",2,fecha2);
        System.out.println(alumno.toString());
        System.out.println(alumno); // Parseo, no necesita el toString
        System.out.println(alum2);
        System.out.println(alum3);
    }
}