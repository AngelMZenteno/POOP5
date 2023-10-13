/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package fi.poo;

/**
 *
 * @author Angel Maurice Zenteno Loyola
 * Simula una fecha en codigo
 */
public class Fecha {
    private int dia, mes, anos;
/**
 * contstructor vacio
 */
    public Fecha() {
    }
/**
 * constructor lleno
 * @param dia El dia de la fecha en int
 * @param mes El mes de la fecha en int
 * @param anos Los anos de la fecha en int
 */
    public Fecha(int dia, int mes, int anos) {
        this.dia = dia;
        this.mes = mes;
        this.anos = anos;
    }
    /**
     * Metodo sobre escrito que muestra los valores de los atributos
     * @return regresa una concatenacion de los valores de los atributos
     */
    @Override
    public String toString() {
        return "Fecha{" + "dia=" + dia + ", mes=" + mes + ", anos=" + anos + '}';
    }

}
