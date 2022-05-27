package com.previo.servicio.loker.models.entity;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

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
@Table(name = "LOCKER")
public class Locker implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 4008629220959014736L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "ID")
	private Long id;
	
	@Column(name = "ESTADO")
	private String estado;
	
	@OneToMany(mappedBy = "locker",cascade = CascadeType.ALL)
	private List<Solicitud> listaSolicitudes = new ArrayList<Solicitud>();

}