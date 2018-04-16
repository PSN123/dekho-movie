package signup;

import java.util.ArrayList;
import java.util.List;

public interface usersign {
    void addata(getset gs);
 void update(getset gs,int wd_id);
 void delete(int id);
 getset get(int eid);
 ArrayList<getset> get();
 String emailid(String email);
}
