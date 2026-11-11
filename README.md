# 🏦 BankChain Java

[![Java](https://img.shields.io/badge/Java-ED8B00?style=for-the-badge&logo=openjdk&logoColor=white)](https://www.oracle.com/java/)
[![Git](https://img.shields.io/badge/GIT-E44C30?style=for-the-badge&logo=git&logoColor=white)](https://git-scm.com/)
[![Status](https://img.shields.io/badge/Status-Conclu%C3%ADdo-brightgreen?style=for-the-badge)](#)

> Sistema bancário modular desenvolvido em Java com Programação Orientada a Objetos (POO), regras de negócio reais, histórico com `ArrayList`, arquitetura desenhada rumo à tecnologia de **Blockchain** e módulo Web com **Spring Boot**.

---

## 💡 O Propósito deste Projeto

O propósito deste projeto é trabalhar com tecnologias e linguagens pelas quais tenho um gosto genuíno, unindo a solidez do Java à precisão que o setor bancário exige. Sempre me chamou a atenção como sistemas financeiros precisam ser rigorosos, seguros e auditáveis em cada centavo movimentado. Ao mesmo tempo, sou fascinado pelo potencial transformador da Blockchain e pelas possibilidades reais que ela traz para sanar problemas históricos da humanidade ligados à confiança, transparência e descentralização — entregando níveis de integridade que chegam a quase 100% de confiabilidade.

Minha meta não é apenas estudar conceitos teóricos, mas aprender construindo na prática, sempre buscando inovar e dar o próximo passo na engenharia de software. Por isso, em vez de criar uma blockchain solta sem contexto, decidi construir primeiro a base de um sistema financeiro real que, naturalmente, sentirá a necessidade de blocos seguros e imutáveis.

---

## 🗺️ Trilha Arquitetural de Evolução

| Etapa | Camada | Responsabilidade | Status |
| :--- | :--- | :--- | :--- |
| **Cliente** | Cadastral | Identificação do correntista (nome, CPF, contato, endereço) | Concluído |
| **Conta** | Operacional | Saldo, saques com trava de validação, depósitos e transferências | Concluído |
| **Transação** | Auditoria | Registro individual de movimentação financeira com comprovante | Concluído |
| **Histórico** | Coleções | Gerenciamento de lista dinâmica com `ArrayList` | Concluído |
| **Extrato** | Relatório | Emissão consolidada de extrato bancário oficial | Concluído |
| **Bloco** | Criptografia | Agrupamento de dados com Hashing e Timestamp | Concluído |
| **Blockchain** | Ledger | Encadeamento inviolável de blocos e validação contínua | Concluído |
| **Módulo Web** | Distribuição | API REST com Spring Boot e interface responsiva | Concluído |

---

## 🛠️ Tecnologias e Ferramentas Utilizadas

![Java](https://img.shields.io/badge/Java-ED8B00?style=flat-square&logo=openjdk&logoColor=white)
![Spring_Boot](https://img.shields.io/badge/Spring_Boot-6DB33F?style=flat-square&logo=spring-boot&logoColor=white)
![POO](https://img.shields.io/badge/Paradigma-POO-blue?style=flat-square)
![Git](https://img.shields.io/badge/Git-F05032?style=flat-square&logo=git&logoColor=white)
![GitHub](https://img.shields.io/badge/GitHub-181717?style=flat-square&logo=github&logoColor=white)
![VS Code](https://img.shields.io/badge/VS_Code-007ACC?style=flat-square&logo=visual-studio-code&logoColor=white)
![PowerShell](https://img.shields.io/badge/PowerShell-5391FE?style=flat-square&logo=powershell&logoColor=white)

* **Linguagem:** Java (JDK 21) — foco em modularidade e boas práticas.
* **Paradigma:** Programação Orientada a Objetos (Classes, Objetos, Métodos, Encapsulamento e Composição).
* **Framework Web:** Spring Boot (Spring Web, Spring MVC).
* **Estrutura de Dados:** Coleções dinâmicas com `ArrayList`.
* **Criptografia & Hashing:** Geração de Hash para encadeamento e proteção de blocos.
* **Controle de Versão:** Git & GitHub (commits semânticos e rastreabilidade de código).
* **Ambiente de Desenvolvimento:** Visual Studio Code & PowerShell.

---

## 🏗️ Estrutura e Entidades do Sistema

| Entidade / Módulo | Responsabilidade |
| :--- | :--- |
| **`Cliente`** | Modela os dados cadastrais do correntista (nome, CPF, e-mail, telefone, endereço). |
| **`Conta`** | Gerencia saldo, regras operacionais (depósito, saque com validação e transferência) e possui seu próprio histórico. |
| **`Transacao`** | Representa o comprovante atômico de uma operação (tipo, valor, data, hora, descrição). |
| **`Historico`** | Estrutura de dados dinâmica baseada em `ArrayList<Transacao>` para registrar as movimentações sem limite fixo. |
| **`Bloco`** | Estrutura que agrupa transações, gera carimbo de tempo (timestamp) e lacre digital (Hash). |
| **`Blockchain`** | Livro-razão distribuído que gerencia a cadeia de blocos criptograficamente encadeados. |
| **`src/`** | Motor central em Java puro executável via console (`Main.java`). |
| **`bankchain-api/`** | Módulo web com Spring Boot e interface interativa responsiva. |

---

## 🛡️ Regras de Negócio Implementadas

- **Validação de Saldo:** Bloqueio de saques e transferências superiores ao saldo disponível (`saldo >= valor`).
- **Validação de Depósito:** Garantia de que valores de entrada sejam estritamente positivos (`valor > 0`).
- **Composição de Objetos:** Cada `Conta` tem um `Cliente` e o seu próprio `Historico`.
- **Extrato Bancário Consolidado:** O método `mostrarExtrato()` cruza os dados do titular, conta, transações do histórico e saldo remanescente.
- **Encadeamento Criptográfico:** Cada bloco armazena o Hash do bloco anterior, garantindo imutabilidade total dos dados.

---

## 💻 Como Compilar e Executar

### Pré-requisitos
* Java Development Kit (JDK 21 ou superior).
* Terminal PowerShell, CMD ou Bash.

### Opção 1: Executar a Versão Console (Java Puro)
```powershell
javac -d bin src/*.java
java -cp bin Main
```

### Opção 2: Executar a Aplicação Web (Spring Boot)
```powershell
cd bankchain-api
.\mvnw.cmd spring-boot:run
```
Acesse no navegador: `http://localhost:8080`

---

## 📋 Roadmap do Projeto

- [x] Modelar entidade `Cliente`
- [x] Modelar entidade `Conta` com operações bancárias (`depositar`, `sacar`, `transferir`)
- [x] Implementar classe de auditoria `Transacao` com método `mostrarTransacao()`
- [x] Refatorar `Historico` para uso de coleção dinâmica (`ArrayList<Transacao>`)
- [x] Implementar emissão de **Extrato Bancário** na conta
- [x] Modelar a entidade **`Bloco`** com encadeamento de dados
- [x] Implementar algoritmo de geração de lacre digital e Hashing
- [x] Estruturar a **`Blockchain`** para validação imutável do histórico bancário
- [x] Desenvolver Módulo Web com **Spring Boot** e interface responsiva

---

## 👨‍💻 Autor

Desenvolvido por **Isaias Evaristo**  
*Focado em inovação, aprendizado contínuo e na construção de soluções tecnológicas que geram valor real.*

[![LinkedIn](https://img.shields.io/badge/LinkedIn-0A66C2?style=for-the-badge&logo=linkedin&logoColor=white)](https://www.linkedin.com/in/isaias-evaristo-69504b430)
[![Email](https://img.shields.io/badge/Email-D14836?style=for-the-badge&logo=gmail&logoColor=white)](mailto:isaias-evaristo156@hotmail.com)