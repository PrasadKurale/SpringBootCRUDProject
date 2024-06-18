package com.csi.service;

import com.csi.dao.EmployeeDaoImpl;
import com.csi.model.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmployeeServiceImpl {

    @Autowired
    EmployeeDaoImpl employeeDaoImpl;

    public Employee savaData(Employee employee) // Here i am saving i one data at a time so thats y we are using Employee if your are saving bulk of data then add list
    {
        return employeeDaoImpl.savaData(employee); // here there is not session,not sessionfactory,here we are just calling inbuilt save method and save only one data

    }
    public List<Employee> getAllData()
    {
        return  employeeDaoImpl.getAllData(); // findAll method is coming from maven

    }
    public Employee updateData(Employee employee){

        return employeeDaoImpl.updateData(employee);

    }
    public void deleteData(int empId)
    {
        employeeDaoImpl.deleteData(empId);   // this deleteById is coming from JPA repository
    }

    public List<Employee> getDataByName(String empFirstName)
    {
        return employeeDaoImpl.getDataByName(empFirstName);

    }
}
