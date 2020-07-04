package com.application.financenow.models.data;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import com.application.financenow.models.Bill;

import javax.transaction.Transactional;

@Repository
@Transactional
public interface BillsDao extends CrudRepository<Bill, Integer> {
}
