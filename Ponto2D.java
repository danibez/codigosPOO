public class Ponto2D {
    double x, y;

    Ponto2D(){}

    Ponto2D(double x, double y){
        this.x = x;
        this.y = y;
    }

    public double distOrigem(){
        double d;
        d = Math.sqrt(Math.pow(this.x, 2) + Math.pow(this.y, 2));
        return d;
    }

    public double distPontos(double x, double y){
        double d;
        d = Math.sqrt(Math.pow(this.x - x, 2) + Math.pow(this.y - y, 2));
        return d;
    }

}
