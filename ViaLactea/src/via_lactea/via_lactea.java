package via_lactea;

public class via_lactea {
	private String nombre = null;
	private double masa= 0.0; 
	private double volumen= 0.0;
	private int kilometros= 0;
	private EstadoElementos tipo; 
    private boolean observable = false;
    private boolean exterior = false;
	
    public enum EstadoElementos {
    	LIQUIDO, TERRESTRE, GASEOSO
    }
    public via_lactea (String nombre, double masa, double volumen, int kilometros, EstadoElementos tipo, boolean observable, boolean exterior) {
    this.nombre= nombre;
    this.masa= masa;
    this.volumen= volumen;
    this.kilometros = kilometros;
    this.tipo= tipo;
    this.observable= observable;
    this.exterior= exterior;
    
    

    }
    public void imprimir {
    	System.out.println("Nombre: " + nombre);
    	System.out.println("Masa: " + masa);
    	System.out.println("Volumen: " + volumen);
    	System.out.println("Kilometros: " + kilometros);
    	System.out.println("Tipo: " + tipo);
    	System.out.println("Observable: " + observable);
    	System.out.println("Exterior" + exterior);
    }
}
