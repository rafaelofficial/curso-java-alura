package javaPilha.exceptions;

public class Fluxo {

    public static void main(String[] args) {
        System.out.println("Ini do main");
        try {
        	metodo1();
        } catch (Exception e) {
        	var mensagem = e.getMessage();
			System.out.println("Exception " + mensagem);
			e.printStackTrace();
		}        
        System.out.println("Fim do main");
    }

    private static void metodo1() throws MinhaExcecao {
        System.out.println("Ini do metodo1");
    	metodo2();
        System.out.println("Fim do metodo1");
    }

    private static void metodo2() throws MinhaExcecao {
        System.out.println("Ini do metodo2");
        for(int i = 1; i <= 5; i++) {
            System.out.println(i);
        	int a = i / 0;
            Conta conta = null;
            conta.deposita();
        }
        System.out.println("Fim do metodo2");
    }
}
