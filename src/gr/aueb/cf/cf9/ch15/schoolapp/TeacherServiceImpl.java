package gr.aueb.cf.cf9.ch15.schoolapp;

public class TeacherServiceImpl implements ITeacherService{
    @Override
    public void addTeacher(Teacher teacher) {
        System.out.println("Teacher added successfully!");
    }

    @Override
    public void updateTeacher(Teacher teacher) {
        System.out.println("Teacher update successfully!");
    }

    @Override
    public void removeTeacher(long id) {
        System.out.println("Teacher removed successfully!");
    }

    @Override
    public Teacher getTeacherById(long id) {
        return new Teacher(1L, "Athanassios", "Androutsos");
    }

    @Override
    public Teacher[] getAllTeachers() {
        return new Teacher[]{
                new Teacher(1L, "Athanasios", "Androutsos"),
                new Teacher(1L, "Athanasios", "Androutsos"),
                new Teacher(2L, "Markos", "Karampatsis")
        };
    }
}
