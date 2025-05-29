package demo.generics;

public class GenericRepositoryDemo {
    public static void main(String[] args) {

    }
}

interface Repository<T, ID> {
    T save(T obj);
    void delete(T obj);
    T findById(ID id);
}


class TeacherRepository implements Repository<Teacher, String> {
    @Override
    public Teacher save(Teacher obj) {
        return null;
    }

    @Override
    public void delete(Teacher obj) {

    }

    @Override
    public Teacher findById(String s) {
        return null;
    }
}

class StudentRepository implements Repository<Student, Integer> {
    @Override
    public Student save(Student obj) {
        return null;
    }

    @Override
    public void delete(Student obj) {

    }

    @Override
    public Student findById(Integer integer) {
        return null;
    }
}

class Student {
    private int rollNumber;
    // getters and setters and other methods
}

class Teacher {
    private String teacherId;
    // getters and setters and other methods
}