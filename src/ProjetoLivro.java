import java.util.Scanner;

public class ProjetoLivro {
    public static void main(String[] args) throws Exception { 
        // começando a história
        System.out.println("A história de Deco\n");
        String linha = "----------------------------------------------------------------------";
        System.out.println(linha);
        escolher();

    }

    private static void escolher() {
        String linha = "----------------------------------------------------------------------";
        Personagem deco = new Personagem("Deco", 20);
       
        String cap1 ="Capitulo 1\n"+
       "Deco, também conhecido como o último romantico do mundo é um rapaz que está" + 
       "\nterrivelmente apaixonado por sua amiga de infância chamada Laura, porém pela infelicidade dele," + 
       "\nela já está comprometida com João Pedro, vulgo JP, que é seu atual namorado";
       String esc1cap1 = "se declarar";
       String esc2cap1 = "nao se declarar";

       String cap2 = "capitulo 2\n\n"+
        "JP acaba descobrindo das segundas intenções de Deco e "+
         "\nacaba cortando os laços com ele" 
        + "\ne depois ele desceu o cacete em deco, coitado";

        Scanner escaneador = new Scanner(System.in); 
        System.out.println("Personagem: " + deco.pegarNome());
        System.out.println("Felicidade: " + deco.pegarFelicidade());
        System.out.println();
        System.out.println(cap1);

        System.out.println("\nO que Deco deve fazer?\n");
        System.out.println(esc1cap1);
        System.out.println(esc2cap1);

        String escolha = escaneador.nextLine();
        
        if(escolha.equalsIgnoreCase(esc1cap1)){
            System.out.println(linha);
            System.out.println(cap2);
            System.out.println( "\nDeco perde 20 pontos de felicidade\n"+
            "Deco pegou depressão");
            System.out.println("FIM");
        }
        else if(escolha.equalsIgnoreCase(esc2cap1)){
                System.out.println();
                System.out.println(linha);
                System.out.println("Deco perde felicidade por não tomar atitude");
                System.out.println("felicidade de Deco -10");

                 naodeclarou();
        }
        else{
            System.out.println("resposta incorreta, tente novamente\n\n");
              escolher();
        }    
         escaneador.close();

    }   
    private static void naodeclarou() {
        String linha = "----------------------------------------------------------------------";
        Personagem deco = new Personagem("Deco", 10);
        Personagem camilinha = new Personagem("Camilinha", 20);

        Scanner escaneador = new Scanner(System.in);
        String cap3 = (
        "Deco decidiu não se declarar para Laura, ele decidiu viver sua vida"+
        "\nentrou para a academia e até tentou parar de ser frangote, mas infelizmente sem sucesso."+
        "\naté que um belo dia ele conheceu Camilinha, Uma menina meiga do seu cursinho"+
        "\nela bateu o olho em deco e se apaixonou pelo magrelo, paixão a primeira vista."+
        "\nDeco, todo bestinha do jeito que é, ficou enrolando pra ter alguma iniciativa com camilinha"+
        "\nporém, depois de umas 2 semanas ele teve iniciativa pra ficar com ela");
        String esc1cap3 = "pedir";
        String esc2cap3 = "nao pedir";

        String cap4 =
        "Deco decide pedir camilinha em namoro porém, já passou muito tempo"
        +"\ne ela já está pensando em conhecer novas pessoas e acaba recusando seu pedido."+
        "\nDeco, frustado com sua resposta acabou por bater sua cabeça na pia e assim, terminar no hospital.";

        String cap5 =
        "Deco decide não pedir camilinha em namoro"+
        "\nrestando assim apenas a sua humilde academia pra vê se deixa de ser frango";

        System.out.println("Capítulo 3");
        System.out.println("Personagem: "+ deco.pegarNome()+
        "\nFelicidade: "+ deco.pegarFelicidade());
        System.out.println();
        System.out.println("Personagem: "+ camilinha.pegarNome()+
        "\nFelicidade: "+ camilinha.pegarFelicidade() );
        System.out.println();

        System.out.println(cap3);
        System.out.println("\ndepois de 3 meses ficando deco deve pedir ela em namoro?\n ");
        System.out.println(esc1cap3);
        System.out.println(esc2cap3);

        String escolha = escaneador.nextLine();
        if(escolha.equalsIgnoreCase(esc1cap3)){
            System.out.println(linha);
            System.out.println("Capítulo 4");
            System.out.println("Personagem: "+deco.pegarNome()+
            "\nFelicidade: "+ deco.pegarFelicidade());
            System.out.println();
            System.out.println("Personagem: "+camilinha.pegarNome()+
            "\nFelicidade: "+camilinha.pegarFelicidade());
            System.out.println();

            System.out.println(cap4);
            System.out.println("\nDeco fica triste por camilinha e pela cabeça"+
            "\nFelicidade de Deco -10");
            System.out.println("Camilinha segue a sua vida feliz sem o nosso caro amigo deco\n"+
            "Felicade de Camilinha +0\n");
            System.out.println("Deco desenvolveu depressão\nFIM");
        }
        else if(escolha.equalsIgnoreCase(esc2cap3)){
            System.out.println(linha);
            System.out.println("Capítulo 5");
             System.out.println("Personagem: "+deco.pegarNome()+
            "\nFelicidade: "+ deco.pegarFelicidade());
            System.out.println();
            System.out.println("Personagem: "+camilinha.pegarNome()+
            "\nFelicidade: "+camilinha.pegarFelicidade());
            System.out.println();
            System.out.println(cap5);
            System.out.println("\nFIM");
        }
        else{
            System.out.println("resposta incorreta, tente novamente\n\n");
            naodeclarou();
        }
             
         escaneador.close();
    }
}
