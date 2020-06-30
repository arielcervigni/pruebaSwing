
package com.guardarAvion;

import java.util.ArrayList;

public  class Avion {

    protected Integer idAvion;
    protected Integer capacidadCombustible;
    protected Integer costoKM;
    protected Integer capacidad;
    protected Integer velocidadMax;
    protected Boolean disponible;
    protected ArrayList<String> fechasReservadas;

    public Avion (){}
    public Avion(Integer capacidadCombustible, Integer costoKM, Integer capacidad, Integer velocidadMax) {
        this.capacidadCombustible = capacidadCombustible;
        this.costoKM = costoKM;
        this.capacidad = capacidad;
        this.velocidadMax = velocidadMax;
        this.disponible=true;
        this.fechasReservadas=new ArrayList<>();
    }

    public Integer getCapacidadCombustible() {
        return capacidadCombustible;
    }

    public void setCapacidadCombustible(Integer capacidadCombustible) {
        this.capacidadCombustible = capacidadCombustible;
    }

    public Integer getCostoKM() {
        return costoKM;
    }

    public void setCostoKM(Integer costoKM) {
        this.costoKM = costoKM;
    }

    public Integer getCapacidad() {
        return capacidad;
    }

    public void setCapacidad(Integer capacidad) {
        this.capacidad = capacidad;
    }

    public Integer getVelocidadMax() {
        return velocidadMax;
    }

    public void setVelocidadMax(Integer velocidadMax) {
        this.velocidadMax = velocidadMax;
    }

    public Boolean getDisponible() {
        return disponible;
    }

    public void setDisponible(Boolean disponible) {
        this.disponible = disponible;
    }

    public Integer getIdAvion() {
        return idAvion;
    }

    public void setIdAvion(Integer idAvion) {
        this.idAvion = idAvion;
    }

    public ArrayList<String> getFechasReservadas() {
        return fechasReservadas;
    }

    public void setFechasReservadas(ArrayList<String> fechasReservadas) {
        this.fechasReservadas = fechasReservadas;
    }

    public String getYESorNO(Boolean bool){
        if (bool==true)
            return "Si";
        else
            return "No";
    }

    public String getTipoDePropulsion(Propulsion propulsion){
        String tipoDePropulsion=null;
        if (propulsion.equals(Propulsion.HELICE)){
            tipoDePropulsion="Motor a helice";
        }else if(propulsion.equals(Propulsion.MOTOR_A_REACCION)) {
            tipoDePropulsion = "Motor a reaccion";
        }else {
            tipoDePropulsion = "Motor de pistones";
        }
        return tipoDePropulsion;
    }

    public boolean agregarReserva(String fecha){
        boolean bool=fechasReservadas.add(fecha);
        return bool;
    }

    @Override
    public String toString() {
        return ("\n[Avion nª" + idAvion + "]" +
                "\nCapacidad de combustible: " + capacidadCombustible + " litros" +
                "\nCosto: " + costoKM + " $/km" +
                "\nCapacidad: " + capacidad + " personas" +
                "\nVelocidad maxima: " + velocidadMax + " km/h");
    }
}