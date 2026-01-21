public class CasoMies {
    // 1. Asignar el monto base
    static double montoBase = 55.0;
    static double montoPorDependiente = 15.00;
    static double factorRural = 1.15;

    // 2. Validar los dependientes
    // 4. ¿Es dependiente?

    public static double subsidioCalculo(int numeroDependientes, boolean esZonaRural) {
        double monto = montoBase;

        if (numeroDependientes > 0) {
            for (int i = 0; i < numeroDependientes; i++) {
                monto += montoPorDependiente;
            }
        }

        return esZonaRural ? monto * factorRural : monto;
    }

    public static void main(String[] args) {
        System.out.println("Caso 1: Zona Urbana: " + subsidioCalculo(0, false));
        System.out.println("Caso 2: Zona Urbana: " + subsidioCalculo(3, false));
        System.out.println("Caso 3: Zona Urbana: " + subsidioCalculo(7, true));
    }

}
