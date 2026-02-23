import java.util.Scanner;

public class ExDo03 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int op = 0;

        do {
            System.out.println("MENU INTERAIVO");
            System.out.println("1- CADASTRO");
            System.out.println("2- LISTAR");
            System.out.println("3- REMOVER");
            System.out.println("4- SAIR");
            op = sc.nextInt();

            switch (op) {
                case 1:
                    System.out.println("cadatro");

                    break;
                case 2:
                    System.out.println("lista");

                    break;
                case 3:
                    System.out.println("remover");

                    break;
                case 4:
                    System.out.println("sair");

                    break;

                default:
                    System.out.println("opção inválida");
                    break;
            }
        }while(op!=4);

        sc.close();
    }
}
