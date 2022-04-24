import java.util.Scanner;

public class DesafioFIE {
    public static void main(String[] args) {

        double altura, totalHomens=0, mediaHomens=0, maiorH=0, menorH=10;
        int sexo, qntdFeminino=0, qntdMasculino=0;

        Scanner texto = new Scanner(System.in);

        for (int i=1; i<=10; i++) {
            System.out.print("Digite o seu sexo,considerando 0 para Masculino e 1 para Feminino: ");
            sexo = texto.nextInt();
            System.out.print("Digite qual a sua altura: ");
            altura = texto.nextFloat();
            if (sexo == 0) {
                System.out.print("Você escolheu: Sexo Masculino e altura de " + altura + "m.\n");
                qntdMasculino++;
                totalHomens = totalHomens + altura;
            } else if (sexo == 1) {
                System.out.print("Você escolheu: Sexo Feminino e altura de " + altura + "m.\n");
                qntdFeminino++;
            } else {
                System.out.println("Opção Inválida, por gentiliza considerar 0 para Masculino e 1 para Feminino!");
                break;
            }
            if (altura > maiorH) {
                maiorH = altura;
            }
            if (altura < menorH){
                menorH = altura;
            }

        }

        texto.close();

        mediaHomens = totalHomens / qntdMasculino;

        System.out.println("\nA maior altura foi de: " + maiorH + "m e a menor foi de: " + menorH + "m.");
        System.out.println("A média da altura do sexo Masculino foi de: " + mediaHomens + "m.");
        System.out.println("O número de pessoas do sexo Feminino foi de: " + qntdFeminino + " pessoa(s).");

    }
}