package aplicacao115;

import java.util.Date;

import entidades115.Ordem;
import entidades115.enums115.OrdemStatus;

public class Programa {

	public static void main(String[] args) {
		
		Ordem pedido1 = new Ordem(1000, new Date(), OrdemStatus.EM_PROCESSAMENTO);
		System.out.println(pedido1);
		
		Ordem pedido2 = new Ordem(1001, new Date(), OrdemStatus.ENTREGUE);
		System.out.println(pedido2);
		
		//INICIO - PEGANDO O VALOR E GUARDANDO NA VARIAVEL LOCAL
			OrdemStatus ordem1 = OrdemStatus.ENVIADO;
			System.out.println(ordem1);
			
			Ordem pedido3 = new Ordem(1002, new Date(), ordem1);
			System.out.println(pedido3);
		//FIM - PEGANDO O VALOR E GUARDANDO NA VARIAVEL LOCAL
		
		//INICIO - PEGANDO O VALOR POR UMA STRING
			OrdemStatus ordem2 = OrdemStatus.valueOf("PAGAMENTO_PENDENTE");
			System.out.println(ordem2);
			
			Ordem pedido4 = new Ordem(1003, new Date(), ordem2);
			System.out.println(pedido4);
		//FIM - PEGANDO O VALOR POR UMA STRING
	}
}