
package com.mycompany.java_contador_dio;
public class ParametrosInvalidosException extends Exception {
    public ParametrosInvalidosException(String mensagem) {
        super(mensagem);
    }
}

public class Java_Contador_Contador {
    public static void main(String[] args) {
        if (args.length != 2) {
            System.err.println("Por favor, forneça dois números inteiros como argumentos.");
            return;
        }

        try {
            int parametroUm = Integer.parseInt(args[0]);
            int parametroDois = Integer.parseInt(args[1]);

            if (parametroUm >= parametroDois) {
                throw new ParametrosInvalidosException("O segundo parâmetro deve ser maior que o primeiro.");
            }

            for (int i = parametroUm; i < parametroDois; i++) {
                System.out.println("Imprimindo o número " + i);
            }
        } catch (NumberFormatException e) {
            System.err.println("Erro: Os argumentos fornecidos não são números inteiros válidos.");
        } catch (ParametrosInvalidosException e) {
            System.err.println("Erro: " + e.getMessage());
        }
    }
}