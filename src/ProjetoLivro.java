import java.util.Scanner;

public class ProjetoLivro {
    public static void main(String[] args) throws Exception { 
        Personagem deco = new Personagem("Deco", 50);
        Personagem camilinha = new Personagem("Camilinha", 50);
        boolean feliz = true;

        String linha = "-----------------------------------------------------------------------------------";

        // começando a história
        String cap1 ="Capitulo 1\n"+
       "Deco, também conhecido como o último romantico do mundo é um rapaz que está" + 
       "\nterrivelmente apaixonado por sua amiga de infância chamada Laura, porém pela infelicidade dele," + 
       "\nela já está comprometida com João Pedro, vulgo JP, que é seu atual namorado";
       String esc1cap1 = "se declarar";
       String esc2cap1 = "nao se declarar";

        //esc1cap1
       String cap2 = "capitulo 2\n\n"+
        "JP acaba descobrindo das segundas intenções de Deco e "+
         "\nacaba cortando os laços com ele" 
        + "\ne depois ele desceu o cacete em deco, coitado";    

        //esc2cap1
        String cap3 = ( "Capítulo 3\n\n"+
        "Deco decidiu não se declarar para Laura, ele decidiu viver sua vida"+
        "\nentrou para a academia e até tentou parar de ser frangote, mas infelizmente sem sucesso."+
        "\naté que um belo dia ele conheceu Camilinha, Uma menina meiga do seu cursinho"+
        "\nela bateu o olho em deco e se apaixonou pelo magrelo, paixão a primeira vista."+
        "\nDeco, todo bestinha do jeito que é, ficou enrolando pra ter alguma iniciativa com camilinha"+
        "\nporém, depois de umas 2 semanas ele teve iniciativa pra ficar com ela");
        String esc1cap3 = "pedir";
        String esc2cap3 = "nao pedir";


        //esc1cap3
         String cap4 ="Capítulo 4\n\n"+
        "Deco decide pedir camilinha em namoro porém, já passou muito tempo"
        +"\ne ela já está pensando em conhecer novas pessoas e acaba recusando seu pedido."+
        "\nDeco, frustado com sua resposta acabou por bater sua cabeça na pia e assim, terminar no hospital.";


        //esc2cap3
        String cap5 ="Capítulo 5\n\n" +
        "Deco decide não pedir camilinha em namoro"+
        "\nrestando assim apenas a sua humilde academia pra vê se deixa de ser frango";


        Scanner escaneador = new Scanner(System.in);
        deco.mudaFelicidade(-10);
        System.out.println();
        System.out.println(cap1);
        System.out.println();

        int contador = 0;
        while(contador ==0 && feliz == true ){
            System.out.println(esc1cap1);
            System.out.println(esc2cap1);

            String escolha1 = escaneador.nextLine();
            
            if(escolha1.equalsIgnoreCase(esc1cap1)){
                System.out.println(linha);
                System.out.println(cap2);
                System.out.println();
                deco.mudaFelicidade(-40);
                contador++;
            }
            else if(escolha1.equalsIgnoreCase(esc2cap1)){
                System.out.println(linha);
                System.out.println(cap3);
                System.out.println();
                deco.mudaFelicidade(+10);
                camilinha.mudaFelicidade(-10);
                int contador2 = 0;
                while(contador2 == 0){
                    System.out.println();
                    System.out.println(esc1cap3);
                    System.out.println(esc2cap3);
                    
                    String escolha2 = escaneador.nextLine();
                    if(escolha2.equalsIgnoreCase(esc1cap3)){
                        System.out.println(linha);
                        System.out.println(cap4);
                        System.out.println();
                        camilinha.mudaFelicidade(10);
                        System.out.println();
                        deco.mudaFelicidade(-30);
                        contador++;
                        contador2++;
                    }
                    else if(escolha2.equalsIgnoreCase(esc2cap3)){
                        System.out.println(linha);
                        System.out.println(cap5);
                        System.out.println();
                        deco.mudaFelicidade(-20);
                        contador++;
                        contador2++;
                    }
                    else{
                        System.out.println("resposta incorreta, tente novamente! ");
                    }
                    
                }
            
            }

                    else{
                    System.out.println("resposta incorreta, tente novamente! ");
                        }
        }

        escaneador.close();

 }   
}