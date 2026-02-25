import java.util.Scanner;

public class Diversão {
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        String[] carros = new String[10];

        System.out.println("=== CARROS ===");
        for (int i = 0; i < carros.length; i++) {
            System.out.println("Digite um nome: ");
            carros[i] =sc.nextLine();
        }

        System.out.println("\nLista atual:");
        listar(carros);


        System.out.println("\nDigite a posição para alterar: ");
        int posAlterar = sc.nextInt();
        sc.nextLine();

        if (posAlterar >= 0 && posAlterar < carros.length) {
            System.out.print("Digite o novo carro: ");
            carros[posAlterar] = sc.nextLine();
        } else {
            System.out.println("Posição inválida!");
        }



        System.out.println("\nLista após alteração:");
        listar(carros);

          System.out.print("\nDigite a posição para remover: ");
        int posRemover = sc.nextInt();

        if (posRemover >= 0 && posRemover < carros.length) {

            // deslocar elementos
            for (int i = posRemover; i < carros.length - 1; i++) {
                carros[i] = carros[i + 1];
            }

            carros[carros.length - 1] = null;
        } else {
            System.out.println("Posição inválida!");
        }

        System.out.println("\nLista após remoção:");
        listar(carros);

        sc.close();

    } 

    public static void listar(String[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.println(i + " - " + array[i]);
        }

        
    }
}

