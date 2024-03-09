import java.util.List;
import java.util.ArrayList;
import java.util.Collections;

public class TeacherService implements iUserService {
    private List teacherList = new ArrayList();
    private UserComparator userComparator = new UserComparator();

    @Override
    public void addUser(Teacher teacher){
        teacherList.add(teacher);
    }

    @Override
    public List getUsers(){

        Collections.sort(teacherList, userComparator);
        return teacherList;
    }
}

