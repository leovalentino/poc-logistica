package br.com.poc.logistica.util;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import br.com.poc.logistica.model.Cliente;
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
			 vo.setIdCliente(devolucao.getPedido().getCliente().getIdCliente());
			 vo.setCpfCnpj(devolucao.getPedido().getCliente().getCpfCnpj());
			 vo.setNomeCliente(devolucao.getPedido().getCliente().getNomeCliente());
			
			 vo.setNumPedido(devolucao.getPedido().getIdPedido());
			 vo.setValorPedido(devolucao.getPedido().getValorPedido());
			 vo.setDataPedido(UtilDate.getDateString(devolucao.getPedido().getDataPedido(), UtilDate.FORMATO_DD_MM_YYYY));
			 
			 vo.setIdProduto(devolucao.getPedido().getProduto().getIdProduto());
			 vo.setValorProduto(devolucao.getPedido().getProduto().getValorProduto());
			 vo.setDescProduto(devolucao.getPedido().getProduto().getDescProduto());
			 
			 vo.setIdDevolucao(devolucao.getId());
			 vo.setDataDevolucao(UtilDate.getDateString(devolucao.getDataDevolucao(), UtilDate.FORMATO_DD_MM_YYYY));
			 vo.setDescMotivo(devolucao.getMotivo());
			
			 listaVO.add(vo);
		 }
		 return listaVO;
	}

	public static PedidoVO convertPedidoToVo(Pedido pedido) {
		PedidoVO vo = new PedidoVO();
		if (pedido != null) {
			vo.setIdCliente(pedido.getCliente().getIdCliente());
			vo.setCpfCnpj(pedido.getCliente().getCpfCnpj());
			vo.setNomeCliente(pedido.getCliente().getNomeCliente());
			
			vo.setIdProduto(pedido.getProduto().getIdProduto());
			vo.setValorProduto(pedido.getProduto().getValorProduto());
			vo.setDescProduto(pedido.getProduto().getDescProduto());
			 
			vo.setNumPedido(pedido.getIdPedido());
			vo.setDataPedido(UtilDate.getDateString(pedido.getDataPedido(), UtilDate.FORMATO_DD_MM_YYYY));
			vo.setDescProduto(pedido.getProduto().getDescProduto());			
		}
		return vo;
	}

	public static Devolucao convertDevolucaoVoToEntity(DevolucaoVO devolucaoVo) {
		Devolucao devolucao = new Devolucao();
		if (devolucaoVo != null) {
			Cliente cliente = new Cliente();
			cliente.setIdCliente(devolucaoVo.getIdCliente());
			cliente.setCpfCnpj(devolucaoVo.getCpfCnpj());
			cliente.setNomeCliente(devolucaoVo.getNomeCliente());
			
			Pedido pedido = new Pedido();
			pedido.setIdPedido(devolucaoVo.getNumPedido());
			pedido.setDataPedido(UtilDate.getStringToDate(devolucaoVo.getDataPedido(), UtilDate.FORMATO_YYYY_MM_DD));
			pedido.setDataPedido(UtilDate.getStringToDate(devolucaoVo.getDataPedido(), UtilDate.FORMATO_DD_MM_YYYY));
			
			Produto produto = new Produto();
			produto.setDescProduto(devolucaoVo.getDescProduto());
			produto.setIdProduto(devolucaoVo.getIdProduto());
			pedido.setProduto(produto);
			
			devolucao.setIdDevolucao(devolucaoVo.getIdDevolucao());
			devolucao.setDataDevolucao(new Date());
			devolucao.setMotivo(devolucaoVo.getDescMotivo());
			devolucao.setPedido(pedido);
		}
		return devolucao;
	}

}
