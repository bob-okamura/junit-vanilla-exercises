# Exercício: JUnit vanilla

## BOOTCAMP 3.0 DEVSUPERIOR
[![NPM](https://img.shields.io/npm/l/react)](https://github.com/bob-okamura/junit-vanilla-exercises/blob/main/LICENCE)

# Sobre o exercício

## Um financiamento possui três dados:
- totalAmont: valor total de dinheiro financiado
- income: renda mensal do cliente que está financiando
- months: número de meses do financiamento

## E dois métodos:
- entry: entrada do financiamento, igual a 20% do valor total
- quota: prestação mensal do financiamento (sem juros)

### Há ainda uma regra: o valor da prestação não pode ser maior que metade da renda mensal do cliente. A seguir alguns exemplos de financiamentos para ajudar a entender a regra:
## Exemplo 1:

```bash
 { totalAmount: 100000, income: 2000, months: 20 }
```

Este exemplo é INVÁLIDO porque com esses dados a entrada seria 20000 e a prestação seria 4000. Porém a prestação não pode passar de 1000, que é a metade da renda do cliente.

## Exemplo 2:

```bash
 { totalAmount: 100000, income: 2000, months: 80 }
```

Já este exemplo é VÁLIDO porque a entrada seria 20000 e a prestação seria 1000. Neste caso, a prestação é menor ou igual a metade da renda do cliente, satisfazendo a regra.

## Implementar os seguintes testes para validar esta classe (total = 10 testes):

### Construtor
- Deve criar o objeto com os dados corretos quando os dados forem válidos
- Deve lançar IllegalArgumentException quando os dados não forem válidos

### setTotalAmount
- Deve atualizar o valor quando os dados forem válidos
- Deve lançar IllegalArgumentException quando os dados não forem válidos

### setIncome
- Deve atualizar o valor quando os dados forem válidos
- Deve lançar IllegalArgumentException quando os dados não forem válidos

### setMonths
- Deve atualizar o valor quando os dados forem válidos
- Deve lançar IllegalArgumentException quando os dados não forem válidos

### entry
- Deve calcular corretamente o valor da entrada

### quota
- Deve calcular corretamente o valor da prestação

# Autor

Roberto Okamura

https://www.linkedin.com/in/roberto-okamura-6a9b59b4/
