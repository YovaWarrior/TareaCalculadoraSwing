package calculadoraswing;

public class CalculadoraEspecial extends Calculadora {
    public String marcaCalculadora;
    public int añoCalculadora;
    
    
    public CalculadoraEspecial(String CarlosMartínez){
        super(CarlosMartínez);
        this.tipoCalculadora = "Calculadora Científica";
        this.color = "Rojo";
        this.dimensionPantalla = 20;
        this.numeroDeSerie = "12312sdfg";
        this.marcaCalculadora = "CASIO";
        this.añoCalculadora = 2023;
    }
    
    public void mostrarDatos (){
        System.out.println("Tipo de Calculadora: "+tipoCalculadora+"\nColor de Calculadora: "+color+"\nDimension de Pantalla: "+dimensionPantalla+"\nNumero de Serie: "+numeroDeSerie+"\nMarca de Calculadora: "+marcaCalculadora+"\nAño de Calculadora: "+añoCalculadora);
    }
    public int Factorial(int numero) {
        int factorial = 1;
        for (int i = 1; i <= numero; i++) {
            factorial *= i;
        }
        return factorial;
    }
    
    public double seno(double numero) {
        return Math.sin(Math.toRadians(numero));
    }

    public double coseno(double numero) {
        return Math.cos(Math.toRadians(numero));
    }

    public double tangente(double numero) {
        return Math.tan(Math.toRadians(numero));
    }
    
    public double secante(double numero) {
         double radianes = Math.toRadians(numero);
         return 1 / Math.cos(radianes);
    }
    
    public double cosecante(double numero) {
         double radianes = Math.toRadians(numero);
         return 1 / Math.sin(radianes);
    }
}