package br.com.poc.logistica.service.interfaces;

import java.math.BigDecimal;
import java.util.Date;
import java.util.List;

import javax.ejb.Local;

import br.com.poc.logistica.model.Devolucao;
import br.com.poc.logistica.model.DevolucaoVO;
import br.com.poc.logistica.model.PedidoVO;

@Local
public interface DevolucaoServico {

	List<DevolucaoVO> pesquisarDevolucao(Integer numPedido, Date dataPedidoMin,
            Date datePedidoMin, BigDecimal valorPedido, BigDecimal valorPedidoMax);
	
	void salvar(Devolucao tarifa);

	void alterar(Devolucao tarifa);

	void excluir(Integer idDevolucao);

	PedidoVO pesquisarPedidoPorNum(Integer numPedido);
	
}
