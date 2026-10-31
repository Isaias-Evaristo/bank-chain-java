# 🏦 BankChain Java

[![Java](https://img.shields.io/badge/Java-ED8B00?style=for-the-badge&logo=openjdk&logoColor=white)](https://www.oracle.com/java/)
[![Git](https://img.shields.io/badge/GIT-E44C30?style=for-the-badge&logo=git&logoColor=white)](https://git-scm.com/)
[![Status](https://img.shields.io/badge/Status-Em%20Evolu%C3%A7%C3%A3o-brightgreen?style=for-the-badge)](#)

> Sistema bancário modular desenvolvido em Java com Programação Orientada a Objetos (POO), regras de negócio reais, histórico com `ArrayList` e arquitetura desenhada rumo à tecnologia de **Blockchain**.

---

## 💡 Motivação e Propósito

Este projeto nasceu da união de três grandes paixões e de uma meta clara de evolução técnica:

1. **Gosto genuíno pelo Java:** Escolhi o Java por sua robustez, maturidade e por ser a linguagem que sustenta os maiores ecossistemas empresariais e financeiros do mundo.
2. **Interesse pelo Setor Bancário:** Sempre me chamou a atenção como sistemas financeiros precisam ser precisos, seguros e auditáveis em cada centavo transacionado.
3. **Fascínio pelo Potencial da Blockchain:** Sou fascinado pelas possibilidades reais que a Blockchain oferece para resolver problemas históricos da humanidade ligados à confiança, segurança e descentralização — aproximando soluções de quase 100% de confiabilidade.
4. **Mentalidade de Aprendizado e Inovação:** Minha meta não é apenas estudar a teoria, mas aprender construindo na prática, sempre me desafiando a inovar e a dar o próximo passo na engenharia de software.

Em vez de criar uma Blockchain solta sem propósito, decidi construir primeiro o **sistema financeiro** que naturalmente sentirá a necessidade de blocos imutáveis.

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

Desenvolvido por **Isaias Evaristo**.  
*Comprometido com aprendizado contínuo, boas práticas de código e soluções tecnológicas inovadoras.*