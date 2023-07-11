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
        String [] escolhacap1 = new String[2];
        escolhacap1[0] = "se declarar";
        escolhacap1[1] = "nao se declarar";
        

        //esc1cap1
       String cap2 = "\ncapitulo 2\n\n"+
        "JP acaba descobrindo das segundas intenções de Deco e "+
         "\nacaba cortando os laços com ele" 
        + "\ne depois ele desceu o cacete em deco, coitado\n";    

        //esc2cap1
        String cap3 = ( "\nCapítulo 3\n\n"+
        "Deco decidiu não se declarar para Laura, ele decidiu viver sua vida"+
        "\nentrou para a academia e até tentou parar de ser frangote, mas infelizmente sem sucesso."+
        "\naté que um belo dia ele conheceu Camilinha, Uma menina meiga do seu cursinho"+
        "\nela bateu o olho em deco e se apaixonou pelo magrelo, paixão a primeira vista."+
        "\nDeco, todo bestinha do jeito que é, ficou enrolando pra ter alguma iniciativa com camilinha"+
        "\nporém, depois de umas 2 semanas ele teve iniciativa pra ficar com ela, o que ele deve fazer? \n");
        String[] escolhacap3 = new String[2];
        escolhacap3[0] = "pedir";
        escolhacap3[1] = "nao pedir";


        //esc1cap3
         String cap4 ="\nCapítulo 4\n\n"+
        "Deco decide pedir camilinha em namoro porém, já passou muito tempo"
        +"\ne ela já está pensando em conhecer novas pessoas e acaba recusando seu pedido."+
        "\nDeco, frustado com sua resposta acabou por bater sua cabeça na pia e assim, terminar no hospital.";


        //esc2cap3
        String cap5 ="Capítulo 5\n\n" +
        "Deco decide não pedir camilinha em namoro"+
        "\nrestando assim apenas a sua humilde academia pra vê se deixa de ser frango";

        String [] escolhanull = new String[0];

        Capitulo capitulo1 = new Capitulo(cap1, escolhacap1, deco, -10);
        Capitulo capitulo2 = new Capitulo(cap2,escolhanull, deco, -40 );
        Capitulo capitulo3 = new Capitulo(cap3,escolhacap3, deco, +10 );
        Capitulo capitulo4 = new Capitulo(cap4,escolhanull ,deco, -30 );
        Capitulo capitulo5 = new Capitulo(cap5,escolhanull, camilinha, -20 );


        Scanner escaneador = new Scanner(System.in);
        capitulo1.mostrar(cap1,escolhacap1,deco ); 


        int contador = 0;
        while(contador ==0 && feliz == true ){
        int esc1 = capitulo1.escolher(escolhacap1);

            //primeiro final
            if (esc1 == 0){
                capitulo2.mostrar(cap2,escolhanull, deco);
                contador++;
            }
            
            else if (esc1 == 1){
                capitulo3.mostrar(cap3,escolhacap3,deco  );
                int contador2 = 0;

                while (contador2 == 0 && feliz == true){
                    int esc2 = capitulo3.escolher(escolhacap3);
                    //segundo final
                    if (esc2 == 0){
                        capitulo4.mostrar(cap4, escolhanull, deco);
                        contador++;
                        contador2++;
                    }
                    //terceiro final
                    else if(esc2 == 1){
                        capitulo5.mostrar(cap5,escolhanull,deco);
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