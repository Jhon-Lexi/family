package Tienda;

public class Main {
    public static void main(String[] args) {
        TipoDrTIenda tien = new TipoDrTIenda();
        tien.dueño="pedro";
        tien.nombre="Ferreteria DON CHEMO";
        tien.producto="tornillos";
        tien.precio=19.90;
        tien.archivo();
      
        TipoDrTIenda tien2=new TipoDrTIenda();
        tien2.dueño="Rodrigo";
        tien2.nombre="Papeleria La estudiantina";
        tien2.producto="Lapices";
        tien2.precio=16.50;
        tien2.archivo();
      
    }
    
    
}
