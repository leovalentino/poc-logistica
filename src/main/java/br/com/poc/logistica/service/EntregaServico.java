package br.com.poc.logistica.service;

import java.util.Date;
import java.util.List;

import javax.ejb.Local;

import br.com.poc.logistica.controller.GerenciarEntregaVo;
import br.com.poc.logistica.model.Entrega;

@Local
public interface EntregaServico {

	List<Entrega> pesquisarEntregas(GerenciarEntregaVo vo);

	List<Entrega> pesquisarEntregas(Integer numPedido, String nomeTranportadora, Date datePedido, String descProduto,
			String descSituacaoEntrega, String nomeCliente);

}
