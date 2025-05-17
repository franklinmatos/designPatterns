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


