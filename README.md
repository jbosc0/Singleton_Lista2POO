# Atividade usando Singleton

Este projeto implementa o padrão **Singleton** em Java, que garante que apenas uma instância da classe `ConfigSingleton` será criada. O projeto também faz a leitura de um arquivo de configuração, armazenando seus dados em memória para posterior acesso.

A solução foi desenvolvida com a ajuda da IA (ChatGPT), que forneceu um passo-a-passo detalhado e sugeriu as etapas para implementar a solução de forma eficiente.

## Uso da IA

### 1. Prompt inicial usado:

O prompt inicial enviado para a IA foi o seguinte:

> **"ChatGPT, preciso implementar um sistema simples em Java usando o padrão Singleton. O programa deve ler um arquivo de configuração apenas uma vez, armazenar seus dados em memória e permitir que outros objetos acessem esses valores. Gere um passo-a-passo detalhado, sem escrever código pronto, apenas me dizendo como estruturar classes, métodos e etapas de implementação. Quero que o passo-a-passo seja sequencial para que eu possa converter cada etapa em um commit."**

### 2. Etapas sugeridas pela IA:

A IA sugeriu os seguintes passos para implementar a solução utilizando o padrão Singleton:

- **Criar a classe `ConfigSingleton`**: Essa classe será responsável por garantir que apenas uma instância seja criada, conforme o padrão Singleton.
- **Implementar o método `getInstance()`**: A IA sugeriu que o método `getInstance()` fosse utilizado para garantir que a instância de `ConfigSingleton` seja acessada globalmente.
- **Criar a classe `ConfigData`**: Esta classe foi sugerida para armazenar os dados carregados do arquivo de configuração, como `AppId`, `UserName`, etc.
- **Criar o método `getConfigData()`**: Esse método permitirá que outros objetos acessem os dados armazenados na instância de `ConfigData`.


## Execução

Para testar a implementação:

1. **Clone o repositório**:
   ```bash
   git clone https://github.com/seu-usuario/Singleton_Lista2POO.git
