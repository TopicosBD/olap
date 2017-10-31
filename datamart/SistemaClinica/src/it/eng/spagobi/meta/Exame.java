package it.eng.spagobi.meta;

import java.io.Serializable;
import javax.persistence.*;


/**
 * This class refers to the exame table.
 * 
 */
@Entity
@Table(name="`exame`"
, catalog="`dwclinica`"
)


public class Exame implements Serializable {

private static final long serialVersionUID = 1L;

public Exame() {
}
	
	@Id
	@Column(name="`idexame`")
private Integer idexame=null;
	@Column(name="`especialidade`")
private String especialidade=null;
	@Column(name="`quantidade`")
private Integer quantidade=null;
	@Column(name="`tipo`")
private String tipo=null;

public Integer getIdexame () {
	return this.idexame;
}
public void setIdexame (Integer idexame) {
	this.idexame = idexame;
}
public String getEspecialidade () {
	return this.especialidade;
}
public void setEspecialidade (String especialidade) {
	this.especialidade = especialidade;
}
public Integer getQuantidade () {
	return this.quantidade;
}
public void setQuantidade (Integer quantidade) {
	this.quantidade = quantidade;
}
public String getTipo () {
	return this.tipo;
}
public void setTipo (String tipo) {
	this.tipo = tipo;
}



	@ManyToOne(cascade={CascadeType.ALL}, fetch=FetchType.LAZY)
@JoinColumn( name="`idempresa`", insertable = false, updatable = false)
	private Empresa rel_idempresa_in_empresa;




	@ManyToOne(cascade={CascadeType.ALL}, fetch=FetchType.LAZY)
@JoinColumn( name="`idresultadoexame`", insertable = false, updatable = false)
	private Resultadoexame rel_idresultadoexame_in_resultadoexame;




	@ManyToOne(cascade={CascadeType.ALL}, fetch=FetchType.LAZY)
@JoinColumn( name="`idtempo`", insertable = false, updatable = false)
	private Tempo rel_idtempo_in_tempo;




	@ManyToOne(cascade={CascadeType.ALL}, fetch=FetchType.LAZY)
@JoinColumn( name="`idempresa`", insertable = false, updatable = false)
	private Empresa rel_idempresa_in_exame;




	@ManyToOne(cascade={CascadeType.ALL}, fetch=FetchType.LAZY)
@JoinColumn( name="`idresultadoexame`", insertable = false, updatable = false)
	private Resultadoexame rel_idresultadoexame_in_exame;




	@ManyToOne(cascade={CascadeType.ALL}, fetch=FetchType.LAZY)
@JoinColumn( name="`idtempo`", insertable = false, updatable = false)
	private Tempo rel_idtempo_in_exame;









public Empresa getRel_idempresa_in_empresa () {
	return this.rel_idempresa_in_empresa;
}

public void setRel_idempresa_in_empresa (Empresa rel_idempresa_in_empresa) {
	this.rel_idempresa_in_empresa = rel_idempresa_in_empresa;
}


 


public Resultadoexame getRel_idresultadoexame_in_resultadoexame () {
	return this.rel_idresultadoexame_in_resultadoexame;
}

public void setRel_idresultadoexame_in_resultadoexame (Resultadoexame rel_idresultadoexame_in_resultadoexame) {
	this.rel_idresultadoexame_in_resultadoexame = rel_idresultadoexame_in_resultadoexame;
}


 


public Tempo getRel_idtempo_in_tempo () {
	return this.rel_idtempo_in_tempo;
}

public void setRel_idtempo_in_tempo (Tempo rel_idtempo_in_tempo) {
	this.rel_idtempo_in_tempo = rel_idtempo_in_tempo;
}


 


public Empresa getRel_idempresa_in_exame () {
	return this.rel_idempresa_in_exame;
}

public void setRel_idempresa_in_exame (Empresa rel_idempresa_in_exame) {
	this.rel_idempresa_in_exame = rel_idempresa_in_exame;
}


 


public Resultadoexame getRel_idresultadoexame_in_exame () {
	return this.rel_idresultadoexame_in_exame;
}

public void setRel_idresultadoexame_in_exame (Resultadoexame rel_idresultadoexame_in_exame) {
	this.rel_idresultadoexame_in_exame = rel_idresultadoexame_in_exame;
}


 


public Tempo getRel_idtempo_in_exame () {
	return this.rel_idtempo_in_exame;
}

public void setRel_idtempo_in_exame (Tempo rel_idtempo_in_exame) {
	this.rel_idtempo_in_exame = rel_idtempo_in_exame;
}


 



}