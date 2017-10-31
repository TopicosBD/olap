package it.eng.spagobi.meta;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Set;


/**
 * This class refers to the tempo table.
 * 
 */
@Entity
@Table(name="`tempo`"
, catalog="`dwclinica`"
)


public class Tempo implements Serializable {

private static final long serialVersionUID = 1L;

public Tempo() {
}
	
	@Id
	@Column(name="`idtempo`")
private Integer idtempo=null;
	@Column(name="`dia`")
private Integer dia=null;
	@Column(name="`mes`")
private Integer mes=null;
	@Column(name="`ano`")
private Integer ano=null;

public Integer getIdtempo () {
	return this.idtempo;
}
public void setIdtempo (Integer idtempo) {
	this.idtempo = idtempo;
}
public Integer getDia () {
	return this.dia;
}
public void setDia (Integer dia) {
	this.dia = dia;
}
public Integer getMes () {
	return this.mes;
}
public void setMes (Integer mes) {
	this.mes = mes;
}
public Integer getAno () {
	return this.ano;
}
public void setAno (Integer ano) {
	this.ano = ano;
}



			@OneToMany(mappedBy="rel_idtempo_in_tempo", cascade={CascadeType.ALL}, fetch=FetchType.LAZY)
	private java.util.Set<Exame> fktempos;




			@OneToMany(mappedBy="rel_idtempo_in_exame", cascade={CascadeType.ALL}, fetch=FetchType.LAZY)
	private java.util.Set<Exame> BR_Tempo_Exames;









public java.util.Set<Exame> getFktempos () {
	return this.fktempos;
}

public void setFktempos (java.util.Set<Exame> fktempos) {
	this.fktempos = fktempos;
}


 


public java.util.Set<Exame> getBR_Tempo_Exames () {
	return this.BR_Tempo_Exames;
}

public void setBR_Tempo_Exames (java.util.Set<Exame> BR_Tempo_Exames) {
	this.BR_Tempo_Exames = BR_Tempo_Exames;
}


 



}