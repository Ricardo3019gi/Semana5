package com.salmonatt.data;

import com.salmonatt.model.Producto;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.FileInputStream;
import java.util.ArrayList
import java.util.List

public class GestorDatos {


    private list<Producto> lista = new ArrayList<>();

    public void cargardesdeExcel(String ruta){

        try(FileInputStream fileInputStream = new FileInputStream (ruta)){
        XSSFWorkbook workbook = new XSSFWorkbook(fileInputStream);
        XSSFSheet hoja = libro.getSheetAt(0);

        for(int i=1;i<= hoja.getLastRowNum();i++){
            var fila = hoja.getRow(i);

            String CentroCultivo = fila.getCell(0).getStringCellValue();
            String Tour = fila.getCell(1).getStringCellValue();
            int Cantidad = (int) fila.getCell(2).getNumericCellValue();
            Producto producto = new Producto(CentroCultivo,Tour,Cantidad);
            agregar (producto);


        }


           libro.close();
        } catch (Exception e) {
            System.out.println ( "Error al cargar el excel");
        }
    }

    public void agregar (Producto producto) {lista.add(producto);}

    public void listartodos(){
        for(Producto producto:lista){
            System.out.println (producto);

        }

    public List<Producto> buscaportour(String tour){
            List<Producto> resultado = new ArrayList<>();
            for(Producto producto:lista){
                if(producto.getTour().equals(tour)){
                resultado.add(producto);
            }

        }
           return resultado;
    }
}

