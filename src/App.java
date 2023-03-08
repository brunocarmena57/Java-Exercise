import java.util.Scanner;

public class App 
{
    public static float MediaAluno(float n1, float n2) {

        float media = (n1 + n2) / 2;
        return media;
    }
    public static void main(String[] args) throws Exception {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Digite a primeira nota: ");
        float n1 = entrada.nextFloat();

        System.out.println("Digite a segunda nota: ");
        float n2 = entrada.nextFloat();

        float media = MediaAluno(n1, n2);
        System.out.println("A média é: " + media);

        Boolean menu = true;
        int qt1, qt2, cod1, cod2, op;
        float v1, v2, ipi;
        int[] vet = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        while(menu) {
            System.out.println(
                "Escolha a opção desejada:\n" + 
                "1 - Soma \n" +
                "2 - Subtração \n" +
                "3 - Divisão \n" +
                "4 - Multiplicação \n" +
                "5 - Potenciação \n" +
                "6 - Exercício 1 \n" +
                "7 - Exercício 2 \n" +
                "0 - Sair \n" 
            );
            op = entrada.nextInt();

            switch(op) {
                case 1:
                    System.out.println("Digite o primeiro valor: ");
                    v1 = entrada.nextFloat();
                    System.out.println("Digite o segundo valor: ");
                    v2 = entrada.nextFloat();
                    float resultado = v1 + v2;
                    System.out.println("O resultado da sua soma é: " + resultado);
                break;
                case 2:
                    System.out.println("Digite o primeiro valor: ");
                    v1 = entrada.nextFloat();
                    System.out.println("Digite o segundo valor: ");
                    v2 = entrada.nextFloat();
                    System.out.println("O resultado da sua subtração é: " + (v1 - v2));
                break;
                case 3:
                    System.out.println("Digite o primeiro valor: ");
                    v1 = entrada.nextFloat();
                    System.out.println("Digite o segundo valor: ");
                    v2 = entrada.nextFloat();
                    System.out.println("O resultado da sua divisão é: " + (v1 / v2));
                break;
                case 4:
                    System.out.println("Digite o primeiro valor: ");
                    v1 = entrada.nextFloat();
                    System.out.println("Digite o segundo valor: ");
                    v2 = entrada.nextFloat();
                    System.out.println("O resultado da sua multiplicação é: " + (v1 * v2));
                break;
                case 5:
                    System.out.println("Digite o primeiro valor: ");
                    v1 = entrada.nextFloat();
                    System.out.println("Digite o segundo valor: ");
                    v2 = (int)entrada.nextFloat();
                    for(float controle = v1; v2 > 1; v2--) {
                        v1 *= controle;
                    }
                    System.out.println("O resultado da sua potenciação é: " + v1);
                break;
                case 6:
                    System.out.println("Mostrar números pares ou ímpares?(1/2)");
                    int par = entrada.nextInt();
                    for(int v : vet) {
                        if((v % 2) == 0 && par == 1) {
                            System.out.println(v);
                        } else if((v % 2) != 0 && par == 2) {
                            System.out.println(v);
                        }
                    }
                break;
                case 7:
                    System.out.println("Digite o valor do IPI: ");
                    ipi = (entrada.nextFloat()/100) - 1;
                    System.out.println("Digite o código do Produto: ");
                    cod1 = entrada.nextInt();
                    System.out.println("Digite o valor do produto: ");
                    v1 = entrada.nextFloat();
                    System.out.println("Digite a quantidade do produto: ");
                    qt1 = entrada.nextInt();

                    System.out.println("Digite o valor do IPI: ");
                    ipi = (entrada.nextFloat()/100) - 1;
                    System.out.println("Digite o código do produto 2: ");
                    cod2 = entrada.nextInt();
                    System.out.println("Digite o valor do produto 2: ");
                    v2 = entrada.nextFloat();
                    System.out.println("Digite a quantidade do produto 2: ");
                    qt2 = entrada.nextInt();

                    System.out.println(
                        "Produto 1: "+ cod1 + " Valor: " + v1 + " Quantidade: " + qt1 +
                        "\nProduto 2: "+ cod2 + " Valor: " + v2 + " Quantidade: " + qt2 +
                        "\nTotal com IPI de: " + ipi + " é: " + (((v1 * qt1) + (v2 * qt2)) * ipi)
                    );
                break;
                case 0:
                    menu = false;
                break;
            }
        }
    }
}
