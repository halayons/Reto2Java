public class Equipos {

    //Variables Base
    static final int PESO_BASE=5;
    static final char MODELO_BASE='F';
    static final double PRECIO_BASE=100;
   
    //Variables
    private int peso;
    private char modelos;
    private double precioBase;
    //Constructores
    
    public Equipos(){
   
        this(PRECIO_BASE, PESO_BASE, MODELO_BASE);
    }
    //Constructores
    public Equipos(Double precioBase, Integer peso){
        this.precioBase=precioBase;
        this.peso=peso;
   
    }
    //Constructores
   
    public Equipos(Double precioBase, Integer peso, char modelos){
        this.precioBase=precioBase;
        this.peso=peso;
        this.modelos=modelos;
   
   
    }
   
    // Metodos
    public Double comprobarmodelos(char modelos){
          
    //Codigo
    if(modelos=='A') {return 100.0; }
        if(modelos=='B') {return 80.0; }
        if(modelos=='C') {return 60.0; }
        if(modelos=='D') {return 50.0; }
        if(modelos=='E') {return 30.0; }
        if(modelos=='F') {return 10.0; }
        return 10.0;
   
    }

    public Double comprobarpesos(int peso){
          
    //Codigo
        if(peso>=0 && peso<19) {return 10.0; }
        if(peso>=19 && peso<49) {return 50.0; }
        if(peso>=49 && peso<80) {return 80.0; }
        if(peso>=80) {return 100.0; }
        return 0.0;
   
    }

    public Double calcularPrecio(){
    Double adicion=comprobarmodelos(modelos)+comprobarpesos(peso);
    //Codigo
    
   
    return precioBase+adicion;
    }
    //Getter
    public Double getPrecioBase() {
        return precioBase;
    }
    public char getModelos() {
    return modelos;
    }
    public Integer getPeso() {
    return peso;
    }
     
    
   }
   