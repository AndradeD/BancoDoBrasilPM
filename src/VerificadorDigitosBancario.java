
public class VerificadorDigitosBancario {

	/**
	 * Para obter o DV da ag�ncia, multiplica-se seus quatro primeiros d�gitos 
	 * pelos multiplicadores 5,4,3,2 nesta ordem. Em seguida, os valores s�o
	 * somados e � calculado o resto da divis�o desta soma por 11. O DV da
	 * Ag�ncia ser� 11 subtra�do do resto da divis�o. 	 
	 * */
	public boolean verificaAgencia(String agencia){	
		
		try	{
		String[] agenciaSplit = agencia.split("-");	
		int numArray = 0;
		int total = 0;
		int resto = 0;		
		int valorSubtracao = 11;
		String digitoVerificador = "";
		
		for (int i = 5; i > 1;i--){
			int num = Integer.parseInt(((Character.toString(agenciaSplit[0].charAt(numArray)))));
			total += num*i;
		}		
		
		resto = valorSubtracao - (total % valorSubtracao);		
				
		if (resto >= 10){
			digitoVerificador = "X";
		}else{
			digitoVerificador = Integer.toString(resto);
		}
		
		if (digitoVerificador.equals(agenciaSplit[1])){
			return true;
		}else{
			return false;
		}
			
		}catch(Exception ex){
			System.out.println("Entre com um n�mero v�lido");
			return false;	
		}		
	}
	
	
	/**
	 * Para obter o DV da conta corrente, multiplicam-se os oito primeiros
	 * d�gitos da conta pelos multiplicadores 9,8,7,6,5,4,3,2 nesta ordem. Em
	 * seguida, os valores s�o somados e � calculado o resto da
	 * divis�o da soma por 11. O DV da Ag�ncia ser� 11 subtra�do do
	 * resto da divis�o.	 
	 * */
	public boolean verificaContaCorrente(String contaCorrente) {
		
		try	{
			String[] contaCorrenteSplit = contaCorrente.split("-");	
			int numArray = 0;
			int total = 0;
			int resto = 0;			
			String digitoVerificador = "";
			int valorSubtracao = 11;
			
			for (int i = 9; i > 1;i--){
				int num = Integer.parseInt(((Character.toString(contaCorrenteSplit[0].charAt(numArray)))));
				total += num*i;
			}
			resto = valorSubtracao - (total % valorSubtracao);			
			
			if (resto >= 10){
				digitoVerificador = "X";
			}else{
				digitoVerificador = Integer.toString(resto);
			}
			
			if (digitoVerificador.equals(contaCorrenteSplit[1])){
				return true;
			}else{
				return false;
			}
				
			}catch(Exception ex){
				System.out.println("Entre com um n�mero v�lido");
				return false;
			}					
	}
	
}
