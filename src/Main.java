public class Main {
    public static void main(String[] args) {
        System.out.println("=== Atividade Git com Java ===");

        // Exemplo de uso das classes do projeto
        FraseMotivacional frase = new FraseMotivacional();
        System.out.println("Frase: " + frase.getFrase());

        Calculadora calc = new Calculadora();
        int soma = calc.somar(5, 3);
        System.out.println("Resultado da soma: " + soma);
    }
}
