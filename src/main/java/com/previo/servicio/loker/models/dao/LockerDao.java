package com.previo.servicio.loker.models.dao;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.previo.servicio.loker.models.entity.Locker;

@Repository
public interface LockerDao extends CrudRepository<Locker, Long> {

}
