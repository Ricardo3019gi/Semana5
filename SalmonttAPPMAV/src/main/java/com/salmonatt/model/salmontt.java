package com.salmonatt.model;

public class salmontt {
}

public class Producto {

    private String CentroCultivo;
    private String Tour;
    private int Cantidad;


    public Producto() {
    }

    public Producto(String CentroCultivo, String Tour, int Cantidad) {
        this.CentroCultivo = CentroCultivo;
        this.Tour = Tour;
        this.Cantidad = Cantidad;
    }

    public String getCentroCultivo() {
        return CentroCultivo;
    }

    public void setCentroCultivo(String CentroCultivo) {
        this.CentroCultivo = CentroCultivo;
    }

    public String getTour() {
        return Tour;
    }

    public void setTour(String Tour) {
        this.Tour = Tour;
    }

    public int getCantidad() {
        return Cantidad;
    }

    public void setCantidad(int Cantidad) {
        this.Cantidad = Cantidad;
    }

    @Override
    public String toString() {
        return "Producto{" +
                "CentroCultivo=" + CentroCultivo +
                ", Tour =" + Tour +
                ", Cantidad =" + Cantidad +
                '}';
    }
}