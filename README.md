# Atividades-Java

Este repositório contém uma sequência de exercícios Java organizados em um módulo chamado `projeto`.

**Resumo**
- **Objetivo:** exercícios didáticos que demonstram classes, herança, sobrecarga e uso de interfaces.
- **Pacotes:** cada exercício está em `src/exercicio1`, `src/exercicio2`, `src/exercicio3`, `src/exercicio4`.
- **Runner:** existe um `app/MainRunner` (linha de comando) e uma GUI Swing em `app/MainGUI` (menu interativo).

**Estrutura principal**
- `src/module-info.java` : declaração do módulo `projeto` (inclui `requires java.desktop` para a GUI).
- `src/exercicio1` : `FormaGeometrica`, `Triangulo`, `IFormaGeometrica`, `Principal`.
- `src/exercicio2` : `Funcionario`, `Geerente`, `IFuncionario`, `Principal`.
- `src/exercicio3` : `Casa`, `ICasa`, `Principal`.
- `src/exercicio4` : `Produto`, `IProduto`, `Principal`.
- `src/app/MainRunner.java` : executa todos os exercícios no console.
- `src/app/MainGUI.java` : interface Swing com menu para executar cada exercício e inserir valores.

**Requisitos**
- JDK 11 ou superior (o projeto usa `module-info.java`; Java 9+ suporta módulos — recomendamos Java 11+).
- Variáveis de ambiente: `JAVA_HOME` apontando para o JDK (recomendado).

Verifique a versão do Java com:

```powershell
java -version
javac -version
```

**Compilar (PowerShell)**
Abra um terminal PowerShell na pasta do projeto (`c:/Users/user/Desktop/Atividades-Java/projeto`) e execute:

```powershell
cd c:/Users/user/Desktop/Atividades-Java/projeto
javac -d bin src/module-info.java src/exercicio1/*.java src/exercicio2/*.java src/exercicio3/*.java src/exercicio4/*.java src/app/*.java
```

Isso gerará os arquivos de classe em `bin/`.

**Executar (linha de comando)**
- Executar o runner que imprime resultados no console:

```powershell
java -p bin -m projeto/app.MainRunner
```

- Executar a interface gráfica (Swing):

```powershell
java -p bin -m projeto/app.MainGUI
```

- Executar um `Principal` de um exercício específico (ex.: exercício 2):

```powershell
java -p bin -m projeto/exercicio2.Principal
```

**Notas sobre comportamento e sugestões**
- O método `Produto.calcularPrecoFinal(double preco1, double preco2, double desconto)` na versão original usa `preco1 + preco2 / desconto`. Isso pode não corresponder à intenção de "desconto". A GUI pede ao usuário o tipo de desconto (percentual ou absoluto) e realiza o cálculo adequadamente. Se preferir, posso alterar a implementação do método para lidar com descontos internamente.
- A classe `Geerente` está escrita com dois `e` ("Geerente"). Se desejar, posso renomeá-la para `Gerente` e atualizar todas as referências.
- As interfaces adicionadas (`IFormaGeometrica`, `IFuncionario`, `ICasa`, `IProduto`) têm assinaturas básicas — podemos expandi-las para incluir todas as sobrecargas se quiser seguir esse design.

**Como contribuir / alterar**
- Faça um branch, modifique os arquivos em `src/` e abra um pull request.

**Problemas comuns**
- Se der erro `module not found` ou `class not found`, verifique se o diretório `bin` contém os `.class` gerados e se você está executando `java -p bin -m projeto/...` na raiz `projeto`.
- Se a GUI não abrir, verifique se o JDK instalado inclui suporte a AWT/Swing (disponível nas distribuições JDK padrão) e se não há problemas de permissões gráficos no ambiente remoto.

---

Se quiser que eu faça alterações (ex.: renomear `Geerente` para `Gerente`, ajustar `Produto` para cálculo percentual por padrão, ou adicionar testes), diga qual opção prefere e eu aplico as mudanças.
