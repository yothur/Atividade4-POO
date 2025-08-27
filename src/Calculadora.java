public class Calculadora {

    public static int somar(int num1, int num2){
        return num1 + num2;
    }

    public static int sub(int num1, int num2){
        return num1 - num2;
    }

    public static int mult(int num1, int num2){
        return num1 * num2;
    }

    public static double div(int num1, int num2){
        return (double) num1 / num2;
    }

    public static double expo(int num1, int num2){
        return Math.pow(num1, num2);
    }

    public static void main(String[] args){

        String op = args[1];
        int num1 = Integer.parseInt(args[0]);
        int num2 = Integer.parseInt(args[2]);

        switch (op) {
            case "+" -> {
                int resultado = somar(num1, num2);
                System.out.printf("O Resultado da Soma foi: %d\n", resultado);
            }
            case "-" -> {
                int resultado = sub(num1, num2);
                System.out.printf("O Resultado da Subtração foi: %d\n", resultado);
            }
            case "x" -> {
                int resultado = mult(num1, num2);
                System.out.printf("O Resultado da Multiplicação foi: %d\n", resultado);
            }
            case ":" -> {
                double resultado = div(num1, num2);
                System.out.printf("O Resultado da Divisão foi: %.2f\n", resultado);
            }
            case "^" -> {
                double resultado = expo(num1, num2);
                System.out.printf("O Resultado da Exponenciação foi: %.2f\n", resultado);
            }
            default -> System.out.println("Digite uma operação valida!");
        }

    }
}
