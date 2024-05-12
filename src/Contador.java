import exception.ParametrosInvalidosException;

import java.util.Scanner;

public class Contador {
    public static void main(String[] args) {
        Scanner terminal = new Scanner(System.in);

        System.out.println("Digite o primeiro parâmetro:");
        int parametro1 = terminal.nextInt();

        System.out.println("Digite o segundo parâmetro:");
        int parametro2 = terminal.nextInt();

        try{
            contar(parametro1, parametro2);
        } catch (ParametrosInvalidosException e){
            System.out.println(e.getMessage());
        }
    }

    static void contar(int parametro1, int parametro2) throws ParametrosInvalidosException{

        if (parametro1 > parametro2) throw new ParametrosInvalidosException("Parâmetro 1 deve ser menor que o parâmetro 2");

        int intervalo = parametro2 - parametro1;

        for (int i = 1; i <= intervalo; i++){
            System.out.printf("Imprimindo o número %d\n", i);
        }
    }
}
