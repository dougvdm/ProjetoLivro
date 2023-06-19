import java.util.Scanner;

public class ProjetoLivro {
    public static void main(String[] args) throws Exception {
        System.out.println("A história de Deco\n\n");
        escolher();
        
    }

    private static void escolher() {
        Scanner escaneador = new Scanner(System.in); 
        System.out.println(
       "Deco, também conhecido como o último romantico do mundo é um rapaz que está" + 
       "\nterrivelmente apaixonado por sua amiga de infância chamada Laura, porém pela infelicidade dele," + 
       "\nela já está comprometida com João Pedro, vulgo JP, que é seu atual namorado");

        System.out.println("\nO que Deco deve fazer?");
        System.out.println("\nse declarar");
        System.out.println("nao se declarar\n");

        String escolha = escaneador.nextLine();
        
        if(escolha.equalsIgnoreCase("se declarar")){
            System.out.println("JP acaba descobrindo das segundas intenções de Deco e "+
              "\nacaba cortando os laços com ele" 
            + "\ne depois ele desceu o cacete em deco, coitado\n");
            System.out.println("FIM");
        }
        else if(escolha.equalsIgnoreCase("nao se declarar")){
                 naodeclarou();
        }
        else{
            System.out.println("resposta incorreta, tente novamente\n\n");
              escolher();
        }    
         escaneador.close();
    }   
    private static void naodeclarou() {
        Scanner escaneador = new Scanner(System.in);
        System.out.println(
    "\nDeco decidiu não se declarar para Laura, ele decidiu viver sua vida"+
    "\nentrou para a academia e até tentou parar de ser frangote, mas infelizmente sem sucesso."+
    "\naté que um belo dia ele conheceu Camilinha, Uma menina meiga do seu cursinho"+
    "\nela bateu o olho em deco e se apaixonou pelo magrelo, paixão a primeira vista."+
    "\nDeco, todo bestinha do jeito que é, ficou enrolando pra ter alguma iniciativa com camilinha"+
    "\nporém, depois de umas 2 semanas ele teve iniciativa pra ficar com ela");

        System.out.println("\ndepois de 3 meses ficando deco deve pedir ela em namoro? ");
        System.out.println("\npedir");
        System.out.println("nao pedir");
        String escolha = escaneador.nextLine();
        if(escolha.equalsIgnoreCase("pedir")){
            System.out.println("\nDeco decide pedir camilinha em namoro porém, já passou muito tempo"
     +"\ne ela já está pensando em conhecer novas pessoas e acaba recusando seu pedido."+
      "\nDeco, frustado com sua resposta acabou por bater sua cabeça na pia e assim, terminar no hospital."
     +"\npaia, ein Deco?");
             System.out.println("\nFIM");
        }
        else if(escolha.equalsIgnoreCase("nao pedir")){
            System.out.println(
            "\nDeco decide não pedir camilinha em namoro"+
            "\nrestando assim apenas a sua humilde academia pra vê se deixa de ser frango"
           +"\ntu é paia visse deco.");
           System.out.println("\nFIM");
        }
        else{
            System.out.println("resposta incorreta, tente novamente\n\n");
            naodeclarou();
        }
             
         escaneador.close();
    }
}
