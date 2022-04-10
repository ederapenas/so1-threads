import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner input = new Scanner(System.in);
        int qtd,resp;

        do{
            System.out.println("Quantos CoinFlippers você deseja?");
            qtd = input.nextInt();

            for(int i = 1; i <= qtd; i++){
                CoinFlip flipper = new CoinFlip(i);
                flipper.start();
            }

            System.out.println("Deseja executar o programa novamente? 0 para não e 1 para sim");
            resp = input.nextInt();
            while(resp != 1 && resp != 0){
                System.out.println("Você deve digitar 0 para encerrar o programa ou 1 para repetir.");
                resp = input.nextInt();
            }
        }while(resp == 1);
    }
}
