package com.guardarAvion;

import java.util.Objects;

public class Silver extends Avion{

    private Propulsion propulsion;
    private Boolean catering;

    public Silver(Integer capacidadCombustible, Integer costoKM, Integer capacidad, Integer velMax, Propulsion propulsion, Boolean catering) {
        super(capacidadCombustible, costoKM, capacidad, velMax);
        this.propulsion = propulsion;
        this.catering = catering;
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

    @Override
    public String toString() {
        return ("\nTipo: " + getClass().getSimpleName() +
                super.toString() +
                "\nPropulsion: " + getTipoDePropulsion(propulsion) +
                "\nCatering: " + getYESorNO(catering));
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        com.guardarAvion.Silver silver = (com.guardarAvion.Silver) o;
        return propulsion == silver.propulsion;
    }

    @Override
    public int hashCode() {
        return Objects.hash(propulsion);
    }
}
