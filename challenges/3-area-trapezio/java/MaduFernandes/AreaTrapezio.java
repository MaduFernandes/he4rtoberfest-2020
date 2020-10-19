import java.util.Scanner;

public class AreaTrapezio {

    public static void main(String[] args) {
        areaTrapezio();
    }

    public static Integer areaTrapezio() {
        Scanner input = new Scanner(System.in);
        System.out.println("Informe a base maior do triangulo: ");
        Integer baseMaior = input.nextInt();

        if (baseMaior != 0) {
            System.out.println("Informe a base menor do triangulo: ");
            Integer baseMenor = input.nextInt();

            if (baseMenor != 0) {
                System.out.println("Informe a altura do triangulo: ");
                Integer altura = input.nextInt();

                if (altura != 0) {
                    Integer areaDoTapezio = calcula(baseMaior, baseMenor, altura);
                    System.out.println("A área do trapézio é: " + areaDoTapezio);
                }
                System.exit(0);
            }
        }
        System.out.println("Por favor, informe um valor válido");
        return areaTrapezio();

    }

    public static Integer calcula(Integer baseMaior, Integer baseMenor, Integer altura) {
        Integer area = (baseMaior + baseMenor) * altura / 2;

        return area;
    }
    
}
