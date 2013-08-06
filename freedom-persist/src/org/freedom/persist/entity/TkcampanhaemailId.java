package org.freedom.persist.entity;

// Generated 31/05/2013 12:00:37 by Hibernate Tools 3.4.0.CR1

import javax.persistence.Column;
import javax.persistence.Embeddable;

/**
 * TkcampanhaemailId generated by hbm2java
 */
@Embeddable
public class TkcampanhaemailId implements java.io.Serializable {

	private String codcamp;
	private short codfilial;
	private int codemp;
	private int codemail;
	private short codfilialem;
	private int codempem;

	public TkcampanhaemailId() {
	}

	public TkcampanhaemailId(String codcamp, short codfilial, int codemp,
			int codemail, short codfilialem, int codempem) {
		this.codcamp = codcamp;
		this.codfilial = codfilial;
		this.codemp = codemp;
		this.codemail = codemail;
		this.codfilialem = codfilialem;
		this.codempem = codempem;
	}

	@Column(name = "CODCAMP", nullable = false, length = 13)
	public String getCodcamp() {
		return this.codcamp;
	}

	public void setCodcamp(String codcamp) {
		this.codcamp = codcamp;
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

	@Column(name = "CODEMAIL", nullable = false)
	public int getCodemail() {
		return this.codemail;
	}

	public void setCodemail(int codemail) {
		this.codemail = codemail;
	}

	@Column(name = "CODFILIALEM", nullable = false)
	public short getCodfilialem() {
		return this.codfilialem;
	}

	public void setCodfilialem(short codfilialem) {
		this.codfilialem = codfilialem;
	}

	@Column(name = "CODEMPEM", nullable = false)
	public int getCodempem() {
		return this.codempem;
	}

	public void setCodempem(int codempem) {
		this.codempem = codempem;
	}

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof TkcampanhaemailId))
			return false;
		TkcampanhaemailId castOther = (TkcampanhaemailId) other;

		return ((this.getCodcamp() == castOther.getCodcamp()) || (this
				.getCodcamp() != null && castOther.getCodcamp() != null && this
				.getCodcamp().equals(castOther.getCodcamp())))
				&& (this.getCodfilial() == castOther.getCodfilial())
				&& (this.getCodemp() == castOther.getCodemp())
				&& (this.getCodemail() == castOther.getCodemail())
				&& (this.getCodfilialem() == castOther.getCodfilialem())
				&& (this.getCodempem() == castOther.getCodempem());
	}

	public int hashCode() {
		int result = 17;

		result = 37 * result
				+ (getCodcamp() == null ? 0 : this.getCodcamp().hashCode());
		result = 37 * result + this.getCodfilial();
		result = 37 * result + this.getCodemp();
		result = 37 * result + this.getCodemail();
		result = 37 * result + this.getCodfilialem();
		result = 37 * result + this.getCodempem();
		return result;
	}

}