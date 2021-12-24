public class Tablet extends Equipos{

    // Varible
    static final int PULGADAS_BASE=20;
    private int pulgadas;
    private boolean GPS;
    
    //Constructor

    public Tablet(){
 this(PRECIO_BASE, PESO_BASE, MODELO_BASE, PULGADAS_BASE, false);
 }

 public Tablet(Double precioBase, Integer peso){
 this(precioBase, peso, MODELO_BASE, PULGADAS_BASE, false);
 }

 public Tablet(Double precioBase, Integer peso, char modelos, Integer pulgadas, boolean GPS){
 super(precioBase, peso, modelos);
 this.pulgadas=pulgadas;
 this.GPS=GPS;
 }

 // Métodos
 public Double comprobargps(boolean GPS){
          
  //Codigo
      if(GPS==true ) {return 50.0; }
      return 0.0;
 
  }
  public Double comprobarpuladas(int pulgadas){
          
    //Codigo
        if(pulgadas>40) {return getPrecioBase()*0.3; }
        return 0.0;
   
    }
 public Double calcularPrecio(){
 // Código
 double precioFinal=0;
 double adicion=comprobarmodelos(getModelos())+comprobarpesos(getPeso())+comprobargps(GPS)+comprobarpuladas(pulgadas);

 return precioFinal=getPrecioBase()+adicion;
 }
}
