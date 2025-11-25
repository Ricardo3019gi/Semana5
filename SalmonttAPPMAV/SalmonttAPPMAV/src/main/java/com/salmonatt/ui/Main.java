package com.salmonatt.ui;

import com.salmonatt.data.GestorDatos;

public class Main {

    public static void main(String[] args) {}

    GestorDatos gestorDatos = new GestorDatos();
    gestorDatos.cargardesdeExcel("Productos.xlsx");
    gestorDatos.listarTodos();



}
