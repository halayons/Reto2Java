public class Main {
    public static void main(String[] args) {
    // Ejemplo 1
    /*Equipos equipos[] = new Equipos[6];
    equipos[0] = new Equipos(150.0, 70, 'A');
    equipos[1] = new Celulares(70.0, 40);
    equipos[2] = new Tablet(600.0, 70, 'D', 50, false);
    equipos[3] = new Equipos();
    equipos[4] = new Equipos(500.0, 60, 'A');
    equipos[5] = new Equipos(700.0, 50, 'D');
    PrecioTotal solucion1 = new PrecioTotal(equipos);
    solucion1.mostrarTotales();
    System.out.println();*/
    // Ejemplo 2
    Equipos equipos[] = new Equipos[4];
    equipos[0] = new Equipos(60.0, 10, 'D');
    equipos[1] = new Celulares(300.0, 40, 'Z', 40);
    equipos[2] = new Tablet(50.0, 10, 'A', 70, false);
    equipos[3] = new Equipos(50.0, 10);
    PrecioTotal solucion1 = new PrecioTotal(equipos);
    solucion1.mostrarTotales();
    System.out.println();
    }
   }
   