public class Personagem {
    String nome;
    int depressao;
    
    
   public Personagem(String nome, int depressao){
    this.nome = nome;
    this.depressao = depressao;
   }
  
   public String pegarNome(){
     return nome;
   }
  
   public int pegarDepressao(){
     return depressao;
   }
  
   public void attDepressao(int depressao){
    this.depressao = depressao;
   }


    
}
