public class triangulo {
    private double lado1;
    private double lado2;

    public triangulo (double lado1, double lado2){
        lado1=5;
        lado2=5;
    }

    public double obtenerArea(){
        return lado1*lado2;
    }
    public double obtenerPerimetro(){
        return (lado1*2)+(lado2*2);
    }
}