# Lógica de Programação - Primeira Avaliação (Java)

![Java](https://img.shields.io/badge/Java-ED8B00?style=for-the-badge&logo=java&logoColor=white)

Repositório criado para a Primeira Avaliação da disciplina Mentoria Tech sobre Lógica de Programação em Java, com foco na implementação de algoritmos em Java. O projeto contém duas atividades práticas: a simulação de um sistema escolar para cálculo de médias (bimestrais, semestrais e final) e um programa para a conversão de temperaturas entre as escalas Celsius, Fahrenheit e Kelvin.

---

## 👨‍💻 Aluno(a)

*   **Nome:** MARIA EDUARDA CARVALHO DA SILVA
*   **Email:** mariadudasilva2612@gmail.com

---

## 👨‍🏫 Professor

*   **Nome:** Helio Lima/Francisco Coelho

---

## 📝 Atividades

O projeto consiste na implementação de duas atividades principais:

| Atividade    | Descrição                                                                                                                                                           |
|--------------|---------------------------------------------------------------------------------------------------------------------------------------------------------------------|
| **Atividade 01** | Simular um sistema escolar, recebendo 8 notas anuais. Deve calcular e exibir as médias bimestrais, médias semestrais e a média final de forma clara.                 |
| **Atividade 02** | Receber uma temperatura em graus Celsius (`°C`). Deve realizar a conversão para Fahrenheit (`°F`) e Kelvin (`K`), e exibir todos os resultados. |

---

## 🛠️ Estrutura do Projeto

O código foi organizado na seguinte estrutura de pastas para manter a clareza e a modularidade:

```
/seu-projeto-logica/
├── src/
│   ├── Main.java             # Ponto de entrada que executa o menu de atividades
│   ├── Atividade01.java      # Lógica do Sistema Escolar
│   └── Atividade02.java      # Lógica do Conversor de Temperatura
└── README.md                 # Documentação do projeto
```

---

## 🚀 Como Executar

Para compilar e executar o projeto localmente, siga os passos abaixo:

1.  **Clone o repositório:**
    ```bash
    git clone https://github.com/ellenisabelly-stack/atividade_mentoriatech.git
    cd atividade_mentoriatech
    ```

2.  **Navegue até a pasta `src`:**
    ```bash
    cd src
    ```

3.  **Compile os arquivos Java:**
    ```bash
    javac Main.java Atividade01.java Atividade02.java
    ```

4.  **Execute a classe principal:**
    ```bash
    java Main
    ```

---

## ☁️ Git: Como Enviar seu Código para o GitHub

Esta seção é um guia para enviar seu código para um repositório no GitHub.

### 1. Configuração Inicial (Primeiro Envio)

Siga estes passos se você criou o projeto no seu computador e quer enviá-lo para o GitHub pela primeira vez.

1.  **Crie um novo repositório no GitHub** (sem `README.md`, `.gitignore` ou licença).

2.  **Abra o terminal** na pasta raiz do seu projeto local.

3.  **Inicialize o repositório Git** e defina a branch principal como `main`:
    ```bash
    git init
    git branch -M main
    ```

4.  **Adicione todos os arquivos** do projeto para o controle de versão:
    ```bash
    git add .
    ```

5.  **Crie o primeiro "commit"** (um "pacote" de alterações):
    ```bash
    git commit -m "Primeiro commit: Estrutura inicial do projeto"
    ```

6.  **Conecte seu repositório local ao remoto** (substitua a URL pela do seu repositório no GitHub):
    ```bash
    git remote add origin https://github.com/seu-usuario/seu-repositorio.git
    ```

7.  **Envie o código** para o GitHub:
    ```bash
    git push -u origin main
    ```

### 2. Atualizando o Repositório (Envios Futuros)

Após o primeiro envio, use este fluxo mais simples para enviar suas atualizações:

1.  **Adicione as modificações:** `git add .`
2.  **Crie um novo commit:** `git commit -m "feat: Adiciona cálculo de média na Atividade 1"`
3.  **Envie para o GitHub:**
    ```bash
    git push origin main
    ```
