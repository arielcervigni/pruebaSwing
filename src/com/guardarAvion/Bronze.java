package com.guardarAvion;

import java.util.Objects;

public class Bronze extends com.guardarAvion.Avion {

    private Propulsion propulsion;

    public Bronze(Integer capacidadCombustible, Integer costoKM, Integer capacidad, Integer velMax, Propulsion propulsion) {
        super(capacidadCombustible, costoKM, capacidad, velMax);
        this.propulsion = propulsion;
    }

    public Propulsion getPropulsion() {
        return propulsion;
    }

    public void setPropulsion(Propulsion propulsion) {
        this.propulsion = propulsion;
    }

    @Override
    public String toString() {
        return ("\nTipo: " + getClass().getSimpleName() +
                super.toString());
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        com.guardarAvion.Bronze bronze = (com.guardarAvion.Bronze) o;
        return propulsion == bronze.propulsion;
    }

    @Override
    public int hashCode() {
        return Objects.hash(propulsion);
    }
}
