package it.eng.spagobi.meta;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Set;


/**
 * This class refers to the empresa table.
 * 
 */
@Entity
@Table(name="`empresa`"
, catalog="`dwclinica`"
)


public class Empresa implements Serializable {

private static final long serialVersionUID = 1L;

public Empresa() {
}
	
	@Id
	@Column(name="`idempresa`")
private Integer idempresa=null;
	@Column(name="`cnpj`")
private String cnpj=null;
	@Column(name="`nomefantasia`")
private String nomefantasia=null;
	@Column(name="`endereco`")
private String endereco=null;
	@Column(name="`telefone`")
private String telefone=null;

public Integer getIdempresa () {
	return this.idempresa;
}
public void setIdempresa (Integer idempresa) {
	this.idempresa = idempresa;
}
public String getCnpj () {
	return this.cnpj;
}
public void setCnpj (String cnpj) {
	this.cnpj = cnpj;
}
public String getNomefantasia () {
	return this.nomefantasia;
}
public void setNomefantasia (String nomefantasia) {
	this.nomefantasia = nomefantasia;
}
public String getEndereco () {
	return this.endereco;
}
public void setEndereco (String endereco) {
	this.endereco = endereco;
}
public String getTelefone () {
	return this.telefone;
}
public void setTelefone (String telefone) {
	this.telefone = telefone;
}



			@OneToMany(mappedBy="rel_idempresa_in_empresa", cascade={CascadeType.ALL}, fetch=FetchType.LAZY)
	private java.util.Set<Exame> fkempresas;




			@OneToMany(mappedBy="rel_idempresa_in_exame", cascade={CascadeType.ALL}, fetch=FetchType.LAZY)
	private java.util.Set<Exame> BR_Empresa_Exames;









public java.util.Set<Exame> getFkempresas () {
	return this.fkempresas;
}

public void setFkempresas (java.util.Set<Exame> fkempresas) {
	this.fkempresas = fkempresas;
}


 


public java.util.Set<Exame> getBR_Empresa_Exames () {
	return this.BR_Empresa_Exames;
}

public void setBR_Empresa_Exames (java.util.Set<Exame> BR_Empresa_Exames) {
	this.BR_Empresa_Exames = BR_Empresa_Exames;
}


 



}