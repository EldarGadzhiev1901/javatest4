import java.util.List;
import java.util.ArrayList;
import java.util.Collections;
public class TeacherController implements iUserController {

    private TeacherService teacherService = new TeacherService();
    @Override
    public void addUser(Teacher teacher){
        teacherService.addUser(teacher);
    }
    
    @Override
    public List getUsers() {

        return teacherService.getUsers();
    }

}