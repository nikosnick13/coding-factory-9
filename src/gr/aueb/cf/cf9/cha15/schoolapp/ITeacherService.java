package gr.aueb.cf.cf9.cha15.schoolapp;

public interface ITeacherService {

    void insertTeacher(Teacher teacher);
    void updateTeacher(Teacher teacher);
    void deleteTeacher(long id);
    Teacher getTeacherById(long id);
    Teacher[] getAllTeachers();

}
