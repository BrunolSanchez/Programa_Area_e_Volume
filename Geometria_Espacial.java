import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    Scanner leitor = new Scanner(System.in);
      
    System.out.println("Escolha uma das formas a seguir: cilindro, cubo, cone ou esfera.");
    String figura = leitor.nextLine();
    if (figura.equals("cubo")){
      System.out.println("Deseja calcular area ou volume?");
      String formula = leitor.nextLine();
      if (formula.equals("area")){
        System.out.println("Qual é o valor da aresta?");
        int a = leitor.nextInt();
        double potencia =Math.pow(a, 2);
        double area_cubo = 6*potencia;
        System.out.println("A area do cubo é: " + area_cubo);
      }
      else{
      System.out.println("Qual é o valor da aresta?");
      int a = leitor.nextInt();
      double potencia = Math.pow(a, 3);
      double volume_cubo = potencia;
      System.out.println("O volume do cubo é: " + volume_cubo);
      }

    }else if (figura.equals("cilindro")){
      System.out.println("area ou volume?");
      String formula = leitor.nextLine();

      if (formula.equals("area")){
        System.out.println("Qual é o valor do raio da base? ");
        int r = leitor.nextInt();
        System.out.println("Qual é o valor da altura do cilindro?");
        int h = leitor.nextInt();
        double area_lado = (2* (Math.PI)*r*h);
        double area_base = ((Math.PI)*r*r);
        double area_cilindro = (area_lado + area_base);
        System.out.println("A área do cilindro é: " + area_cilindro);

      }else{
        System.out.println("Qual é o valor do raio da base?");
        int r = leitor.nextInt();
        System.out.println("qual é a altura do cilindro?");
        int h = leitor.nextInt();
        double area_base = ((Math.PI)*r*r);
        double volume_cilindro = (area_base*h);
        System.out.println("O volume do cilindro é: " + volume_cilindro);
      }

    }else if (figura.equals("esfera")){
      System.out.println("area ou volume?");
      String formula = leitor.nextLine();
      if(formula.equals("area")){
        System.out.println("qual é o valor do raio?");
        int r = leitor.nextInt();
        double area_esfera = (4*(Math.PI)*r*r);
        System.out.println("a área da esfera é de: "+ area_esfera);
        
      }else{
        System.out.println("Qual é o valor do raio?");
        int r = leitor.nextInt();
        double volume_esfera = (4/3*(Math.PI)*r*r*r);
        System.out.println("o volume da esfera é: " + volume_esfera);
      }

    }else if(figura.equals("cone")){
      System.out.println("area ou volume?");
      String formula = leitor.nextLine();
      if (formula.equals("area")){
        System.out.println("Qual é o valor do raio?");
        int r = leitor.nextInt();
        System.out.println("Qual é a altura do cone?");
        int h = leitor.nextInt();
        double g_pow =((r*r)+(h*h));
        double g = Math.sqrt(g_pow);
        double area_cone = ((Math.PI)*r*(g+r));
        System.out.println("A área do cone é: " + area_cone);        
      }else{
        System.out.println("Qual é o valor do raio?");
        int r = leitor.nextInt();
        System.out.println("Qual é o valor da altura do cone?");
        int h = leitor.nextInt();
        double volume_cone = ((Math.PI)*r*r*h)/3;
        System.out.println("O volume do cone é: " + volume_cone);
      }
    }
  }
}
