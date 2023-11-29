import java.util.Arrays;
import java.util.Scanner;

public class ConvertNumber {

  static Scanner scanner = new Scanner(System.in);
  static String baseOrigin = "";
  static String number;

  public static void main(String[] args) {

    InitialMenu();
    switch (baseOrigin) {
      case ("D"):
        convertDecimal(number);
        break;
      case ("B"):
        convertBinary(number);
        break;
      case ("O"):
        convertOctal(number);
        break;
      case ("H"):
        convertHexadecimal(number);
        break;
    }

  }

  private static void InitialMenu() {
    System.out.println("----------------------------");
    System.out.println("----Conversor de Números----");
    System.out.println("----------------------------");
    System.out.println();
    while (!baseOrigin.equals("D") && !baseOrigin.equals("B")
        && !baseOrigin.equals("O") && !baseOrigin.equals("H")) {
      System.out.println("Escolha a base original que deseja converter");
      System.out.println("D - Decimal");
      System.out.println("B - Binário");
      System.out.println("O - Octal");
      System.out.println("H - Hexadecimal");
      baseOrigin = scanner.next();
    }

    System.out.printf("Digite o número da base %s que deseja converter: ",
        baseOrigin);
    number = scanner.next();
    System.out.println();
  }

  private static void convertDecimal(String number) {
    try {
      System.out.printf("Converter %s de Decimal para demais bases:\n", number);
      int numeral = Integer.parseInt(number);
      String b = Integer.toBinaryString(numeral);
      System.out.println("Binário: " + b);
      String o = Integer.toOctalString(numeral);
      System.out.println("Octal: " + o);
      String h = Integer.toHexString(numeral);
      System.out.println("Hexadecimal: " + h);
    } catch (NumberFormatException e) {
      System.out.println("Erro no formato do número");
    }
  }

  private static void convertBinary(String number) {
    try {
      System.out.printf("Converter %s de Binário para demais bases:\n", number);
      int numeral = Integer.parseInt(number, 2);
      System.out.println("Decimal: " + numeral);
      String o = Integer.toOctalString(numeral);
      System.out.println("Octal: " + o);
      String h = Integer.toHexString(numeral);
      System.out.println("Hexadecimal: " + h);
    } catch (NumberFormatException e) {
      System.out.println("Erro no formato do número");
    }
  }

  private static void convertOctal(String number) {
    try {
      System.out.printf("Converter %s de Octal para demais bases:\n", number);
      int numeral = Integer.parseInt(number, 8);
      System.out.println("Decimal: " + numeral);
      String b = Integer.toBinaryString(numeral);
      System.out.println("Binário: " + b);
      String h = Integer.toHexString(numeral);
      System.out.println("Hexadecimal: " + h);
    } catch (NumberFormatException e) {
      System.out.println("Erro no formato do número");
    }
  }

  private static void convertHexadecimal(String number) {
    try {
      System.out.printf("Converter %s de Hexadecimal para demais bases:\n", number);
      int numeral = Integer.parseInt(number, 16);
      System.out.println("Decimal: " + numeral);
      String b = Integer.toBinaryString(numeral);
      System.out.println("Binário: " + b);
      String o = Integer.toOctalString(numeral);
      System.out.println("Octal: " + o);
    } catch (NumberFormatException e) {
      System.out.println("Erro no formato do número");
    }
  }

}
