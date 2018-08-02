package br.com.caelum.financas.teste;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import br.com.caelum.financas.modelo.Conta;

public class TesteConta {

	public static void main(String[] args) {
		
		Conta conta = new Conta();
		conta.setAgencia("123");
		conta.setTitular("EvilCoder");
		conta.setBanco("EvilCorp");
		conta.setNumero("456");
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("financas"); //cria a fabrica de persistencias
		EntityManager em = emf.createEntityManager();//cria o gerenciado de entidade
		em.getTransaction().begin(); //cria uma transação
		em.persist(conta); //persiste a conta
		em.getTransaction().commit(); //commita no banco
		em.close();
		emf.close();
	}
}
