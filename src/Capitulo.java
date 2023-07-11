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

    void mostrar(String texto, String[] escolhas, Personagem personagem){ 
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
            int valor = 0;
            for(int i = 0; i < escolhas.length; i++){
                if(escolhas[i].equalsIgnoreCase(escolha)){
                    valor++;
                }
            }
            return valor;
    }  
       
}
        

        
         

