package org.freedom.persist.entity;

// Generated 20/11/2013 10:59:59 by Hibernate Tools 4.0.0

import java.util.Date;

/**
 * Eqprevestoqlog generated by hbm2java
 */
public class Eqprevestoqlog implements java.io.Serializable {

	private long id;
	private Integer codemp;
	private Short codfilial;
	private Date dtini;
	private Date dtfim;
	private Integer codempgp;
	private Short codfilialgp;
	private String codgrup;
	private Integer codemppd;
	private Short codfilialpd;
	private Integer codprod;
	private char ordem;
	private char mercadoriaRevenda;
	private char materiaPrima;
	private char emProcesso;
	private char outros;
	private char subProduto;
	private char equipamento;
	private char materialConsumo;
	private char produtoIntermed;
	private char produtoAcabado;
	private char embalagem;
	private char outrosInsumos;
	private Date dtins;
	private Date hins;
	private String idusuins;
	private Date dtalt;
	private Date halt;
	private String idusualt;

	public Eqprevestoqlog() {
	}

	public Eqprevestoqlog(long id, Date dtini, Date dtfim, char ordem,
			char mercadoriaRevenda, char materiaPrima, char emProcesso,
			char outros, char subProduto, char equipamento,
			char materialConsumo, char produtoIntermed, char produtoAcabado,
			char embalagem, char outrosInsumos, Date dtins, Date hins,
			String idusuins, Date dtalt, Date halt, String idusualt) {
		this.id = id;
		this.dtini = dtini;
		this.dtfim = dtfim;
		this.ordem = ordem;
		this.mercadoriaRevenda = mercadoriaRevenda;
		this.materiaPrima = materiaPrima;
		this.emProcesso = emProcesso;
		this.outros = outros;
		this.subProduto = subProduto;
		this.equipamento = equipamento;
		this.materialConsumo = materialConsumo;
		this.produtoIntermed = produtoIntermed;
		this.produtoAcabado = produtoAcabado;
		this.embalagem = embalagem;
		this.outrosInsumos = outrosInsumos;
		this.dtins = dtins;
		this.hins = hins;
		this.idusuins = idusuins;
		this.dtalt = dtalt;
		this.halt = halt;
		this.idusualt = idusualt;
	}

	public Eqprevestoqlog(long id, Integer codemp, Short codfilial, Date dtini,
			Date dtfim, Integer codempgp, Short codfilialgp, String codgrup,
			Integer codemppd, Short codfilialpd, Integer codprod, char ordem,
			char mercadoriaRevenda, char materiaPrima, char emProcesso,
			char outros, char subProduto, char equipamento,
			char materialConsumo, char produtoIntermed, char produtoAcabado,
			char embalagem, char outrosInsumos, Date dtins, Date hins,
			String idusuins, Date dtalt, Date halt, String idusualt) {
		this.id = id;
		this.codemp = codemp;
		this.codfilial = codfilial;
		this.dtini = dtini;
		this.dtfim = dtfim;
		this.codempgp = codempgp;
		this.codfilialgp = codfilialgp;
		this.codgrup = codgrup;
		this.codemppd = codemppd;
		this.codfilialpd = codfilialpd;
		this.codprod = codprod;
		this.ordem = ordem;
		this.mercadoriaRevenda = mercadoriaRevenda;
		this.materiaPrima = materiaPrima;
		this.emProcesso = emProcesso;
		this.outros = outros;
		this.subProduto = subProduto;
		this.equipamento = equipamento;
		this.materialConsumo = materialConsumo;
		this.produtoIntermed = produtoIntermed;
		this.produtoAcabado = produtoAcabado;
		this.embalagem = embalagem;
		this.outrosInsumos = outrosInsumos;
		this.dtins = dtins;
		this.hins = hins;
		this.idusuins = idusuins;
		this.dtalt = dtalt;
		this.halt = halt;
		this.idusualt = idusualt;
	}

	public long getId() {
		return this.id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public Integer getCodemp() {
		return this.codemp;
	}

	public void setCodemp(Integer codemp) {
		this.codemp = codemp;
	}

	public Short getCodfilial() {
		return this.codfilial;
	}

	public void setCodfilial(Short codfilial) {
		this.codfilial = codfilial;
	}

	public Date getDtini() {
		return this.dtini;
	}

	public void setDtini(Date dtini) {
		this.dtini = dtini;
	}

	public Date getDtfim() {
		return this.dtfim;
	}

	public void setDtfim(Date dtfim) {
		this.dtfim = dtfim;
	}

	public Integer getCodempgp() {
		return this.codempgp;
	}

	public void setCodempgp(Integer codempgp) {
		this.codempgp = codempgp;
	}

	public Short getCodfilialgp() {
		return this.codfilialgp;
	}

	public void setCodfilialgp(Short codfilialgp) {
		this.codfilialgp = codfilialgp;
	}

	public String getCodgrup() {
		return this.codgrup;
	}

	public void setCodgrup(String codgrup) {
		this.codgrup = codgrup;
	}

	public Integer getCodemppd() {
		return this.codemppd;
	}

	public void setCodemppd(Integer codemppd) {
		this.codemppd = codemppd;
	}

	public Short getCodfilialpd() {
		return this.codfilialpd;
	}

	public void setCodfilialpd(Short codfilialpd) {
		this.codfilialpd = codfilialpd;
	}

	public Integer getCodprod() {
		return this.codprod;
	}

	public void setCodprod(Integer codprod) {
		this.codprod = codprod;
	}

	public char getOrdem() {
		return this.ordem;
	}

	public void setOrdem(char ordem) {
		this.ordem = ordem;
	}

	public char getMercadoriaRevenda() {
		return this.mercadoriaRevenda;
	}

	public void setMercadoriaRevenda(char mercadoriaRevenda) {
		this.mercadoriaRevenda = mercadoriaRevenda;
	}

	public char getMateriaPrima() {
		return this.materiaPrima;
	}

	public void setMateriaPrima(char materiaPrima) {
		this.materiaPrima = materiaPrima;
	}

	public char getEmProcesso() {
		return this.emProcesso;
	}

	public void setEmProcesso(char emProcesso) {
		this.emProcesso = emProcesso;
	}

	public char getOutros() {
		return this.outros;
	}

	public void setOutros(char outros) {
		this.outros = outros;
	}

	public char getSubProduto() {
		return this.subProduto;
	}

	public void setSubProduto(char subProduto) {
		this.subProduto = subProduto;
	}

	public char getEquipamento() {
		return this.equipamento;
	}

	public void setEquipamento(char equipamento) {
		this.equipamento = equipamento;
	}

	public char getMaterialConsumo() {
		return this.materialConsumo;
	}

	public void setMaterialConsumo(char materialConsumo) {
		this.materialConsumo = materialConsumo;
	}

	public char getProdutoIntermed() {
		return this.produtoIntermed;
	}

	public void setProdutoIntermed(char produtoIntermed) {
		this.produtoIntermed = produtoIntermed;
	}

	public char getProdutoAcabado() {
		return this.produtoAcabado;
	}

	public void setProdutoAcabado(char produtoAcabado) {
		this.produtoAcabado = produtoAcabado;
	}

	public char getEmbalagem() {
		return this.embalagem;
	}

	public void setEmbalagem(char embalagem) {
		this.embalagem = embalagem;
	}

	public char getOutrosInsumos() {
		return this.outrosInsumos;
	}

	public void setOutrosInsumos(char outrosInsumos) {
		this.outrosInsumos = outrosInsumos;
	}

	public Date getDtins() {
		return this.dtins;
	}

	public void setDtins(Date dtins) {
		this.dtins = dtins;
	}

	public Date getHins() {
		return this.hins;
	}

	public void setHins(Date hins) {
		this.hins = hins;
	}

	public String getIdusuins() {
		return this.idusuins;
	}

	public void setIdusuins(String idusuins) {
		this.idusuins = idusuins;
	}

	public Date getDtalt() {
		return this.dtalt;
	}

	public void setDtalt(Date dtalt) {
		this.dtalt = dtalt;
	}

	public Date getHalt() {
		return this.halt;
	}

	public void setHalt(Date halt) {
		this.halt = halt;
	}

	public String getIdusualt() {
		return this.idusualt;
	}

	public void setIdusualt(String idusualt) {
		this.idusualt = idusualt;
	}

}