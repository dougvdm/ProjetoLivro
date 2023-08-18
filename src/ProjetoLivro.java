
import java.util.HashMap;

public class ProjetoLivro {
    public static void main(String[] args) throws Exception { 
    
    LeitorArquivos leitor = new LeitorArquivos();
    HashMap<String, Personagem> personagens = leitor.LerPersonagem("rsc/personagens.txt");
    HashMap<String, Capitulo> capitulos = leitor.LerCapitulo("rsc/capitulos.txt", personagens);

    Capitulo raiz = capitulos.get("cap1");
    raiz.executar();

        
        

}
}