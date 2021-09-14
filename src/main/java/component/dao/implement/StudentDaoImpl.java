package component.dao.implement;

import component.dao.StudentDao;
import component.domain.Student;

import java.util.ArrayList;
import java.util.List;

public class StudentDaoImpl implements StudentDao {
    List<Student> students = new ArrayList<Student>();
    @Override
    public Student create(Student student) {
        students.add(student);
        return student;
    }

    @Override
    public Student readById(int id) {
        Student student = students.get(id-1);
        return student;
    }

    @Override
    public List<Student> readAll() {
        return students;
    }

    @Override
    public Student update(Student student) {
        students.set(student.getId()-1, student);
        return student;
    }

    @Override
    public void delete(int id) {
        students.remove(id-1);

    }
}
