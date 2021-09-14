package component.dao;

import component.domain.Student;

import java.util.List;

public interface StudentDao {

    Student create(Student student);
    Student readById(int id);
    List<Student> readAll();
    Student update(Student student);
    void delete(int id);
}
