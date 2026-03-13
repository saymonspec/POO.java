Questionário sobre Herança em Java:

1.  Defina herança em programação orientada a objetos e explique seu principal objetivo em Java.**
    * O que significa "uma classe herdar de outra"?
R: Herança é um mecanismo da programação orientada a objetos que permite que uma classe adquira atributos e métodos de outra classe. Isso possibilita reutilizar código e criar relações hierárquicas entre classes.


    * Qual o benefício primário de usar herança em Java?
R: Significa que uma classe (subclasse) pode utilizar propriedades e comportamentos de outra classe (superclasse), sem precisar reescrever o mesmo código.

------------------------------------------------------------------------------------------------------------------------------------------

2.  O que é a superclasse (superclass) e a subclasse (subclass) em Java? Forneça um exemplo simples de uma hierarquia de herança.
    * Como os atributos e métodos da superclasse são acessíveis na subclasse?
R: A superclasse é a classe que fornece atributos e métodos para outras classes e a subclasse é a classe que herda essas características da superclasse. Exemplo de hierarquia abaixo:

class Veiculo {
    int velocidade;

    void acelerar() {
        System.out.println("O veículo está acelerando");
    }
}

class Carro extends Veiculo {
    int portas;
}

public class Main {
    public static void main(String[] args) {
        Carro c = new Carro();
        c.acelerar();
    }
}


    * O que acontece com os membros privados da superclasse?
R: Os membros privados não podem ser acessados diretamente pela subclasse. Eles só podem ser utilizados através de métodos públicos ou protegidos (getters e setters).   

------------------------------------------------------------------------------------------------------------------------------------------

3.  O que é sobrescrita de método (`method overriding`) em Java? Explique como ela funciona e forneça um exemplo.
R: Sobrescrita ocorre quando uma subclasse redefine um método da superclasse, mantendo o mesmo nome, parâmetros e tipo de retorno. Isso permite que a subclasse tenha um comportamento diferente. Exemplo abaixo:

class Animal {
    void fazerSom() {
        System.out.println("O animal faz um som");
    }
}

class Gato extends Animal {
    @Override
    void fazerSom() {
        System.out.println("O gato mia");
    }
}

public class Main {
    public static void main(String[] args) {
        Gato g = new Gato();
        g.fazerSom();
    }
}

------------------------------------------------------------------------------------------------------------------------------------------

4.  Como a herança contribui para o polimorfismo em Java? Forneça um exemplo de polimorfismo utilizando herança.
R: A herança permite que um objeto de uma subclasse seja tratado como objeto da superclasse. Isso possibilita diferentes comportamentos para o mesmo método. Exemplo abaixo:

class Animal {
    void fazerSom() {
        System.out.println("Som genérico");
    }
}

class Cachorro extends Animal {
    @Override
    void fazerSom() {
        System.out.println("Latido");
    }
}

class Gato extends Animal {
    @Override
    void fazerSom() {
        System.out.println("Miau");
    }
}

public class Main {
    public static void main(String[] args) {
        Animal a;

        a = new Cachorro();
        a.fazerSom();

        a = new Gato();
        a.fazerSom();
    }
}

------------------------------------------------------------------------------------------------------------------------------------------

5. Quais são as desvantagens potenciais do uso excessivo de herança em Java? Quais alternativas podem ser consideradas?
R: O uso excessivo de herança pode causar:
I. Acoplamento forte entre classes
II. Hierarquias complexas e difíceis de manter
III. Menor flexibilidade no sistema

    * Como a herança pode levar a um acoplamento forte entre classes?
R: Quando uma subclasse depende muito da superclasse, qualquer alteração na superclasse pode afetar todas as subclasses, podendo causar erros no sistema.

    * Quais são as vantagens da composição em relação à herança em certos cenários?
R: A composição ocorre quando uma classe possui objetos de outras classes como atributos.
