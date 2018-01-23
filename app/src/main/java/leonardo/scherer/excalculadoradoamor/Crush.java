package leonardo.scherer.excalculadoradoamor;

import java.util.Random;

/**
 * Created by Leonardo on 26/07/2017.
 */

public class Crush {
    private String seunome;
    private String nomecrush;
    private String signocrush;
    private String signo;
    private String sexo;

    public Crush() {
    }

    public Crush(String seunome, String nomecrush, String signocrush, String signo, String sexo) {
        this.seunome = seunome;
        this.nomecrush = nomecrush;
        this.signocrush = signocrush;
        this.signo = signo;
        this.sexo = sexo;
    }

    public String getSeunome() {
        return seunome;
    }

    public void setSeunome(String seunome) {
        this.seunome = seunome;
    }

    public String getNomecrush() {
        return nomecrush;
    }

    public void setNomecrush(String nomecrush) {
        this.nomecrush = nomecrush;
    }

    public String getSignocrush() {
        return signocrush;
    }

    public void setSignocrush(String signocrush) {
        this.signocrush = signocrush;
    }

    public String getSigno() {
        return signo;
    }

    public void setSigno(String signo) {
        this.signo = signo;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public double gerarNumeroRandomico(){
        Random num = new Random();
        return  num.nextInt(100);
    }

    public String verificarSexo(){
        if(sexo.equalsIgnoreCase("Masculino")){
            return "homem: "+10;
        }else if(sexo.equalsIgnoreCase("Feminino")){
            return "Mulher: "+20;
        }else{
            return "outro: "+100;
        }
    }

    public String verificarSigno(){
        if(signocrush.equalsIgnoreCase("Aquário") && signo.equalsIgnoreCase("Aquário")){
            return "Vocês têm tudo em comum, sério! Mas o ímpeto criativo do aquariano " +
                    "está duplicado agora que vocês estão juntos e isso deve ser controlado " +
                    "para que tenham mais intimidade e carinho.";
        }else if(signocrush.equalsIgnoreCase("Aquário") && signo.equalsIgnoreCase("Peixes")){
            return "Vai ser muito difícil vocês conseguirem levar uma conversa sem que um ou " +
                    "outro se sinta entediado e evitem a conversa." +
                    "Por isso, concentre-se no que seu amor está dizendo e, mais importante, responda!";
        }else if(signocrush.equalsIgnoreCase("Aquário") && signo.equalsIgnoreCase("Touro")){
            return "Façam as enormes diferenças entre vocês serem positivas, não negativas. " +
                    "Taurino, controle seu ciúme, pois o aquariano precisa de um pouco de espaço " +
                    "para suas ideas malucas.";
        }else if(signocrush.equalsIgnoreCase("Aquário") && signo.equalsIgnoreCase("Áries")){
            return "Amantes da liberdade, ambos os signos podem entrar em contradição mais vezes " +
                    "que o desejado. O ideal é que o ariano e o aquariano passem mais tempo juntos para" +
                    " resolverem os problemas.";
        }else if(signocrush.equalsIgnoreCase("Aquário") && signo.equalsIgnoreCase("Gêmeos")){
            return "Curiosos, divertidos e extravagantes. O geminiano e o aquariano irão viver " +
                    "uma intensa história de amor juntos. Problemas todo mundo têm, mas é só " +
                    "deixá-los de lado que tudo dará certo.";
        }else if(signocrush.equalsIgnoreCase("Aquário") && signo.equalsIgnoreCase("Câncer")){
            return "Cuidado com o eterno terminar e voltar que desgasta relacionamentos." +
                    " Encontrem o que está causando conflitos e resolvam antes que vire uma bola de" +
                    " neve que esmagará o relacionamento de vocês.";
        }else if(signocrush.equalsIgnoreCase("Aquário") && signo.equalsIgnoreCase("Leão")){
            return "Signos opostos, mas com uma união que no final pode dar certo. " +
                    "Cabe a ambos sempre se atualizar e ouvir a opinião do parceiro. " +
                    "Só isso o relacionamento pode fluir.";
        }else if(signocrush.equalsIgnoreCase("Aquário") && signo.equalsIgnoreCase("Virgem")){
            return "A chave desse relacionamento será o aquariano aprender a controlar aquelas" +
                    " ideias novas que chegam subitamente e podem atrapalhar a calma e o conforto do" +
                    " cotidiano de Virgem.";
        }else if(signocrush.equalsIgnoreCase("Aquário") && signo.equalsIgnoreCase("Libra")){
            return "Aquarianos são criativos e librianos adoram romantismo. Invistam nisso e" +
                    " não deixem que o relacionamento caia na mesmice, fazendo as mesmas coisas" +
                    " todas as vezes que pode ter seus momentos íntimos.";
        }else if(signocrush.equalsIgnoreCase("Aquário") && signo.equalsIgnoreCase("Escorpião")){
            return "Evitem conversas que vocês já sabem que terminará em briga e evitem também " +
                    "tentarem se entender toda hora. Beijem-se loucamente e aproveitem a cama, " +
                    "intimidade é no que esse casal deve investir.";
        }else if(signocrush.equalsIgnoreCase("Aquário") && signo.equalsIgnoreCase("Sagitário")){
            return "Os dois são emotivos ao extremo, então evitem aquela sinceridade desnecessária " +
                    "que você sabe que vai acabar machucando seu parceiro. Mais amor, " +
                    "menos desentendimento e o amor será perfeito!\n";
        }else if(signocrush.equalsIgnoreCase("Aquário") && signo.equalsIgnoreCase("Capricórnio")){
            return "Cada um pensa de um jeito e não deixem que isso interfira na harmonia do casal. " +
                    "Os dois devem completar e amenizar os erros do outro e não apontá-los sem escrúpulos.\n";
        }else if(signocrush.equalsIgnoreCase("Peixes") && signo.equalsIgnoreCase("Aquário")){
            return "MUITA SENSIBILIDADE\n" +
                    "As coisas não vão correr bem se vocês tentarem levar tudo para o lado emocional." +
                    " Dialoguem muito e entrem em acordo para não destruírem o relacionamento por uma " +
                    "discussão desnecessária.\n";
        }else if(signocrush.equalsIgnoreCase("Peixes") && signo.equalsIgnoreCase("Peixes")){
            return "REALIZEM SEUS PLANOS\n" +
                    "Os amantes piscianos tendem a planejar suas vidas inteiras e não esperam a hora " +
                    "de viver esses sonhos incríveis que têm. Não deixem os planos somente no papel " +
                    "e realizem enquanto há tempo.\n";
        }else if(signocrush.equalsIgnoreCase("Peixes") && signo.equalsIgnoreCase("Áries")){
            return "CONFLITO DE PERSONALIDADE\n" +
                    "Por serem tão diferentes, podem dar muito certo. Para isso, é necessário um" +
                    " pouco de paciência com o parceiro, já que um vive no mundo dos sonhos" +
                    " e outro em um universo imediatista.\n";
        }else if(signocrush.equalsIgnoreCase("Peixes") && signo.equalsIgnoreCase("Touro")){
            return "A CAMA É O LAR\n" +
                    "Os dois viverão momentos inesquecíveis na cama, nos braços do outro ou" +
                    " em qualquer lugar que possam aproveitar seus momentos de intimidade." +
                    " Não se esqueçam de que a vida não é um eterno namoro e planejam sua vida.\n";
        }else if(signocrush.equalsIgnoreCase("Peixes") && signo.equalsIgnoreCase("Gêmeos")){
            return "BALANÇA DO ROMANCE\n" +
                    "O que falta em um, sobra no outro. O pisciano é muito romântico, o contrário" +
                    " do geminiano, que encara as coisas de uma forma mais fria. Se o pisciano " +
                    "entender o lado de seu companheiro, o relacionamento pode fluir.\n";
        }else if(signocrush.equalsIgnoreCase("Peixes") && signo.equalsIgnoreCase("Câncer")){
            return "UM PARA O OUTRO\n" +
                    "Perfeição, isso resume o relacionamento de vocês. Vão compartilhar tudo, " +
                    "conversa, escova de dente, sonhos e desejos. O tempo nunca passa para vocês," +
                    " então aproveitem!\n";
        }else if(signocrush.equalsIgnoreCase("Peixes") && signo.equalsIgnoreCase("Leão")){
            return "DEDICAÇÃO NECESSÁRIA\n" +
                    "Caminhos diferentes, opiniões diferentes. Ambos estão em uma sintonia " +
                    "distinta, mas que pode se solucionar com mais carinho e atenção. " +
                    "Quando resolvido o problema, os dois viverão uma incrível história.\n";
        }else if(signocrush.equalsIgnoreCase("Peixes") && signo.equalsIgnoreCase("Virgem")){
            return "APROVEITEM AS DIFERENÇAS\n" +
                    "Que vocês são diferentes, isso é evidente. Mas façam com que essas diferenças" +
                    " os unam ao invés de fazer com que vivam em mundos diferentes. Fazendo isso, tudo dará certo!\n";
        }else if(signocrush.equalsIgnoreCase("Peixes") && signo.equalsIgnoreCase("Libra")){
            return "MENOS FORMALIDADE\n" +
                    "Conversem, divirtam-se, beijem-se, percam-se no amor e esqueçam palavrinhas " +
                    "de educação. Deixem de ser sistemáticos e vidrados em perfeição e aproveitem melhor o seu tempo.\n";
        }else if(signocrush.equalsIgnoreCase("Peixes") && signo.equalsIgnoreCase("Escorpião")) {
            return "SINTONIA PERFEITA\n" +
                    "Seja conversando, brincando, jogando, fazendo piadas idiotas ou correndo atrás " +
                    "do outro pela casa, vocês vão se divertir absurdamente! Feitos um para o outro e " +
                    "ponto final. O amor vai reinar para sempre!\n";
        }else if(signocrush.equalsIgnoreCase("Peixes") && signo.equalsIgnoreCase("Sargitário")){
            return "DIFICULDADES À VISTA\n" +
                    "A visão de romance de vocês é muito diferente. Sagitário vai combater a " +
                    "delicadeza de Peixes com ignorâncias e as brigas serão constantes." +
                    " Controlem seus sentimentos e as coisas podem dar certo.\n";
        }else if(signocrush.equalsIgnoreCase("Peixes") && signo.equalsIgnoreCase("Capricórnio")){
            return "MATURIDADE É TUDO\n" +
                    "Evitem desentendimentos bobos, pois vocês têm tudo para dar certo!" +
                    " Não tentem acabar com os maneirismos um do outro e acostume-se com o jeito " +
                    "de seu parceiro, as coisas vão correr bem!\n";
        }else if(signocrush.equalsIgnoreCase("Áries") && signo.equalsIgnoreCase("Aquário")){
            return "CUIDADO COM CONFLITOS\n" +
                    "Amantes da liberdade, ambos os signos podem entrar em contradição mais vezes" +
                    " que o desejado. O ideal é que o ariano e o aquariano passem mais tempo juntos" +
                    " para resolverem os problemas.\n";
        }else if(signocrush.equalsIgnoreCase("Áries") && signo.equalsIgnoreCase("Peixes")){
            return "CONFLITO DE PERSONALIDADE\n" +
                    "Por serem tão diferentes, podem dar muito certo. Para isso, é necessário" +
                    " um pouco de paciência com o parceiro, já que um vive no mundo dos sonhos e" +
                    " outro em um universo imediatista.\n";
        }else if(signocrush.equalsIgnoreCase("Áries") && signo.equalsIgnoreCase("Áries")){
            return "CONFLITO DE INTERESSES\n" +
                    "Duas opiniões distintas podem, em muitas vezes, gerar um desconforto na relação " +
                    "a dois. O casal ariano deve tomar cuidado com isso e tentar sempre ouvir a opinião do parceiro.\n";
        }else if(signocrush.equalsIgnoreCase("Áries") && signo.equalsIgnoreCase("Touro")){
            return "PERSONALIDADES DIFERENTES\n" +
                    "A agitação de Áries e a calma de Touro podem causar uma explosão no relacionamento." +
                    " Resolvam os problemas, aproveitem e descubram novos lados da vida.\n";
        }else if(signocrush.equalsIgnoreCase("Áries") && signo.equalsIgnoreCase("Gêmeos")){
            return "JOGO DA PACIÊNCIA\n" +
                    "Os dois podem ser diferentes, mas se deixarem as diferenças de lado, a relação " +
                    "vai dar certo. O ariano deve ter mais paciência com o geminiano, que é muito comunicativo e " +
                    "sempre tem uma opinião sobre tudo.\n";
        }else if(signocrush.equalsIgnoreCase("Áries") && signo.equalsIgnoreCase("Câncer")){
            return "DIVERSÃO ACIMA DA MÉDIA\n" +
                    "Um é frio e o outro quente, mas mesmo assim, um ariano e um canceriano têm " +
                    "tudo para dar certo. Diversão é o que não vai faltar neste casal que fará todo " +
                    "o possível e impossível para uma noite de boas risadas.\n";
        }else if(signocrush.equalsIgnoreCase("Áries") && signo.equalsIgnoreCase("Leão")){
            return "GRANDE ATRAÇÃO\n" +
                    "Ambos têm uma personalidade forte e parecida, o que faz com o que a relação" +
                    " flua naturalmente. Apesar da forte atração, os dois devem lembrar que um relacionamento " +
                    "é feito de cooperação.\n";
        }else if(signocrush.equalsIgnoreCase("Áries") && signo.equalsIgnoreCase("Virgem")){
            return "A RELAÇÃO DE VOCÊS\n" +
                    "É preciso de muito esforço para que um ariano e um virginiano se entendam " +
                    "e vivam em harmonia. A tarefa pode não ser fácil, mas se o amor estiver em " +
                    "jogo, a relação pode dar certo.\n";
        }else if(signocrush.equalsIgnoreCase("Áries") && signo.equalsIgnoreCase("Libra")){
            return "LIBERDADE DE SER\n" +
                    "As qualidades do ariano e do libriano são opostas, e por isso tornam-se " +
                    "complementares. A amizade e o amor entre esses signos têm a característica da " +
                    "verdade, da personalidade sincera.\n";
        }else if(signocrush.equalsIgnoreCase("Áries") && signo.equalsIgnoreCase("Escorpião")){
            return "CONTROLE DE SENTIMENTOS\n" +
                    "Dois signos com temperamentos dominadores. Os dois devem abrir concessões" +
                    " para que a relação flua naturalmente. Deixar de lado o bicho do ciúme é um " +
                    "ótimo método para que o romance flua.\n";
        }else if(signocrush.equalsIgnoreCase("Áries") && signo.equalsIgnoreCase("Sargitário")){
            return "AVENTUREIROS DE PRIMEIRA\n" +
                    "Bom humor e aventura é o que não irá faltar nesta relação. Ambos compartilham " +
                    "uma personalidade forte, mas que pode ser muito bem trabalhada em conjunto." +
                    " A amizade pode trazer sucesso e lucro para os dois.\n";
        }else if(signocrush.equalsIgnoreCase("Áries") && signo.equalsIgnoreCase("Capricórnio")){
            return "INCOMPATIBILIDADE DE GÊNIOS\n" +
                    "Um é agitado, o outro mais calmo. Um vivo no mundo dos sonhos, o outro " +
                    "toma como base a realidade. Para fazer com que essa relação dê certo," +
                    " é preciso que ambos mantenham os pés no chão.\n";
        }else if(signocrush.equalsIgnoreCase("Touro") && signo.equalsIgnoreCase("Aquário")){
            return "BOAS DIFERENÇAS\n" +
                    "Façam as enormes diferenças entre vocês serem positivas, não negativas." +
                    " Taurino, controle seu ciúme, pois o aquariano precisa de um pouco de " +
                    "espaço para suas ideas maluco.\n";
        }else if(signocrush.equalsIgnoreCase("Touro") && signo.equalsIgnoreCase("Peixes")){
            return "A CAMA É O LAR\n" +
                    "Os dois viverão momentos inesquecíveis na cama, nos braços do " +
                    "outro ou em qualquer lugar que possam aproveitar seus momentos de intimidade." +
                    " Não se esqueçam de que a vida não é um eterno namoro e planejam sua vida.\n";
        }else if(signocrush.equalsIgnoreCase("Touro") && signo.equalsIgnoreCase("Áries")){
            return "CUIDADO COM OS PROBLEMAS\n" +
                    "Explosão de vida e diversão. A relação pode dar muito certo, contanto que" +
                    " o casal deixe de lado todas as diferenças e enfrente os problemas.\n";
        }else if(signocrush.equalsIgnoreCase("Touro") && signo.equalsIgnoreCase("Touro")){
            return "DUPLA DINÂMICA\n" +
                    "Por serem do mesmo signo, os amantes taurinos têm tudo para dar certo. " +
                    "Muita afinidade e talentos compartilhados entre ambos trarão lucros para o relacionamento.\n" +
                    "ENTRE QUATRO PAREDES\n";
        }else if(signocrush.equalsIgnoreCase("Touro") && signo.equalsIgnoreCase("Gêmeos")){
            return "PERSONALIDADES DISTINTAS\n" +
                    "Cuidado com as crises de ciúme! O jeito extrovertido do geminiano " +
                    "pode assustar um pouco o taurino. Com esses problemas resolvidos, os dois têm tudo para dar certo.\n";
        }else if(signocrush.equalsIgnoreCase("Touro") && signo.equalsIgnoreCase("Câncer")){
            return "NÃO CAIAM NO COTIDIANO\n" +
                    "Vocês adoram ficar em casa e curtir um ao outro no sofá assistindo um filminho," +
                    " legal. Mas não deixem de sair e curtir um pouco, aproveitar o amor em outros lugares " +
                    "que não sejam o lar.\n";
        }else if(signocrush.equalsIgnoreCase("Touro") && signo.equalsIgnoreCase("Leão")){
            return "SINTONIA PERFEITA\n" +
                    "Típico casal que foi feito para ficar junto." +
                    " Os dois gostam de atenção e por isso entendem um ao outro." +
                    " Vale a dica para manter o equilíbrio entre a relação.\n";
        }else if(signocrush.equalsIgnoreCase("Touro") && signo.equalsIgnoreCase("Virgem")){
            return "RELAÇÃO DE ENSINAMENTOS\n" +
                    "Muitos ensinamentos serão necessários para que esse casal tenha finalmente " +
                    "um final feliz. Ouvir sempre o parceiro e aceitar opiniões diferentes da sua " +
                    "é essencial para um relacionamento saudável.\n";
        }else if(signocrush.equalsIgnoreCase("Touro") && signo.equalsIgnoreCase("Libra")){
            return "CUIDADO COM CONFLITOS\n" +
                    "Enquanto Touro é mais prático e gosta de ir direto ao ponto," +
                    " librianos são mais indecisos e precisam de mais tempo para entender as questões " +
                    "do relacionamento. Diálogo é essencial!\n";
        }else if(signocrush.equalsIgnoreCase("Touro") && signo.equalsIgnoreCase("Escorpião")){
            return "A QUÍMICA PERFEITA\n" +
                    "Escorpianos e taurinos são feitos um pro outro! A sensualidade e erotismo " +
                    "entre quatro paredes são incríveis e os problemas são resolvidos com muito amor e carinho.\n";
        }else if(signocrush.equalsIgnoreCase("Touro") && signo.equalsIgnoreCase("Sargitário")){
            return "FALTA DE COMPROMISSO\n" +
                    "Vocês terão muitas dificuldades de diálogo, pois têm ideias e planos de vida " +
                    "diferentes. Tomem cuidado para que essas dificuldades não se tornem constantes " +
                    "a ponto de não terem compromisso um com o outro.\n";
        }else if(signocrush.equalsIgnoreCase("Touro") && signo.equalsIgnoreCase("Capricórnio")){
            return "TUDO PRA DAR CERTO\n" +
                    "Vocês têm tudo pra dar certo! Adoram estar grudados a todo o momento e " +
                    "fazem planos para o futuro e para a vida e não se vêem um sem o outro. " +
                    "Nada de planejar coisas malucas e tudo dará certo!\n";
        }else if(signocrush.equalsIgnoreCase("Gêmeos") && signo.equalsIgnoreCase("Aquário")){
            return "UNIÃO PERFEITA\n" +
                    "Curiosos, divertidos e extravagantes. O geminiano e o aquariano irão viver " +
                    "uma intensa história de amor juntos. Problemas todo mundo têm, mas é só deixá-los " +
                    "de lado que tudo dará certo.\n";
        }else if(signocrush.equalsIgnoreCase("Gêmeos") && signo.equalsIgnoreCase("Peixes")){
            return "BALANÇA DO ROMANCE\n" +
                    "O que falta em um, sobra no outro. O pisciano é muito romântico, o contrário" +
                    " do geminiano, que encara as coisas de uma forma mais fria. Se o pisciano entender" +
                    " o lado de seu companheiro, o relacionamento pode fluir.\n";
        }else if(signocrush.equalsIgnoreCase("Gêmeos") && signo.equalsIgnoreCase("Áries")){
            return "DESAFIOS NO CAMINHO\n" +
                    "Os dois podem viver em harmonia, mas isso não será fácil." +
                    " A comunicação ativa do geminiano pode espantar o ariano. Empreendam os desafios juntos!\n";
        }else if(signocrush.equalsIgnoreCase("Gêmeos") && signo.equalsIgnoreCase("Touro")){
            return "CONVIVÊNCIA DIFÍCIL\n" +
                    "É preciso de um pouco de esforço para que a relação entre um geminiano e um " +
                    "taurino dê certo. O ideal é que o casal passe por cima de todos os problemas," +
                    " e principalmente das diferenças, juntos.\n";
        }else if(signocrush.equalsIgnoreCase("Gêmeos") && signo.equalsIgnoreCase("Gêmeos")){
            return "COMUNICAÇÃO ENFATIZADA\n" +
                    "A união entre os amantes geminianos é de dar inveja em qualquer casal. " +
                    "Por serem comunicativos, nunca faltará assunto e animação no relacionamento.\n";
        }else if(signocrush.equalsIgnoreCase("Gêmeos") && signo.equalsIgnoreCase("Câncer")){
            return "CRIATIVIDADE ATIVADA\n" +
                    "A união entre os amantes geminianos é de dar inveja em qualquer casal." +
                    " Por serem comunicativos, nunca faltará assunto e animação no relacionamento.\n";
        }else if(signocrush.equalsIgnoreCase("Gêmeos") && signo.equalsIgnoreCase("Leão")){
            return "INTRIGAS À VISTA\n" +
                    "Apesar de terem a personalidade parecida e de sempre viverem em clima de festa, " +
                    "o geminiano e o leonino podem passar por muitos problemas juntos." +
                    " O ideal é que ambos pensem muito antes de falar.\n";
        }else if(signocrush.equalsIgnoreCase("Gêmeos") && signo.equalsIgnoreCase("Virgem")){
            return "EQUILÍBRIO EM ALTA\n" +
                    "Apesar de serem opostos, o geminiano e o virginiano podem " +
                    "se dar muito bem no final das contas. Ambos precisam dar o melhor de si" +
                    " na ralação para surpreender o parceiro.\n";
        }else if(signocrush.equalsIgnoreCase("Gêmeos") && signo.equalsIgnoreCase("Libra")){
            return "SINTONIA PERFEITA!\n" +
                    "De longe dá para notar a harmonia entre o casal de Gêmeos e Libra. " +
                    "A comunicação, alegria e paixão entre os dois é de colocar qualquer outro " +
                    "amante de queixo caído.\n";
        }else if(signocrush.equalsIgnoreCase("Gêmeos") && signo.equalsIgnoreCase("Escorpião")){
            return "CUIDADO COM CONFLITOS\n" +
                    "Um é superficial, o outro profundo. Para que o relacionamento entre um " +
                    "geminiano e um escorpiano dê certo é preciso que ambos entendam o lado do parceiro." +
                    " Coloque-se sempre do outro lado da história.\n";
        }else if(signocrush.equalsIgnoreCase("Gêmeos") && signo.equalsIgnoreCase("Sargitário")){
            return "ÓTIMA RELAÇÃO\n" +
                    "As diferenças podem fazer o relacionamento desandar, mas se isso não acontecer," +
                    " o geminiano e o sagitariano vão se entender tranquilamente. O ideal é que " +
                    "ambos sempre ouçam o parceiro quando necessário.\n";
        }else if(signocrush.equalsIgnoreCase("Gêmeos") && signo.equalsIgnoreCase("Capricórnio")){
            return "CONFLITO DE PERSONALIDADE\n" +
                    "Um é quieto, o outro não consegue fechar a boca nunca. O geminiano e o" +
                    " capricorniano vão enfrentar muitos problemas juntos por conta da personalidade." +
                    " Mas mesmo assim, vale o esforço.\n";
        }else if(signocrush.equalsIgnoreCase("Câncer") && signo.equalsIgnoreCase("Aquário")){
            return "COMPORTAMENTOS DIFERENTES\n" +
                    "Um vive de modo emocional, ligado ao passado. O outro está totalmente conectado" +
                    " ao futuro. É preciso de muita paciência e vontade para fazer essa relação dar certo.\n";
        }else if(signocrush.equalsIgnoreCase("Câncer") && signo.equalsIgnoreCase("Peixes")){
            return "UM PARA O OUTRO\n" +
                    "Perfeição, isso resume o relacionamento de vocês. Vão compartilhar tudo, " +
                    "conversa, escova de dente, sonhos e desejos. O tempo nunca passa para vocês, então aproveitem!\n";
        }else if(signocrush.equalsIgnoreCase("Câncer") && signo.equalsIgnoreCase("Áries")){
            return "APRENDIZADO COLETIVO\n" +
                    "Os dois são muito diferentes, e podem aprender muito um com o outro. Quem sabe" +
                    " o ariano não passe sua agitação para o parceiro, e o canceriano não ensine o" +
                    " ariano a ter uma pouco mais de calma?\n";
        }else if(signocrush.equalsIgnoreCase("Câncer") && signo.equalsIgnoreCase("Touro")){
            return "CASAL PERFEITO\n" +
                    "Ninguém precisa de uma história de contos de fadas quando se tem um" +
                    " canceriano e um taurino ao lado. A relação e a sintonia entre ambos é mágica," +
                    " sem conflitos e estresses.\n";
        }else if(signocrush.equalsIgnoreCase("Câncer") && signo.equalsIgnoreCase("Gêmeos")){
            return "CUIDADO COM O CIÚME\n" +
                    "A combinação é perigosa. Gêmeos é mais comunicativo e atirado, e Câncer " +
                    "não é diferente. Os dois devem tomar cuidado com o ciúme, que é o maior problema " +
                    "da relação amorosa.\n";
        }else if(signocrush.equalsIgnoreCase("Câncer") && signo.equalsIgnoreCase("Câncer")){
            return "DUPLA EMOTIVA\n" +
                    "Um casal de dar inveja em qualquer outro. Nada melhor que dois cancerianos" +
                    " para se entenderem, já que pessoas que compartilham desse signo são muito emotivas." +
                    " Romance é o que não vai faltar na relação!\n";
        }else if(signocrush.equalsIgnoreCase("Câncer") && signo.equalsIgnoreCase("Leão")){
            return "CONTROLE DA SITUAÇÃO\n" +
                    "A personalidade de ambos não bate, não tem jeito. Mas e que tal escutar o parceiro?" +
                    " É assim que funciona uma relação entre um canceriano e um leonino.\n";
        }else if(signocrush.equalsIgnoreCase("Câncer") && signo.equalsIgnoreCase("Virgem")){
            return "COMBINAÇÃO PERFEITA\n" +
                    "Relação saudável e amigável entre o canceriano e o virginiano. " +
                    "Ambos viverão momentos intensos de felicidade e amor.\n";
        }else if(signocrush.equalsIgnoreCase("Câncer") && signo.equalsIgnoreCase("Libra")){
            return "CONVIVÊNCIA DIFÍCIL\n" +
                    "Librianos e cancerianos vão viver envoltos de sensualidade, carinho e amor." +
                    " Porém, Libra é regido pela insegurança e Câncer pelo desejo de aventura, " +
                    "o que pode gerar dificuldades na convivência do dia a dia.\n";
        }else if(signocrush.equalsIgnoreCase("Câncer") && signo.equalsIgnoreCase("Escorpião")){
            return "LAR, DOCE LAR\n" +
                    "O coração de um escorpiano é a morada perfeita para o ânimo agitado e" +
                    " aventureiro de um canceriano. Os dois serão compreensivos e dificilmente irão se " +
                    "desentender por motivos fúteis.\n" +
                    "ENTRE QUATRO PAREDES\n";
        }else if(signocrush.equalsIgnoreCase("Câncer") && signo.equalsIgnoreCase("Sargitário")){
            return "DECISÕES DIFÍCEIS\n" +
                    "Qualquer decisão para vocês será bastante complicada. O apego do canceriano ao " +
                    "que lhe é confortável e o desejo aventureiro e inovador do sagitariano vão" +
                    " conflitar constantemente. Aprendam a dialogar!\n";
        }else if(signocrush.equalsIgnoreCase("Câncer") && signo.equalsIgnoreCase("Capricórnio")){
            return "COMPREENSÃO\n" +
                    "É evidente que seus jeitos são diferentes, mas é evidente, também, que vocês " +
                    "se dão muito bem. Não tentem mudar o jeito do outro a cada segundo e aceite as" +
                    " decisões do seu parceiro.\n";
        }else if(signocrush.equalsIgnoreCase("Leão") && signo.equalsIgnoreCase("Aquário")){
            return "CONVIVÊNCIA DIFÍCIL\n" +
                    "Signos opostos, mas com uma união que no final pode dar certo. " +
                    "Cabe a ambos sempre se atualizar e ouvir a opinião do parceiro. " +
                    "Só isso o relacionamento pode fluir.\n";
        }else if(signocrush.equalsIgnoreCase("Leão") && signo.equalsIgnoreCase("Peixes")){
            return "DEDICAÇÃO NECESSÁRIA\n" +
                    "Caminhos diferentes, opiniões diferentes. Ambos estão em uma sintonia distinta," +
                    " mas que pode se solucionar com mais carinho e atenção. Quando resolvido o" +
                    " problema, os dois viverão uma incrível história.\n";
        }else if(signocrush.equalsIgnoreCase("Leão") && signo.equalsIgnoreCase("Áries")){
            return "TENHAM CALMA\n" +
                    "Apesar das intrigas e dos desentendimentos, o leonino e o ariano podem se " +
                    "dar muito bem no amor. Ambos têm a personalidade forte, e saberão entender o " +
                    "parceiro sempre.\n";
        }else if(signocrush.equalsIgnoreCase("Leão") && signo.equalsIgnoreCase("Touro")){
            return "TENHAM CALMA\n" +
                    "O leonino e o taurino foram feitos para o amor! Ambos brilham por todos os" +
                    " lugares que passam, e juntos podem conquistar muitos prêmios. Mas cuidado com" +
                    " a inveja e o ciúme.\n";
        }else if(signocrush.equalsIgnoreCase("Leão") && signo.equalsIgnoreCase("Gêmeos")){
            return "CUIDADO COM A ROTINA\n" +
                    "O geminiano sempre tem o que falar, e isso pode afastar um pouco" +
                    " o leonino. O ideal é que o casal tenha sempre atividades diferentes para " +
                    "não cair na rotina sempre.\n";
        }else if(signocrush.equalsIgnoreCase("Leão") && signo.equalsIgnoreCase("Câncer")){
            return "CONFLITO DE PERSONALIDADE\n" +
                    "Os dois são muito parecidos, o que pode complicar e muito a relação. " +
                    "Ouça sempre o seu parceiro, mesmo que tenham opiniões distintas, só assim o " +
                    "romance pode fluir para algo concreto.\n";
        }else if(signocrush.equalsIgnoreCase("Leão") && signo.equalsIgnoreCase("Leão")){
            return "BRILHO EXCESSIVO\n" +
                    "Há muita chance de um romance vingar. Por terem os mesmos interesses, " +
                    "os leoninos podem se entender muito bem. Ambos adoram brilhar e farão isso " +
                    "juntos em todos os lugares.\n";
        }else if(signocrush.equalsIgnoreCase("Leão") && signo.equalsIgnoreCase("Virgem")){
            return "OPINIÕES DISTINTAS\n" +
                    "Signos opostos, opiniões opostas. O leonino e o virginiano podem encontrar " +
                    "muitos problemas pelo caminho. Um prefere uma balada, e o outro gosta de " +
                    "ficar em casa. Se os dois entrarem em um acordo, tudo dará certo.\n";
        }else if(signocrush.equalsIgnoreCase("Leão") && signo.equalsIgnoreCase("Libra")){
            return "CONTO DE FADAS\n" +
                    "Perfeitos um para o outro. Não há outra frase que defina esses amantes." +
                    " Os dois encaram de frente os problemas e sempre ficam juntos. Amor, amizade" +
                    " e alegria não faltam nessa união.\n";
        }else if(signocrush.equalsIgnoreCase("Leão") && signo.equalsIgnoreCase("Escorpião")){
            return "CÚMPLICES PERFEITOS\n" +
                    "Lembrem-se de manter a tolerância sempre em alta. Fora isso, o leonino e" +
                    " o escorpiano não terão muitos conflitos. Momentos de alegria e amizade farão" +
                    " parte da rotina de ambos.\n";
        }else if(signocrush.equalsIgnoreCase("Leão") && signo.equalsIgnoreCase("Sargitário")){
            return "ALEGRIA QUE CONTAGIA\n" +
                    "Difícil mesmo é separar esses dois. Ambos têm tudo para deixar qualquer um" +
                    " com inveja e morrendo de vontade de viver um romance profundo. Disposição" +
                    " e alegria é o que não falta na relação.\n";
        }else if(signocrush.equalsIgnoreCase("Leão") && signo.equalsIgnoreCase("Capricórnio")){
            return "UNIÃO DE SUCESSO\n" +
                    "Força, disciplina e tenacidade. Tudo o que um casal precisa para alcançar o " +
                    "sucesso está com os amantes de leão e capricórnio. Mesmo com opiniões diferentes, " +
                    "os dois sempre chegarão a um acordo." +
                    " e alegria é o que não falta na relação.\n";
        }else if(signocrush.equalsIgnoreCase("Virgem") && signo.equalsIgnoreCase("Aquário")){
            return "OPINIÕES DISTINTAS\n" +
                    "Os dois adoram trabalhar, organizar a casa e bater um papo cabeça. " +
                    "Por mais que se divirtam fazendo isso, vocês precisam de longos momentos de " +
                    "intimidade e de carinho, sem nenhuma preocupação!\n";
        }else if(signocrush.equalsIgnoreCase("Virgem") && signo.equalsIgnoreCase("Peixes")){
            return "APROVEITEM AS DIFERENÇAS\n" +
                    "Que vocês são diferentes, isso é evidente. Mas façam com que essas diferenças " +
                    "os unam ao invés de fazer com que vivam em mundos diferentes. Fazendo isso," +
                    " tudo dará certo!\n";
        }else if(signocrush.equalsIgnoreCase("Virgem") && signo.equalsIgnoreCase("Áries")){
            return "PACIÊNCIA E DISCIPLINA\n" +
                    "Para que os dois consigam viver em harmonia em qualquer ambiente, é necessário " +
                    "ter paciência. Não espere um retorno fácil de seu companheiro, mas aguarde o " +
                    "momento certo. Vale investir na união\n";
        }else if(signocrush.equalsIgnoreCase("Virgem") && signo.equalsIgnoreCase("Touro")){
            return "RELAÇÃO DE ENSINAMENTOS\n" +
                    "Muitos ensinamentos serão necessários para que esse casal tenha finalmente " +
                    "um final feliz. Ouvir sempre o parceiro e aceitar opiniões diferentes da sua " +
                    "é essencial para um relacionamento saudável.\n";
        }else if(signocrush.equalsIgnoreCase("Virgem") && signo.equalsIgnoreCase("Gêmeos")){
            return "BANQUETE CULTURAL\n" +
                    "Gostos diferentes, mas cheios de personalidade. Juntos, os amantes de " +
                    "virgem e gêmeos têm muito o que ensinar outros casais. O ideal é o equilíbrio" +
                    " entre a criatividade e a objetividade.\n";
        }else if(signocrush.equalsIgnoreCase("Virgem") && signo.equalsIgnoreCase("Câncer")){
            return "PARCERIA PERFEITA\n" +
                    "Um é prático, o outro metódico. Nesta relação, um será o " +
                    "complemento do outro. Mas tome cuidado! Ouça sempre seu companheiro e" +
                    " faça com que ele se sinta especial.\n";
        }else if(signocrush.equalsIgnoreCase("Virgem") && signo.equalsIgnoreCase("Leão")){
            return "CUIDADO COM A PERSONALIDADE\n" +
                    "Opostos se atraem, mas em alguns dos casos o cuidado é necessário. Essa" +
                    " é uma relação um tanto quanto difícil, pois ambos têm interesses diferentes." +
                    " Tenha paciência e respeite o seu parceiro.\n";
        }else if(signocrush.equalsIgnoreCase("Virgem") && signo.equalsIgnoreCase("Virgem")){
            return "CASAL MARAVILHA\n" +
                    "Organização é a palavra-chave do casal virginiano. Além de serem românticos " +
                    "e super amigos, os dois sabem como contornar uma situação difícil.\n";
        }else if(signocrush.equalsIgnoreCase("Virgem") && signo.equalsIgnoreCase("Libra")){
            return "EVITE A FORMALIDADE\n" +
                    "Naturalmente, Libra e Virgem se darão muito bem por terem muito em comum," +
                    " mas isso pode fazer com que caiam na rotina e virem cavalheiro e dama formais. " +
                    "Evite isso a todo custo e a relação pode durar!\n";
        }else if(signocrush.equalsIgnoreCase("Virgem") && signo.equalsIgnoreCase("Escorpião")){
            return "DIÁLOGO É TUDO\n" +
                    "Escorpianos e virginianos gostam de liberdade, mas para o relacionamento " +
                    "ser duradouro, ambos devem ter o hábito de conversar e se entender, sem " +
                    "deixar as coisas ficarem ruins para um ou outro.\n";
        }else if(signocrush.equalsIgnoreCase("Virgem") && signo.equalsIgnoreCase("Sargitário")){
            return "MANIAS E HÁBITOS\n" +
                    "Sagitário e Virgem adoram as coisas à sua maneira, portanto não tentem mudar" +
                    " um ao outro ou impor seu jeito e suas ideias ao seu parceiro. Deixem tudo de" +
                    "uma maneira agradável aos dois!\n";
        }else if(signocrush.equalsIgnoreCase("Virgem") && signo.equalsIgnoreCase("Capricórnio")){
            return "SEPAREM SEU TEMPO\n" +
                    "Os dois adoram trabalhar, organizar a casa e bater um papo cabeça." +
                    " Por mais que se divirtam fazendo isso, vocês precisam de longos momentos " +
                    "de intimidade e de carinho, sem nenhuma preocupação!\n";
        }else if(signocrush.equalsIgnoreCase("Libra") && signo.equalsIgnoreCase("Aquário")){
            return "AMIZADE COLORIDA\n" +
                    "Os dois serão ótimos amigos e se darão muito bem. Na cama, " +
                    "os dois satisfarão todos seus desejos e vontades. Se quiserem arriscar " +
                    "no amor, não deixem desejos sexuais os controlarem e não deixem a amizade " +
                    "atrapalhar o relacionamento!\n";
        }else if(signocrush.equalsIgnoreCase("Libra") && signo.equalsIgnoreCase("Peixes")){
            return "FALTA DE TEMPO\n" +
                    "O senso de urgência e anseio de aventuras do libriano podem fazer com " +
                    "que não sobre muito tempo para dar atenção aos sentimentos e necessidade de" +
                    " carinho do pisciano. Coloquem o amor como prioridade" +
                    " na vida de ambos e pode dar certo!\n";
        }else if(signocrush.equalsIgnoreCase("Libra") && signo.equalsIgnoreCase("Áries")){
            return "LIBERDADE DE SER\n" +
                    "As qualidades do ariano e do libriano são opostas, e por isso tornam-se " +
                    "complementares. A amizade e o amor entre esses signos têm a característica" +
                    " da verdade, da personalidade sincera.\n";
        }else if(signocrush.equalsIgnoreCase("Libra") && signo.equalsIgnoreCase("Touro")){
            return "CUIDADO COM CONFLITOS\n" +
                    "Enquanto Touro é mais prático e gosta de ir direto ao ponto, librianos são " +
                    "mais indecisos e precisam de mais tempo para entender as questões" +
                    " do relacionamento. Diálogo é essencial!\n";
        }else if(signocrush.equalsIgnoreCase("Libra") && signo.equalsIgnoreCase("Gêmeos")){
            return "SINTONIA PERFEITA!\n" +
                    "De longe dá para notar a harmonia entre o casal de Gêmeos e Libra." +
                    " A comunicação, alegria e paixão entre os dois é de colocar qualquer " +
                    "outro amante de queixo caído.\n";
        }else if(signocrush.equalsIgnoreCase("Libra") && signo.equalsIgnoreCase("Câncer")){
            return "CONVIVÊNCIA DIFÍCIL\n" +
                    "Librianos e cancerianos vão viver envoltos de sensualidade, carinho e amor. " +
                    "Porém, Libra é regido pela insegurança e Câncer pelo desejo de aventura, o que " +
                    "pode gerar dificuldades na convivência do dia a dia.\n";
        }else if(signocrush.equalsIgnoreCase("Libra") && signo.equalsIgnoreCase("Leão")){
            return "CONTO DE FADAS\n" +
                    "Perfeitos um para o outro. Não há outra frase que defina esses amantes. " +
                    "Os dois encaram de frente os problemas e sempre ficam juntos. Amor, amizade " +
                    "e alegria não faltam nessa união.\n";
        }else if(signocrush.equalsIgnoreCase("Libra") && signo.equalsIgnoreCase("Virgem")){
            return "EVITE A FORMALIDADE\n" +
                    "Naturalmente, Libra e Virgem se darão muito bem por terem muito em comum, mas " +
                    "isso pode fazer com que caiam na rotina e virem cavalheiro e dama formais. Evite " +
                    "isso a todo custo e a relação pode durar!\n";
        }else if(signocrush.equalsIgnoreCase("Libra") && signo.equalsIgnoreCase("Libra")){
            return "FALTA DE INTIMIDADE\n" +
                    "Um casal libriano deve tomar cuidado com a falta de intimidade. Por mais que " +
                    "seja interessante fugir do cotidiano, é muito divertido e gostoso para" +
                    " um casal viver sem timidez ou vergonha do outro.\n";
        }else if(signocrush.equalsIgnoreCase("Libra") && signo.equalsIgnoreCase("Escorpião")){
            return "CONFLITO DE INTERESSES\n" +
                    "Um casal libriano e escorpiano não tem muito em comum quanto ao que gostam " +
                    "e às ideias e princípios que defendem, portanto conversem, mas evitem brigas" +
                    " e desentendimentos bobos.\n";
        }else if(signocrush.equalsIgnoreCase("Libra") && signo.equalsIgnoreCase("Sargitário")){
            return "CONTROLE SUA TEIMOSIA\n" +
                    "Libra e Sagitário têm características parecidas, mas serão muito teimosos " +
                    "quando entrarem em discussões para convencer o outro do que querem. Tomem" +
                    " conta da situação e há chance de tudo dar certo!\n";
        }else if(signocrush.equalsIgnoreCase("Libra") && signo.equalsIgnoreCase("Capricórnio")){
            return "COMPROMISSOS\n" +
                    "Librianos e capricornianos vão adorar mostrar a todos que estão juntos" +
                    " e felizes e, por isso, os compromissos formais, como namoro, noivado e " +
                    "casamento, serão muito importantes. Tudo a seu tempo e dará tudo certo!\n";
        }else if(signocrush.equalsIgnoreCase("Escorpião") && signo.equalsIgnoreCase("Aquário")){
            return "DISCUSSÕES DESNECESSÁRIAS\n" +
                    "Se quiserem fazer o relacionamento dar certo, é imprescindível evitar " +
                    "discussões desnecessárias. O aquariano deve ter calma e paciência para não " +
                    "cair nos joguinhos violentos do escorpiano.\n";
        }else if(signocrush.equalsIgnoreCase("Escorpião") && signo.equalsIgnoreCase("Peixes")){
            return "OITO OU OITENTA\n" +
                    "O relacionamento vai ser uma enxurrada de silêncios escorpianos e lágrimas " +
                    "piscianas ou uma fantasia digna de um conto de fadas, com muita compreensão," +
                    " diálogo e carinho. Vocês decidem!\n";
        }else if(signocrush.equalsIgnoreCase("Escorpião") && signo.equalsIgnoreCase("Áries")){
            return "CONTROLE DE SENTIMENTOS\n" +
                    "Dois signos com temperamentos dominadores. Os dois devem abrir concessões para" +
                    " que a relação flua naturalmente. Deixar de lado o bicho do ciúme é um ótimo " +
                    "método para que o romance flua.\n";
        }else if(signocrush.equalsIgnoreCase("Escorpião") && signo.equalsIgnoreCase("Touro")){
            return "A QUÍMICA PERFEITA\n" +
                    "Escorpianos e taurinos são feitos um pro outro! A sensualidade e erotismo" +
                    " entre quatro paredes são incríveis e os problemas são resolvidos com " +
                    "muito amor e carinho.\n";
        }else if(signocrush.equalsIgnoreCase("Escorpião") && signo.equalsIgnoreCase("Gêmeos")){
            return "CUIDADO COM CONFLITOS\n" +
                    "Um é superficial, o outro profundo. Para que o relacionamento entre um " +
                    "geminiano e um escorpiano dê certo é preciso que ambos entendam o lado" +
                    " do parceiro. Coloque-se sempre do outro lado da história.\n";
        }else if(signocrush.equalsIgnoreCase("Escorpião") && signo.equalsIgnoreCase("Câncer")){
            return "LAR, DOCE LAR\n" +
                    "O coração de um escorpiano é a morada perfeita para o ânimo agitado e" +
                    " aventureiro de um canceriano. Os dois serão compreensivos e dificilmente " +
                    "irão se desentender por motivos fúteis.\n";
        }else if(signocrush.equalsIgnoreCase("Escorpião") && signo.equalsIgnoreCase("Leão")){
            return "CÚMPLICES PERFEITOS\n" +
                    "Lembrem-se de manter a tolerância sempre em alta. Fora isso, o leonino e " +
                    "o escorpiano não terão muitos conflitos. Momentos de alegria e amizade" +
                    " farão parte da rotina de ambos.\n";
        }else if(signocrush.equalsIgnoreCase("Escorpião") && signo.equalsIgnoreCase("Virgem")){
            return "DIÁLOGO É TUDO\n" +
                    "Escorpianos e virginianos gostam de liberdade, mas para o relacionamento " +
                    "ser duradouro, ambos devem ter o hábito de conversar e se entender, sem " +
                    "deixar as coisas ficarem ruins para um ou outro.\n";
        }else if(signocrush.equalsIgnoreCase("Escorpião") && signo.equalsIgnoreCase("Libra")){
            return "VÃO COM CALMA\n" +
                    "Escorpiano, não seja tão duro ou grosso. Libriano, não seja tão sensível às " +
                    "palavras do escorpiano. Os dois já têm uma inclinação natural para se desentender, " +
                    "por isso peguem leve e se entendam para dar certo.\n";
        }else if(signocrush.equalsIgnoreCase("Escorpião") && signo.equalsIgnoreCase("Escorpião")){
            return "BOLA DE NEVE\n" +
                    "Escorpianos têm uma inclinação para guardar mágoas e praticar vinganças. " +
                    "Tomem cuidado para não transformar o relacionamento numa guerra sem fim," +
                    " com ataques de todos os lados.\n";
        }else if(signocrush.equalsIgnoreCase("Escorpião") && signo.equalsIgnoreCase("Sargitário")){
            return "ENTENDIMENTO\n" +
                    "Definam logo no início do relacionamento: vocês vão querer entender um " +
                    "ao outro? Se sim, preparem-se para terem problemas e conflitos, pois escorpianos" +
                    " e sagitarianos têm características diferentes e pensamentos conflitantes.\n";
        }else if(signocrush.equalsIgnoreCase("Escorpião") && signo.equalsIgnoreCase("Capricórnio")){
            return "CALMA E PAZ\n" +
                    "O relacionamento será calmo e a paz reinará. Os dois conseguem resolver " +
                    "problemas com muita facilidade e capricornianos conseguem lidar facilmente " +
                    "com o jeito explosivo dos escorpianos.\n";
        }else if(signocrush.equalsIgnoreCase("Sargitário") && signo.equalsIgnoreCase("Aquário")){
            return "ENVOLVAM-SE\n" +
                    "Sagitarianos e aquarianos têm uma certa inclinação para se envolverem " +
                    "em projetos malucos e diferentes, mas devem estar atentos para que não " +
                    "excluam seus parceiros desses planos malucos.\n";
        }else if(signocrush.equalsIgnoreCase("Sargitário") && signo.equalsIgnoreCase("Peixes")){
            return "AMOR SEM AMIZADE\n" +
                    "A química entre os dois é muito boa, mas uma conversa qualquer pode se " +
                    "transformar, repentinamente, em uma briga. O excesso de sinceridade sagitariano" +
                    " e a sensibilidade pisciana devem ser controlados.\n";
        }else if(signocrush.equalsIgnoreCase("Sargitário") && signo.equalsIgnoreCase("Áries")){
            return "AVENTUREIROS DE PRIMEIRA\n" +
                    "Bom humor e aventura é o que não irá faltar nesta relação. Ambos " +
                    "compartilham uma personalidade forte, mas que pode ser muito bem trabalhada " +
                    "em conjunto. A amizade pode trazer sucesso e lucro para os dois.\n";
        }else if(signocrush.equalsIgnoreCase("Sargitário") && signo.equalsIgnoreCase("Touro")){
            return "FALTA DE COMPROMISSO\n" +
                    "Vocês terão muitas dificuldades de diálogo, pois têm ideias e planos " +
                    "de vida diferentes. Tomem cuidado para que essas dificuldades não se tornem" +
                    " constantes a ponto de não terem compromisso um com o outro.\n";
        }else if(signocrush.equalsIgnoreCase("Sargitário") && signo.equalsIgnoreCase("Gêmeos")){
            return "ÓTIMA RELAÇÃO\n" +
                    "As diferenças podem fazer o relacionamento desandar, mas se isso não " +
                    "acontecer, o geminiano e o sagitariano vão se entender tranquilamente. O ideal" +
                    " é que ambos sempre ouçam o parceiro quando necessário.\n";
        }else if(signocrush.equalsIgnoreCase("Sargitário") && signo.equalsIgnoreCase("Câncer")){
            return "DECISÕES DIFÍCEIS\n" +
                    "Qualquer decisão para vocês será bastante complicada. O apego do" +
                    " canceriano ao que lhe é confortável e o desejo aventureiro e inovador" +
                    " do sagitariano vão conflitar constantemente. Aprendam a dialogar!\n";
        }else if(signocrush.equalsIgnoreCase("Sargitário") && signo.equalsIgnoreCase("Leão")){
            return "ALEGRIA QUE CONTAGIA\n" +
                    "Difícil mesmo é separar esses dois. Ambos têm tudo para deixar qualquer " +
                    "um com inveja e morrendo de vontade de viver um romance profundo." +
                    " Disposição e alegria é o que não falta na relação.\n";
        }else if(signocrush.equalsIgnoreCase("Sargitário") && signo.equalsIgnoreCase("Virgem")){
            return "MANIAS E HÁBITOS\n" +
                    "Sagitário e Virgem adoram as coisas à sua maneira, portanto não" +
                    " tentem mudar um ao outro ou impor seu jeito e suas ideias ao seu parceiro. " +
                    "Deixem tudo de uma maneira agradável aos dois!\n";
        }else if(signocrush.equalsIgnoreCase("Sargitário") && signo.equalsIgnoreCase("Libra")){
            return "FRIEZA\n" +
                    "Aproveitem muitos os momentos de intimidade. Os dois têm muito em " +
                    "comum e se darão bem em todas as atividades, mas não deixem que faltem" +
                    " momentos de intimidade do casal.\n";
        }else if(signocrush.equalsIgnoreCase("Sargitário") && signo.equalsIgnoreCase("Escorpião")){
            return "BRIGAS E MAIS BRIGAS\n" +
                    "O jeito possessivo e super protetor de Escorpião e o jeito sensível e " +
                    "delicado de Sagitário entrarão em conflito e será muito difícil resolver " +
                    "as brigas constantes se vocês não se empenharem nisso.\n";
        }else if(signocrush.equalsIgnoreCase("Sargitário") && signo.equalsIgnoreCase("Sargitário")){
            return "CONTROLEM OS DESEJOS\n" +
                    "Sagitarianos juntos vão querer aproveitar tudo que há no mundo a " +
                    "todo o momento! Mas tomem cuidado para que as atividades que farão juntos não" +
                    " se tornem mais importantes do que o amor que está ao seu lado.\n";
        }else if(signocrush.equalsIgnoreCase("Sargitário") && signo.equalsIgnoreCase("Capricórnio")){
            return "IMEDIATISMO X PLANEJAMENTO\n" +
                    "O desejo de Sagitário de fazer o que quer no momento que quer e a " +
                    "tranquilidade e planejamento de Capricórnio podem acabar incomodando o " +
                    "parceiro. Conversem bastante e tomem decisões conjuntas.\n";
        }else if(signocrush.equalsIgnoreCase("Capricórnio") && signo.equalsIgnoreCase("Aquário")){
            return "PENSAMENTOS DIFERENTES\n" +
                    "Conversem muito e controlem-se para que as ideias sempre oxigenadas do" +
                    " aquariano batam de frente com as mais conservadoras do capricorniano. " +
                    "Os planos do casal devem considerar os dois!\n";
        }else if(signocrush.equalsIgnoreCase("Capricórnio") && signo.equalsIgnoreCase("Peixes")){
            return "MAUS HÁBITOS\n" +
                    "Os dois são sistemáticos. Isso não vai mudar. O que precisa melhorar " +
                    "é o jeito autoritário com o qual tentam impor seus maus hábitos e manias" +
                    " ao outro. Encontrem o equilíbrio e tudo dará certo!\n";
        }else if(signocrush.equalsIgnoreCase("Capricórnio") && signo.equalsIgnoreCase("Áries")){
            return "NCOMPATIBILIDADE DE GÊNIOS\n" +
                    "Um é agitado, o outro mais calmo. Um vivo no mundo dos sonhos, o" +
                    " outro toma como base a realidade. Para fazer com que essa relação dê certo, " +
                    "é preciso que ambos mantenham os pés no chão.\n";
        }else if(signocrush.equalsIgnoreCase("Capricórnio") && signo.equalsIgnoreCase("Touro")){
            return "TUDO PRA DAR CERTO\n" +
                    "Vocês têm tudo pra dar certo! Adoram estar grudados a todo o momento e " +
                    "fazem planos para o futuro e para a vida e não se vêem um sem o outro." +
                    " Nada de planejar coisas malucas e tudo dará certo!\n";
        }else if(signocrush.equalsIgnoreCase("Capricórnio") && signo.equalsIgnoreCase("Gêmeos")){
            return "CONFLITO DE PERSONALIDADE\n" +
                    "Um é quieto, o outro não consegue fechar a boca nunca. O geminiano e" +
                    " o capricorniano vão enfrentar muitos problemas juntos por conta " +
                    "da personalidade. Mas mesmo assim, vale o esforço.\n";
        }else if(signocrush.equalsIgnoreCase("Capricórnio") && signo.equalsIgnoreCase("Câncer")){
            return "COMPREENSÃO\n" +
                    "É evidente que seus jeitos são diferentes, mas é evidente, também, que vocês " +
                    "se dão muito bem. Não tentem mudar o jeito do outro a cada segundo " +
                    "e aceite as decisões do seu parceiro.\n";
        }else if(signocrush.equalsIgnoreCase("Capricórnio") && signo.equalsIgnoreCase("Leão")){
            return "UNIÃO DE SUCESSO\n" +
                    "Força, disciplina e tenacidade. Tudo o que um casal precisa para alcançar" +
                    " o sucesso está com os amantes de leão e capricórnio. Mesmo com opiniões " +
                    "diferentes, os dois sempre chegarão a um acordo.\n";
        }else if(signocrush.equalsIgnoreCase("Capricórnio") && signo.equalsIgnoreCase("Virgem")){
            return "SEPAREM SEU TEMPO\n" +
                    "Os dois adoram trabalhar, organizar a casa e bater um papo cabeça. " +
                    "Por mais que se divirtam fazendo isso, vocês precisam de longos momentos de" +
                    " intimidade e de carinho, sem nenhuma preocupação!\n";
        }else if(signocrush.equalsIgnoreCase("Capricórnio") && signo.equalsIgnoreCase("Libra")){
            return "AMIZADES\n" +
                    "Tomem cuidado com as amizades do casal. O aconselhável é que tenham os" +
                    " mesmos amigos, pois as diferenças de pensamento do que querem num amigo" +
                    " é muito diferente e podem causar conflitos desnecessários.\n";
        }else if(signocrush.equalsIgnoreCase("Capricórnio") && signo.equalsIgnoreCase("Escorpião")){
            return "DESCONFIANÇA\n" +
                    "Os dois são possessivos, ciumentos e pura desconfiança. Não deixem que" +
                    " isso tome suas cabeças e que restrinjam a liberdade do parceiro " +
                    "de realizar seus sonhos e de fazer o que sempre quis.\n";
        }else if(signocrush.equalsIgnoreCase("Capricórnio") && signo.equalsIgnoreCase("Sargitário")){
            return "CONTROLEM OS ÍMPETOS\n" +
                    "O sagitariano é desbocado, sincero e sem medo de falar o que quer. O " +
                    "capricorniano é tímido, reservado e calmo. Achem um jeito de casar os " +
                    "dois jeitos e sem que um invada o espaço do outro.\n";
        }else if(signocrush.equalsIgnoreCase("Capricórnio") && signo.equalsIgnoreCase("Capricórnio")){
            return "O CASAL É PRIORIDADE\n" +
                    "Evitem que trabalho, estudos ou outros tipos de estresse ofusquem" +
                    " o amor e o deixem de lado. Os dois precisam de atenção e carinho constantes," +
                    " mas também não negam trabalho. Encontrem o equilíbrio.\n";
        }else {
            return "Vcs se completam";
        }
    }


    @Override
    public String toString(){
        return
                "\nSeu Nome = " + seunome +
                "\nNome Crush='" + nomecrush+
                "\nChances com o Crush = " + gerarNumeroRandomico() +"%"+
                "\nSigno Crush "+verificarSigno()+
                "\nSexo: "+verificarSexo();
    }
}

