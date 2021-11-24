package com.demarqui.demo.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.demarqui.demo.model.Veiculo;

@Repository
public interface VeiculoRepository extends CrudRepository <Veiculo, Integer>
{

}
