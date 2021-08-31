package com.empresa.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.empresa.entity.Medicamento;
import com.empresa.repository.MedicamentoRepository;

@Service
public class MedicamentoServiceImp1 implements MedicamentoService{

	@Autowired
	MedicamentoRepository repository;

	public List<Medicamento> listaMedicamento() {
		// TODO Auto-generated method stub
		return repository.findAll();
	}

	public Medicamento registroMedicamento(Medicamento medicamento) {
		// TODO Auto-generated method stub
		return repository.save(medicamento);
	}
	
}
