package me.ashif.microcorpus.service;

import me.ashif.microcorpus.beans.Employee;
import me.ashif.microcorpus.dao.EmployeeDAO;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.annotations.common.util.impl.LoggerFactory;

import java.util.List;
import java.util.logging.Logger;

/*
 * Developed by Ashif Ismail
 * Associate Software Engineer,TechJini Solutions
 * www.ashif.me
 * admin@ashif.me
 *
 */

public interface EmployeeService {
    void addEmployee(Employee e);
    void removeEmployeeByID(int id);
    void updateEmployee(int id,Employee e);
    List<Employee> getEmployeeById(int id);
    List<Employee> getAllEmployees();
}