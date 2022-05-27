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

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonProperty.Access;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "SOLICITUD")
public class Solicitud implements Serializable{
	
	
	/**
	 * 
	 */
	private static final long serialVersionUID = -8745878352350855210L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "ID")
	private Long id;

	@ManyToOne(fetch = FetchType.LAZY,optional = false)
	@JoinColumn(name = "CODIGO_QR_ID")//llave foranea
	@JsonProperty(access = Access.WRITE_ONLY)
	private CodigoQr codigoQr;
	
	
	@ManyToOne(fetch = FetchType.LAZY,optional = false)
	@JoinColumn(name = "LOCKER_ID")//llave foranea
	@JsonProperty(access = Access.WRITE_ONLY)
	private Locker locker;

	@Column(name = "FECHA_PRESTAMO")
	@Temporal(TemporalType.DATE)
	private Date fechaPrestamo;
	
	@Column(name = "FECHA_DEVOLUCION")
	@Temporal(TemporalType.DATE)
	private Date fechaDevolucion;
	
	
	
}
