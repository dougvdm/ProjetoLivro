import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class ImagemDoCapitulo extends Capitulo {
    private String imagem;

    public ImagemDoCapitulo(String texto,
    ArrayList<Escolha> escolhas,
     Personagem personagem, 
     int qtdfeliz,
     String imagem){
        super(texto, escolhas, personagem, qtdfeliz);
        this.imagem = imagem;
    }
    
    public ImagemDoCapitulo(Scanner escaneador, HashMap<String, Personagem> personagens, Scanner leitor){
        super(escaneador,personagens,leitor);
        this.escolhas = new ArrayList<Escolha>();
        this.escaneador = escaneador;
        this.LerCapitulo(personagens, leitor);

    }

@Override
    protected void LerCapitulo(HashMap<String, Personagem> personagens,Scanner leitor ){
        super.LerCapitulo(personagens,leitor);
        leitor.nextLine();
        String linha = leitor.nextLine();
        this.imagem = "";
        while(!linha.equalsIgnoreCase("FimDaImagem")){
            this.imagem += linha + "\n";
            linha = leitor.nextLine();
        }
    }


@Override
    public void mostrar(){
        System.out.println(this.texto);
        System.out.println(this.imagem);
        
        if(qtdfeliz != 0){
            this.personagem.mudaFelicidade(qtdfeliz);
        }
    }

@Override
    public void executar(){
            mostrar();
            escolher();
         }
}     

