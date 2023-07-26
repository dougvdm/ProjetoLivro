import java.util.Scanner;


public class Capitulo {
    Scanner escaneador = new Scanner(System.in);
    String texto;
    Escolha[] escolhas;
    Personagem personagem;
    int qtdfeliz;
   

    public Capitulo(String texto,Escolha[] escolhas, Personagem personagem, int qtdfeliz){
        this.texto = texto;
        this.personagem = personagem;
        this.qtdfeliz = qtdfeliz;
        this.escolhas = escolhas;
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
           
}

        

        
         

