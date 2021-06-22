package bytebank;

public class TestaMetodo { 
    
	public static void main(String[] args) { 
        Conta conta1 = new Conta();
        conta1.adicionarSaldo(100);
        conta1.deposita(50);
        System.out.println(conta1.pegaSaldo()); 

        boolean conseguiuRetirar = conta1.saca(20);
        System.out.println(conta1.pegaSaldo()); 
        System.out.println(conseguiuRetirar);

        Conta conta2 = new Conta();
        conta2.deposita(1000);

        boolean sucessoTransferencia = conta2.transfere(300, conta1);
       
        if(sucessoTransferencia) {
            System.out.println("transferencia com sucesso");
        } else {
            System.out.println("faltou dinheiro");
        }
        
        System.out.println(conta2.pegaSaldo());
        System.out.println(conta1.pegaSaldo()); 
    }
	
}
