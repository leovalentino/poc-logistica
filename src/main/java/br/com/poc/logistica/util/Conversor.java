package br.com.poc.logistica.util;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import br.com.poc.logistica.model.Devolucao;
import br.com.poc.logistica.model.DevolucaoVO;
import br.com.poc.logistica.model.Pedido;
import br.com.poc.logistica.model.PedidoVO;
import br.com.poc.logistica.model.Produto;
import br.com.poc.logistica.service.UtilDate;

public class Conversor {

	public static List<DevolucaoVO> convertListDevolucaoToListVo(List<Devolucao> listaDevolucao) {
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

	public static PedidoVO convertPedidoToVo(Pedido pedido) {
		PedidoVO vo = new PedidoVO();
		if (pedido != null) {
			vo.setNumPedido(pedido.getIdPedido());
			vo.setDataPedido(UtilDate.getDateString(pedido.getDataPedido(), UtilDate.FORMATO_DD_MM_YYYY));
			vo.setDescProduto(pedido.getProduto().getDescProduto());			
		}
		return vo;
	}

	public static Devolucao convertDevolucaoVoToEntity(DevolucaoVO devolucaoVo) {
		Devolucao devolucao = new Devolucao();
		if (devolucaoVo != null) {
			devolucao.setDataDevolucao(new Date());
			devolucao.setMotivo(devolucaoVo.getDescMotivo());
			Pedido pedido = new Pedido();
			pedido.setDataPedido(UtilDate.getStringToDate(devolucaoVo.getDataPedido(), UtilDate.FORMATO_DD_MM_YYYY));
			Produto produto = new Produto();
			produto.setDescProduto(devolucaoVo.getDescProduto());
			pedido.setProduto(produto);
			devolucao.setPedido(pedido);
		}
		return devolucao;
	}

}
