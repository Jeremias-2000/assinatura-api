package com.dashboard.repository;

import com.dashboard.document.Assinatura;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AssinaturaRepository extends MongoRepository<Assinatura,String> {
}
