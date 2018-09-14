package br.com.poc.logistica.service;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.ejb.EJB;
import javax.ejb.Stateless;

import br.com.poc.logistica.dao.DevolucaoDao;
import br.com.poc.logistica.model.Devolucao;
import br.com.poc.logistica.model.DevolucaoVO;

@Stateless
public class DevolucaoServicoEJB implements DevolucaoServico {

	@EJB
	private DevolucaoDao dao;
	
	public List<DevolucaoVO> pesquisarDevolucao(Integer numPedido, Date dataDevolucao,
            BigDecimal valorPedido) {
		 List<Devolucao> listaDevolucao = dao.pesquisarListaDevolucao(numPedido, dataDevolucao, valorPedido);
		 List<DevolucaoVO> listaVO = new ArrayList<>();
		 for (Devolucao devolucao : listaDevolucao) {
			 DevolucaoVO vo = new DevolucaoVO();
			 vo.setIdDevolucao(devolucao.getId());
			 vo.setDataPedido(UtilDate.getDateString(devolucao.getPedido().getDataPedido(), UtilDate.FORMATO_DD_MM_YYYY));
			 vo.setValorPedido(devolucao.getPedido().getValorPedido());
			 vo.setDataDevolucao(UtilDate.getDateString(devolucao.getDataDevolucao(), UtilDate.FORMATO_DD_MM_YYYY));
			 vo.setDescMotivo(devolucao.getMotivo());
			 vo.setDescProduto(devolucao.getPedido().getProduto().getDescProduto());
			 vo.setNumPedido(devolucao.getPedido().getIdPedido());
			 listaVO.add(vo);
		 }
		 return listaVO;
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
