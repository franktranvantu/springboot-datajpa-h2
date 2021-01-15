package com.franktran.springboot.springdata.springbootdatajpah2;

import org.springframework.data.repository.CrudRepository;

import java.util.List;

/**
 * @author frank.tran
 */
public interface CustomerRepository extends CrudRepository<Customer, Long> {

    List<Customer> findCustomerByLastName(String lastName);

    Customer findCustomerById(Long id);
}
