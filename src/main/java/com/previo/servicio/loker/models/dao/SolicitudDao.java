package com.previo.servicio.loker.models.dao;



import java.sql.Date;
import java.sql.Timestamp;
import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.previo.servicio.loker.models.entity.Solicitud;

@Repository
public interface SolicitudDao extends CrudRepository<Solicitud, Long>{
	
	@Query(nativeQuery = false,value = "SELECT s FROM Solicitud s WHERE s.fechaPrestamo BETWEEN :fechaInicio AND :fechaFin")
	 List<Solicitud> findByFechaPrestamo(@Param("fechaInicio") Timestamp fechaInicio,@Param("fechaFin") Timestamp fechaFin);
}
