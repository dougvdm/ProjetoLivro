public class Personagem {
    String nome;
    int felicidade;
    
    
   public Personagem(String nome, int felicidade){
    this.nome = nome;
    this.felicidade = felicidade;
   }
  
   public String pegarNome(){
     return nome;
   }
  
   public int pegarFelicidade(){
     return felicidade;
   }
    
}
