package org.freedom.persist.entity;

// Generated 12/05/2014 09:11:34 by Hibernate Tools 4.0.0

import java.math.BigDecimal;
import java.util.Date;
//import java.util.HashSet;
//import java.util.Set;
import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.JoinColumns;
import javax.persistence.ManyToOne;
//import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 * Eqitrecmerc generated by hbm2java
 */
@Entity
@Table(name = "EQITRECMERC")
public class Eqitrecmerc implements java.io.Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private EqitrecmercId id;
	private Eqproduto eqproduto;
	private Sgfilial sgfilial;
	private Eqserie eqserie;
	private Eqrecmerc eqrecmerc;
	private Eqprocrecmerc eqprocrecmerc;
	private String descitrecmerc;
	private char garantia;
	private String refprod;
	private BigDecimal mediaamostragem;
	private short rendaamostragem;
	private BigDecimal qtditrecmerc;
	private String statusitrecmerc;
	private String defeitoitrecmerc;
	private String condicoesitrecmerc;
	private String servicosolicitrecmerc;
	private String obsitrecmerc;
	private String placaveiculo;
	private String nrofrota;
	private String garagem;
	private char emmanut;
	private Date dtins;
	private Date hins;
	private String idusuins;
	private Date dtalt;
	private Date halt;
	private String idusualt;
	/*private Set eqrecamostragems = new HashSet(0);
	private Set eqitrecmercitoses = new HashSet(0);
	private Set eqmovseries = new HashSet(0);
	private Set eqitrecmercitcps = new HashSet(0);
	private Set eqitrecmercseries = new HashSet(0);
*/
	public Eqitrecmerc() {
	}

	public Eqitrecmerc(EqitrecmercId id, Eqproduto eqproduto,
			Sgfilial sgfilial, Eqserie eqserie, Eqrecmerc eqrecmerc,
			Eqprocrecmerc eqprocrecmerc, char garantia, String refprod,
			BigDecimal mediaamostragem, short rendaamostragem,
			BigDecimal qtditrecmerc, String statusitrecmerc, char emmanut,
			Date dtins, Date hins, String idusuins) {
		this.id = id;
		this.eqproduto = eqproduto;
		this.sgfilial = sgfilial;
		this.eqserie = eqserie;
		this.eqrecmerc = eqrecmerc;
		this.eqprocrecmerc = eqprocrecmerc;
		this.garantia = garantia;
		this.refprod = refprod;
		this.mediaamostragem = mediaamostragem;
		this.rendaamostragem = rendaamostragem;
		this.qtditrecmerc = qtditrecmerc;
		this.statusitrecmerc = statusitrecmerc;
		this.emmanut = emmanut;
		this.dtins = dtins;
		this.hins = hins;
		this.idusuins = idusuins;
	}

	public Eqitrecmerc(EqitrecmercId id, Eqproduto eqproduto,
			Sgfilial sgfilial, Eqserie eqserie, Eqrecmerc eqrecmerc,
			Eqprocrecmerc eqprocrecmerc, String descitrecmerc, char garantia,
			String refprod, BigDecimal mediaamostragem, short rendaamostragem,
			BigDecimal qtditrecmerc, String statusitrecmerc,
			String defeitoitrecmerc, String condicoesitrecmerc,
			String servicosolicitrecmerc, String obsitrecmerc,
			String placaveiculo, String nrofrota, String garagem, char emmanut,
			Date dtins, Date hins, String idusuins, Date dtalt, Date halt,
			String idusualt
			/*, Set eqrecamostragems, Set eqitrecmercitoses,
			Set eqmovseries, Set eqitrecmercitcps, Set eqitrecmercseries*/
			) {
		this.id = id;
		this.eqproduto = eqproduto;
		this.sgfilial = sgfilial;
		this.eqserie = eqserie;
		this.eqrecmerc = eqrecmerc;
		this.eqprocrecmerc = eqprocrecmerc;
		this.descitrecmerc = descitrecmerc;
		this.garantia = garantia;
		this.refprod = refprod;
		this.mediaamostragem = mediaamostragem;
		this.rendaamostragem = rendaamostragem;
		this.qtditrecmerc = qtditrecmerc;
		this.statusitrecmerc = statusitrecmerc;
		this.defeitoitrecmerc = defeitoitrecmerc;
		this.condicoesitrecmerc = condicoesitrecmerc;
		this.servicosolicitrecmerc = servicosolicitrecmerc;
		this.obsitrecmerc = obsitrecmerc;
		this.placaveiculo = placaveiculo;
		this.nrofrota = nrofrota;
		this.garagem = garagem;
		this.emmanut = emmanut;
		this.dtins = dtins;
		this.hins = hins;
		this.idusuins = idusuins;
		this.dtalt = dtalt;
		this.halt = halt;
		this.idusualt = idusualt;
		/*this.eqrecamostragems = eqrecamostragems;
		this.eqitrecmercitoses = eqitrecmercitoses;
		this.eqmovseries = eqmovseries;
		this.eqitrecmercitcps = eqitrecmercitcps;
		this.eqitrecmercseries = eqitrecmercseries;*/
	}

	@EmbeddedId
	@AttributeOverrides({
			@AttributeOverride(name = "ticket", column = @Column(name = "TICKET", nullable = false)),
			@AttributeOverride(name = "coditrecmerc", column = @Column(name = "CODITRECMERC", nullable = false)),
			@AttributeOverride(name = "codfilial", column = @Column(name = "CODFILIAL", nullable = false)),
			@AttributeOverride(name = "codemp", column = @Column(name = "CODEMP", nullable = false)) })
	public EqitrecmercId getId() {
		return this.id;
	}

	public void setId(EqitrecmercId id) {
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
			@JoinColumn(name = "CODFILIAL", referencedColumnName = "CODFILIAL", nullable = false, insertable = false, updatable = false),
			@JoinColumn(name = "CODEMP", referencedColumnName = "CODEMP", nullable = false, insertable = false, updatable = false) })
	public Sgfilial getSgfilial() {
		return this.sgfilial;
	}

	public void setSgfilial(Sgfilial sgfilial) {
		this.sgfilial = sgfilial;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumns({
			@JoinColumn(name = "NUMSERIE", referencedColumnName = "NUMSERIE", insertable = false, updatable = false),
			@JoinColumn(name = "CODPROD", referencedColumnName = "CODPROD", insertable = false, updatable = false),
			@JoinColumn(name = "CODFILIALNS", referencedColumnName = "CODFILIAL", insertable = false, updatable = false),
			@JoinColumn(name = "CODEMPNS", referencedColumnName = "CODEMP", insertable = false, updatable = false) })
	public Eqserie getEqserie() {
		return this.eqserie;
	}

	public void setEqserie(Eqserie eqserie) {
		this.eqserie = eqserie;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumns({
			@JoinColumn(name = "TICKET", referencedColumnName = "TICKET", nullable = false, insertable = false, updatable = false),
			@JoinColumn(name = "CODFILIAL", referencedColumnName = "CODFILIAL", nullable = false, insertable = false, updatable = false),
			@JoinColumn(name = "CODEMP", referencedColumnName = "CODEMP", nullable = false, insertable = false, updatable = false) })
	public Eqrecmerc getEqrecmerc() {
		return this.eqrecmerc;
	}

	public void setEqrecmerc(Eqrecmerc eqrecmerc) {
		this.eqrecmerc = eqrecmerc;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumns({
			@JoinColumn(name = "CODTIPORECMERC", referencedColumnName = "CODTIPORECMERC", nullable = false),
			@JoinColumn(name = "CODPROCRECMERC", referencedColumnName = "CODPROCRECMERC", nullable = false),
			@JoinColumn(name = "CODFILIALTP", referencedColumnName = "CODFILIAL", nullable = false),
			@JoinColumn(name = "CODEMPTP", referencedColumnName = "CODEMP", nullable = false) })
	public Eqprocrecmerc getEqprocrecmerc() {
		return this.eqprocrecmerc;
	}

	public void setEqprocrecmerc(Eqprocrecmerc eqprocrecmerc) {
		this.eqprocrecmerc = eqprocrecmerc;
	}

	@Column(name = "DESCITRECMERC", length = 1000)
	public String getDescitrecmerc() {
		return this.descitrecmerc;
	}

	public void setDescitrecmerc(String descitrecmerc) {
		this.descitrecmerc = descitrecmerc;
	}

	@Column(name = "GARANTIA", nullable = false, length = 1)
	public char getGarantia() {
		return this.garantia;
	}

	public void setGarantia(char garantia) {
		this.garantia = garantia;
	}

	@Column(name = "REFPROD", nullable = false, length = 20)
	public String getRefprod() {
		return this.refprod;
	}

	public void setRefprod(String refprod) {
		this.refprod = refprod;
	}

	@Column(name = "MEDIAAMOSTRAGEM", nullable = false, precision = 15, scale = 5)
	public BigDecimal getMediaamostragem() {
		return this.mediaamostragem;
	}

	public void setMediaamostragem(BigDecimal mediaamostragem) {
		this.mediaamostragem = mediaamostragem;
	}

	@Column(name = "RENDAAMOSTRAGEM", nullable = false)
	public short getRendaamostragem() {
		return this.rendaamostragem;
	}

	public void setRendaamostragem(short rendaamostragem) {
		this.rendaamostragem = rendaamostragem;
	}

	@Column(name = "QTDITRECMERC", nullable = false, precision = 15, scale = 5)
	public BigDecimal getQtditrecmerc() {
		return this.qtditrecmerc;
	}

	public void setQtditrecmerc(BigDecimal qtditrecmerc) {
		this.qtditrecmerc = qtditrecmerc;
	}

	@Column(name = "STATUSITRECMERC", nullable = false, length = 2)
	public String getStatusitrecmerc() {
		return this.statusitrecmerc;
	}

	public void setStatusitrecmerc(String statusitrecmerc) {
		this.statusitrecmerc = statusitrecmerc;
	}

	@Column(name = "DEFEITOITRECMERC", length = 1000)
	public String getDefeitoitrecmerc() {
		return this.defeitoitrecmerc;
	}

	public void setDefeitoitrecmerc(String defeitoitrecmerc) {
		this.defeitoitrecmerc = defeitoitrecmerc;
	}

	@Column(name = "CONDICOESITRECMERC", length = 1000)
	public String getCondicoesitrecmerc() {
		return this.condicoesitrecmerc;
	}

	public void setCondicoesitrecmerc(String condicoesitrecmerc) {
		this.condicoesitrecmerc = condicoesitrecmerc;
	}

	@Column(name = "SERVICOSOLICITRECMERC", length = 1000)
	public String getServicosolicitrecmerc() {
		return this.servicosolicitrecmerc;
	}

	public void setServicosolicitrecmerc(String servicosolicitrecmerc) {
		this.servicosolicitrecmerc = servicosolicitrecmerc;
	}

	@Column(name = "OBSITRECMERC", length = 1000)
	public String getObsitrecmerc() {
		return this.obsitrecmerc;
	}

	public void setObsitrecmerc(String obsitrecmerc) {
		this.obsitrecmerc = obsitrecmerc;
	}

	@Column(name = "PLACAVEICULO", length = 10)
	public String getPlacaveiculo() {
		return this.placaveiculo;
	}

	public void setPlacaveiculo(String placaveiculo) {
		this.placaveiculo = placaveiculo;
	}

	@Column(name = "NROFROTA", length = 20)
	public String getNrofrota() {
		return this.nrofrota;
	}

	public void setNrofrota(String nrofrota) {
		this.nrofrota = nrofrota;
	}

	@Column(name = "GARAGEM", length = 20)
	public String getGaragem() {
		return this.garagem;
	}

	public void setGaragem(String garagem) {
		this.garagem = garagem;
	}

	@Column(name = "EMMANUT", nullable = false, length = 1)
	public char getEmmanut() {
		return this.emmanut;
	}

	public void setEmmanut(char emmanut) {
		this.emmanut = emmanut;
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

	/*@OneToMany(fetch = FetchType.LAZY, mappedBy = "eqitrecmerc")
	public Set getEqrecamostragems() {
		return this.eqrecamostragems;
	}

	public void setEqrecamostragems(Set eqrecamostragems) {
		this.eqrecamostragems = eqrecamostragems;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "eqitrecmerc")
	public Set getEqitrecmercitoses() {
		return this.eqitrecmercitoses;
	}

	public void setEqitrecmercitoses(Set eqitrecmercitoses) {
		this.eqitrecmercitoses = eqitrecmercitoses;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "eqitrecmerc")
	public Set getEqmovseries() {
		return this.eqmovseries;
	}

	public void setEqmovseries(Set eqmovseries) {
		this.eqmovseries = eqmovseries;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "eqitrecmerc")
	public Set getEqitrecmercitcps() {
		return this.eqitrecmercitcps;
	}

	public void setEqitrecmercitcps(Set eqitrecmercitcps) {
		this.eqitrecmercitcps = eqitrecmercitcps;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "eqitrecmerc")
	public Set getEqitrecmercseries() {
		return this.eqitrecmercseries;
	}

	public void setEqitrecmercseries(Set eqitrecmercseries) {
		this.eqitrecmercseries = eqitrecmercseries;
	}
*/
}
