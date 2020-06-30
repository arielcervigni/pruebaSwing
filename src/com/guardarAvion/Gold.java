package com.guardarAvion;

import java.util.Objects;

public class Gold extends Avion {
    /*
        la propulsion la defini asi, hay mas maneras de hacerlas claro. Pero como el tp se basa en interaccion del
        usuario, crei que seria mejor definirla asi para nosotros con el codigo darle una propulsion, sin correr
        el programa.
        Pero si se dan cuenta, las 3 clases de Gold, silver y bronze tienen casi el mismo codigo, solo se cambian
        los parametros. Me parece medio burdo, si hay una mejor forma de hacerlo, saquen toda esa cagada :)
    */
    private Propulsion propulsion;
    private Boolean catering;
    private Boolean wifi;

    public Gold(Integer capacidadCombustible, Integer costoKM, Integer capacidad, Integer velMax, Propulsion propulsion, Boolean catering, Boolean wifi) {
        super(capacidadCombustible, costoKM, capacidad, velMax);
        this.propulsion = propulsion;
        this.catering = catering;
        this.wifi = wifi;
    }

    public Gold() {
        super();
    }

    public Propulsion getPropulsion() {
        return propulsion;
    }

    public void setPropulsion(Propulsion propulsion) {
        this.propulsion = propulsion;
    }

    public Boolean getCatering() {
        return catering;
    }

    public void setCatering(Boolean catering) {
        this.catering = catering;
    }

    public Boolean getWifi() {
        return wifi;
    }

    public void setWifi(Boolean wifi) {
        this.wifi = wifi;
    }

    @Override
    public String toString() {
        return ("\nTipo: " + getClass().getSimpleName() +
                super.toString() +
                "\nPropulsion: " + getTipoDePropulsion(propulsion) +
                "\nCatering: " + getYESorNO(catering) +
                "\nWifi: " + getYESorNO(wifi));
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        com.guardarAvion.Gold gold = (com.guardarAvion.Gold) o;
        return propulsion == gold.propulsion;
    }

    @Override
    public int hashCode() {
        return Objects.hash(propulsion);
    }
}
