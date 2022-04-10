import java.util.Random;

public class CoinFlip extends Thread{
    private int numero;

    public CoinFlip(int numero){
        this.numero = numero;
    }

    @Override
    public void run(){
        Random num = new Random();
        int cont=1;
        int result;
        
        do{
            result = num.nextInt(2);
            if(result == 0){
                System.out.println("Cara! Rodarei Novamente! (Thread numero:" + numero + ")");
                cont++;
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                }
            }else{
                System.out.println("Coroa! Levou apenas " + cont + " tentativas para conseguir! (Thread numero: " + numero + ")");
            }
        }while(result==0);
    }

}