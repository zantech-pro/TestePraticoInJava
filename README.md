# Teste Prático Java - Iniflex

Este projeto foi desenvolvido como parte do **Teste Prático de Programação** da Iniflex.  
Ele simula a gestão de funcionários de uma indústria, realizando operações como cadastro, remoção, aumento salarial, agrupamento por função, cálculo de idade e salários mínimos.

---

## 📌 Estrutura do Projeto

- **Classe Pessoa**
  - Atributos: `nome` (String), `dataNascimento` (LocalDate)
- **Classe Funcionario** (extende Pessoa)
  - Atributos: `salario` (BigDecimal), `funcao` (String)
- **Classe Principal**
  - Executa todas as operações solicitadas no teste.

---

## ✅ Funcionalidades Implementadas

1. Inserção de todos os funcionários com dados fornecidos na tabela do enunciado.
2. Remoção do funcionário **"João"** da lista.
3. Impressão de todos os funcionários:
   - Data no formato **dd/MM/yyyy**.
   - Salário formatado com **ponto como separador de milhar** e **vírgula como decimal**.
4. Aplicação de **10% de aumento salarial** e atualização da lista.
5. Agrupamento de funcionários por função usando `Map<String, List<Funcionario>>`.
6. Impressão de funcionários agrupados por função.
7. Impressão de funcionários que fazem aniversário nos meses **10** e **12**.
8. Identificação e impressão do funcionário com a **maior idade** (nome e idade).
9. Impressão da lista de funcionários em **ordem alfabética**.
10. Cálculo e impressão do **total de salários**.
11. Cálculo de quantos **salários mínimos (R$1.212,00)** cada funcionário recebe.

---

## 💻 Como Executar

1. Clone este repositório:

```bash
git clone  https://github.com/zantech-pro/TestePraticoInJava.git
```

2. Abra o projeto no **Eclipse**, **NetBeans** ou qualquer IDE Java compatível.

3. Compile e execute a classe
```bash
Principal.java.
```

4. A saída será exibida no console, conforme os requisitos do teste.

## 📊 Formatação de Valores

- Salários formatados em **BigDecimal** com separador de milhar e vírgula decimal.

- Idade calculada a partir da **data de nascimento** usando LocalDate e Period.

- Quantidade de salários mínimos arredondada com 2 casas decimais.
