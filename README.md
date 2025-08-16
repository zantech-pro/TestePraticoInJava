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

##. A saída será exibida no console, conforme os requisitos do teste.

## 📊 Formatação de Valores

- Salários formatados em **BigDecimal** com separador de milhar e vírgula decimal.

- Idade calculada a partir da **data de nascimento** usando LocalDate e Period.

- Quantidade de salários mínimos arredondada com 2 casas decimais.

## 📝 Observações

- Todos os requisitos do teste foram implementados.

- Classes e métodos possuem comentários explicativos.

- Qualquer requisito que não soubesse implementar foi comentado no código.

  # 🖥 Saída do Programa

### Lista de Funcionários (Formato Original)
```bash eclipse
Nome | Data Nascimento | Salario | Função
Maria | 18/10/2000 | 2009.44 | Operador
João | 12/5/1990 | 2284.38 | Operador
Caio | 2/5/1961 | 9836.14 | Coordenador
Miguel | 14/10/1988 | 19119.88 | Diretor
Alice | 5/1/1995 | 2234.68 | Recepcionista
Heitor | 19/11/1999 | 1582.72 | Operador
Arthur | 8/3/1993 | 4071.84 | Contador
Laura | 8/7/1994 | 3017.45 | Gerente
Heloisa | 24/5/2003 | 1606.85 | Eletricista
Helena | 2/9/1996 | 2799.93 | Gerente
```

### Após Remoção do João
```bash eclipse
Maria | 18/10/2000 | 2009.44 | Operador
Caio | 2/5/1961 | 9836.14 | Coordenador
Miguel | 14/10/1988 | 19119.88 | Diretor
Alice | 5/1/1995 | 2234.68 | Recepcionista
Heitor | 19/11/1999 | 1582.72 | Operador
Arthur | 8/3/1993 | 4071.84 | Contador
Laura | 8/7/1994 | 3017.45 | Gerente
Heloisa | 24/5/2003 | 1606.85 | Eletricista
Helena | 2/9/1996 | 2799.93 | Gerente
```

### Salários com 10% de Aumento e Formatação
```bash eclipse
Maria | 18/10/2000 | R$ 2.210,38 | Operador
Caio | 2/5/1961 | R$ 10.819,75 | Coordenador
Miguel | 14/10/1988 | R$ 21.031,87 | Diretor
Alice | 5/1/1995 | R$ 2.458,15 | Recepcionista
Heitor | 19/11/1999 | R$ 1.740,99 | Operador
Arthur | 8/3/1993 | R$ 4.479,02 | Contador
Laura | 8/7/1994 | R$ 3.319,19 | Gerente
Heloisa | 24/5/2003 | R$ 1.767,53 | Eletricista
Helena | 2/9/1996 | R$ 3.079,92 | Gerente
```
### Agrupamento por Função
```bash eclipse
Função: Operador
Maria | 18/10/2000 | R$ 2.210,38
Heitor | 19/11/1999 | R$ 1.740,99

Função: Eletricista
Heloisa | 24/5/2003 | R$ 1.767,53

Função: Recepcionista
Alice | 5/1/1995 | R$ 2.458,15

Função: Diretor
Miguel | 14/10/1988 | R$ 21.031,87

Função: Gerente
Laura | 8/7/1994 | R$ 3.319,19
Helena | 2/9/1996 | R$ 3.079,92

Função: Coordenador
Caio | 2/5/1961 | R$ 10.819,75

Função: Contador
Arthur | 8/3/1993 | R$ 4.479,02
```


### Funcionários com Aniversário em Outubro e Dezembro

```bash eclipse
Miguel | 14/10/1988 | R$ 21.031,87
Maria | 18/10/2000 | R$ 2.210,38
```
### Funcionário com Maior Idade

```bash eclipse
Caio | Idade: 64
```


### Funcionários em Ordem Alfabética

```bash eclipse
Alice | 5/1/1995 | R$ 2.458,15 | Recepcionista
Arthur | 8/3/1993 | R$ 4.479,02 | Contador
Caio | 2/5/1961 | R$ 10.819,75 | Coordenador
Heitor | 19/11/1999 | R$ 1.740,99 | Operador
Helena | 2/9/1996 | R$ 3.079,92 | Gerente
Heloisa | 24/5/2003 | R$ 1.767,53 | Eletricista
Laura | 8/7/1994 | R$ 3.319,19 | Gerente
Maria | 18/10/2000 | R$ 2.210,38 | Operador
Miguel | 14/10/1988 | R$ 21.031,87 | Diretor
```


### Total de Salários

```bash eclipse
Total: R$ 50.906,82
```

### Quantidade de Salários Mínimos por Funcionário

```bash eclipse
Salário Mínimo: R$ 1.212,00
Alice: 2,03
Arthur: 3,70
Caio: 8,93
Heitor: 1,44
Helena: 2,54
Heloisa: 1,46
Laura: 2,74
Maria: 1,82
Miguel: 17,35
```


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

A saída será exibida no console, conforme exemplos acima.

Autor

Zander de Jesus Lopes
GitHub: [https://github.com/zantech-pro](https://github.com/zantech-pro)
