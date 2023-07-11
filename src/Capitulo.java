import java.util.Scanner;


public class Capitulo {
    Scanner escaneador = new Scanner(System.in);
    String texto;
    String[] escolhas;
    Personagem personagem;
    int qtdfeliz;


    public Capitulo(String texto, String[] escolhas, Personagem personagem, int qtdfeliz){
        this.texto = texto;
        this.escolhas = escolhas;
        this.personagem = personagem;
        this.qtdfeliz = qtdfeliz;
    }

    void mostrar(String texto, String[] escolhas, Personagem personagem ,  int qtdfeliz){ 
        System.out.println(this.texto);
        if(escolhas != null){
            for(String str : escolhas ){
                System.out.println(str);
            
            }  
        }
        if(qtdfeliz != 0){
            this.personagem.mudaFelicidade(qtdfeliz);
        }


        
       }

        int escolher(String [] escolhas){
            String escolha = escaneador.nextLine();
            if(escolha.equalsIgnoreCase(escolhas[0])){
                return 0;
            }
            else if(escolha.equalsIgnoreCase(escolhas[1])){
                return 1;
            }
            else{
                return 3;
            }

    }  
       
}
        

        
         

