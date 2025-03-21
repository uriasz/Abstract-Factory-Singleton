# LawOffice - Sistema de Geração de Documentos Jurídicos

Este projeto Java demonstra a aplicação de padrões de projeto como **Abstract Factory** e **Singleton** para a criação e gerenciamento de documentos jurídicos para pessoas físicas e jurídicas. Além disso, utiliza o `java.util.logging` para registro das operações e o **JUnit 5** para testes unitários, garantindo a robustez e a manutenção do sistema.

---

## Sumário

- [Visão Geral](#vis%C3%A3o-geral)
- [Arquitetura e Padrões de Projeto](#arquitetura-e-padr%C3%B5es-de-projeto)
- [Descrição das Classes e Interfaces](#descri%C3%A7%C3%A3o-das-classes-e-interfaces)
  - [Interface `Document`](#interface-document)
  - [Implementações de `Document`](#implementa%C3%A7%C3%B5es-de-document)
  - [LoggerUtil](#loggerutil)
  - [Interface `DocumentFactory`](#interface-documentfactory)
  - [Fábricas de Documentos (Singleton)](#f%C3%A1bricas-de-documentos-singleton)
  - [Classe Principal `LawOffice`](#classe-principal-lawoffice)
- [Testes Unitários](#testes-unit%C3%A1rios)
- [Como Executar](#como-executar)
- [Considerações Finais](#considera%C3%A7%C3%B5es-finais)

---

## Visão Geral

O sistema simula um ambiente de um escritório de advocacia que gera dois tipos de documentos, de acordo com o perfil do cliente:

- **Pessoa Física:**  
  - Contrato (`Contract`)
  - Parecer jurídico (`LegalAdvice`)

- **Pessoa Jurídica:**  
  - Contrato empresarial (`BusinessContract`)
  - Relatório tributário (`TaxReport`)

Cada documento é gerado por meio do método `generate()`, que registra uma mensagem informativa utilizando a classe `LoggerUtil`.

---

## Arquitetura e Padrões de Projeto

- **Abstract Factory:**  
  Define uma interface para criação de famílias de objetos (documentos) sem especificar suas classes concretas.  
  - `IndividualDocumentFactory` para pessoas físicas.
  - `BusinessDocumentFactory` para pessoas jurídicas.

- **Singleton:**  
  Garante que cada fábrica seja instanciada apenas uma vez durante a execução do sistema.

- **Logger:**  
  A classe `LoggerUtil` centraliza o registro de mensagens utilizando `java.util.logging` com um `ConsoleHandler` configurado com `SimpleFormatter`.

---

## Descrição das Classes e Interfaces

### Interface `Document`

- **Função:**  
  Define o contrato para a geração de documentos.
- **Método:**  
  - `void generate();`

### Implementações de `Document`

- **Pessoa Física:**
  - `Contract`: Gera um contrato.
  - `LegalAdvice`: Gera um parecer jurídico.

- **Pessoa Jurídica:**
  - `BusinessContract`: Gera um contrato empresarial.
  - `TaxReport`: Gera um relatório tributário.

> Cada implementação utiliza `LoggerUtil.log()` para registrar mensagens de log durante a geração.

### LoggerUtil

- **Função:**  
  Configura e gerencia o logging centralizado para o projeto.
- **Detalhes:**  
  - Configura um `ConsoleHandler` com `SimpleFormatter`.
  - Método `static void log(String message)` para registrar informações no console.

### Interface `DocumentFactory`

- **Função:**  
  Define os métodos para criação de documentos primários e secundários.
- **Métodos:**  
  - `Document createPrimaryDocument();`
  - `Document createSecondaryDocument();`

### Fábricas de Documentos (Singleton)

- **IndividualDocumentFactory:**  
  - Cria os documentos para pessoa física: `Contract` e `LegalAdvice`.
  - Implementada com padrão Singleton para garantir única instância.

- **BusinessDocumentFactory:**  
  - Cria os documentos para pessoa jurídica: `BusinessContract` e `TaxReport`.
  - Também implementada com o padrão Singleton.

### Classe Principal `LawOffice`

- **Função:**  
  Ponto de entrada do sistema.
- **Operação:**  
  - Instancia as fábricas para pessoas físicas e jurídicas.
  - Cria e gera os documentos correspondentes utilizando os métodos das fábricas.
  - As mensagens de log são exibidas no console durante a geração dos documentos.

---

## Testes Unitários

O projeto utiliza **JUnit 5** para garantir o funcionamento correto dos componentes. A suíte de testes inclui:

- **LoggerUtilTest:**  
  Verifica que o método `LoggerUtil.log()` executa sem lançar exceções.

- **ContractTest & LegalAdviceTest:**  
  Testam a geração dos documentos para pessoa física.

- **BusinessContractTest & TaxReportTest:**  
  Testam a geração dos documentos para pessoa jurídica.

- **IndividualDocumentFactoryTest:**  
  - Verifica a implementação do padrão Singleton.
  - Confirma que `createPrimaryDocument()` retorna uma instância de `Contract` e `createSecondaryDocument()` retorna uma instância de `LegalAdvice`.

- **BusinessDocumentFactoryTest:**  
  - Assegura a implementação correta do padrão Singleton.
  - Valida que os métodos de criação retornam instâncias de `BusinessContract` e `TaxReport`.

- **AllTests:**  
  Agrega todos os testes unitários para execução conjunta, facilitando a verificação completa do sistema.

---

## Como Executar

### Pré-requisitos

- **Java JDK:** Versão 8 ou superior.
- **JUnit 5:** Para execução dos testes unitários.

### Compilação e Execução da Aplicação

1. **Compilação:**
   ```bash
   javac -d bin src/*.java```

2. **Execução da Aplicação:**

```bash 
java -cp bin LawOffice
 ```

Ao executar, as mensagens de log serão exibidas no console, indicando a geração dos documentos.


---


### Execução dos Testes Unitários

- **Utilizando uma IDE:**
Abra o projeto em uma IDE com suporte a JUnit 5 e execute a suíte de testes.

- **Utilizando Maven (exemplo):**

```bash
mvn test
```

---

### Considerações Finais
Este projeto é um exemplo prático de como implementar padrões de projeto para desenvolver um código modular, reutilizável e de fácil manutenção. A separação das responsabilidades (geração de documentos e logging) possibilita expansões futuras, como a inclusão de novos tipos de documentos ou alterações no mecanismo de log. A cobertura de testes unitários fortalece a robustez e a confiabilidade do sistema, tornando-o adequado para ambientes de produção.


