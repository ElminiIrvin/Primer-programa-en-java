public class Main {
    public static void main(String[] args) {
        int resultado;
        Coche micohe = new Coche();
        resultado=Suma(10,10,10);
        System.out.println("La suma de los tres números es " + resultado);
        micohe.AñadirPuertas();
        System.out.println("El númmero de puertas es " + micohe.puertas);
    }
    public static int Suma(int n1, int n2, int n3){
        return n1+n2+n3;
    }
}
class Coche{
    int puertas=0;

    public void AñadirPuertas(){
        this.puertas++;
    }
}