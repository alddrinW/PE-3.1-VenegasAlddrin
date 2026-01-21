public class CasoMiesRecursivo {
    static double montoBase = 55.0;
    static double montoPorDependiente = 15.0;
    static double factorRural = 1.15;

    public static double calcularRecursivo(int dependientes, boolean esZonaRural) {

        // Caso exitoso donde no hay dependientes y donde no es rural
        if (dependientes == 0) {
            return esZonaRural ? montoBase * factorRural : montoBase;
        }

        // Recursividad
        double montoAnterior = calcularRecursivo(dependientes - 1, esZonaRural);
        double adicional = esZonaRural ? montoBase * factorRural : montoBase;

        return montoAnterior + adicional;

    }

    public static double calcularRecursivoBug(int dependientes, boolean esZonaRural) {

        // Caso exitoso donde no hay dependientes y donde no es rural en este caso
        // generando el bug eliminando la condicion

        // if (dependientes == 0) {
        // return esZonaRural ? montoBase * factorRural : montoBase;
        // }

        // Recursividad
        double montoAnterior = calcularRecursivoBug(dependientes - 1, esZonaRural);
        double adicional = esZonaRural ? montoBase * factorRural : montoBase;

        return montoAnterior + adicional;

    }

    public static void main(String[] args) {
        System.out.println("Caso 1 Erick: Zona Urbana: " + calcularRecursivo(3, false));
        System.out.println("Caso 2 Toño: Zona Urbana: " + calcularRecursivo(0, false));
        System.out.println("Caso 3 Christian: Zona Rural: " + calcularRecursivo(5, true));
        System.out.println("Caso 4 Prueba: Zona Rural: " + calcularRecursivo(3, true));
    }

}
