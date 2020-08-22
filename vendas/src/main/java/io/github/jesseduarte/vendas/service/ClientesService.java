package io.github.jesseduarte.vendas.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import io.github.jesseduarte.vendas.model.Cliente;
import io.github.jesseduarte.vendas.repository.ClientesRepository;

@Service
public class ClientesService { //ONDE TEM AS REGRAS DE NEGOCIO DE UM DOMINIO. SERÁ DE CLIENTES.
	
	//Como injetar a instancia do clienteRepository no meu ClienteService.
	
	//Poderia injetar aqui tambem (injecao de campo) @Autowired
	private ClientesRepository repository;
	
	@Autowired //Irá injetar, injecao de construtor (recomendado!)!! Pode ser omitido, nas versoes atuais do Spring!!
	public ClientesService(ClientesRepository repository) {
		this.repository = repository;
	} //término da injecao
	
	public void salvarCliente(Cliente cliente) {
		validarCliente(cliente);
		this.repository.persistir(cliente);
	}
	
	public void validarCliente(Cliente cliente) {
		//aplica validacoes
	}

}

//É A CLASSE QUE TERÁ AS VALIDACOES, GERA RELATORIOS, TEM OBJ QUE ACESSA A BASE.
//PARA REALIZAR AS OPERACOES DELE, ELE DEVERÁ ACESSAR A TABELA REPOSITORY
//ENTAO, A TABELA CLIENTESERVICE DEVERÁ ACESSAR A TABELA CLIENTESREPOSITORY PARA SALVAR SEUS CLIENTES.