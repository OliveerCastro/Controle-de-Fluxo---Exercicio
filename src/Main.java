/* Classe de exécicio de Operadores lógicos e relacionais, Controle de fluxos e Blocos.

 Criando variáveis e expressoes para estruturas if e switch

- Com if, exiba o nome do mês do ano de acordo com seu número. Evite o efeito "flecha". Crie outro if que verifica se o mês é julho, dezembro ou janeiro, para exibir "Férias". 
- Com switch use String a patir do dia da semana, exiba seu número. Faça outro switch onde se uma vaviável inteira for entre 1 e 3, exiba "Certo. Se for 4 exiba "Errado*, se for 5 "Talvez". Para outros vlores, exibir "Valor indefinido".*/


public class Main {
  
  public static void main(String[] args) {
    
    ifFlecha();
    ifSemFlecha();
    ifFerias();
    ifMenor();


    switchSemana();
    switchNumero();
    switchFerias();
  }

  private static void ifFlecha() {

    int mes = 9;

    if(mes == 1) {
      System.out.println("Janeiro");
    } else{
      if(mes == 2) {
        System.out.println("Fevereiro");
      } else{
        if(mes == 3) {
          System.out.println("Março");
        } else{
          if(mes == 4) {
            System.out.println("Abril");
          } else{
            if(mes == 5) {
              System.out.println("Maio");
            } else{
              if(mes == 6) {
                System.out.println("Junho");
              } else{
                if(mes == 7) {
                  System.out.println("Julho");
                } else{
                  if(mes == 8) {
                    System.out.println("Agosto");
                  } else{
                    if(mes == 9) {
                      System.out.println("Stembro");
                    } else{
                      if(mes == 10) {
                        System.out.println("Outubro");
                      } else{
                        if(mes == 11) {
                          System.out.println("Novembro");
                        } else{
                          if(mes == 12) {
                            System.out.println("Dezembro");
                          } else{
                            System.out.println("Mês indefinido");
                          }
                        }                  
                      }
                    }
                  }
                }
              }
            }
          }
        }
      }
    }
  }

  private static void ifSemFlecha() {
    
    int mes = 9;

    if(mes == 1) {
      System.out.println("Janeiro");
    } else if (mes == 2) {
      System.out.println("Fevereiro");
    } else if (mes == 3) {
      System.out.println("Março");
    } else if (mes == 4) {
      System.out.println("Abril");
    } else if (mes == 5) {
      System.out.println("Maio");
    } else if (mes == 6) {
      System.out.println("Junho");
    } else if (mes == 7) {
      System.out.println("Julho");
    } else if (mes == 8) {
      System.out.println("Agosto");
    } else if (mes == 9) {
      System.out.println("Setembro");
    } else if (mes == 10) {
      System.out.println("Outubro");
    } else if (mes == 11) {
      System.out.println("Novembro");
    } else if (mes == 12) {
      System.out.println("Dezembro");
    } else {
      System.out.println("Mês indefinido");
    } 
  }

  // Como não deve fazer um if, porque possui uma variável usada várias vezes, o correto seria usar switch, o if (com valor exato) não cai bem nesse caso.
  private static void ifFerias() {

    String mes = "julho";

    if(mes == "julho" || mes == "dezembro" || mes == "janeiro") {
      System.out.println("Férias");
    }
  } 

  private static void ifMenor() {
    
    double salarioMensal = 11893.58d;
    double mediaSalario = 10500d;

    int quntidadeDependentes = 4;
    int mediaDependentes = 2;

    //Esse if deve ser evitado
    if((salarioMensal < mediaSalario) && (quntidadeDependentes >= mediaDependentes)) {
      System.out.println("Funcionário deve receber auxílio.");
    }

    boolean salarioBaixo = salarioMensal < mediaSalario;
    boolean muitosDependentes = quantidadeDependentes >= mediaDependentes;

    if((salarioBaixo) && (muitosDependentes)) {
      System.out.println("Funcionário deve receber auxílio.");
    }

    boolean recebeAuxilio = (salarioBaixo) && (muitosDependentes);
    if(recebeAuxilio) {
      System.out.println("Funcionário deve receber auxilio.");
    } else{
      System.out.println("Funcionário não deve receber auxilio.");
    }
  }

  private static void switchSemana() {

    String dia = "terça";

    switch (dia) {
      case "Segunda":
        System.out.println(2);
        break;

      case "Terça":
        System.out.println(3);
        break;

      case "Quarta":
        System.out.println(4);
        break;  
    
      case "Quinta":
        System.out.println(5);
        break;

      case "Sexta":
        System.out.println(6);
        break;

      case "Sábado":
        System.out.println(7);
        break;

      case "Domingo":
        System.out.println(1);
        break;

        default:
      System.out.println("Dia inválido");
        break;
    }
  }

  private static void switchNumero() {
    
    int numero = 4;

    switch(numero){

      case 1:
      case 2:
      case 3:
        System.out.println("Certo");
        break;

      case 4:
        System.out.println("Errado");
        break;

      case 5:
        System.out.println("Talvez");
        break;

      default:
        System.out.println("Valor inválido");
        break;
    }
  }

  private static void switchFerias() {

    String mes = "dezembro";

    switch (mes) {
      case "dezembro":
      case "julho":
      case "janeiro":
        System.out.println("Férias");  
        break;
    
      default:
        System.out.println("Mês indefinido");
        break;
    }
  }
}