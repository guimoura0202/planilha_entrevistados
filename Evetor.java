/**
 * É uma classe que armazena os dados dos entrevistados em um vetor e utiliza metodos para organiza-los, conforme for necessario ao usuario
 */
public class Evetor {
    //Variavel do vetor onde os dados dos entrevistados são armazenados
    Entrevistado [] vetor = new Entrevistado [300];
    // É um contador que conta o número de entrevistados
    private int proximo=0;
    // Metodo set do vetor
    public void setVetor (Entrevistado [] vetor){
        this.vetor = vetor;
    }
    // Metodo 1: adiciona novos entrevistados ao vetor
    public void adiciona(Entrevistado entrev){
        vetor[proximo] = entrev;
        proximo++;
    }
    // Metodo 2: retorna o numero de entrevistados
    public String relatorioQuantPessoas(){
        return "1) São um total de "+proximo+" entrevistados.";
    }
    // Metodo 3: retona o numero de pessoas de determinado genero
    public float returnGenero(char genero){
        float quant = 0;
        char aux = ' ';
        // Anda por todo array, verificando os valores da variável aux, do tipo char, acrescentando a variável quant, do tipo int.
        for (int i = 0; i < proximo; i++){
            aux = vetor[i].getId();
            if (aux==genero){
                quant++;
            }
        }
        return quant;
    }
    // Metodo 4: retorna a porcentagem de pessoas de um genero especifico
    public float returnPercGen(float quant){
        float perc = (100*quant)/proximo;
        return perc;
    }
    //metodo 5: informa a porcentagem de cada um dos generos de todos os entrevistados 
    public String relatorioSexo(){
        String str = " ";
        float m = 0, f = 0, o = 0;
        float percM, percF, percO;
        //Utiliza metodo 3 para retornar o numero de pessoas de cada genero
        m = returnGenero('m');
        f = returnGenero ('f');
        o = returnGenero('o');
        //Utiliza metodo 4 para retornar as porcentagens de cada genero
        percM = returnPercGen(m);
        percF = returnPercGen(f);
        percO = returnPercGen(o);
        str = "2) A porcentagem de pessoas do gênero masculino é "+percM+"% , a porcentagem de pessoas do gênero feminino é "+percF+"% e a porcentagem de outros: "+percO+"%.";
        return str;
    }
    //metodo 6: retorna o numero de pessoas de uma determinada faixa etaria
    public int returnFaixaEtaria(String FaixaEtaria){
        String aux = " ";
        int contador = 0;
        // Anda por todo array, verificando os valores da variável aux, do tipo String, acrescentando a variável contador, do tipo int.
        for (int i = 0; i < proximo; i++){
            aux = vetor[i].getIdade();
            if (aux.equals(FaixaEtaria)){
                contador++;
            }
        }
        return contador;
    }    
    //metodo 7: informa quantos entrevistados de cada faixa etaria possuem
    public String relatorioFaixaEtaria(){
        String str = " ";
        int crianca=0, jovem=0, adulto=0, idoso=0;
        //utiliza o metodo 6 para retornar o numero de pessoas de cada faixa etaria
        crianca = returnFaixaEtaria(" Até 15 anos");
        jovem = returnFaixaEtaria(" De 16 a 29 anos");
        adulto = returnFaixaEtaria(" De 30 a 59 anos");
        idoso = returnFaixaEtaria(" Acima de 60 anos");
        str = "3) Tiveram "+crianca+" entrevistados de até 15 anos, "+jovem+" de 16 a 29 anos, "+adulto+" de 30 a 59 anos e "+idoso+" acima de 60 anos.";
        return str;
    }
    //metodo 8: retorna o numero de pessoas de um determinado nivel de escolaridade
    public float returnEscolaridade(String escolaridade){
        String aux = " ";
        float contador = 0;
        // Anda por todo array, verificando os valores da variável aux, do tipo String, acrescentando a variável contador, do tipo int.
        for(int i  = 0; i<proximo; i++){
            aux = vetor[i].getEnsino();
            if(aux.equals(escolaridade)){
                contador++;
            }
        }
        return contador;
    }
    //metodo 9: retorna a porcentagem de determinado nível de escolaridade sobre todos os demais entrevistados
    public float returnPercEsc(float quant){
        float perc = (100 * quant)/proximo;
        return perc;
    }
    //metodo 10: divide todos os entrevistados em porcentagens pelos niveis de escolaridade
    public String relatorioEscolaridade(){
        String str = " ";
        float fundInc = 0, fundCom = 0, medInc = 0, medCom = 0, supInc = 0, supCom = 0;
        float pFundInc, pFundCom, pMedInc, pMedCom, pSupInc, pSupCom;
        //Utiliza o metodo 8 para retornar o numero de pessoas de cada nivel de escolaridade
        fundInc = returnEscolaridade(" Ensino fundamental incompleto");
        fundCom = returnEscolaridade(" Ensino fundamental completo");
        medInc = returnEscolaridade( " Ensino médio incompleto");
        medCom = returnEscolaridade(" Ensino médio completo");
        supInc =  returnEscolaridade(" Ensino superior incompleto");
        supCom =  returnEscolaridade( " Ensino superior completo");
        // Utiliza o metodo 9 para retornar a porcentagem de pessoas de cada nivel de escolaridade.
        pFundInc = returnPercEsc(fundInc);
        pFundCom = returnPercEsc(fundCom);
        pMedInc = returnPercEsc(medInc);
        pMedCom = returnPercEsc(medCom);
        pSupInc = returnPercEsc(supInc);
        pSupCom = returnPercEsc(supCom);
        str = "4) Porcentagens de entrevistados com: \nFundamental incompleto: "+pFundInc+"%;\nFundamental completo: "+pFundCom+"%; \nMédio incompleto é de "+pMedInc+"%; \nMédio completo: "+pMedCom+"%; \nSuperior incompleto: "+pSupInc+"%; \nSuperior completo: "+pSupCom+"%.";
        return str;
    }
    //Metodo 11: que apresenta quantos entrevistados tem no minimo ensino superior completo
    public String relatorioEnsiSuperior(){
        String str = " ";
        float supCom = 0;
        supCom =  returnEscolaridade( " Ensino superior completo");
        str = "5) Tiveram "+supCom+" com no mínimo superior completo";
        return str;
    }
    //metodo 12: que retorna quantas pessoas de uma mesma faixa etaria que usam uma mesma tecnologia
    public int returnFaixaEtariaTecnologia(String tecnologia, String idade){
        String aux1 = " ", aux2 = " ";
        int cont = 0;
        // Anda por todo array, verificando os valores das variáveis aux1 e aux2, do tipo String, acrescentando a variável cont, do tipo int.
        for(int i = 0; i < proximo; i++){
            aux1 = vetor[i].getAcesso();
            aux2 = vetor[i].getIdade();
            if (aux1.equals(tecnologia)&&aux2.equals(idade)){
                cont++;
            }
        }
        return cont;
    }
    //metodo 13: que compara qual das variaveis é maior, retornando a faixa etária do maior ou de ambos, caso estes sejam iguais
    public String comparaMaior(int entrevistados1, String idade1, int entrevistados2, String idade2){
        String aux = " ";
        if (entrevistados1>entrevistados2){
            aux = idade1;
        }
        if (entrevistados2>entrevistados1){
            aux = idade2;
        }
        if (entrevistados2==entrevistados1){
            aux = idade1 + " e " + idade2;
        }
        return aux;
    }
    //metodo 14: que auxilia o metodo anterior, que seleciona qual o valor da variavel maior, para que dessa forma não seja necesario comparar todas as variaveis entre si
    public int maiorvalor(int variavel1, int variavel2){
        int aux = 0;
        if (variavel1>variavel2){
            aux = variavel1;
        }
        if (variavel2>variavel1){
            aux = variavel2;
        }
        if (variavel2==variavel1){
            aux = variavel1;
        }
        return aux;
    }
    //metodo 15: do tipo booleano que testa a igualdade de duas variaveis, para que dessa forma caso as maiores variaveis sejam iguais, a mensagem mostrada sera sobre ambas as variaveis
    public boolean testaIgualdade(int v1, int v2, boolean aux){
        if (v1 == v2){
            return true;
        }else{
            return aux;
        }
    }
    //metodo 16: utilizado para apresentar a faixa etaria que mais utiliza o smartphone
    public String relatorioMaisUtilizaCelular(){
        String str = " ";
        int crianca = 0, jovem = 0, adulto = 0, idoso = 0, maiorv = 0;
        String maior = " ";
        boolean aux = false;
        //utiliza o metodo 12, recebendo o número de entrevistados de cada faixa etaria que utilizam smartphone
        crianca = returnFaixaEtariaTecnologia(" Smartphone"," Até 15 anos");
        jovem = returnFaixaEtariaTecnologia(" Smartphone"," De 16 a 29 anos");
        adulto = returnFaixaEtariaTecnologia(" Smartphone"," De 30 a 59 anos");
        idoso = returnFaixaEtariaTecnologia(" Smartphone"," Acima de 60 anos");
        //utiliza o metodo 15, testando a igualdade de cada uma das variaveis
        aux = testaIgualdade(crianca, jovem, aux);
        aux = testaIgualdade(jovem, adulto, aux);
        aux = testaIgualdade(crianca, adulto, aux);
        aux = testaIgualdade(adulto, idoso, aux);
        aux = testaIgualdade(crianca, idoso, aux);
        aux = testaIgualdade(jovem, idoso, aux);
        //utiliza os metodos 13 e 14, de forma que e possivel comparar todas as variaveis de forma mais rapida e simples, de forma que e levado em consideracao se elas sao iguais ou nao para que no final seja mostrado apenas uma variavel caso ela nao seja igual a nenhuma outra ou pode ser mostrado duas ou mais variaveis caso elas sejam as maiores e iguais
        maior = comparaMaior(crianca, "até 15 anos", jovem, "de 16 a 29 anos");
        maiorv = maiorvalor(crianca, jovem);
        maior = comparaMaior(maiorv,maior,adulto,"de 30 a 59 anos");
        maiorv = maiorvalor(maiorv,adulto);
        maior = comparaMaior(maiorv,maior,idoso,"acima de 60 anos");
        maiorv = maiorvalor(maiorv,idoso);
        //caso a variavel boolana seja falsa, a maior variavel nao e igual a nenhuma outra e so e apressentada uma variavel, caso contrario as maiores variaveis sao igual e elas sao todas apresentadas
        if (aux==false){
            str = "6) A faixa etária que mais utiliza smartphone é a "+maior;
        }else{
            str = "6) As duas faixa etárias que mais utilizam smartphone são as "+maior;
        }
        return str;
    }
    //metodo 17: que compara qual das variaveis é menor, retornando a tecnologia da menor variavel ou de ambas, caso estes sejam iguais
    public String comparaMenor(int variavel1, String tec1, int variavel2, String tec2){
        String aux = " ";
        if (variavel1<variavel2){
            aux = tec1;
        }
        if (variavel2<variavel1){
            aux = tec2;
        }
        if (variavel2==variavel1){
            aux = tec1 + " e " + tec2;
        }
        return aux;
    }
    //metodo 18: que auxilia o metodo anterior, que seleciona qual o valor da variavel menor, para que dessa forma não seja necesario comparar todas as variaveis entre si
    public int menorvalor(int variavel1, int variavel2){
        int aux = 0;
        if (variavel1<variavel2){
            aux = variavel1;
        }
        if (variavel2<variavel1){
            aux = variavel2;
        }
        if (variavel2==variavel1){
            aux = variavel1;
        }
        return aux;
    }
    //metodo 19: que apresenta a tecnologia menos utilizada pela faixa etaria de ate 15 anos
    public String relatorioTecMenosUtil15(){
        String str = " ", menor = " ";
        int comp = 0, note = 0, tablet = 0, smartphone = 0, menorv = 0;
        boolean aux = false;
        //reutiliza o metodo 12, contando quantos entrevistados de ate 15 anos utilizam cada tipo de tecnologia
        note = returnFaixaEtariaTecnologia(" Notebook ou Netbook", " Até 15 anos");
        tablet = returnFaixaEtariaTecnologia(" Tablet", " Até 15 anos");
        comp = returnFaixaEtariaTecnologia(" Computador Pessoal", " Até 15 anos");
        smartphone = returnFaixaEtariaTecnologia(" Smartphone", " Até 15 anos");
        //reutiliza o metodo 15, testando a igualdade de cada uma das variaveis
        aux = testaIgualdade(note, tablet, aux);
        aux = testaIgualdade(note, comp, aux);
        aux = testaIgualdade(note, smartphone, aux);
        aux = testaIgualdade(comp, tablet, aux);
        aux = testaIgualdade(comp, smartphone, aux);
        aux = testaIgualdade(smartphone, tablet, aux);
        //utiliza os metodos 17 e 18, de forma que e possivel comparar todas as variaveis de forma mais rapida e simples, de forma que e levado em consideracao se elas sao iguais ou nao para que no final seja mostrado apenas uma variavel caso ela nao seja igual a nenhuma outra ou pode ser mostrado duas ou mais variaveis caso elas sejam as menores e iguais
        menor = comparaMenor(note, "notebook ou netbook", tablet, "tablet");
        menorv = menorvalor(note, tablet);
        menor = comparaMenor(menorv, menor, comp, "computador pessoal");
        menorv = menorvalor(menorv, comp);
        menor = comparaMenor(menorv, menor, smartphone, "smartphone");
        menorv = menorvalor(menorv, smartphone);
        //caso a variavel aux seja falsa, mostra apenas uma variavel, caso seja verdadeira mostra uma ou mais tecnologias
        if (aux == false){
            str = "7) A tecnologia menos utilizada pela faixa etária até 15 anos é o "+menor;
        }else{
            str = "7) As tecnologias menos utilizadas pela faixa etária até 15 anos são "+menor;
        }
        return str;
    }
    //metodo 20: retorna numero de entrevistados que selecionou uma prioridade especifica
    public int returnAreaPrioritaria(String prioridade){
        String aux = " ";
        int cont = 0;
        for(int i = 0; i < proximo; i++){
            aux = vetor[i].getImportancia();
            if(aux.equals(prioridade)){
                cont++;
            }
        }
        return cont;
    }
    //metodo 21: mostra todos os entrevistados separando quando deles selecionaram cada area prioritaria
    public String relatorioAreaPrioritaria(){
        String str = " ";
        int alim = 0, educ = 0, lazer = 0, seg = 0, cult = 0, empr = 0, saude = 0, transp = 0;
        //utiliza metodo 20 para mostrar quantos entrevistados selecionaram cada uma das prioridades, atribuindo elas a suas respectivas variaveis
        alim = returnAreaPrioritaria(" Alimentação");
        educ = returnAreaPrioritaria(" Educação");
        cult = returnAreaPrioritaria(" Cultura");
        lazer = returnAreaPrioritaria(" Lazer");
        seg = returnAreaPrioritaria(" Segurança");
        empr = returnAreaPrioritaria(" Emprego");
        saude = returnAreaPrioritaria(" Saude");
        transp = returnAreaPrioritaria(" Transporte");
        str = "8) A seguir temos o número de entrevistados que apontou cada um desses problemas envolvendo tecnologias digitais como sendo prioridade: \nAlimentação: "+alim+"\nEducação:"+educ+"\nCultura: "+cult+"\nSaúde: "+saude+"\nTransporte: "+transp+"\nEmprego: "+empr+"\nLazer: "+lazer+"\nSegurança: "+seg+".";
        return str;
    }
}