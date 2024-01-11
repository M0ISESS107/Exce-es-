package exeções;

import java.util.Scanner;

public class Exeções {

    public static void main(String[] args) {
        double resuntado;

        try {
           resuntado= div();
           if(resuntado/5 != 0) {
               throw new Exception("são premitidos apenas numeros divididos por 5");
           }
            
        } catch (ArithmeticException ex) {
            System.out.println("não e possivel dividir por 0");
            System.out.println(ex.getMessage());
            ex.printStackTrace();
        
        } catch (Exception e) {
            System.out.println("por favor digite um valor valido");
            System.out.println(e.getMessage());
            e.printStackTrace();
        } finally {
            System.out.println("obrigado por usar o meu codigo");
        }
    }

    public static double div() throws Exception {
        int divisor, dividendo, resuntado;
        Scanner entre = new Scanner(System.in);

        System.out.println("digite o dividendo");
        dividendo = entre.nextInt();
        System.out.println("digite o dividendo");
        divisor = entre.nextInt();
        resuntado = dividendo / divisor;

        return resuntado;

    }

}
