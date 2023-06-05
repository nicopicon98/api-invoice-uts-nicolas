package com.webservice.uts.models.dao;

import org.springframework.data.repository.CrudRepository;

import com.webservice.uts.models.entities.Factura;

public interface IFacturaDao extends CrudRepository<Factura, Long> {

}
