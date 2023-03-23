import java.util.Scanner;
public class App {
    public static void main(String[] args) throws Exception {
        
        Calculadora calculo1 = new Calculadora(0, 0);
        Scanner scanner = new Scanner(System.in);        
        System.out.println("Digite o primeiro valor:");
        calculo1.setValor1(scanner.nextDouble());
        System.out.println("Digite o segundo valor:");
        calculo1.setValor2(scanner.nextDouble());
        System.out.println("Digite -> 1 - SOMA // 2 - SUBTRAÇÃO // 3 - MULTIPLICAÇÃO // 4 - ");
        int i = scanner.nextInt();
        switch(i) {
            case 1:
            calculo1.Soma();
            break;
            case 2:
            calculo1.Subtracao();
            break;
            case 3:
            calculo1.Multiplicacao();
            break;
            case 4:
            calculo1.Divisao();
            break; 
        }
        scanner.close();
    }
}
