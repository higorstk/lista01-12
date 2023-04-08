import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    // Passo1:Mostrar variaveis
    
    double altura;
    double pesoideal;
    
    // Passo2:Entrada de dados
    Scanner teclado = new Scanner(System.in);
    System.out.println("Digite sua altura :");
    altura = teclado.nextDouble();
    
    pesoideal = (72.7*altura) - 58;
    
    // Passo4:Mostrar resultado
    System.out.println("Seu peso ideal é :" + pesoideal);
  }
}
