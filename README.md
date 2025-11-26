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
---
