import javax.swing.text.html.parser.Parser;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        System.out.println("----PROGRAMA PARA CONTABILIZAR NOTAS E MOEDAS----");
        System.out.println("Digite o valor desejado:");
        double valor = teclado.nextDouble();

        contarDinheiro(valor);

    }

    public static final int CEM_REAIS = 100;
    public static final int CINQUENTA_REAIS = 50;
    public static final int VINTE_REAIS = 20;
    public static final int DEZ_REAIS = 10;
    public static final int CINCO_REAIS = 5;
    public static final int DOIS_REAIS = 2;

    public static final int UM_REAL = 1;
    public static final double CINQUENTA_CENTAVOS = 0.50;
    public static final double VINTE_CINCO_CENTAVOS = 0.25;
    public static final double DEZ_CENTAVOS = 0.10;
    public static final double CINCO_CENTAVOS = 0.05;
    public static final double UM_CENTAVO = 0.01;


    public static void contarDinheiro(Double dinheiro) {

        Double notas100 = 0.00;
        Double notas50 = 0.00;
        Double notas20 = 0.00;
        Double notas10 = 0.00;
        Double notas5 = 0.00;
        Double notas2 = 0.00;
        Double moedas1 = 0.00;
        Double moedas50 = 0.00;
        Double moedas25 = 0.00;
        Double moedas10 = 0.00;
        Double moedas5 = 0.00;
        Double moedas001 = 0.00;

        Double sobra100 = 0.00;
        Double sobra50 = 0.00;
        Double sobra20 = 0.00;
        Double sobra10 = 0.00;
        Double sobra5 = 0.00;
        Double sobra2 = 0.00;
        Double sobra1 = 0.00;
        Double sobramoeda50 = 0.00;
        Double sobramoeda25 = 0.00;
        Double sobramoeda10 = 0.00;
        Double sobramoeda5 = 0.00;
        Double sobramoeda001 = 0.00;


        if (dinheiro <= 0) {
            throw new IllegalArgumentException("Valor inválido");
        }

        if (dinheiro >= CEM_REAIS){
            notas100 = dinheiro / CEM_REAIS;
            sobra100 = dinheiro % CEM_REAIS;
        }

        if (dinheiro >= CINQUENTA_REAIS){
            notas50 = sobra100 / CINQUENTA_REAIS;
            sobra50 = sobra100 % CINQUENTA_REAIS;
        }

        if (dinheiro >= VINTE_REAIS){
            notas20 = sobra50 / VINTE_REAIS;
            sobra20 = sobra50 % VINTE_REAIS;
        }

        if (dinheiro >= DEZ_REAIS){
            notas10 = sobra20 / DEZ_REAIS;
            sobra10 = sobra20 % DEZ_REAIS;
        }

        if (dinheiro >= CINCO_REAIS){
            notas5 = sobra10 / CINCO_REAIS;
            sobra5 = sobra10 % CINCO_REAIS;
        }

        if (dinheiro >= DOIS_REAIS){
            notas2 = sobra5 / DOIS_REAIS;
            sobra2 = sobra5 % DOIS_REAIS;
        }

        if (dinheiro >= UM_REAL){
            moedas1 = sobra2 / UM_REAL;
            sobra1 = sobra2 % UM_REAL;
        }

        if (dinheiro >= CINQUENTA_CENTAVOS){
            moedas50 = sobra1 / CINQUENTA_CENTAVOS;
            sobramoeda50 = sobra1 % CINQUENTA_CENTAVOS;
        }

        if (dinheiro >= VINTE_CINCO_CENTAVOS){
            moedas25 = sobramoeda50 / VINTE_CINCO_CENTAVOS;
            sobramoeda25 = sobramoeda50 % VINTE_CINCO_CENTAVOS;
        }

        if (dinheiro >= DEZ_CENTAVOS){
            moedas10 = sobramoeda25 / DEZ_CENTAVOS;
            sobramoeda10 = sobramoeda25 % DEZ_CENTAVOS;
        }

        if (dinheiro >= CINCO_CENTAVOS){
            moedas5 = sobramoeda10 / CINCO_CENTAVOS;
            sobramoeda5 = sobramoeda10 % CINCO_CENTAVOS;
        }

        if (dinheiro >= UM_CENTAVO){
            moedas001 = sobramoeda5 / UM_CENTAVO;
            sobramoeda001 = sobramoeda5 % UM_CENTAVO;
        }



        System.out.printf("Notas de R$100 - %d%n", notas100.intValue());
        System.out.printf("Notas de R$50 - %d%n", notas50.intValue());
        System.out.printf("Notas de R$20 - %d%n", notas20.intValue());
        System.out.printf("Notas de R$10 - %d%n", notas10.intValue());
        System.out.printf("Notas de R$5 - %d%n", notas5.intValue());
        System.out.printf("Notas de R$2 - %d%n", notas2.intValue());
        System.out.printf("Moedas de R$1 - %d%n", moedas1.intValue());
        System.out.printf("Moedas de R$0,50 - %d%n", moedas50.intValue());
        System.out.printf("Moedas de R$0,25 - %d%n", moedas25.intValue());
        System.out.printf("Moedas de R$0,10 - %d%n", moedas10.intValue());
        System.out.printf("Moedas de R$0,05 - %d%n", moedas5.intValue());
        System.out.printf("Moedas de R$0,01 - %.0f%n", moedas001);

    }

}
