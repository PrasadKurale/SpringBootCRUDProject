package com.csi.dao;

import com.csi.model.Employee;
import com.csi.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;


import java.util.List;

@Component
public class EmployeeDaoImpl {

    @Autowired
    EmployeeRepository employeeRepositoryImpl;

    public Employee savaData(Employee employee) // Here i am saving i one data at a time so thats y we are using Employee if your are saving bulk of data then add list
    {
      return employeeRepositoryImpl.save(employee); // here there is not session,not sessionfactory,here we are just calling inbuilt save method and save only one data

    }
    public List<Employee> getAllData()
    {
        return  employeeRepositoryImpl.findAll(); // findAll method is coming from maven

    }
    public Employee updateData(Employee employee){

        return employeeRepositoryImpl.save(employee);
    }
    public void deleteData(int empId)
    {
   employeeRepositoryImpl.deleteById(empId);    // this deleteById is coming from JPA repository
    }

     public List<Employee> getDataByName(String empFirstName)
     {
         return employeeRepositoryImpl.findByEmpFirstName(empFirstName);

     }
}
