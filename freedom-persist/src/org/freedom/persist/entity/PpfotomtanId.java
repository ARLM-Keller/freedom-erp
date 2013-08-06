package org.freedom.persist.entity;

// Generated 31/05/2013 12:00:37 by Hibernate Tools 3.4.0.CR1

import javax.persistence.Column;
import javax.persistence.Embeddable;

/**
 * PpfotomtanId generated by hbm2java
 */
@Embeddable
public class PpfotomtanId implements java.io.Serializable {

	private int codfotomtan;
	private int codmtanalise;
	private short codfilial;
	private int codemp;

	public PpfotomtanId() {
	}

	public PpfotomtanId(int codfotomtan, int codmtanalise, short codfilial,
			int codemp) {
		this.codfotomtan = codfotomtan;
		this.codmtanalise = codmtanalise;
		this.codfilial = codfilial;
		this.codemp = codemp;
	}

	@Column(name = "CODFOTOMTAN", nullable = false)
	public int getCodfotomtan() {
		return this.codfotomtan;
	}

	public void setCodfotomtan(int codfotomtan) {
		this.codfotomtan = codfotomtan;
	}

	@Column(name = "CODMTANALISE", nullable = false)
	public int getCodmtanalise() {
		return this.codmtanalise;
	}

	public void setCodmtanalise(int codmtanalise) {
		this.codmtanalise = codmtanalise;
	}

	@Column(name = "CODFILIAL", nullable = false)
	public short getCodfilial() {
		return this.codfilial;
	}

	public void setCodfilial(short codfilial) {
		this.codfilial = codfilial;
	}

	@Column(name = "CODEMP", nullable = false)
	public int getCodemp() {
		return this.codemp;
	}

	public void setCodemp(int codemp) {
		this.codemp = codemp;
	}

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof PpfotomtanId))
			return false;
		PpfotomtanId castOther = (PpfotomtanId) other;

		return (this.getCodfotomtan() == castOther.getCodfotomtan())
				&& (this.getCodmtanalise() == castOther.getCodmtanalise())
				&& (this.getCodfilial() == castOther.getCodfilial())
				&& (this.getCodemp() == castOther.getCodemp());
	}

	public int hashCode() {
		int result = 17;

		result = 37 * result + this.getCodfotomtan();
		result = 37 * result + this.getCodmtanalise();
		result = 37 * result + this.getCodfilial();
		result = 37 * result + this.getCodemp();
		return result;
	}

}