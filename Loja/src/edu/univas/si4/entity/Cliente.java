package edu.univas.si4.entity;
// Generated 03/05/2017 20:58:23 by Hibernate Tools 5.2.1.Final

import java.util.HashSet;
import java.util.Set;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import org.hibernate.annotations.GenericGenerator;
import org.hibernate.annotations.Parameter;

/**
 * Cliente generated by hbm2java
 */
@Entity
@Table(name = "cliente", schema = "public")
public class Cliente implements java.io.Serializable {

	private Integer cod;
	private String nome;
	private String email;
	private Set<Pedido> pedidos = new HashSet<Pedido>(0);

	public Cliente() {
	}

	public Cliente(String nome, String email, Set<Pedido> pedidos) {
		this.nome = nome;
		this.email = email;
		this.pedidos = pedidos;
	}

	@GenericGenerator(name = "generator", strategy = "org.hibernate.id.enhanced.SequenceStyleGenerator", parameters = {
			@Parameter(name = "optimizer", value = "none"),
			@Parameter(name = "sequence_name", value = "public.seq_cliente"),
			@Parameter(name = "increment_size", value = "1") })
	@Id
	@GeneratedValue(generator = "generator")

	@Column(name = "cod", unique = true, nullable = false)
	public Integer getCod() {
		return this.cod;
	}

	public void setCod(Integer cod) {
		this.cod = cod;
	}

	@Column(name = "nome", length = 50)
	public String getNome() {
		return this.nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	@Column(name = "email", length = 50)
	public String getEmail() {
		return this.email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "cliente")
	public Set<Pedido> getPedidos() {
		return this.pedidos;
	}

	public void setPedidos(Set<Pedido> pedidos) {
		this.pedidos = pedidos;
	}

}
