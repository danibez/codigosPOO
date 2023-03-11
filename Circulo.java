public class Circulo {
    double raio;

    Circulo(double x){
        raio = x;
    }

    double comprimento(){
        return 2*3.14*raio;
    }

    double area(){
        double resultado = 3.14 * raio * raio;
        return resultado;
    }
    
}