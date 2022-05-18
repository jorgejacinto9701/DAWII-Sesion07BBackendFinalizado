package com.empresa.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.empresa.entity.Docente;
import com.empresa.repository.DocenteRepository;

@Service
public class DocenteServiceImpl implements DocenteService {

	@Autowired
	private DocenteRepository repository;

	@Override
	public List<Docente> listaDocente() {
		return repository.findAll();
	}

	@Override
	public Docente insertaActualizaDocente(Docente obj) {
		return repository.save(obj);
	}

	@Override
	public List<Docente> listaDocentePorNombreDniUbigeo(String nombre, String dni, int idUbigeo, int estado, String fecInicio, String fecFin) {
		return repository.listaDocentePorNombreDniUbigeo(nombre, dni, idUbigeo, estado,  fecInicio,  fecFin);
	}

	

}
