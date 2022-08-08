/**
 * It's a class that represents a person who was interviewed
 */
public class Entrevistado {
    private final char id;
    private final String idade;
    private final String ensino;
    private final String regiao;
    private final String acesso;
    private final String importancia;
    public Entrevistado(char id, String idade, String ensino, String regiao, String acesso,String importancia) {
        this.id = id;
        this.ensino = ensino;
        this.idade = idade;
        this.regiao = regiao;
        this.acesso = acesso;
        this.importancia = importancia; 
    }

//

    public char getId() { return id; }
    public String getIdade() { return idade; }
    public String getEnsino() { return ensino; }
    public String getRegiao() { return regiao; }
    public String getAcesso() { return acesso; }
    public String getImportancia() {return importancia;}
}