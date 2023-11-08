import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Deseja iniciar a compra");
        char opc = input.nextLine().charAt(0);
        int tamanho;
        Compra c = new Compra();
        while(opc == 'y' || opc == 'Y'){
            System.out.println("Qual tamanho para o saco");
            tamanho = input.nextInt();
            if(tamanho == 1){
                c.adicionaSacoBombom(new SacoPequeno(" "));
            }else if(tamanho == 2){
                c.adicionaSacoBombom(new SacoMedio(" "));
            }else if(tamanho == 3){
                c.adicionaSacoBombom(new SacoGrande(" "));
            }else{
                System.out.println("Tamanho invalido");
            }
            System.out.println("Deseja continuar a compra");
            opc = input.nextLine().charAt(0);
        }
        input.close();
    }
}
