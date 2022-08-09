//É uma classe que representa uma pessoa sendo entrevistada
public class Entrevistado {
    //variável do genero
    private final char id;
    //variável da faixa etária
    private final String idade;
    //variável do nível de escolaridade
    private final String ensino;
    //variável da região
    private final String regiao;
    //variável das tecnologias que consegue acessar
    private final String acesso;
    //variáveis da área prioritária
    private final String importancia;
    //construtor que recebe as informacoes de um entrevistado: genero, idade, ensino, regiao, acesso, importancia
    public Entrevistado(char id, String idade, String ensino, String regiao, String acesso,String importancia) {
        this.id = id;
        this.ensino = ensino;
        this.idade = idade;
        this.regiao = regiao;
        this.acesso = acesso;
        this.importancia = importancia; 
    }
    //metodos get para que cada uma das variaveis possa ser recebida
    public char getId() { return id; }
    public String getIdade() { return idade; }
    public String getEnsino() { return ensino; }
    public String getRegiao() { return regiao; }
    public String getAcesso() { return acesso; }
    public String getImportancia() {return importancia;}
}