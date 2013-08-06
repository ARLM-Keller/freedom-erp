package org.freedom.persist.entity;

// Generated 31/05/2013 12:00:37 by Hibernate Tools 3.4.0.CR1

import java.util.Date;
import java.util.HashSet;
import java.util.Set;
import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.JoinColumns;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 * Eqitexpedicao generated by hbm2java
 */
@Entity
@Table(name = "EQITEXPEDICAO")
public class Eqitexpedicao implements java.io.Serializable {

	private EqitexpedicaoId id;
	private Eqproduto eqproduto;
	private Eqexpedicao eqexpedicao;
	private Eqprocexped eqprocexped;
	private String refprod;
	private String statusitexped;
	private Date dtins;
	private Date hins;
	private String idusuins;
	private Date dtalt;
	private Date halt;
	private String idusualt;
	private Set<Eqexpedamostragem> eqexpedamostragems = new HashSet<Eqexpedamostragem>(
			0);

	public Eqitexpedicao() {
	}

	public Eqitexpedicao(EqitexpedicaoId id, Eqproduto eqproduto,
			Eqexpedicao eqexpedicao, Eqprocexped eqprocexped, String refprod,
			String statusitexped, Date dtins, Date hins, String idusuins) {
		this.id = id;
		this.eqproduto = eqproduto;
		this.eqexpedicao = eqexpedicao;
		this.eqprocexped = eqprocexped;
		this.refprod = refprod;
		this.statusitexped = statusitexped;
		this.dtins = dtins;
		this.hins = hins;
		this.idusuins = idusuins;
	}

	public Eqitexpedicao(EqitexpedicaoId id, Eqproduto eqproduto,
			Eqexpedicao eqexpedicao, Eqprocexped eqprocexped, String refprod,
			String statusitexped, Date dtins, Date hins, String idusuins,
			Date dtalt, Date halt, String idusualt,
			Set<Eqexpedamostragem> eqexpedamostragems) {
		this.id = id;
		this.eqproduto = eqproduto;
		this.eqexpedicao = eqexpedicao;
		this.eqprocexped = eqprocexped;
		this.refprod = refprod;
		this.statusitexped = statusitexped;
		this.dtins = dtins;
		this.hins = hins;
		this.idusuins = idusuins;
		this.dtalt = dtalt;
		this.halt = halt;
		this.idusualt = idusualt;
		this.eqexpedamostragems = eqexpedamostragems;
	}

	@EmbeddedId
	@AttributeOverrides({
			@AttributeOverride(name = "ticket", column = @Column(name = "TICKET", nullable = false)),
			@AttributeOverride(name = "coditexped", column = @Column(name = "CODITEXPED", nullable = false)),
			@AttributeOverride(name = "codfilial", column = @Column(name = "CODFILIAL", nullable = false)),
			@AttributeOverride(name = "codemp", column = @Column(name = "CODEMP", nullable = false)) })
	public EqitexpedicaoId getId() {
		return this.id;
	}

	public void setId(EqitexpedicaoId id) {
		this.id = id;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumns({
			@JoinColumn(name = "CODPROD", referencedColumnName = "CODPROD", nullable = false),
			@JoinColumn(name = "CODFILIALPD", referencedColumnName = "CODFILIAL", nullable = false),
			@JoinColumn(name = "CODEMPPD", referencedColumnName = "CODEMP", nullable = false) })
	public Eqproduto getEqproduto() {
		return this.eqproduto;
	}

	public void setEqproduto(Eqproduto eqproduto) {
		this.eqproduto = eqproduto;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumns({
			@JoinColumn(name = "TICKET", referencedColumnName = "TICKET", nullable = false, insertable = false, updatable = false),
			@JoinColumn(name = "CODFILIAL", referencedColumnName = "CODFILIAL", nullable = false, insertable = false, updatable = false),
			@JoinColumn(name = "CODEMP", referencedColumnName = "CODEMP", nullable = false, insertable = false, updatable = false) })
	public Eqexpedicao getEqexpedicao() {
		return this.eqexpedicao;
	}

	public void setEqexpedicao(Eqexpedicao eqexpedicao) {
		this.eqexpedicao = eqexpedicao;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumns({
			@JoinColumn(name = "CODTIPOEXPED", referencedColumnName = "CODTIPOEXPED", nullable = false),
			@JoinColumn(name = "CODPROCEXPED", referencedColumnName = "CODPROCEXPED", nullable = false),
			@JoinColumn(name = "CODFILIALTE", referencedColumnName = "CODFILIAL", nullable = false),
			@JoinColumn(name = "CODEMPTE", referencedColumnName = "CODEMP", nullable = false) })
	public Eqprocexped getEqprocexped() {
		return this.eqprocexped;
	}

	public void setEqprocexped(Eqprocexped eqprocexped) {
		this.eqprocexped = eqprocexped;
	}

	@Column(name = "REFPROD", nullable = false, length = 20)
	public String getRefprod() {
		return this.refprod;
	}

	public void setRefprod(String refprod) {
		this.refprod = refprod;
	}

	@Column(name = "STATUSITEXPED", nullable = false, length = 2)
	public String getStatusitexped() {
		return this.statusitexped;
	}

	public void setStatusitexped(String statusitexped) {
		this.statusitexped = statusitexped;
	}

	@Temporal(TemporalType.DATE)
	@Column(name = "DTINS", nullable = false, length = 10)
	public Date getDtins() {
		return this.dtins;
	}

	public void setDtins(Date dtins) {
		this.dtins = dtins;
	}

	@Temporal(TemporalType.TIME)
	@Column(name = "HINS", nullable = false, length = 8)
	public Date getHins() {
		return this.hins;
	}

	public void setHins(Date hins) {
		this.hins = hins;
	}

	@Column(name = "IDUSUINS", nullable = false, length = 8)
	public String getIdusuins() {
		return this.idusuins;
	}

	public void setIdusuins(String idusuins) {
		this.idusuins = idusuins;
	}

	@Temporal(TemporalType.DATE)
	@Column(name = "DTALT", length = 10)
	public Date getDtalt() {
		return this.dtalt;
	}

	public void setDtalt(Date dtalt) {
		this.dtalt = dtalt;
	}

	@Temporal(TemporalType.TIME)
	@Column(name = "HALT", length = 8)
	public Date getHalt() {
		return this.halt;
	}

	public void setHalt(Date halt) {
		this.halt = halt;
	}

	@Column(name = "IDUSUALT", length = 8)
	public String getIdusualt() {
		return this.idusualt;
	}

	public void setIdusualt(String idusualt) {
		this.idusualt = idusualt;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "eqitexpedicao")
	public Set<Eqexpedamostragem> getEqexpedamostragems() {
		return this.eqexpedamostragems;
	}

	public void setEqexpedamostragems(Set<Eqexpedamostragem> eqexpedamostragems) {
		this.eqexpedamostragems = eqexpedamostragems;
	}

}