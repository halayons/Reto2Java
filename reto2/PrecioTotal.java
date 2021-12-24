public class PrecioTotal {
    // Variable
    private double totalEquipos;
    private double totalCelulares;
    private double totalTablets;
    private Equipos[] listaEquipos;
    // Constructor
    PrecioTotal(Equipos[] pEquipos) {
    this.listaEquipos = pEquipos;
    }
    public void mostrarTotales() {
    // Código
    // Mostramos los resultados
    for (int i=0;i<listaEquipos.length;i++){
        totalEquipos+=listaEquipos[i].calcularPrecio();
        if (listaEquipos[i] instanceof Tablet) {
            //your code
            totalTablets+=listaEquipos[i].calcularPrecio();
            
            }
        if (listaEquipos[i] instanceof Celulares) {
                //your code
                totalCelulares+=listaEquipos[i].calcularPrecio();
                
                }
            
            

    }
    
    System.out.println("La suma del precio de los equipos es de " + totalEquipos);
    System.out.println("La suma del precio de los equipos celulares es de " + totalCelulares);
    System.out.println("La suma del precio de los equipos tablet es de " + totalTablets);
    }
   }
