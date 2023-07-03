import java.util.Scanner;

public class ProjetoLivro {
    public static void main(String[] args) throws Exception { 
        Personagem deco = new Personagem("Deco", 50);
        Personagem camilinha = new Personagem("Camilinha", 50);
        boolean feliz = true;

        

        // começando a história
        String cap1 ="Capitulo 1\n"+
       "Deco, também conhecido como o último romantico do mundo é um rapaz que está" + 
       "\nterrivelmente apaixonado por sua amiga de infância chamada Laura, porém pela infelicidade dele," + 
       "\nela já está comprometida com João Pedro, vulgo JP, que é seu atual namorado, o que ele deve fazer? \n";
       String esc1cap1 = "se declarar";
       String esc2cap1 = "nao se declarar\n";

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
        "\nporém, depois de umas 2 semanas ele teve iniciativa pra ficar com ela, o que ele deve fazer? \n");
        String esc1cap3 = "pedir";
        String esc2cap3 = "nao pedir\n";


        //esc1cap3
         String cap4 ="Capítulo 4\n\n"+
        "Deco decide pedir camilinha em namoro porém, já passou muito tempo"
        +"\ne ela já está pensando em conhecer novas pessoas e acaba recusando seu pedido."+
        "\nDeco, frustado com sua resposta acabou por bater sua cabeça na pia e assim, terminar no hospital.";


        //esc2cap3
        String cap5 ="Capítulo 5\n\n" +
        "Deco decide não pedir camilinha em namoro"+
        "\nrestando assim apenas a sua humilde academia pra vê se deixa de ser frango";

        String pedir = "pedir";
        String naopedir ="nao pedir";
        String declarar = "se declarar";
        String naodeclarar = "nao se declarar";
        Capitulo capitulo1 = new Capitulo(cap1, esc1cap1,esc2cap1, deco, -10);
        Capitulo final1 = new Capitulo(cap2,"", "", deco, -40 );
        Capitulo capitulo2 = new Capitulo(cap3, esc1cap3, esc2cap3, deco, +10 );
        Capitulo final2 = new Capitulo(cap4, "" , "" ,deco, -30 );
        Capitulo final3 = new Capitulo(cap5, "", "", deco, -20 );


        Scanner escaneador = new Scanner(System.in);
        capitulo1.mostrar(cap1,esc1cap1,esc2cap1,deco , -10); 


        int contador = 0;
        while(contador ==0 && feliz == true ){
        int esc1 = capitulo1.escolher(declarar, naodeclarar);

            if (esc1 == 1){
                final1.mostrar(cap2, "", "", deco, -40);
                contador++;
            }
            
            else if (esc1 == 2){
                capitulo2.mostrar(cap3,esc1cap3, esc2cap3,deco ,+10 );
                int contador2 = 0;

                while (contador2 == 0 && feliz == true){
                    int esc2 = capitulo2.escolher(pedir,naopedir);
                    if (esc2 ==1 ){
                        final2.mostrar(cap4, "", "", deco, -30);
                        contador++;
                        contador2++;
                    }
                    else if(esc2 == 2){
                        final3.mostrar(cap5,"","",deco, -20);
                        contador++;
                        contador2++;
                    }
                    else{
                        System.out.println("ERROR, tente novamente");
                    }

                }
            }
            else{
                System.out.println("ERRO, tente novamente");
                
            }

            
            


          
        }   
        escaneador.close();
}
}