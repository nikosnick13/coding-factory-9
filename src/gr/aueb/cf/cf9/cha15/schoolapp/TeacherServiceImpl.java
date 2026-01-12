package gr.aueb.cf.cf9.cha15.schoolapp;

public class TeacherServiceImpl implements ITeacherService{


    @Override
    public void insertTeacher(Teacher teacher) {
        System.out.println( "Teacher added successfully!");
    }

    @Override
    public void updateTeacher(Teacher teacher) {
        System.out.println( "Teacher updated successfully!");
    }

    @Override
    public void deleteTeacher(long id) {
        System.out.println( "Teacher deleted successfully!");
    }

    @Override
    public Teacher getTeacherById(long id) {
        return null;
    }

    @Override
    public Teacher[] getAllTeachers() {
        return new Teacher[0];
    }
}
