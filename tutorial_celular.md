# Tutorial: Como Fazer Upload de Projetos para o GitHub pelo Celular

Fazer o upload de um projeto para o GitHub pelo celular é totalmente possível, especialmente se você estiver usando um ambiente como o Jvdroid. Para usar os comandos do Git que estão no `README.md` do seu projeto, você precisará de um aplicativo de terminal. A opção mais popular e poderosa para Android é o **Termux**.

Aqui está um passo a passo completo:

### Passo 1: Instalar o Termux

Primeiro, você precisa instalar o Termux. É importante baixá-lo da loja **F-Droid**, pois a versão da Google Play Store está desatualizada e não recebe mais atualizações.

1.  Acesse o site do **F-Droid** e baixe o aplicativo da loja.
2.  Instale o F-Droid e, dentro dele, procure e instale o **Termux**.

### Passo 2: Instalar o Git no Termux

Com o Termux aberto, você precisa instalar o pacote do Git. Digite os seguintes comandos, pressionando `Enter` após cada um:

```bash
# Atualiza a lista de pacotes do Termux
pkg update

# Instala o Git
pkg install git
```

### Passo 3: Configurar suas Credenciais do Git

Assim como no computador, você precisa configurar seu nome de usuário e e-mail no Git. Substitua as informações de exemplo pelas suas.

```bash
git config --global user.name "Seu Nome Completo"
git config --global user.email "seu-email@exemplo.com"
```

### Passo 4: Acessar os Arquivos do Projeto

Para que o Termux possa acessar os arquivos do seu celular (onde seu projeto do Jvdroid está salvo), execute o seguinte comando e conceda a permissão quando solicitado:

```bash
termux-setup-storage
```

Isso criará uma pasta `storage` dentro do Termux, que é um atalho para o armazenamento interno do seu celular. Seus projetos do Jvdroid geralmente ficam em uma pasta como `Internal Storage/Jvdroid`.

Agora, navegue até a pasta do seu projeto. O caminho será algo parecido com isto:

```bash
# Navega para a pasta do seu projeto
# O caminho pode variar um pouco dependendo do seu celular
cd storage/shared/Jvdroid/seu-projeto-logica
```

> **Dica:** use o comando `ls` para listar os arquivos e pastas e ter certeza de que está no lugar certo.

### Passo 5: Fazer o Upload para o GitHub

Uma vez dentro da pasta correta, você pode seguir os mesmos comandos que estão no `README.md` do seu projeto.

#### Se for o primeiro envio:

1.  **Crie um repositório vazio no GitHub** pelo navegador do seu celular.
2.  Execute os comandos no Termux:

    ```bash
    git init
    git branch -M main
    git add .
    git commit -m "Primeiro commit: Estrutura inicial do projeto"
    git remote add origin https://github.com/seu-usuario/seu-repositorio.git
    git push -u origin main
    ```

#### Para atualizações futuras:

Depois de fazer alterações no seu código, basta executar:

```bash
git add .
git commit -m "feat: Adiciona cálculo de média na Atividade 1"
git push origin main
```