public class Piramide extends Triangulo {
    @Override
    public double calcularArea() {

        Punto a = puntos.get(0);
        Punto b = puntos.get(1);
        Punto c = puntos.get(2);
        double lado = a.calcularDistancia(b);
        double altura = puntos.get(3).getZ();
        double areaBase = (Math.sqrt(3) * lado * lado) / 4;
        double areaLateral = (lado * altura) / 2;
        return areaBase + 3 * areaLateral;
    }

    public double calcularVolumen() {
        Punto a = puntos.get(0);
        Punto b = puntos.get(1);
        Punto c = puntos.get(2);
        double lado = a.calcularDistancia(b);
        double altura = puntos.get(3).getZ();
        return (Math.sqrt(2) * lado * lado * altura) / 12;
    }
}

