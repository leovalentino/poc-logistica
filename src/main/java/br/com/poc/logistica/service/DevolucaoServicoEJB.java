package br.com.poc.logistica.service;

import java.math.BigDecimal;
import java.util.Date;
import java.util.List;

import javax.ejb.EJB;
import javax.ejb.Stateless;

import br.com.poc.logistica.dao.DevolucaoDao;
import br.com.poc.logistica.dao.PedidoDao;
import br.com.poc.logistica.model.Devolucao;
import br.com.poc.logistica.model.DevolucaoVO;
import br.com.poc.logistica.model.Pedido;
import br.com.poc.logistica.model.PedidoVO;
import br.com.poc.logistica.service.interfaces.DevolucaoServico;
import br.com.poc.logistica.util.Conversor;

@Stateless
public class DevolucaoServicoEJB implements DevolucaoServico {

	@EJB
	private DevolucaoDao dao;
	
	@EJB
	private PedidoDao pedidoDao;
	
	@Override
	public List<DevolucaoVO> pesquisarDevolucao(Integer numPedido, Date dataPedidoMin, Date dataPedidoMax,
            BigDecimal valorPedidoMin, BigDecimal valorPedidoMax) {
		 List<Devolucao> listaDevolucao = dao.pesquisarListaDevolucao(numPedido, dataPedidoMin, dataPedidoMax,valorPedidoMin, valorPedidoMax);
		 return Conversor.convertListDevolucaoToListVo(listaDevolucao);
	}

	@Override
	public PedidoVO pesquisarPedidoPorNum(Integer numPedido) {
		Pedido pedido = pedidoDao.pesquisarPedidoPorNum(numPedido);
		return Conversor.convertPedidoToVo(pedido);
	}
	
	@Override
	public void salvar(Devolucao tarifa) {
		dao.salvar(tarifa);
	}
	
	@Override
	public void alterar(Devolucao tarifa) {
		dao.alterar(tarifa);
	}

	@Override
	public void excluir(Integer idDevolucao) {
		dao.excluir(idDevolucao);
	}
	
}
