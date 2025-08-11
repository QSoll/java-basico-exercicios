<img src="Sintaxe-ContaBanco/img-javaBank.jpg">

# Bootcamp Santander 2025 Back-End com Java

## EXERCÍCIOS / DESAFIOS

## 1- Controle fluxo - Desafio

Vamos exercitar todo o conteúdo apresentado no módulo de Controle de Fluxo codificando o seguinte cenário.

O sistema deverá receber dois parâmetros via terminal que representarão dois números inteiros, com estes dois números você deverá obter a quantidade de interações (for) e realizar a impressão no console (System.out.print) dos números incrementados, exemplo:

Se você passar os números 12 e 30, logo teremos uma interação (for) com 18 ocorrências para imprimir os números, exemplo: "Imprimindo o número 1", "Imprimindo o número 2" e assim por diante.

Se o primeiro parâmetro for MAIOR que o segundo parâmetro, você deverá lançar a exceção customizada chamada de ParametrosInvalidosException com a segunda mensagem: "O segundo parâmetro deve ser maior que o primeiro"

=> Crie o projeto DesafioControleFluxo

Dentro do projeto, crie a classe Contador.java para realizar toda a codificação do nosso programa.

Dentro do projeto, crie a classe ParametrosInvalidosException que representará a exceção de negócio no sistema.

Abaixo temos um trecho de código no qual você poderá seguir alterando as partes que contenham ??

public class Contador {
	public static void main(String[] args) {
		Scanner terminal = new Scanner(System.in);
		System.out.println("Digite o primeiro parâmetro");
		int parametroUm = terminal.??;
		System.out.println("Digite o segundo parâmetro");
		int parametroDois = terminal.??;
		
		try {
			//chamando o método contendo a lógica de contagem
			contar(parametroUm, parametroDois);
		
		}catch (? exception) {
			//imprimir a mensagem: O segundo parâmetro deve ser maior que o primeiro
		}
		
	}
	static void contar(int parametroUm, int parametroDois ) throws ParametrosInvalidosException {
		//validar se parametroUm é MAIOR que parametroDois e lançar a exceção
		
		int contagem = parametroDois - parametroUm;
		//realizar o for para imprimir os números com base na variável contagem
	}
}

## => Resposta em respostas.md, item 1
## => Pasta do exercício: Controle-fluxo/

-----------------------

## 2- POO - Desafio: Modelagem e Diagramação de um Componente iPhone

Neste desafio, você será responsável por modelar e diagramar a representação UML do componente iPhone, abrangendo suas funcionalidades como Reprodutor Musical, Aparelho Telefônico e Navegador na Internet.

Contexto: Com base no vídeo de lançamento do iPhone de 2007 (link abaixo), você deve elaborar a diagramação das classes e nterfaces utilizando uma ferramenta UML de sua preferência.

Em seguida, implemente as classes e interfaces no formato de arquivos .java.

*Lançamento iPhone 2007*

Minutos relevantes: 00:15 até 00:55
Funcionalidades a Modelar
Reprodutor Musical
Métodos: tocar(), pausar(), selecionarMusica(String musica)
Aparelho Telefônico
Métodos: ligar(String numero), atender(), iniciarCorreioVoz()
Navegador na Internet
Métodos: exibirPagina(String url), adicionarNovaAba(), atualizarPagina()

*Objetivo*

- Criar um diagrama UML que represente as funcionalidades descritas acima.

- Implementar as classes e interfaces correspondentes em Java (Opcional).

Exemplo de Diagrama UML (Mermaid)

*Instruções*

- Assista ao vídeo do lançamento do iPhone para entender as funcionalidades principais.

- Utilize uma ferramenta UML de sua preferência para criar o diagrama das classes e interfaces. Você pode utilizar o modelo acima (criado na sintaxe Mermaid), uma alternativa open-source e compatível com arquivos Markdown como este.

- Opcionalmente, caso esteja cheio(a) de confiança, pode implementar as classes Java representadas em seu diagrama UML.

- Submeta seu repositório GitHub conforme as orientações da plataforma DIO. Por exemplo:
https://github.com/glysns/trilha-java-basico/desafios/poo/README.md

## => Resposta em respostas.md, item 2
## => Pasta do exercício: Poo-Iphone

----------------------------

## 3- Sintaxe-ContaBanco

*Criar o projeto contaBanco que receberá dados via terminal contendo caracteristicas de uma conta bancária conforme atributos:*
  
  - Numero (int-1021)
  - Agencia (texto-067-8)
  - Nome do cliente (texto-Mario Andrade)
  - Saldo (decimal-237,48)

Dentro do projeto crie a class *contaTerminal.java*, para realizar toda a codificação do programa.

## => Resposta em respostas.md, item 3
## => Pasta do exercício: Sintaxe-ContaBanco

__________________________________________________

<img src="https://solmorcillo.com.br/imgs_public/logo_SM.jpg" width="100px" height="130px">





