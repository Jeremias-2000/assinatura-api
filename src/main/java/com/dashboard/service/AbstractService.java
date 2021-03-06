package com.dashboard.service;

import org.springframework.data.crossstore.ChangeSetPersister;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

public interface AbstractService<A> {
    Page<A> findAll(Pageable pageable);
    A findAssinaturaById(String id) throws ChangeSetPersister.NotFoundException;
    A saveAssinatura(A assinatura);
    A updateAssinaturaById(String id,A assinatura);
    void deleteAssinaturaById(String id);
    void checkIfAssinaturaIsNull(A assinatura);
}
