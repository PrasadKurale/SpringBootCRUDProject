package com.csi.repository;

import com.csi.model.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee,Integer> // JpaRepository<T, ID>,<Employee,Inyteger>this Employee is POJO CLASS and This Integer is wrapper class,we used it because we initialize the int in POJO Class that's why.
{

    //CUSTOM METHOD GOES HERE ND YOU CAN WRITE A MANY METHOD
    public List<Employee> findByEmpFirstName(String empFirstName);
}
