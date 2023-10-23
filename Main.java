import java.util.Scanner;
class Main {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    int n1, quadrado, i, j, e, ast, ast2;
    
    System.out.println("Qual o tamanho do quadrado? (LIMITE DE 1 A 20)");
      quadrado = scan.nextInt();

      if(quadrado<=20 && quadrado>0){

        System.out.print("\n LETRA A \n \n");

        for(i=0; i<quadrado; i++){
          for(j=0; j<quadrado; j++){
          System.out.print("* ");
          }
          System.out.print("\n");
        }

        System.out.print("\n LETRA B \n \n");


        for(i=0; i<quadrado; i++){
          for(j=0; j<=i; j++){
            System.out.print("* ");
          }
          System.out.print("\n");

        }

        System.out.print("\n LETRA C \n \n");

        for(i=0; i<quadrado; i++){
          for(j=0; j<(quadrado-i); j++){
            System.out.print("* ");
          }
          System.out.print("\n");

        }
      }
      else{
        System.out.println("Escolha um número de 1 a 20");
    }

  }
}