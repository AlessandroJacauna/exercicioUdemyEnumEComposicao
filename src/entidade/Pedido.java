package entidade;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import entidade.enums.StatusPedido;

public class Pedido {
	private static final SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");

	private Date momento;
	private StatusPedido status;
	private Cliente cliente;
	private List<ItensDoPedido> idp = new ArrayList<>();
	

	public Pedido() {		
	}

	public Pedido(Date momento, StatusPedido status) {
		this.momento = momento;
		this.status = status;
	}
	
	public Pedido(Date momento, StatusPedido status, Cliente cliente) {
		this.momento = momento;
		this.status = status;
		this.cliente = cliente;
	}

	public Date getMomento() {
		return momento;
	}

	public void setMomento(Date momento) {
		this.momento = momento;
	}

	public StatusPedido getStatus() {
		return status;
	}

	public void setStatus(StatusPedido status) {
		this.status = status;
	}
	
	public List<ItensDoPedido> getItensDoPedido() {
		return idp;
	}
	
	public void addItensDoPedido(ItensDoPedido item) {
		idp.add(item);
	}
	public void removeItensDoPedido(ItensDoPedido item) {
		idp.remove(item);
	}
	
	public double total() {
		double soma = 0;
		for(ItensDoPedido i : idp) {
			soma += i.subTotal();			
		}
		return soma;
	}
	
	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("Hora da compra: ");
		sb.append(sdf.format(momento) + "\n");
		sb.append("Status da compra: ");
		sb.append(status + "\n");
		sb.append("Cliente: ");
		sb.append(cliente + "\n");
		sb.append("Itens do pedido: \n");
		for(ItensDoPedido item : idp) {
			sb.append(item + "\n");
		}
		sb.append("Preço total: R$ ");
		sb.append(String.format("%.2f", total()));
		return sb.toString();

	}
}