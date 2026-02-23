import java.util.Scanner;

public class ExDo02 {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numero;

        do{
            System.out.println("Informe o número positivo:");
            numero=sc.nextInt();
        }while(numero<=0);

        sc.close();
    }
}
