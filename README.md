# 🏦 BankChain Java

[![Java](https://img.shields.io/badge/Java-ED8B00?style=for-the-badge&logo=openjdk&logoColor=white)](https://www.oracle.com/java/)
[![Git](https://img.shields.io/badge/GIT-E44C30?style=for-the-badge&logo=git&logoColor=white)](https://git-scm.com/)
[![Status](https://img.shields.io/badge/Status-Em%20Evolu%C3%A7%C3%A3o-brightgreen?style=for-the-badge)](#)

> Sistema bancário modular desenvolvido em Java com Programação Orientada a Objetos (POO), regras de negócio reais, auditoria de transações em memória com `ArrayList` e arquitetura desenhada para integração com **Blockchain**.

---

## 🎯 Sobre o Projeto

O **BankChain Java** foi concebido a partir de um princípio prático de engenharia de software: em vez de construir uma Blockchain do nada sem propósito, construímos primeiro um **sistema financeiro real** que naturalmente precisa de imutabilidade e descentralização.

O sistema simula operações bancárias do dia a dia (abertura de contas, validações de saldo, depósitos, saques e transferências entre clientes), mantendo a rastreabilidade completa de cada movimentação através de comprovantes e extratos bancários.

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
| **`Conta`** | Gerencia saldo, regras operacionais (saque com trava de saldo, depósito, transferência) e possui seu próprio histórico. |
| **`Transacao`** | Representa o comprovante atômico de uma operação (tipo, valor, data, hora, descrição). |
| **`Historico`** | Estrutura de dados dinâmica baseada em `ArrayList<Transacao>` para armazenar movimentações sem limite fixo. |
| **`Main`** | Orquestra a execução dos fluxos de teste, simulação de contas e emissão de extratos. |

---

## 🛡️ Regras de Negócio Implementadas

- **Validação de Saldo:** Impedimento de saques e transferências superiores ao saldo disponível (`saldo >= valor`).
- **Validação de Depósito:** Garantia de que valores de entrada sejam sempre positivos (`valor > 0`).
- **Composição de Objetos:** Cada `Conta` possui seu próprio `Cliente` e seu próprio `Historico`.
- **Emissão de Extrato Consolidado:** O método `mostrarExtrato()` cruza os dados do titular, número da conta, transações do histórico e saldo remanescente.

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
- [ ] Implementar algoritmo de criptografia (Hashing SHA-256)
- [ ] Estruturar a **`Blockchain`** para validação imutável do histórico bancário

---

## 👨‍💻 Autor

Desenvolvido por **Isaias Evaristo**.  
Focado em aprendizado prático de desenvolvimento backend, POO e arquitetura de soluções.
