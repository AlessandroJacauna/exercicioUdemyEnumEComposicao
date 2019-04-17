package aplicacao;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

import entidade.Cliente;
import entidade.ItensDoPedido;
import entidade.Pedido;
import entidade.Produtos;
import entidade.enums.StatusPedido;

public class TestaPedido {

	public static void main(String[] args) throws ParseException {
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

		Scanner sc = new Scanner(System.in);
		
		System.out.println("Entre com os dados do cliente...");
		System.out.print("Nome: ");
		String nome = sc.nextLine();
		System.out.print("E-mail: ");
		String email = sc.nextLine();
		System.out.print("Data de nascimento: ");
		Date dataDeNascimento = sdf.parse(sc.next());
		
		System.out.println();

		Cliente cliente = new Cliente(nome, email, dataDeNascimento);
		

	//Tudo certo até aqui
		
		System.out.println("Entre com o status do pedido...");
		System.out.print("Status: ");
		StatusPedido status = StatusPedido.valueOf(sc.next());
		System.out.println();
		System.out.print("Quantos itens no pedido? ");
		
		Pedido pedido = new Pedido(new Date(), status, cliente);

		int n = sc.nextInt();
		
		for(int i = 1; i <= n; i++) {
			System.out.println("Entre com os dados do " + i + "º item:");
			System.out.print("Nome do produto: ");
			sc.nextLine();
			String nomeDoProduto = sc.nextLine();
			System.out.print("Valor: ");
			double preco = sc.nextDouble();
			
			Produtos prod = new Produtos(nomeDoProduto, preco);
			
			System.out.print("Quantidade: ");
			int quantidade = sc.nextInt();
			ItensDoPedido itensDoPedido = new ItensDoPedido(quantidade, preco, prod);
			pedido.addItensDoPedido(itensDoPedido);				
		}
		System.out.println();
		System.out.println("Sumário do Pedido:");
		System.out.println(pedido);
		sc.close();
	}

}
