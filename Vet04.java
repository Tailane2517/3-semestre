public class Vet04 {
    public static void main(String[] args) {
        
        String [] nomes = new String[3];

        nomes[0]="Anderson";
        nomes[1]="edivandecidecleide";

        for(int i=0;i<nomes.length;i++){
            System.out.println("O nome é "+nomes[i]);
        }

        for (String n : nomes) {
            System.out.println(n);
        }
    }
    
}
