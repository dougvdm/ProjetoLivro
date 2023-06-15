import java.util.Scanner;

public class ProjetoLivro {
    public static void main(String[] args) throws Exception {
        System.out.println("Capítulo 1\n\n");
        System.out.println("A história de Deco");
        escolher1();
        
    }

    private static void escolher1() {
        Scanner input = new Scanner(System.in); 
        System.out.println(
    "Deco, também conhecido como o último romantico do mundo é um rapaz que está" + 
    "\nterrivelmente apaixonado por sua amiga de infância chamada Laura, porém pela infelicidade dele," + 
    "\nelá já está comprometida com João Pedro, vulgo JP, que é seu atual namorado");
        System.out.println("O que Deco deve fazer?");
        System.out.println("\ndeve se declarar ");
        System.out.println("nao deve se declarar\n");
        String escolha = input.nextLine();
        if(escolha.equalsIgnoreCase("deve se declarar")){
            declarou();
        }
        else if(escolha.equalsIgnoreCase("nao deve se declarar"));
            System.out.println("FIM");
    }

    private static void declarou() {
        System.out.println("Deco decidiu se declarar para Laura porém, o que ele não contava era");
    }
}
