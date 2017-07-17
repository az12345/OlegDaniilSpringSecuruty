package by.service;

import by.dao.DaoEmploee;
import by.model.Employee;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class ServiceEmployee {
    DaoEmploee daoEmploee;

    public void setDaoEmploee(DaoEmploee daoEmploee) {
        this.daoEmploee = daoEmploee;
    }
    @Transactional
    public void add(Employee employee){
        daoEmploee.add(employee);
    }
    @Transactional
    public List<Employee> list(){
        return daoEmploee.list();
    }
    @Transactional
    public void delete(int id){
        daoEmploee.delete(id);
    }
    @Transactional
    public Employee findById(int id){
        return daoEmploee.findById(id);
    }
    @Transactional
    public void update(Employee employee){
        daoEmploee.update(employee);
    }
}
