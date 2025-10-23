
# 💳 Sistema de Compras com Limite de Cartão

Projeto desenvolvido como exercício prático de **Java**, com o objetivo de consolidar conhecimentos em:
- Programação orientada a objetos (POO)
- Estruturas de repetição e decisão
- Manipulação de listas (`ArrayList`)
- Entrada de dados com `Scanner`
- Encapsulamento e boas práticas de código

---

## 🧠 Descrição do Projeto

O sistema simula o uso de um cartão de crédito simples.

Ao iniciar o programa, o usuário informa o **limite do cartão**.  
Em seguida, pode realizar **diversas compras**, informando o nome e o valor de cada produto.

A cada compra:
- O sistema **verifica se há saldo suficiente** no cartão.  
- Caso o saldo seja suficiente, o valor é **debitado do limite** e a compra é **armazenada em uma lista**.  
- Se o valor ultrapassar o limite disponível, o programa encerra com uma mensagem de **saldo insuficiente**.

No final da execução:
- Todas as compras são **exibidas em ordem crescente de valor**.
- O **limite final** do cartão é mostrado na tela.

---

## ⚙️ Funcionalidades Principais

- 💰 Definir o limite inicial do cartão
- 🛒 Registrar várias compras com nome e valor
- 🚫 Impedir compras que ultrapassem o limite
- 📋 Exibir lista de compras ordenada por valor (usando `Comparator`)
- 🔁 Loop interativo com opção de continuar ou encerrar
- ✅ Controle e validação de entradas com `Scanner`

---

## 🧩 Estrutura do Projeto

```

📦 projeto-cartao-compras
┣ 📂 src
┃ ┣ 📂 Main
┃ ┃ ┗ 📜 Main.java
┃ ┣ 📂 Models
┃ ┃ ┣ 📜 Cartao.java
┃ ┃ ┗ 📜 Compras.java
┣ 📜 README.md

````

### 🗂️ Classes:

#### **Cartao**
Responsável por armazenar o limite e debitar valores das compras.
```java
public class Cartao {
    private double limite;

    public boolean debitar(double valor) {
        if (valor <= limite) {
            limite -= valor;
            return true;
        }
        return false;
    }
}
````

#### **Compras**

Representa um item comprado, com nome e valor.

```java
public class Compras {
    private String produto;
    private double valor;
    // getters, setters e toString()
}
```

#### **Main**

Controla o fluxo principal: leitura dos dados, verificação do limite e listagem das compras.

* Usa `ArrayList<Compras>` para armazenar os itens.
* Faz a ordenação da lista com `Comparator.comparing(Compras::getValor)`.

---

## 🧮 Exemplo de Execução

```
Digite o limite a ser gasto:
500

Qual produto deseja comprar?
Carne
Qual o valor do produto?
120

Compra realizada! Limite restante: 380.00
Digite 1 para continuar ou digite 0 para sair:
1

Qual produto deseja comprar?
Carvão
Qual o valor do produto?
30

Compra realizada! Limite restante: 350.00
Digite 1 para continuar ou digite 0 para sair:
0

_________________________
Compras realizadas (ordem crescente de valor):
Carvão - R$ 30.00
Carne - R$ 120.00
Limite final: R$ 350.00
```

---

## 🧰 Tecnologias Utilizadas

* ☕ **Java 17+**
* 🧱 **Paradigma de Programação Orientada a Objetos (POO)**
* 💬 **Scanner** para entrada de dados
* 🗃️ **ArrayList** para armazenamento de objetos
* ⚖️ **Comparator** para ordenação

---

## 🚀 Aprendizados

Durante o desenvolvimento deste projeto, foram praticados:

* Criação e uso de **classes e objetos**
* Aplicação de **encapsulamento** e **responsabilidade única**
* Controle de **fluxos condicionais**
* Uso de **listas dinâmicas**
* Manipulação e **ordenação de dados com Collections**
* **Boas práticas de interação com o usuário** e tratamento de entradas

---

## 🧑‍💻 Autor

**Willian Diniz Menezes**
📍 Maricá - RJ
📧 williandiniz2412@hotmail.com
💼 LinkedIn(https://www.linkedin.com/in/willian-diniz-2360b74b/)






