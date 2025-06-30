# designPatterns
This repository was created to post codes during in design patterns study.


Creational Patterns


1 - Strategy

O padrão strategy vai ser o primeiros dos padrões comportamentais que iremos implementar aqui.
Caso queira saber mais sobre padrões de projeto acesse o link que usamos como referencia para essas
implementações: https://refactoring.guru/design-patterns

Para facilitar nosso exemplo criamos um enum para listar todas as tavas que iremos implementar:


public enum TaxType {
    ICMS("ICMS"),
    IPVA("IPVA"),
    IPTU("IPTU"),
    ISS("ISS");
}


Para acompanhar a execução deste padrão, na classe Main.java tem o exemplo de seleção
do ICMS, retornando a classe instanciada referente a essa imposto e o resultado do valor
aplicado a taxa que foi definida na classe e na implementação do método.


1 - Observer
Criamos o exemplo de uma corretora de bitcoin onde ela observa a troca de valores. Ao mudar o valor do Bitcoin os investidores e as platadormas
parceiras são notificadas da mudança de preços.

O padrão oberver implementado aqui tem sua classe Bitcoin como sendo a classe que armazena a lista de observadores e tem a responsabilidade de fazer as notificações.
BitcoinPriceObserver  é a interface observada. E por fim as classes InvestorNotifier, NewsPlatform e BinancePriceLogger são as classes que serão notificadas a cada troca de preços

obs: Para ver o padrão funcionando basta executar a classe Main.java que está dentro o package observer