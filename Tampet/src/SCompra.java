import java.util.Scanner;


public class SCompra {
	
	Scanner entrada = new Scanner (System.in);
	
	public int mp;
	public int pedido_compra_mp;
	public int opcao;
	public int opcao1;
	public int qtd_plastico_compra;
	public int qtd_tinta_compra;
	public double preco_plastico;
	public double preco_tinta;
	public double preco_final_plastico;
	public double preco_final_tinta;
	
	do{
		System.out.println("1- Compra de materia prima \n2- Receber MP do Fornecedor \n3- Atualizar Estoque de MP \n4- Enviar pedido de Pagamento ao Fornecedor");
		opcao = entrada.nextInt();
		
		switch(opcao){
		
		case 1: 
			System.out.print("Compras de MP");
			System.out.println("1- Plastico \n2- Tinta");
			opcao1 = entrada.nextInt();
			if(opcao == 1){
				System.out.println("Informe a quantidade");
				qtd_plastico_compra = entrada.nextInt();
				System.out.println("Informe o Valor unitario");
				preco_plastico= entrada.nextDouble();
				preco_final_plastico = qtd_plastico_compra * preco_plastico;
				}else{
					System.out.println("Informe a quantidade");
					qtd_tinta_compra = entrada.nextInt();
					System.out.println("Informe o Valor unitario");
					preco_tinta= entrada.nextDouble();
					preco_final_tinta = qtd_tinta_compra * preco_tinta;
				}
		}
		
		
	}
