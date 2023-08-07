public class Personagem {
    private String nome;
    private int felicidade;
    
    
   public Personagem(String nome, int felicidade){
    this.nome = nome;
    this.felicidade = felicidade;
  }

    boolean mudaFelicidade(int mudanca){
      boolean feliz = true;
      this.felicidade += mudanca;

      if(felicidade <= 0){
        this.felicidade = 0;
        System.out.println("sua felicidade é: "+ this.felicidade);
        System.out.println(this.nome + " morreu de tristeza");
        feliz = false;
        return feliz;
      }
      else if(felicidade > 50){
        this.felicidade = 50;
        System.out.println("sua nova felicidade é: "+ this.felicidade);
        System.out.println(this.nome+ " está extremamente feliz!");
        return feliz;
      }
      else{
        System.out.println(this.nome +" mudou seu estado de felicidade");
        System.out.println("Sua nova felicidade é de "+ this.felicidade);
        return feliz;
      } 
     
    }
  
 
    public String getNome() {
        return nome;
    }

    
    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getFelicidade() {
        return felicidade;
    }

   
    public void setFelicidade(int felicidade) {
        this.felicidade = felicidade;
    }

}
