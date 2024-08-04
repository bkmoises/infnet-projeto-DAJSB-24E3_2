# Projeto Infnet-DAJSB-24E3_2

## Visão Geral

Este projeto é um exemplo de aplicação Java utilizando Spring Boot e Maven. A versão do Java utilizada é a 17. O código-fonte está organizado de maneira a facilitar a manutenção e a expansão da aplicação.

## Requisitos

- Java 17
- Maven
- IDE (IntelliJ IDEA ou Eclipse)

## Clonando o Repositório

Para começar, você precisa clonar o repositório do GitHub. Abra seu terminal e execute o seguinte comando:

```bash
git clone https://github.com/bkmoises/infnet-projeto-DAJSB-24E3_2.git
cd infnet-projeto-DAJSB-24E3_2
git checkout primeira-entrega
```

## Configuração do Ambiente

### Configuração no IntelliJ IDEA

1. **Abrir o Projeto**:
    - Abra o IntelliJ IDEA.
    - Vá em `File > Open` e selecione a pasta do projeto clonada.

2. **Importar Dependências do Maven**:
    - O IntelliJ IDEA deve detectar automaticamente o arquivo `pom.xml` e importar as dependências Maven. Caso contrário, clique com o botão direito no arquivo `pom.xml` e selecione `Add as Maven Project`.

3. **Configuração do SDK**:
    - Certifique-se de que o SDK do projeto está configurado para o Java 17. Vá em `File > Project Structure > Project`, e selecione a versão 17 do SDK.

4. **Run Application**:
    - Navegue até a classe principal `AppMoisesAndradeApplication.java`.
    - Clique com o botão direito e selecione `Run 'AppMoisesAndradeApplication'`.

### Configuração no Eclipse

1. **Importar o Projeto Maven**:
    - Abra o Eclipse.
    - Vá em `File > Import`.
    - Selecione `Maven > Existing Maven Projects` e clique em `Next`.
    - Navegue até a pasta do projeto clonada e clique em `Finish`.

2. **Configuração do JDK**:
    - Certifique-se de que o JDK 17 está configurado no Eclipse. Vá em `Window > Preferences > Java > Installed JREs` e adicione o JDK 17 se ainda não estiver listado.

3. **Build do Projeto**:
    - O Eclipse deve automaticamente detectar e baixar as dependências Maven definidas no `pom.xml`. Caso contrário, clique com o botão direito no projeto, selecione `Maven > Update Project`.

4. **Run Application**:
    - Navegue até a classe principal `AppMoisesAndradeApplication.java`.
    - Clique com o botão direito e selecione `Run As > Java Application`.
