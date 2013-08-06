package org.freedom.persist.entity;

// Generated 31/05/2013 12:00:37 by Hibernate Tools 3.4.0.CR1

import javax.persistence.Column;
import javax.persistence.Embeddable;

/**
 * FnborderoId generated by hbm2java
 */
@Embeddable
public class FnborderoId implements java.io.Serializable {

	private int codbor;
	private short codfilial;
	private int codemp;

	public FnborderoId() {
	}

	public FnborderoId(int codbor, short codfilial, int codemp) {
		this.codbor = codbor;
		this.codfilial = codfilial;
		this.codemp = codemp;
	}

	@Column(name = "CODBOR", nullable = false)
	public int getCodbor() {
		return this.codbor;
	}

	public void setCodbor(int codbor) {
		this.codbor = codbor;
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
		if (!(other instanceof FnborderoId))
			return false;
		FnborderoId castOther = (FnborderoId) other;

		return (this.getCodbor() == castOther.getCodbor())
				&& (this.getCodfilial() == castOther.getCodfilial())
				&& (this.getCodemp() == castOther.getCodemp());
	}

	public int hashCode() {
		int result = 17;

		result = 37 * result + this.getCodbor();
		result = 37 * result + this.getCodfilial();
		result = 37 * result + this.getCodemp();
		return result;
	}

}