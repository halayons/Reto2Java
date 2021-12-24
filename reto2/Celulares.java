public class Celulares extends Equipos{
    //Variables
    static final  int ALMACENAMIENTO_BASE=50;
    private int almacenamiento;
    //Constructor
    public Celulares(){
        this(PRECIO_BASE, PESO_BASE, MODELO_BASE, ALMACENAMIENTO_BASE);
    }
   
    public Celulares(Double precioBase, Integer peso){
        this(precioBase, peso, MODELO_BASE, ALMACENAMIENTO_BASE);   
    }
    //Constructor
    public Celulares(Double precioBase, Integer peso, char modelos, Integer almacenamiento){
        super(precioBase, peso, modelos);
        this.almacenamiento=almacenamiento;        
   
    }

       
    // Métodos

    public Double comprobaralmacenamiento(int almacenamiento){
          
        //Codigo
            if(almacenamiento>100 ) {return 50.0; }
            return 0.0;
       
        }
    public Double calcularPrecio(){
    // Varible
    double precioFinal=0;
    double adicion=comprobarmodelos(getModelos())+comprobarpesos(getPeso())+comprobaralmacenamiento(almacenamiento);
    return precioFinal=getPrecioBase()+adicion;
    }
    public Integer getCarga() {
    return almacenamiento;
    }
   }
   