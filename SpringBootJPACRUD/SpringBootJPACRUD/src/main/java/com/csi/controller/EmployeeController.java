package com.csi.controller;


import com.csi.model.Employee;
import com.csi.service.EmployeeServiceImpl;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
@Slf4j
public class EmployeeController {

    @Autowired
    EmployeeServiceImpl employeeServiceImpl;

    @PostMapping("/savadata")
    public ResponseEntity<Employee> saveData(@RequestBody Employee employee)
    {
        log.info("*********TRYING TO SAVE DATA FOR EMPLOYEE:"+employee.getEmpFirstName());
        return  ResponseEntity.ok(employeeServiceImpl.savaData(employee));

    }

    @GetMapping("/getalldata")
    public ResponseEntity<List<Employee>> getAllData()
    {
        return ResponseEntity.ok(employeeServiceImpl.getAllData());
    }



    @PutMapping("/updatadata/{empId}") // THiS Part is display part on web page
    public ResponseEntity<Employee> updataData(@PathVariable int empId,@RequestBody Employee employee) // RequstBody we required because updates has to shown and update in Employee
    {   // exception code goes here itself
        return ResponseEntity.ok(employeeServiceImpl.updateData(employee));// Updated data will be printed on RequestBody
    }
    @DeleteMapping("/deletedata/{empId}")

    public ResponseEntity<String> deleteData(@PathVariable int empId){
       employeeServiceImpl.deleteData(empId);
        return ResponseEntity.ok("Data Deleted Successfully");

    }

     @GetMapping("/getdatabyname/{empFirstName}")
    public ResponseEntity<List<Employee>> getDataByName(@PathVariable String empFirstName)
     {
                  return ResponseEntity.ok(employeeServiceImpl.getDataByName(empFirstName));
     }
}
