package com.previo.servicio.loker.controllers;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.previo.servicio.loker.models.entity.Locker;
import com.previo.servicio.loker.models.service.interfaces.ILockerService;

@RestController
@RequestMapping("/api/locker")
public class LockerController {
	
	@Autowired
	private ILockerService lockerService;
	

    @GetMapping("/listar")
	public List<Locker> findAll() {
		return (List<Locker>) lockerService.findAll();
	}

    @GetMapping("/ver/{id}")
	public Locker findById(@PathVariable Long id) {
		return lockerService.findById(id);
	}

    @PostMapping("/guardar")
	public void Save(@RequestBody Locker objeto) {
		lockerService.Save(objeto);
	}

	
    @PostMapping("/guardarLista")
	public void saveAll(@RequestBody ArrayList<Locker> objetos) {
		lockerService.saveAll(objetos);
		
	}

    @DeleteMapping("/eliminar/{id}")
	public void deleteById(@PathVariable Long id) {
		lockerService.deleteById(id);
		
	}

    @DeleteMapping("/eliminarObjeto")
	public void delete(@RequestBody Locker entity) {
		lockerService.delete(entity);
		
	}

}