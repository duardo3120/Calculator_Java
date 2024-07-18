import java.util.Scanner;

public class calculator {

    public static void main(String[] args){
        int operacao;
        Double num1;
        Double num2;
        Double result;

        Scanner sc = new Scanner(System.in);
        System.out.println("1 Adição, 2 Subtração, 3 Multiplicação ou 4 Divisão");
        System.out.println("Digite a operação desejada");
        operacao = sc.nextInt();

        switch (operacao) {
            case 1:
                System.out.println("Digite o primeiro numero");
                num1 = sc.nextDouble();
                System.out.println("Digite o segundo número");
                num2 = sc.nextDouble();
                result = num1 + num2;
                System.out.println("O resultado da conta é: " + result);
                break;

            case 2:
                System.out.println("Digite o primeiro numero");
                num1 = sc.nextDouble();
                System.out.println("Digite o segundo número");
                num2 = sc.nextDouble();
                result = num1 - num2;
                System.out.println("O resultado da conta é: " + result);
                break;

            case 3:
                System.out.println("Digite o primeiro numero");
                num1 = sc.nextDouble();
                System.out.println("Digite o segundo número");
                num2 = sc.nextDouble();
                result = num1 * num2;
                System.out.println("O resultado da conta é: " + result);
                break;

            case 4:
                System.out.println("Digite o primeiro numero");
                num1 = sc.nextDouble();
                System.out.println("Digite o segundo número");
                num2 = sc.nextDouble();
                if (num2 == 0) {
                    System.out.println("Não é possivel realizar essa operação");
                } else{
                        result = num1 / num2;
                        System.out.println("O resultado da conta é: " + result);}
                break;

                default: System.out.println("Operação invalida, Digite novamente!");

            
     
        }


        sc.close();
}
}