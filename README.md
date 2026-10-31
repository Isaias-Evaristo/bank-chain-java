# 🏦 BankChain Java

[![Java](https://img.shields.io/badge/Java-ED8B00?style=for-the-badge&logo=openjdk&logoColor=white)](https://www.oracle.com/java/)
[![Git](https://img.shields.io/badge/GIT-E44C30?style=for-the-badge&logo=git&logoColor=white)](https://git-scm.com/)
[![Status](https://img.shields.io/badge/Status-Em%20Evolu%C3%A7%C3%A3o-brightgreen?style=for-the-badge)](#)

> Sistema bancário modular desenvolvido em Java com Programação Orientada a Objetos (POO), regras de negócio reais, histórico com `ArrayList` e arquitetura desenhada rumo à tecnologia de **Blockchain**.

---

## 💡 O Propósito deste Projeto

O propósito deste projeto é trabalhar com tecnologias e linguagens pelas quais tenho um gosto genuíno, unindo a solidez do Java à precisão que o setor bancário exige. Sempre me chamou a atenção como sistemas financeiros precisam ser rigorosos, seguros e auditáveis em cada centavo movimentado. Ao mesmo tempo, sou fascinado pelo potencial transformador da Blockchain e pelas possibilidades reais que ela traz para sanar problemas históricos da humanidade ligados à confiança, transparência e descentralização — entregando níveis de integridade que chegam a quase 100% de confiabilidade.

Minha meta não é apenas estudar conceitos teóricos, mas aprender construindo na prática, sempre buscando inovar e dar o próximo passo na engenharia de software. Por isso, em vez de criar uma blockchain solta sem contexto, decidi construir primeiro a base de um sistema financeiro real que, naturalmente, sentirá a necessidade de blocos seguros e imutáveis.

---

## 🗺️ Trilha Arquitetural de Evolução

```text
Cliente ➔ Conta ➔ Transferência ➔ Transação ➔ Histórico ➔ Extrato ➔ Bloco ➔ Blockchain
   ✅       ✅          ✅            ✅          ✅         ✅       ⏳         ⏳
```

---

## 🏗️ Estrutura e Entidades do Sistema

| Entidade | Responsabilidade |
| :--- | :--- |
| **`Cliente`** | Modela os dados cadastrais do correntista (nome, CPF, e-mail, telefone, endereço). |
| **`Conta`** | Gerencia saldo, regras operacionais (depósito, saque com validação e transferência) e possui seu próprio histórico. |
| **`Transacao`** | Representa o comprovante atômico de uma operação (tipo, valor, data, hora, descrição). |
| **`Historico`** | Estrutura de dados dinâmica baseada em `ArrayList<Transacao>` para registrar as movimentações sem limite fixo. |
| **`Main`** | Orquestra a execução dos fluxos, simula operações reais e emite os extratos. |

---

## 🛡️ Regras de Negócio Implementadas

- **Validação de Saldo:** Bloqueio de saques e transferências superiores ao saldo disponível (`saldo >= valor`).
- **Validação de Depósito:** Garantia de que valores de entrada sejam estritamente positivos (`valor > 0`).
- **Composição de Objetos:** Cada `Conta` tem um `Cliente` e o seu próprio `Historico`.
- **Extrato Bancário Consolidado:** O método `mostrarExtrato()` cruza os dados do titular, conta, transações do histórico e saldo remanescente.

---

## 💻 Como Compilar e Executar

### Pré-requisitos
* Java Development Kit (JDK 17 ou superior).
* Terminal PowerShell, CMD ou Bash.

### Passo a passo pelo terminal:

1. Clone o repositório:
```powershell
git clone https://github.com/Isaias-Evaristo/bank-chain-java.git
cd bank-chain-java
```

2. Compile os arquivos Java da pasta `src`:
```powershell
javac -d bin src/*.java
```

3. Execute a aplicação:
```powershell
java -cp bin Main
```

---

## 📋 Roadmap do Projeto

- [x] Modelar entidade `Cliente`
- [x] Modelar entidade `Conta` com operações bancárias (`depositar`, `sacar`, `transferir`)
- [x] Implementar classe de auditoria `Transacao` com método `mostrarTransacao()`
- [x] Refatorar `Historico` para uso de coleção dinâmica (`ArrayList<Transacao>`)
- [x] Implementar emissão de **Extrato Bancário** na conta
- [ ] Modelar a entidade **`Bloco`** com encadeamento de dados
- [ ] Implementar algoritmo de criptografia e Hashing (SHA-256)
- [ ] Estruturar a **`Blockchain`** para validação imutável do histórico bancário

---


## 👨‍💻 Autor

Desenvolvido por **Isaias Evaristo**  
*Focado em inovação, aprendizado contínuo e na construção de soluções tecnológicas que geram valor real.*

[![LinkedIn](https://img.shields.io/badge/LinkedIn-0A66C2?style=for-the-badge&logo=linkedin&logoColor=white)](https://www.linkedin.com/in/isaias-evaristo-69504b430)
[![Email](https://img.shields.io/badge/Email-D14836?style=for-the-badge&logo=gmail&logoColor=white)](mailto:isaias-evaristo156@hotmail.com)