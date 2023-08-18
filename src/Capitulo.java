import java.util.Scanner;
import java.util.ArrayList;


public class Capitulo {
    private Scanner escaneador = new Scanner(System.in);
    private String texto;
    private ArrayList<Escolha> escolhas;
    private Personagem personagem;
    private int qtdfeliz;
   

    public Capitulo(String texto,ArrayList<Escolha> escolhas, Personagem personagem, int qtdfeliz){
        this.texto = texto;
        this.personagem = personagem;
        this.qtdfeliz = qtdfeliz;
        this.escolhas = new ArrayList<>();
    }

    public void mostrar(){
         System.out.println(this.texto);
        
    
        if(qtdfeliz != 0){
            this.personagem.mudaFelicidade(qtdfeliz);
        }
    
    }
         public void executar() {
            mostrar();
            escolher();
         }
        


         public void escolher(){
            boolean escolhaValida = true;
            while (escolhaValida) {
                String resposta = escaneador.nextLine();
                for (Escolha escolha : escolhas) {
                    if (resposta.equalsIgnoreCase(escolha.getTexto())) {
                        escolhaValida = false;
                        Capitulo proximoCapitulo = escolha.getProximo();
                        proximoCapitulo.executar();
                        return;
            }  
       
          }
          System.out.println("Você digitou errado, tente novamente!");
       }
    }

    public Scanner getEscaneador() {
        return escaneador;
    }

    public void setEscaneador(Scanner escaneador) {
        this.escaneador = escaneador;
    }

   
    public void setTexto(String texto) {
        this.texto = texto;
    }

    public ArrayList<Escolha> getEscolhas() {
        return escolhas;
    }

    public void addescolhas(Escolha escolha){
        escolhas.add(escolha);
    } 
   
    public Personagem getPersonagem() {
        return personagem;
    }

  
    public void setPersonagem(Personagem personagem) {
        this.personagem = personagem;
    }

    public int getQtdfeliz() {
        return qtdfeliz;
    }


    public void setQtdfeliz(int qtdfeliz) {
        this.qtdfeliz = qtdfeliz;
    }

}

        

        
         

