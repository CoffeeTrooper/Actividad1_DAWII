package com.empresa.service;

import java.util.List;

import com.empresa.entity.Medicamento;

public interface MedicamentoService {

	public List<Medicamento> listaMedicamento();
	
	public Medicamento registroMedicamento(Medicamento medicamento);
}
