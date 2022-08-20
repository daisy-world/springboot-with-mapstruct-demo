package com.app.easy2excel.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.app.easy2excel.entity.Customer;


@Repository
public interface CustomerRepository  extends JpaRepository<Customer, Long>{

}
