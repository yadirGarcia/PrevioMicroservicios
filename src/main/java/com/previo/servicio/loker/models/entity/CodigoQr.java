package com.previo.servicio.loker.models.entity;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "CODIGO_QR")
public class CodigoQr implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 8300142748106193272L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "ID")
	private Long id;
	
	@OneToMany(mappedBy = "codigoQr",cascade = CascadeType.ALL)
	private List<Solicitud> ListaSolicitudes = new ArrayList<Solicitud>();

}
