import java.util.Scanner;


public class Capitulo {
    Scanner escaneador = new Scanner(System.in);
    String texto;
    String escolha1;
    String escolha2;
    Personagem personagem;
    int mudaFelicidade;

    public Capitulo(String texto, String escolha1, String escolha2, Personagem personagem, int mudaFelicidade){
        this.texto = texto;
        this.escolha1 = escolha1;
        this.escolha2 = escolha2;
        this.personagem = personagem;
        this.mudaFelicidade = mudaFelicidade;
    }

    void mostrar(String texto, String escolha1,String escolha2, Personagem personagem ,  int mudaFelicidade){ 
        System.out.println( this.texto);
        System.out.println( this.escolha1);
        System.out.println( this.escolha2);
        personagem.mudaFelicidade(mudaFelicidade);
        
       }

    int escolher(String resposta1, String resposta2){
        String escolha;
        escolha = escaneador.nextLine();
        if (escolha.equalsIgnoreCase(resposta1)){
            return 1;
        }
        else if (escolha.equalsIgnoreCase(resposta2)){
            return 2;
        }
        else{
            return 3;
        }
        

        }
         
}
