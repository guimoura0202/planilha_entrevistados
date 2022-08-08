/**
 * It's a class that stores the data of the survey and has methods to generate reports
 */
public class Evetor {
    Entrevistado [] vetor = new Entrevistado [300];
    // It's a counter that counts how many people were interviewed.
    private int proximo=0;
    // It's a method that sets the vector of the class.
    public void setVetor (Entrevistado [] vetor){
        this.vetor = vetor;
    }
    // It's a method that adds a new interviewee to the vector.
    public void adiciona(Entrevistado entrev){
        vetor[proximo] = entrev;
        proximo++;
    }
    // It's a method that returns a string with the number of interviewees.
    public String relatorio1(){
        return "1) São um total de "+proximo+" entrevistados.";
    }
    public String relatorio2(){
        String str = " ";
        char aux;
        int m = 0, f = 0, o = 0;
        float percM, percF, percO;
        for (int i = 0; i < 300; i++){
            aux = vetor[i].getId();
            if (aux == 'm'){
                m++;
            } else{
                if (aux == 'f'){
                    f++;
                }else{
                    o++;
                }
            }
        }
        percM = (m*100) / 300;
        percF = (f*100) / 300;
        percO = (o*100) / 300;
        str = "2) A porcentagem de pessoas do gênero masculino é "+percM+"% , a porcentagem de pessoas do gênero feminino é "+percF+"% e a porcentagem de outros: "+percO+"%.";
        return str;
    }
    public String relatorio3(){
        String str = " ", aux;
        int crianca=0, jovem=0, adulto=0, idoso=0;
        for (int i = 0; i < 300; i++){
            aux = vetor[i].getIdade();
            if (aux.equals(" Até 15 anos")){
                crianca++;
            }
            if (aux.equals(" De 16 a 29 anos")){
                jovem++;
            }
            if (aux.equals(" De 30 a 59 anos")){
                adulto++;
            }
            if (aux.equals(" Acima de 60 anos")){
                idoso++;
            }
        }
        str = "3) Tiveram "+crianca+" entrevistados de até 15 anos, "+jovem+" de 16 a 29 anos, "+adulto+" de 30 a 59 anos e "+idoso+" acima de 60 anos.";
        return str;
    }
    public String relatorio4(){
        String str = " ", aux;
        float fundInc = 0, fundCom = 0, medInc = 0, medCom = 0, supInc = 0, supCom = 0;
        float pFundInc, pFundCom, pMedInc, pMedCom, pSupInc, pSupCom;
        for (int i = 0; i < 300; i++){
            aux = vetor[i].getEnsino();
            if (aux.equals(" Ensino fundamental incompleto")){
                fundInc++;
            }
            if (aux.equals(" Ensino fundamental completo")){
                fundCom++;
            }
            if (aux.equals(" Ensino médio incompleto")){
                medInc++;
            }
            if (aux.equals(" Ensino médio completo")){
                medCom++;
            }
            if (aux.equals(" Ensino superior incompleto")){
                supInc++;
            }
            if (aux.equals(" Ensino superior completo")){
                supCom++;
            }
        }
        pFundInc = (fundInc * 100)/300;
        pFundCom = (fundCom * 100)/300;
        pMedInc = (medInc * 100)/300;
        pMedCom = (medCom * 100)/300;
        pSupInc = (supInc * 100)/300;
        pSupCom = (supCom * 100)/300;
        str = "4) Porcentagens de entrevistados com: \nFundamental incompleto: "+pFundInc+"%;\nFundamental completo: "+pFundCom+"%; \nMédio incompleto é de "+pMedInc+"%; \nMédio completo: "+pMedCom+"%; \nSuperior incompleto: "+pSupInc+"%; \nSuperior completo: "+pSupCom+"%.";
        return str;
    }
    public String relatorio5(){
        String str = " ", aux;
        int supCom = 0;
        for (int i = 0; i < 300; i++){
            aux = vetor[i].getEnsino();
            if (aux.equals(" Ensino superior completo")){
                supCom++;
            }
        }
        str = "Tiveram "+supCom+" com no mínimo superior completo";
        return str;
    }
    public String relatorio6(){
        String str = " ", aux1, aux2;
        int crianca = 0, jovem = 0, adulto = 0, idoso = 0;
        String maior = " ";
        for(int i = 0; i < 300; i++){
            aux1 = vetor[i].getIdade();
            aux2 = vetor[i].getAcesso();
            if (aux1.equals(" Até 15 anos")&&aux2.equals(" Smartphone")){
                crianca++;
            }
            if (aux1.equals(" De 16 a 29 anos")&&aux2.equals(" Smartphone")){
                jovem++;
            }
            if (aux1.equals(" De 30 a 59 anos")&&aux2.equals(" Smartphone")){
                adulto++;
            }
            if (aux1.equals(" Acima de 60 anos")&&aux2.equals(" Smartphone")){
                idoso++;
            }
        }
        if(crianca>=jovem&&crianca>=adulto&&crianca>=idoso){
            maior = "até 15 anos.";
        }
        if(jovem>=crianca&&jovem>=adulto&&jovem>=idoso){
            if (jovem==crianca){
                maior = "até 29 anos.";
            }
            if (jovem==adulto){
                maior = "de 16 a 59 anos.";
            }
            if (jovem!=crianca&&jovem!=adulto&&jovem!=idoso){
                maior = "16 a 29 anos.";
            }
        }
        if(adulto>=crianca&&adulto>=jovem&&adulto>=idoso){
            if (adulto==jovem){
                maior = "de 16 a 59 anos.";
            }
            if (adulto==idoso){
                maior = "acima de 59 anos.";
            }
            if (jovem!=crianca&&jovem!=adulto&&jovem!=idoso){
                maior = "30 a 59 anos.";
            }
        }
        if(idoso>=crianca&&idoso>=jovem&&idoso>=adulto){
            maior = "acima de 60 anos.";
        } 
        str = "5) A faixa etária que mais utiliza smartphone é a "+maior;
        return str;
    }
    public String relatorio7(){
        String aux1, aux2, menor = " ";
        int comp = 0, note = 0, tablet = 0, nenhuma = 0, smartphone = 0;
        for (int i = 0; i < 300; i++){
            aux1 = vetor[i].getAcesso();
            aux2 = vetor[i].getIdade();
            if (aux2.equals(" Até 15 anos")&&aux1.equals(" Notebook ou Netbook")){
                note++;
            }
            if (aux2.equals(" Até 15 anos")&&aux1.equals(" Tablet")){
                tablet++;
            }
            if (aux2.equals(" Até 15 anos")&&aux2.equals(" Computador Pessoal")){
                comp++;
            }
            if (aux2.equals(" Até 15 anos")&&aux2.equals(" Smartphone")){
                smartphone++;
            }
        }
        if (note<tablet||note<comp||note<smartphone){
            menor = "7) A tecnologia menos utilizada pela faixa etária até 15 anos é Notebook ou Netbook.";
        }
        if (comp<tablet||comp<note||comp<smartphone){
            menor = "7) A tecnologia menos utilizada pela faixa etária até 15 anos é o computador pessoal.";
        }
        if (tablet<comp||tablet<note||tablet<smartphone){
            menor = "7) A tecnologia menos utilizada pela faixa etária até 15 anos é o tablet.";
        }
        if (smartphone<comp||smartphone<note||smartphone<tablet){
            menor = "7) A tecnologia menos utilizada pela faixa etária até 15 anos é o smartphone.";
        }
        return menor;
    }
    public String relatorio8(){
        String str = " ", aux;
        int alim = 0, educ = 0, lazer = 0, seg = 0, cult = 0, empr = 0, saude = 0, transp = 0;
        for (int i = 0; i < 300; i++){
            aux = vetor[i].getImportancia();
            if (aux.equals(" Alimentação")){
                alim++;
            }
            if (aux.equals(" Educação")){
                educ++;
            }
            if (aux.equals(" Cultura")){
                cult++;
            }
            if (aux.equals(" Lazer")){
                lazer++;
            }
            if (aux.equals(" Segurança")){
                seg++;
            }
            if (aux.equals(" Emprego")){
                empr++;
            }
            if (aux.equals(" Saude")){
                saude++;
            }
            if (aux.equals(" Transporte")){
                transp++;
            }
        }
        str = "8) A seguir temos o número de entrevistados que apontou cada um desses problemas envolvendo tecnologias digitais como sendo prioridade: \nAlimentação: "+alim+"\nEducação:"+educ+"\nCultura: "+cult+"\nSaúde: "+saude+"\nTransporte: "+transp+"\nEmprego: "+empr+"\nLazer: "+lazer+"\nSegurança: "+seg+".";
        return str;
    }
}