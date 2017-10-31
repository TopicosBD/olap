package it.eng.spagobi.meta;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Set;


/**
 * This class refers to the resultadoexame table.
 * 
 */
@Entity
@Table(name="`resultadoexame`"
, catalog="`dwclinica`"
)


public class Resultadoexame implements Serializable {

private static final long serialVersionUID = 1L;

public Resultadoexame() {
}
	
	@Id
	@Column(name="`idresultadoexame`")
private Integer idresultadoexame=null;
	@Column(name="`tipo`")
private String tipo=null;

public Integer getIdresultadoexame () {
	return this.idresultadoexame;
}
public void setIdresultadoexame (Integer idresultadoexame) {
	this.idresultadoexame = idresultadoexame;
}
public String getTipo () {
	return this.tipo;
}
public void setTipo (String tipo) {
	this.tipo = tipo;
}



			@OneToMany(mappedBy="rel_idresultadoexame_in_resultadoexame", cascade={CascadeType.ALL}, fetch=FetchType.LAZY)
	private java.util.Set<Exame> fkresultadoexames;




			@OneToMany(mappedBy="rel_idresultadoexame_in_exame", cascade={CascadeType.ALL}, fetch=FetchType.LAZY)
	private java.util.Set<Exame> BR_Resultadoexame_Exames;









public java.util.Set<Exame> getFkresultadoexames () {
	return this.fkresultadoexames;
}

public void setFkresultadoexames (java.util.Set<Exame> fkresultadoexames) {
	this.fkresultadoexames = fkresultadoexames;
}


 


public java.util.Set<Exame> getBR_Resultadoexame_Exames () {
	return this.BR_Resultadoexame_Exames;
}

public void setBR_Resultadoexame_Exames (java.util.Set<Exame> BR_Resultadoexame_Exames) {
	this.BR_Resultadoexame_Exames = BR_Resultadoexame_Exames;
}


 



}