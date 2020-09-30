package io.github.jesseduarte.vendas.repository;

import org.springframework.stereotype.Repository;

import io.github.jesseduarte.vendas.model.Cliente;

@Repository
public class ClientesRepository { //Acessará a tabela de Clientes.

	public void persistir(Cliente cliente) {
		//acessa a base e salva o cliente
	}
}
//É A CLASSE QUE ACESSARÁ DIRETAMENTE A BASE, QUE FAZ AS OPERACOES CRUD.