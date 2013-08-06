package org.freedom.persist.entity;

// Generated 31/05/2013 12:00:37 by Hibernate Tools 3.4.0.CR1

import java.math.BigDecimal;
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
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 * Cpcompra generated by hbm2java
 */
@Entity
@Table(name = "CPCOMPRA")
public class Cpcompra implements java.io.Serializable {

	private CpcompraId id;
	private Ppop ppop;
	private Fnconta fnconta;
	private Cpsolicitacao cpsolicitacao;
	private Fnbanco fnbanco;
	private Fncc fncc;
	private Eqrecmerc eqrecmerc;
	private Sgfilial sgfilial;
	private Cpimportacao cpimportacao;
	private Fntipocob fntipocob;
	private Cpforneced cpforneced;
	private Fnplanopag fnplanopag;
	private Eqtipomov eqtipomov;
	private Fnplanejamento fnplanejamento;
	private Cpordcompra cpordcompra;
	private Vdtransp vdtransp;
	private int codempse;
	private short codfilialse;
	private String serie;
	private int doccompra;
	private Date dtentcompra;
	private Date dtemitcompra;
	private Date dtcompcompra;
	private BigDecimal percdesccompra;
	private BigDecimal percipicompra;
	private BigDecimal vlrprodcompra;
	private BigDecimal vlrliqcompra;
	private BigDecimal vlrcompra;
	private BigDecimal vlrdesccompra;
	private BigDecimal vlrdescitcompra;
	private BigDecimal vlradiccompra;
	private BigDecimal vlrbaseicmscompra;
	private BigDecimal vlrbaseicmsstcompra;
	private BigDecimal vlrbaseipicompra;
	private BigDecimal vlrbasepiscompra;
	private BigDecimal vlrbasecofinscompra;
	private BigDecimal vlricmscompra;
	private BigDecimal vlricmsstcompra;
	private BigDecimal vlripicompra;
	private BigDecimal vlrpiscompra;
	private BigDecimal vlrcofinscompra;
	private BigDecimal vlrfunruralcompra;
	private BigDecimal vlrfretecompra;
	private BigDecimal vlroutrascompra;
	private BigDecimal vlrisentascompra;
	private char impnotacompra;
	private char bloqcompra;
	private char emmanut;
	private Character flag;
	private char adicfretecompra;
	private Character tipofretecompra;
	private String observacao;
	private String obs01;
	private String obs02;
	private String obs03;
	private String obs04;
	private char adicadiccompra;
	private BigDecimal qtdfretecompra;
	private Character adicfretebaseicms;
	private Character adicadicbaseicms;
	private Character adicipibaseicms;
	private String chavenfecompra;
	private String statuscompra;
	private String nrodi;
	private Date dtregdi;
	private String locdesembdi;
	private String siglaufdesembdi;
	private Integer codpaisdesembdi;
	private Date dtdesembdi;
	private String identcontainer;
	private char calctrib;
	private String infcompl;
	private String numacdraw;
	private Character tipodocimp;
	private String sitdoc;
	private String obsnfe;
	private BigDecimal vlrbaseiicompra;
	private BigDecimal vlriicompra;
	private BigDecimal vlricmsdiferido;
	private BigDecimal vlricmsdevido;
	private BigDecimal vlricmscredpresum;
	private String obspag;
	private BigDecimal vlrisscompra;
	private String nroordemcompra;
	private BigDecimal vlroutrasdesp;
	private Long cnf;
	private String chavenfevalida;
	private Date dtins;
	private Date hins;
	private String idusuins;
	private Date dtalt;
	private Date halt;
	private String idusualt;
	private Set<Eqguiatraf> eqguiatrafs = new HashSet<Eqguiatraf>(0);
	private Set<Cprateio> cprateios = new HashSet<Cprateio>(0);
	private Set<Ppitop> ppitops = new HashSet<Ppitop>(0);
	private Set<Lffretecompra> lffretecompras = new HashSet<Lffretecompra>(0);
	private Set<Fnpagar> fnpagars = new HashSet<Fnpagar>(0);
	private Set<Cpitcompra> cpitcompras = new HashSet<Cpitcompra>(0);
	private Cpfretecp cpfretecp;

	public Cpcompra() {
	}

	public Cpcompra(CpcompraId id, Sgfilial sgfilial, Cpforneced cpforneced,
			Fnplanopag fnplanopag, Eqtipomov eqtipomov, int codempse,
			short codfilialse, String serie, int doccompra, Date dtentcompra,
			Date dtemitcompra, Date dtcompcompra, char impnotacompra,
			char bloqcompra, char emmanut, char adicfretecompra,
			char adicadiccompra, String statuscompra, char calctrib,
			String chavenfevalida, Date dtins, Date hins, String idusuins) {
		this.id = id;
		this.sgfilial = sgfilial;
		this.cpforneced = cpforneced;
		this.fnplanopag = fnplanopag;
		this.eqtipomov = eqtipomov;
		this.codempse = codempse;
		this.codfilialse = codfilialse;
		this.serie = serie;
		this.doccompra = doccompra;
		this.dtentcompra = dtentcompra;
		this.dtemitcompra = dtemitcompra;
		this.dtcompcompra = dtcompcompra;
		this.impnotacompra = impnotacompra;
		this.bloqcompra = bloqcompra;
		this.emmanut = emmanut;
		this.adicfretecompra = adicfretecompra;
		this.adicadiccompra = adicadiccompra;
		this.statuscompra = statuscompra;
		this.calctrib = calctrib;
		this.chavenfevalida = chavenfevalida;
		this.dtins = dtins;
		this.hins = hins;
		this.idusuins = idusuins;
	}

	public Cpcompra(CpcompraId id, Ppop ppop, Fnconta fnconta,
			Cpsolicitacao cpsolicitacao, Fnbanco fnbanco, Fncc fncc,
			Eqrecmerc eqrecmerc, Sgfilial sgfilial, Cpimportacao cpimportacao,
			Fntipocob fntipocob, Cpforneced cpforneced, Fnplanopag fnplanopag,
			Eqtipomov eqtipomov, Fnplanejamento fnplanejamento,
			Cpordcompra cpordcompra, Vdtransp vdtransp, int codempse,
			short codfilialse, String serie, int doccompra, Date dtentcompra,
			Date dtemitcompra, Date dtcompcompra, BigDecimal percdesccompra,
			BigDecimal percipicompra, BigDecimal vlrprodcompra,
			BigDecimal vlrliqcompra, BigDecimal vlrcompra,
			BigDecimal vlrdesccompra, BigDecimal vlrdescitcompra,
			BigDecimal vlradiccompra, BigDecimal vlrbaseicmscompra,
			BigDecimal vlrbaseicmsstcompra, BigDecimal vlrbaseipicompra,
			BigDecimal vlrbasepiscompra, BigDecimal vlrbasecofinscompra,
			BigDecimal vlricmscompra, BigDecimal vlricmsstcompra,
			BigDecimal vlripicompra, BigDecimal vlrpiscompra,
			BigDecimal vlrcofinscompra, BigDecimal vlrfunruralcompra,
			BigDecimal vlrfretecompra, BigDecimal vlroutrascompra,
			BigDecimal vlrisentascompra, char impnotacompra, char bloqcompra,
			char emmanut, Character flag, char adicfretecompra,
			Character tipofretecompra, String observacao, String obs01,
			String obs02, String obs03, String obs04, char adicadiccompra,
			BigDecimal qtdfretecompra, Character adicfretebaseicms,
			Character adicadicbaseicms, Character adicipibaseicms,
			String chavenfecompra, String statuscompra, String nrodi,
			Date dtregdi, String locdesembdi, String siglaufdesembdi,
			Integer codpaisdesembdi, Date dtdesembdi, String identcontainer,
			char calctrib, String infcompl, String numacdraw,
			Character tipodocimp, String sitdoc, String obsnfe,
			BigDecimal vlrbaseiicompra, BigDecimal vlriicompra,
			BigDecimal vlricmsdiferido, BigDecimal vlricmsdevido,
			BigDecimal vlricmscredpresum, String obspag,
			BigDecimal vlrisscompra, String nroordemcompra,
			BigDecimal vlroutrasdesp, Long cnf, String chavenfevalida,
			Date dtins, Date hins, String idusuins, Date dtalt, Date halt,
			String idusualt, Set<Eqguiatraf> eqguiatrafs,
			Set<Cprateio> cprateios, Set<Ppitop> ppitops,
			Set<Lffretecompra> lffretecompras, Set<Fnpagar> fnpagars,
			Set<Cpitcompra> cpitcompras, Cpfretecp cpfretecp) {
		this.id = id;
		this.ppop = ppop;
		this.fnconta = fnconta;
		this.cpsolicitacao = cpsolicitacao;
		this.fnbanco = fnbanco;
		this.fncc = fncc;
		this.eqrecmerc = eqrecmerc;
		this.sgfilial = sgfilial;
		this.cpimportacao = cpimportacao;
		this.fntipocob = fntipocob;
		this.cpforneced = cpforneced;
		this.fnplanopag = fnplanopag;
		this.eqtipomov = eqtipomov;
		this.fnplanejamento = fnplanejamento;
		this.cpordcompra = cpordcompra;
		this.vdtransp = vdtransp;
		this.codempse = codempse;
		this.codfilialse = codfilialse;
		this.serie = serie;
		this.doccompra = doccompra;
		this.dtentcompra = dtentcompra;
		this.dtemitcompra = dtemitcompra;
		this.dtcompcompra = dtcompcompra;
		this.percdesccompra = percdesccompra;
		this.percipicompra = percipicompra;
		this.vlrprodcompra = vlrprodcompra;
		this.vlrliqcompra = vlrliqcompra;
		this.vlrcompra = vlrcompra;
		this.vlrdesccompra = vlrdesccompra;
		this.vlrdescitcompra = vlrdescitcompra;
		this.vlradiccompra = vlradiccompra;
		this.vlrbaseicmscompra = vlrbaseicmscompra;
		this.vlrbaseicmsstcompra = vlrbaseicmsstcompra;
		this.vlrbaseipicompra = vlrbaseipicompra;
		this.vlrbasepiscompra = vlrbasepiscompra;
		this.vlrbasecofinscompra = vlrbasecofinscompra;
		this.vlricmscompra = vlricmscompra;
		this.vlricmsstcompra = vlricmsstcompra;
		this.vlripicompra = vlripicompra;
		this.vlrpiscompra = vlrpiscompra;
		this.vlrcofinscompra = vlrcofinscompra;
		this.vlrfunruralcompra = vlrfunruralcompra;
		this.vlrfretecompra = vlrfretecompra;
		this.vlroutrascompra = vlroutrascompra;
		this.vlrisentascompra = vlrisentascompra;
		this.impnotacompra = impnotacompra;
		this.bloqcompra = bloqcompra;
		this.emmanut = emmanut;
		this.flag = flag;
		this.adicfretecompra = adicfretecompra;
		this.tipofretecompra = tipofretecompra;
		this.observacao = observacao;
		this.obs01 = obs01;
		this.obs02 = obs02;
		this.obs03 = obs03;
		this.obs04 = obs04;
		this.adicadiccompra = adicadiccompra;
		this.qtdfretecompra = qtdfretecompra;
		this.adicfretebaseicms = adicfretebaseicms;
		this.adicadicbaseicms = adicadicbaseicms;
		this.adicipibaseicms = adicipibaseicms;
		this.chavenfecompra = chavenfecompra;
		this.statuscompra = statuscompra;
		this.nrodi = nrodi;
		this.dtregdi = dtregdi;
		this.locdesembdi = locdesembdi;
		this.siglaufdesembdi = siglaufdesembdi;
		this.codpaisdesembdi = codpaisdesembdi;
		this.dtdesembdi = dtdesembdi;
		this.identcontainer = identcontainer;
		this.calctrib = calctrib;
		this.infcompl = infcompl;
		this.numacdraw = numacdraw;
		this.tipodocimp = tipodocimp;
		this.sitdoc = sitdoc;
		this.obsnfe = obsnfe;
		this.vlrbaseiicompra = vlrbaseiicompra;
		this.vlriicompra = vlriicompra;
		this.vlricmsdiferido = vlricmsdiferido;
		this.vlricmsdevido = vlricmsdevido;
		this.vlricmscredpresum = vlricmscredpresum;
		this.obspag = obspag;
		this.vlrisscompra = vlrisscompra;
		this.nroordemcompra = nroordemcompra;
		this.vlroutrasdesp = vlroutrasdesp;
		this.cnf = cnf;
		this.chavenfevalida = chavenfevalida;
		this.dtins = dtins;
		this.hins = hins;
		this.idusuins = idusuins;
		this.dtalt = dtalt;
		this.halt = halt;
		this.idusualt = idusualt;
		this.eqguiatrafs = eqguiatrafs;
		this.cprateios = cprateios;
		this.ppitops = ppitops;
		this.lffretecompras = lffretecompras;
		this.fnpagars = fnpagars;
		this.cpitcompras = cpitcompras;
		this.cpfretecp = cpfretecp;
	}

	@EmbeddedId
	@AttributeOverrides({
			@AttributeOverride(name = "codcompra", column = @Column(name = "CODCOMPRA", nullable = false)),
			@AttributeOverride(name = "codfilial", column = @Column(name = "CODFILIAL", nullable = false)),
			@AttributeOverride(name = "codemp", column = @Column(name = "CODEMP", nullable = false)) })
	public CpcompraId getId() {
		return this.id;
	}

	public void setId(CpcompraId id) {
		this.id = id;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumns({
			@JoinColumn(name = "CODOP", referencedColumnName = "CODOP"),
			@JoinColumn(name = "SEQOP", referencedColumnName = "SEQOP"),
			@JoinColumn(name = "CODFILIALOP", referencedColumnName = "CODFILIAL"),
			@JoinColumn(name = "CODEMPOP", referencedColumnName = "CODEMP") })
	public Ppop getPpop() {
		return this.ppop;
	}

	public void setPpop(Ppop ppop) {
		this.ppop = ppop;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumns({
			@JoinColumn(name = "NUMCONTA", referencedColumnName = "NUMCONTA"),
			@JoinColumn(name = "CODFILIALCT", referencedColumnName = "CODFILIAL"),
			@JoinColumn(name = "CODEMPCT", referencedColumnName = "CODEMP") })
	public Fnconta getFnconta() {
		return this.fnconta;
	}

	public void setFnconta(Fnconta fnconta) {
		this.fnconta = fnconta;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumns({
			@JoinColumn(name = "CODSOL", referencedColumnName = "CODSOL"),
			@JoinColumn(name = "CODFILIALSOL", referencedColumnName = "CODFILIAL"),
			@JoinColumn(name = "CODEMPSOL", referencedColumnName = "CODEMP") })
	public Cpsolicitacao getCpsolicitacao() {
		return this.cpsolicitacao;
	}

	public void setCpsolicitacao(Cpsolicitacao cpsolicitacao) {
		this.cpsolicitacao = cpsolicitacao;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumns({
			@JoinColumn(name = "CODBANCO", referencedColumnName = "CODBANCO"),
			@JoinColumn(name = "CODFILIALBO", referencedColumnName = "CODFILIAL"),
			@JoinColumn(name = "CODEMPBO", referencedColumnName = "CODEMP") })
	public Fnbanco getFnbanco() {
		return this.fnbanco;
	}

	public void setFnbanco(Fnbanco fnbanco) {
		this.fnbanco = fnbanco;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumns({
			@JoinColumn(name = "CODCC", referencedColumnName = "CODCC"),
			@JoinColumn(name = "ANOCC", referencedColumnName = "ANOCC"),
			@JoinColumn(name = "CODFILIALCC", referencedColumnName = "CODFILIAL"),
			@JoinColumn(name = "CODEMPCC", referencedColumnName = "CODEMP") })
	public Fncc getFncc() {
		return this.fncc;
	}

	public void setFncc(Fncc fncc) {
		this.fncc = fncc;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumns({
			@JoinColumn(name = "TICKET", referencedColumnName = "TICKET"),
			@JoinColumn(name = "CODFILIALRM", referencedColumnName = "CODFILIAL"),
			@JoinColumn(name = "CODEMPRM", referencedColumnName = "CODEMP") })
	public Eqrecmerc getEqrecmerc() {
		return this.eqrecmerc;
	}

	public void setEqrecmerc(Eqrecmerc eqrecmerc) {
		this.eqrecmerc = eqrecmerc;
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
			@JoinColumn(name = "CODIMP", referencedColumnName = "CODIMP"),
			@JoinColumn(name = "CODFILIALIM", referencedColumnName = "CODFILIAL"),
			@JoinColumn(name = "CODEMPIM", referencedColumnName = "CODEMP") })
	public Cpimportacao getCpimportacao() {
		return this.cpimportacao;
	}

	public void setCpimportacao(Cpimportacao cpimportacao) {
		this.cpimportacao = cpimportacao;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumns({
			@JoinColumn(name = "CODTIPOCOB", referencedColumnName = "CODTIPOCOB"),
			@JoinColumn(name = "CODFILIALTC", referencedColumnName = "CODFILIAL"),
			@JoinColumn(name = "CODEMPTC", referencedColumnName = "CODEMP") })
	public Fntipocob getFntipocob() {
		return this.fntipocob;
	}

	public void setFntipocob(Fntipocob fntipocob) {
		this.fntipocob = fntipocob;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumns({
			@JoinColumn(name = "CODFOR", referencedColumnName = "CODFOR", nullable = false),
			@JoinColumn(name = "CODFILIALFR", referencedColumnName = "CODFILIAL", nullable = false),
			@JoinColumn(name = "CODEMPFR", referencedColumnName = "CODEMP", nullable = false) })
	public Cpforneced getCpforneced() {
		return this.cpforneced;
	}

	public void setCpforneced(Cpforneced cpforneced) {
		this.cpforneced = cpforneced;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumns({
			@JoinColumn(name = "CODPLANOPAG", referencedColumnName = "CODPLANOPAG", nullable = false),
			@JoinColumn(name = "CODFILIALPG", referencedColumnName = "CODFILIAL", nullable = false),
			@JoinColumn(name = "CODEMPPG", referencedColumnName = "CODEMP", nullable = false) })
	public Fnplanopag getFnplanopag() {
		return this.fnplanopag;
	}

	public void setFnplanopag(Fnplanopag fnplanopag) {
		this.fnplanopag = fnplanopag;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumns({
			@JoinColumn(name = "CODTIPOMOV", referencedColumnName = "CODTIPOMOV", nullable = false),
			@JoinColumn(name = "CODFILIALTM", referencedColumnName = "CODFILIAL", nullable = false),
			@JoinColumn(name = "CODEMPTM", referencedColumnName = "CODEMP", nullable = false) })
	public Eqtipomov getEqtipomov() {
		return this.eqtipomov;
	}

	public void setEqtipomov(Eqtipomov eqtipomov) {
		this.eqtipomov = eqtipomov;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumns({
			@JoinColumn(name = "CODPLAN", referencedColumnName = "CODPLAN"),
			@JoinColumn(name = "CODFILIALPN", referencedColumnName = "CODFILIAL"),
			@JoinColumn(name = "CODEMPPN", referencedColumnName = "CODEMP") })
	public Fnplanejamento getFnplanejamento() {
		return this.fnplanejamento;
	}

	public void setFnplanejamento(Fnplanejamento fnplanejamento) {
		this.fnplanejamento = fnplanejamento;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumns({
			@JoinColumn(name = "CODEMPOC", referencedColumnName = "CODEMP"),
			@JoinColumn(name = "CODFILIALOC", referencedColumnName = "CODFILIAL"),
			@JoinColumn(name = "CODORDCP", referencedColumnName = "CODORDCP") })
	public Cpordcompra getCpordcompra() {
		return this.cpordcompra;
	}

	public void setCpordcompra(Cpordcompra cpordcompra) {
		this.cpordcompra = cpordcompra;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumns({
			@JoinColumn(name = "CODTRAN", referencedColumnName = "CODTRAN"),
			@JoinColumn(name = "CODFILIALTN", referencedColumnName = "CODFILIAL"),
			@JoinColumn(name = "CODEMPTN", referencedColumnName = "CODEMP") })
	public Vdtransp getVdtransp() {
		return this.vdtransp;
	}

	public void setVdtransp(Vdtransp vdtransp) {
		this.vdtransp = vdtransp;
	}

	@Column(name = "CODEMPSE", nullable = false)
	public int getCodempse() {
		return this.codempse;
	}

	public void setCodempse(int codempse) {
		this.codempse = codempse;
	}

	@Column(name = "CODFILIALSE", nullable = false)
	public short getCodfilialse() {
		return this.codfilialse;
	}

	public void setCodfilialse(short codfilialse) {
		this.codfilialse = codfilialse;
	}

	@Column(name = "SERIE", nullable = false, length = 4)
	public String getSerie() {
		return this.serie;
	}

	public void setSerie(String serie) {
		this.serie = serie;
	}

	@Column(name = "DOCCOMPRA", nullable = false)
	public int getDoccompra() {
		return this.doccompra;
	}

	public void setDoccompra(int doccompra) {
		this.doccompra = doccompra;
	}

	@Temporal(TemporalType.DATE)
	@Column(name = "DTENTCOMPRA", nullable = false, length = 10)
	public Date getDtentcompra() {
		return this.dtentcompra;
	}

	public void setDtentcompra(Date dtentcompra) {
		this.dtentcompra = dtentcompra;
	}

	@Temporal(TemporalType.DATE)
	@Column(name = "DTEMITCOMPRA", nullable = false, length = 10)
	public Date getDtemitcompra() {
		return this.dtemitcompra;
	}

	public void setDtemitcompra(Date dtemitcompra) {
		this.dtemitcompra = dtemitcompra;
	}

	@Temporal(TemporalType.DATE)
	@Column(name = "DTCOMPCOMPRA", nullable = false, length = 10)
	public Date getDtcompcompra() {
		return this.dtcompcompra;
	}

	public void setDtcompcompra(Date dtcompcompra) {
		this.dtcompcompra = dtcompcompra;
	}

	@Column(name = "PERCDESCCOMPRA", precision = 15, scale = 5)
	public BigDecimal getPercdesccompra() {
		return this.percdesccompra;
	}

	public void setPercdesccompra(BigDecimal percdesccompra) {
		this.percdesccompra = percdesccompra;
	}

	@Column(name = "PERCIPICOMPRA", precision = 6)
	public BigDecimal getPercipicompra() {
		return this.percipicompra;
	}

	public void setPercipicompra(BigDecimal percipicompra) {
		this.percipicompra = percipicompra;
	}

	@Column(name = "VLRPRODCOMPRA", precision = 15, scale = 5)
	public BigDecimal getVlrprodcompra() {
		return this.vlrprodcompra;
	}

	public void setVlrprodcompra(BigDecimal vlrprodcompra) {
		this.vlrprodcompra = vlrprodcompra;
	}

	@Column(name = "VLRLIQCOMPRA", precision = 15, scale = 5)
	public BigDecimal getVlrliqcompra() {
		return this.vlrliqcompra;
	}

	public void setVlrliqcompra(BigDecimal vlrliqcompra) {
		this.vlrliqcompra = vlrliqcompra;
	}

	@Column(name = "VLRCOMPRA", precision = 15, scale = 5)
	public BigDecimal getVlrcompra() {
		return this.vlrcompra;
	}

	public void setVlrcompra(BigDecimal vlrcompra) {
		this.vlrcompra = vlrcompra;
	}

	@Column(name = "VLRDESCCOMPRA", precision = 15, scale = 5)
	public BigDecimal getVlrdesccompra() {
		return this.vlrdesccompra;
	}

	public void setVlrdesccompra(BigDecimal vlrdesccompra) {
		this.vlrdesccompra = vlrdesccompra;
	}

	@Column(name = "VLRDESCITCOMPRA", precision = 15, scale = 5)
	public BigDecimal getVlrdescitcompra() {
		return this.vlrdescitcompra;
	}

	public void setVlrdescitcompra(BigDecimal vlrdescitcompra) {
		this.vlrdescitcompra = vlrdescitcompra;
	}

	@Column(name = "VLRADICCOMPRA", precision = 15, scale = 5)
	public BigDecimal getVlradiccompra() {
		return this.vlradiccompra;
	}

	public void setVlradiccompra(BigDecimal vlradiccompra) {
		this.vlradiccompra = vlradiccompra;
	}

	@Column(name = "VLRBASEICMSCOMPRA", precision = 15, scale = 5)
	public BigDecimal getVlrbaseicmscompra() {
		return this.vlrbaseicmscompra;
	}

	public void setVlrbaseicmscompra(BigDecimal vlrbaseicmscompra) {
		this.vlrbaseicmscompra = vlrbaseicmscompra;
	}

	@Column(name = "VLRBASEICMSSTCOMPRA", precision = 15, scale = 5)
	public BigDecimal getVlrbaseicmsstcompra() {
		return this.vlrbaseicmsstcompra;
	}

	public void setVlrbaseicmsstcompra(BigDecimal vlrbaseicmsstcompra) {
		this.vlrbaseicmsstcompra = vlrbaseicmsstcompra;
	}

	@Column(name = "VLRBASEIPICOMPRA", precision = 15, scale = 5)
	public BigDecimal getVlrbaseipicompra() {
		return this.vlrbaseipicompra;
	}

	public void setVlrbaseipicompra(BigDecimal vlrbaseipicompra) {
		this.vlrbaseipicompra = vlrbaseipicompra;
	}

	@Column(name = "VLRBASEPISCOMPRA", precision = 15, scale = 5)
	public BigDecimal getVlrbasepiscompra() {
		return this.vlrbasepiscompra;
	}

	public void setVlrbasepiscompra(BigDecimal vlrbasepiscompra) {
		this.vlrbasepiscompra = vlrbasepiscompra;
	}

	@Column(name = "VLRBASECOFINSCOMPRA", precision = 15, scale = 5)
	public BigDecimal getVlrbasecofinscompra() {
		return this.vlrbasecofinscompra;
	}

	public void setVlrbasecofinscompra(BigDecimal vlrbasecofinscompra) {
		this.vlrbasecofinscompra = vlrbasecofinscompra;
	}

	@Column(name = "VLRICMSCOMPRA", precision = 15, scale = 5)
	public BigDecimal getVlricmscompra() {
		return this.vlricmscompra;
	}

	public void setVlricmscompra(BigDecimal vlricmscompra) {
		this.vlricmscompra = vlricmscompra;
	}

	@Column(name = "VLRICMSSTCOMPRA", precision = 15, scale = 5)
	public BigDecimal getVlricmsstcompra() {
		return this.vlricmsstcompra;
	}

	public void setVlricmsstcompra(BigDecimal vlricmsstcompra) {
		this.vlricmsstcompra = vlricmsstcompra;
	}

	@Column(name = "VLRIPICOMPRA", precision = 15, scale = 5)
	public BigDecimal getVlripicompra() {
		return this.vlripicompra;
	}

	public void setVlripicompra(BigDecimal vlripicompra) {
		this.vlripicompra = vlripicompra;
	}

	@Column(name = "VLRPISCOMPRA", precision = 15, scale = 5)
	public BigDecimal getVlrpiscompra() {
		return this.vlrpiscompra;
	}

	public void setVlrpiscompra(BigDecimal vlrpiscompra) {
		this.vlrpiscompra = vlrpiscompra;
	}

	@Column(name = "VLRCOFINSCOMPRA", precision = 15, scale = 5)
	public BigDecimal getVlrcofinscompra() {
		return this.vlrcofinscompra;
	}

	public void setVlrcofinscompra(BigDecimal vlrcofinscompra) {
		this.vlrcofinscompra = vlrcofinscompra;
	}

	@Column(name = "VLRFUNRURALCOMPRA", precision = 15, scale = 5)
	public BigDecimal getVlrfunruralcompra() {
		return this.vlrfunruralcompra;
	}

	public void setVlrfunruralcompra(BigDecimal vlrfunruralcompra) {
		this.vlrfunruralcompra = vlrfunruralcompra;
	}

	@Column(name = "VLRFRETECOMPRA", precision = 15, scale = 5)
	public BigDecimal getVlrfretecompra() {
		return this.vlrfretecompra;
	}

	public void setVlrfretecompra(BigDecimal vlrfretecompra) {
		this.vlrfretecompra = vlrfretecompra;
	}

	@Column(name = "VLROUTRASCOMPRA", precision = 15, scale = 5)
	public BigDecimal getVlroutrascompra() {
		return this.vlroutrascompra;
	}

	public void setVlroutrascompra(BigDecimal vlroutrascompra) {
		this.vlroutrascompra = vlroutrascompra;
	}

	@Column(name = "VLRISENTASCOMPRA", precision = 15, scale = 5)
	public BigDecimal getVlrisentascompra() {
		return this.vlrisentascompra;
	}

	public void setVlrisentascompra(BigDecimal vlrisentascompra) {
		this.vlrisentascompra = vlrisentascompra;
	}

	@Column(name = "IMPNOTACOMPRA", nullable = false, length = 1)
	public char getImpnotacompra() {
		return this.impnotacompra;
	}

	public void setImpnotacompra(char impnotacompra) {
		this.impnotacompra = impnotacompra;
	}

	@Column(name = "BLOQCOMPRA", nullable = false, length = 1)
	public char getBloqcompra() {
		return this.bloqcompra;
	}

	public void setBloqcompra(char bloqcompra) {
		this.bloqcompra = bloqcompra;
	}

	@Column(name = "EMMANUT", nullable = false, length = 1)
	public char getEmmanut() {
		return this.emmanut;
	}

	public void setEmmanut(char emmanut) {
		this.emmanut = emmanut;
	}

	@Column(name = "FLAG", length = 1)
	public Character getFlag() {
		return this.flag;
	}

	public void setFlag(Character flag) {
		this.flag = flag;
	}

	@Column(name = "ADICFRETECOMPRA", nullable = false, length = 1)
	public char getAdicfretecompra() {
		return this.adicfretecompra;
	}

	public void setAdicfretecompra(char adicfretecompra) {
		this.adicfretecompra = adicfretecompra;
	}

	@Column(name = "TIPOFRETECOMPRA", length = 1)
	public Character getTipofretecompra() {
		return this.tipofretecompra;
	}

	public void setTipofretecompra(Character tipofretecompra) {
		this.tipofretecompra = tipofretecompra;
	}

	@Column(name = "OBSERVACAO", length = 10000)
	public String getObservacao() {
		return this.observacao;
	}

	public void setObservacao(String observacao) {
		this.observacao = observacao;
	}

	@Column(name = "OBS01", length = 1024)
	public String getObs01() {
		return this.obs01;
	}

	public void setObs01(String obs01) {
		this.obs01 = obs01;
	}

	@Column(name = "OBS02", length = 1024)
	public String getObs02() {
		return this.obs02;
	}

	public void setObs02(String obs02) {
		this.obs02 = obs02;
	}

	@Column(name = "OBS03", length = 1024)
	public String getObs03() {
		return this.obs03;
	}

	public void setObs03(String obs03) {
		this.obs03 = obs03;
	}

	@Column(name = "OBS04", length = 1024)
	public String getObs04() {
		return this.obs04;
	}

	public void setObs04(String obs04) {
		this.obs04 = obs04;
	}

	@Column(name = "ADICADICCOMPRA", nullable = false, length = 1)
	public char getAdicadiccompra() {
		return this.adicadiccompra;
	}

	public void setAdicadiccompra(char adicadiccompra) {
		this.adicadiccompra = adicadiccompra;
	}

	@Column(name = "QTDFRETECOMPRA", precision = 15, scale = 5)
	public BigDecimal getQtdfretecompra() {
		return this.qtdfretecompra;
	}

	public void setQtdfretecompra(BigDecimal qtdfretecompra) {
		this.qtdfretecompra = qtdfretecompra;
	}

	@Column(name = "ADICFRETEBASEICMS", length = 1)
	public Character getAdicfretebaseicms() {
		return this.adicfretebaseicms;
	}

	public void setAdicfretebaseicms(Character adicfretebaseicms) {
		this.adicfretebaseicms = adicfretebaseicms;
	}

	@Column(name = "ADICADICBASEICMS", length = 1)
	public Character getAdicadicbaseicms() {
		return this.adicadicbaseicms;
	}

	public void setAdicadicbaseicms(Character adicadicbaseicms) {
		this.adicadicbaseicms = adicadicbaseicms;
	}

	@Column(name = "ADICIPIBASEICMS", length = 1)
	public Character getAdicipibaseicms() {
		return this.adicipibaseicms;
	}

	public void setAdicipibaseicms(Character adicipibaseicms) {
		this.adicipibaseicms = adicipibaseicms;
	}

	@Column(name = "CHAVENFECOMPRA", length = 44)
	public String getChavenfecompra() {
		return this.chavenfecompra;
	}

	public void setChavenfecompra(String chavenfecompra) {
		this.chavenfecompra = chavenfecompra;
	}

	@Column(name = "STATUSCOMPRA", nullable = false, length = 2)
	public String getStatuscompra() {
		return this.statuscompra;
	}

	public void setStatuscompra(String statuscompra) {
		this.statuscompra = statuscompra;
	}

	@Column(name = "NRODI", length = 10)
	public String getNrodi() {
		return this.nrodi;
	}

	public void setNrodi(String nrodi) {
		this.nrodi = nrodi;
	}

	@Temporal(TemporalType.DATE)
	@Column(name = "DTREGDI", length = 10)
	public Date getDtregdi() {
		return this.dtregdi;
	}

	public void setDtregdi(Date dtregdi) {
		this.dtregdi = dtregdi;
	}

	@Column(name = "LOCDESEMBDI", length = 60)
	public String getLocdesembdi() {
		return this.locdesembdi;
	}

	public void setLocdesembdi(String locdesembdi) {
		this.locdesembdi = locdesembdi;
	}

	@Column(name = "SIGLAUFDESEMBDI", length = 2)
	public String getSiglaufdesembdi() {
		return this.siglaufdesembdi;
	}

	public void setSiglaufdesembdi(String siglaufdesembdi) {
		this.siglaufdesembdi = siglaufdesembdi;
	}

	@Column(name = "CODPAISDESEMBDI")
	public Integer getCodpaisdesembdi() {
		return this.codpaisdesembdi;
	}

	public void setCodpaisdesembdi(Integer codpaisdesembdi) {
		this.codpaisdesembdi = codpaisdesembdi;
	}

	@Temporal(TemporalType.DATE)
	@Column(name = "DTDESEMBDI", length = 10)
	public Date getDtdesembdi() {
		return this.dtdesembdi;
	}

	public void setDtdesembdi(Date dtdesembdi) {
		this.dtdesembdi = dtdesembdi;
	}

	@Column(name = "IDENTCONTAINER", length = 20)
	public String getIdentcontainer() {
		return this.identcontainer;
	}

	public void setIdentcontainer(String identcontainer) {
		this.identcontainer = identcontainer;
	}

	@Column(name = "CALCTRIB", nullable = false, length = 1)
	public char getCalctrib() {
		return this.calctrib;
	}

	public void setCalctrib(char calctrib) {
		this.calctrib = calctrib;
	}

	@Column(name = "INFCOMPL", length = 10000)
	public String getInfcompl() {
		return this.infcompl;
	}

	public void setInfcompl(String infcompl) {
		this.infcompl = infcompl;
	}

	@Column(name = "NUMACDRAW", length = 20)
	public String getNumacdraw() {
		return this.numacdraw;
	}

	public void setNumacdraw(String numacdraw) {
		this.numacdraw = numacdraw;
	}

	@Column(name = "TIPODOCIMP", length = 1)
	public Character getTipodocimp() {
		return this.tipodocimp;
	}

	public void setTipodocimp(Character tipodocimp) {
		this.tipodocimp = tipodocimp;
	}

	@Column(name = "SITDOC", length = 2)
	public String getSitdoc() {
		return this.sitdoc;
	}

	public void setSitdoc(String sitdoc) {
		this.sitdoc = sitdoc;
	}

	@Column(name = "OBSNFE", length = 10000)
	public String getObsnfe() {
		return this.obsnfe;
	}

	public void setObsnfe(String obsnfe) {
		this.obsnfe = obsnfe;
	}

	@Column(name = "VLRBASEIICOMPRA", precision = 15, scale = 5)
	public BigDecimal getVlrbaseiicompra() {
		return this.vlrbaseiicompra;
	}

	public void setVlrbaseiicompra(BigDecimal vlrbaseiicompra) {
		this.vlrbaseiicompra = vlrbaseiicompra;
	}

	@Column(name = "VLRIICOMPRA", precision = 15, scale = 5)
	public BigDecimal getVlriicompra() {
		return this.vlriicompra;
	}

	public void setVlriicompra(BigDecimal vlriicompra) {
		this.vlriicompra = vlriicompra;
	}

	@Column(name = "VLRICMSDIFERIDO", precision = 15, scale = 5)
	public BigDecimal getVlricmsdiferido() {
		return this.vlricmsdiferido;
	}

	public void setVlricmsdiferido(BigDecimal vlricmsdiferido) {
		this.vlricmsdiferido = vlricmsdiferido;
	}

	@Column(name = "VLRICMSDEVIDO", precision = 15, scale = 5)
	public BigDecimal getVlricmsdevido() {
		return this.vlricmsdevido;
	}

	public void setVlricmsdevido(BigDecimal vlricmsdevido) {
		this.vlricmsdevido = vlricmsdevido;
	}

	@Column(name = "VLRICMSCREDPRESUM", precision = 15, scale = 5)
	public BigDecimal getVlricmscredpresum() {
		return this.vlricmscredpresum;
	}

	public void setVlricmscredpresum(BigDecimal vlricmscredpresum) {
		this.vlricmscredpresum = vlricmscredpresum;
	}

	@Column(name = "OBSPAG", length = 250)
	public String getObspag() {
		return this.obspag;
	}

	public void setObspag(String obspag) {
		this.obspag = obspag;
	}

	@Column(name = "VLRISSCOMPRA", precision = 15, scale = 5)
	public BigDecimal getVlrisscompra() {
		return this.vlrisscompra;
	}

	public void setVlrisscompra(BigDecimal vlrisscompra) {
		this.vlrisscompra = vlrisscompra;
	}

	@Column(name = "NROORDEMCOMPRA", length = 20)
	public String getNroordemcompra() {
		return this.nroordemcompra;
	}

	public void setNroordemcompra(String nroordemcompra) {
		this.nroordemcompra = nroordemcompra;
	}

	@Column(name = "VLROUTRASDESP", precision = 15, scale = 5)
	public BigDecimal getVlroutrasdesp() {
		return this.vlroutrasdesp;
	}

	public void setVlroutrasdesp(BigDecimal vlroutrasdesp) {
		this.vlroutrasdesp = vlroutrasdesp;
	}

	@Column(name = "CNF")
	public Long getCnf() {
		return this.cnf;
	}

	public void setCnf(Long cnf) {
		this.cnf = cnf;
	}

	@Column(name = "CHAVENFEVALIDA", nullable = false, length = 20)
	public String getChavenfevalida() {
		return this.chavenfevalida;
	}

	public void setChavenfevalida(String chavenfevalida) {
		this.chavenfevalida = chavenfevalida;
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

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "cpcompra")
	public Set<Eqguiatraf> getEqguiatrafs() {
		return this.eqguiatrafs;
	}

	public void setEqguiatrafs(Set<Eqguiatraf> eqguiatrafs) {
		this.eqguiatrafs = eqguiatrafs;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "cpcompra")
	public Set<Cprateio> getCprateios() {
		return this.cprateios;
	}

	public void setCprateios(Set<Cprateio> cprateios) {
		this.cprateios = cprateios;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "cpcompra")
	public Set<Ppitop> getPpitops() {
		return this.ppitops;
	}

	public void setPpitops(Set<Ppitop> ppitops) {
		this.ppitops = ppitops;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "cpcompra")
	public Set<Lffretecompra> getLffretecompras() {
		return this.lffretecompras;
	}

	public void setLffretecompras(Set<Lffretecompra> lffretecompras) {
		this.lffretecompras = lffretecompras;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "cpcompra")
	public Set<Fnpagar> getFnpagars() {
		return this.fnpagars;
	}

	public void setFnpagars(Set<Fnpagar> fnpagars) {
		this.fnpagars = fnpagars;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "cpcompra")
	public Set<Cpitcompra> getCpitcompras() {
		return this.cpitcompras;
	}

	public void setCpitcompras(Set<Cpitcompra> cpitcompras) {
		this.cpitcompras = cpitcompras;
	}

	@OneToOne(fetch = FetchType.LAZY, mappedBy = "cpcompra")
	public Cpfretecp getCpfretecp() {
		return this.cpfretecp;
	}

	public void setCpfretecp(Cpfretecp cpfretecp) {
		this.cpfretecp = cpfretecp;
	}

}