/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

/**
 *
 * @author jeferson.agudelo
 */
public class Coche extends Vehiculo {

    int dias;
    float precio_dia;
    float precio_base;
    float precio_alquiler;

    Clase_1 clase1 = new Clase_1();
    Clase_2 clase2 = new Clase_2();

    public int getDias() {
        return dias;
    }

    public void setDias(int dias) {
        this.dias = dias;
    }

    public float getPrecio_dia() {
        return precio_dia;
    }

    public void setPrecio_dia(float precio_dia) {
        this.precio_dia = precio_dia;
    }

    public float getPrecio_base() {
        return precio_base;
    }

    public void setPrecio_base(float precio_base) {
        this.precio_base = precio_base;
    }

    public float getPrecio_alquiler() {
        return precio_alquiler;
    }

    public void setPrecio_alquiler(float precio_alquiler) {
        this.precio_alquiler = precio_alquiler;
    }

    @Override
    public void Alquilar() {

        clase2.CalcularPrecioBase(clase1);
        clase2.CalcularPrecioCoche(clase1);

        precio_base = clase1.getPrecio_base();
        precio_dia = clase1.getPrecio_dia();

        precio_alquiler = (precio_base + precio_dia) * dias;

    }

}
