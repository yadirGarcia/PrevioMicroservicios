package com.previo.servicio.loker.models.entity;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonProperty.Access;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "solicitud")
public class Solicitud implements Serializable{
	
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private Long idSolicitud;

	@JsonIgnore
	@ManyToOne(fetch = FetchType.LAZY,optional = false)
	@JoinColumn(name = "idCodigoQr")//llave foranea
	private CodigoQr codigoQr;
	
	@JsonIgnore
	@ManyToOne(fetch = FetchType.LAZY,optional = false)
	@JoinColumn(name = "idLocker")//llave foranea
	private Locker locker;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "fechaPrestamo")
	private Date fechaPrestamo;
	
	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "fechaDevolucion")
	private Date fechaDevolucion;
	
	
	
}
