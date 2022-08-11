import java.io.*;

public class Trabalho {
    public static void main(String[] args) {
        // O caminho do arquivo que contem os dados.
        String file = "Entrevistados.csv";
        // Criacao de uma variavel chamada reader do tipo BufferedReader e inicializando como null.
        BufferedReader reader = null;
        // Criacao de uma variavel chamada line do tipo String e inicializando como uma String vazia.
        String line = " ";
        String conc = " ";
        // Criando um objeto da classe Evetor.
        Evetor v = new Evetor ();
       // Leitura do arquivo e criação de um objeto da classe Entrevistado para cada linha do arquivo.
        try {
            // Cria um novo objeto BufferedReader e atribue ele a variavel reader.
            reader = new BufferedReader(new FileReader(file));
            while((line = reader.readLine()) != null) {
                // Dividindo a linha em um array de Strings, que seriam as colunas da planilha.
                String[] row = line.split(";");
                // Atribuindo o array de String à variável entrevistado do tipo Entrevistado.
                Entrevistado entrevistado = new Entrevistado(row[0].charAt(0), row[1], row[2], row[3], row[4], row[5]);
                // Adiciona o objeto `entrevistado` ao vetor de entrevistados.
                v.adiciona(entrevistado);
            }
        }
        // Captura uma excessão
        catch(Exception e) {
            e.printStackTrace();
        }
        // Um bloco de código que será executado após a conclusão do bloco try/catch e antes
        // do código seguinte ao bloco try/catch. O bloco finally será executado se uma
        // exceção for lançada ou não. Se uma exceção for lançada, o bloco finally será 
        // executado mesmo se nenhuma instrução catch corresponder à exceção.
        finally {
            try {
                // Fecha o arquivo.
                reader.close();
            // Captura uma excessão
            } catch (IOException e) {
            
                // Imprime o rastreamento de pilha da exceção.
                e.printStackTrace();
            }
        }
        // Escreve o resultado do método relatorioQuantPessoas() da classe Evetor.
        System.out.println(v.relatorioQuantPessoas()); 
        // Escreve o resultado do método relatorioSexo() da classe Evetor.
        System.out.println(v.relatorioSexo()); 
        // Escreve o resultado do método relatorioFaixaEtaria() da classe Evetor.
        System.out.println(v.relatorioFaixaEtaria()); 
        // Escreve o resultado do método relatorioEscolaridade() da classe Evetor.
        System.out.println(v.relatorioEscolaridade()); 
        // Escreve o resultado do método relatorioEnsiSuperior() da classe Evetor.
        System.out.println(v.relatorioEnsiSuperior());
        // Escreve o resultado do método relatorioMaisUtilizaCelular() da classe Evetor.
        System.out.println(v.relatorioMaisUtilizaCelular());  
        // Escreve o resultado do método relatorioTecMenosUtil15() da classe Evetor.
        System.out.println(v.relatorioTecMenosUtil15());  
        // Escreve o resultado do método relatorioAreaPrioritaria() da classe Evetor.
        System.out.println(v.relatorioAreaPrioritaria()); 
        // Concatena os resultados dos metodos da classe Evetor.
        conc = "Informações pedidas pelo trabalho que foram encontradas pelo grupo: \n" + v.relatorioQuantPessoas() + "\n" + v.relatorioSexo() + "\n" + v.relatorioFaixaEtaria() + "\n" + v.relatorioEscolaridade() + "\n" + v.relatorioEnsiSuperior() + "\n" + v.relatorioMaisUtilizaCelular() + "\n" + v.relatorioTecMenosUtil15() + "\n" + v.relatorioAreaPrioritaria();
        try {
            // Escreve o resultado da concatenacao dos metodos da classe Evetor em um arquivo
            // chamado Relatorio.txt.
            Arquivo.gravar(conc,"Relatorio.txt");
        } catch (Exception e) {
            // Imprime o rastreamento da pilha de excessões.
            e.printStackTrace();
        }
        finally {
            try {
                // Fecha o arquivo.
                reader.close();
            } catch (IOException e) {
            
                e.printStackTrace();
            }
        }
    }
}