/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

import Vista.Formulario;

/**
 *
 * @author jeferson.agudelo
 */
public class Clase_2 {

    

    public float CalcularPrecioBase(Clase_1 bas) {

        bas.setPrecio_base(50);
        bas.setDias_alquiler(0);
        bas.setPrecio_total(0);

        return 0;
    }

    public float CalcularPrecioCoche(Clase_1 per) {

        per.setPrecio_base_pma(0);
        per.setPrecio_dia((float) 1.5);
        per.setPrecio_adicional(0);
        return 0;
    }

    public float CalcularPrecioMicro(Clase_1 per) {

        per.setPrecio_base_pma(0);
        per.setPrecio_dia((float) 1.5);
        per.setPrecio_adicional(2);
        return 0;
    }

    public float CalcularPrecioFurgo(Clase_1 per) {

        per.setPrecio_base_pma(20);
        per.setPrecio_dia((float) 0);
        per.setPrecio_adicional(0);

        return 0;
    }

    public float CalcularPrecioCamion(Clase_1 per) {

        per.setPrecio_base_pma(20);
        per.setPrecio_dia((float) 0);
        per.setPrecio_adicional(40);

        return 0;
    }

    
}
