# Descrição do Projeto: Banco Digital em Java

O projeto consiste na criação de um sistema bancário digital utilizando Java, com foco na aplicação dos princípios de Programação Orientada a Objetos (POO). A implementação inclui a construção de um banco digital com funcionalidades básicas como depósitos, saques e gerenciamento de contas.

## Principais Pontos Aprendidos

- **Encapsulamento:** As classes como `Conta`, `ContaCorrente` e `ContaPoupanca` encapsulam dados e métodos relacionados, controlando o acesso e proteção do estado interno das contas.

- **Herança:** As classes `ContaCorrente` e `ContaPoupanca` herdam de `Conta`, permitindo a reutilização de código e a especialização de comportamentos, como o gerenciamento de saques e a aplicação de juros.

- **Polimorfismo:** A interface `Transacao` e suas implementações (`Deposito` e `Saque`) demonstram polimorfismo, permitindo que diferentes tipos de transações sejam tratadas de forma uniforme através de um método `realizar`.

- **Abstração:** O uso de classes abstratas e interfaces promove a abstração, permitindo que o sistema opere com conceitos genéricos de transações e contas, enquanto esconde a complexidade específica das operações.

- **Design e Estrutura de Código:** O projeto destaca a importância de uma estrutura de código bem definida e modular, facilitando a manutenção e a expansão do sistema.

Este projeto proporciona uma compreensão prática dos conceitos fundamentais de POO em Java, aplicando-os em um contexto realista e interativo.

