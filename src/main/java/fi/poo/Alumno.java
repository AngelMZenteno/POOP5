/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package fi.poo;

/**
 *
 * @author Angel Maurice Zenteno Loyola
 * Simula a un alumno en codigo
 */
public class Alumno {
    private String nombre, apellido, carrera, escuela;
    private int semestre;
    private Fecha fechaNacimiento;

    public Alumno() {
    }

    public Alumno(String nombre, String apellido, String carrera, String escuela, int semestre, Fecha fechaNacimiento) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.carrera = carrera;
        this.escuela = escuela;
        this.semestre = semestre;
        this.fechaNacimiento = fechaNacimiento;
    }
    /**
     * Metodo que modifica el nombre del objeto Alumno
     * @param nombre El nombre del alumno
     * 
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    /**
     * Metodo que modifica el nombre del objeto Alumno
     * @param apellido El apellido del alumno
     */
    public void setApellido(String apellido) {
        this.apellido = apellido;
    }
    /**
     * Metodo que modifica la carrera del objeto Alumno
     * @param carrera La carrera del alumno
     */
    public void setCarrera(String carrera) {
        this.carrera = carrera;
    }
    /**
     * Metodo que modifica la escuela del objeto Alumno
     * @param escuela La carrera del alumno
     */
    public void setEscuela(String escuela) {
        this.escuela = escuela;
    }
    /**
     * Metodo que modifica el semestre del objeto Alumno
     * @param semestre El semestre del alumno
     */
    public void setSemestre(int semestre) {
        this.semestre = semestre;
    }
    /**
     * Metodo que modifica la fecha de nacimiento del objeto Alumno
     * @param fechaNacimiento La carrera del alumno
     */
    public void setFechaNacimiento(Fecha fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }
    /**
     * Metodo que regresa el nombre
     * @return regresa el nombre
     */
    public String getNombre() {
        return nombre;
    }
    /**
     * Metodo que regresa el apellido
     * @return regresa el apellido
     */
    public String getApellido() {
        return apellido;
    }
    /**
     * Metodo que regresa la carrera
     * @return regresa la carrera
     */
    public String getCarrera() {
        return carrera;
    }
    /**
     * Metodo que regresa la escuela
     * @return regresa la escuela
     */
    public String getEscuela() {
        return escuela;
    }
    /**
     * Metodo que regresa el semestre
     * @return regresa el semestre
     */
    public int getSemestre() {
        return semestre;
    }
    /**
     * Metodo que regresa el semestre
     * @return regresa el semestre
     */
    public Fecha getFechaNacimiento() {
        return fechaNacimiento;
    }
    /**
     *  Imprime el sonido al dormir
     */
    public void dormir(){
        System.out.println("zzzzz");
    }
    /**
     * Imprime el sonido al comer
     */
    public void comer(){
        System.out.println("ñam ñam");
    }
    /**
     * Imprime que esta estudiando
     */
    public void estudiar(){
        System.out.println("Estoy estudiando");
    }
    /**
     * Imprime que está trabajando 
     */
    public void trabajar(){
        System.out.println("Estoy trabajando");
    }
    /**
     * Imprime que está jugando
     */
    public void jugar(){
        System.out.println("Estoy jugando");
    }
    /**
     * Metodo sobre escrito que muestra los valores de los atributos
     * @return regresa una concatenacion de los valores de los atributos
     */
    @Override
    public String toString() {
        return "Alumno{" + "nombre=" + nombre + ", apellido=" + apellido + ", carrera=" + carrera + ", escuela=" + escuela + ", semestre=" + semestre + ", fechaNacimiento=" + fechaNacimiento + '}';
    }
       
}

