package by.dao;


import by.model.Employee;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public class DaoEmploee {
    private SessionFactory sessionFactory;

    public void setSessionFactory(SessionFactory sessionFactory) {
        this.sessionFactory = sessionFactory;
    }

    public void add(Employee employee){
        Session session = this.sessionFactory.getCurrentSession();
        session.persist(employee);
    }
    public List<Employee> list(){
        Session session = this.sessionFactory.getCurrentSession();
        List<Employee> list = session.createQuery("from  Employee ").list();
        return list;
    }
    public  void delete(int id){
        Session session = this.sessionFactory.getCurrentSession();
        Employee employee = (Employee) session.load(Employee.class, new Integer(id));
        session.delete(employee);
    }
    public Employee findById(int id){
       Session session = this.sessionFactory.getCurrentSession();
       Employee employee = (Employee) session.load(Employee.class, new Integer(id));
       employee.getName();
       return employee;
    }
    public void update(Employee employee){
        Session session = this.sessionFactory.getCurrentSession();
        session.update(employee);
    }
}
