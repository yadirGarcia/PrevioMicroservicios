package com.previo.servicio.loker.models.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.previo.servicio.loker.models.dao.SolicitudDao;
import com.previo.servicio.loker.models.entity.Solicitud;
import com.previo.servicio.loker.models.service.interfaces.ISolicitudService;

@Service
public class SolicitudServiceImpl implements ISolicitudService{

	@Autowired
	private SolicitudDao solicitudDao;

	@Override
	@Transactional(readOnly = true)
	public List<Solicitud> findAll() {
		return (List<Solicitud>) solicitudDao.findAll();
	}

	@Override
	@Transactional(readOnly = true)
	public Solicitud findById(Long id) {
		return solicitudDao.findById(id).get();
	}

	@Override
	public void Save(Solicitud objeto) {
		solicitudDao.save(objeto);
	}

	@Override
	public void saveAll(ArrayList<Solicitud> objetos) {
		solicitudDao.saveAll(objetos);
	}

	@Override
	public void deleteById(Long id) {
		solicitudDao.deleteById(id);
		
	}

	@Override
	public void delete(Solicitud entity) {
		solicitudDao.delete(entity);
		
	}
	
}
