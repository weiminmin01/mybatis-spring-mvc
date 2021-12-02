package cn.smbms.dao;

import cn.smbms.beans.User;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository("userDao")
public interface UserDao {

    public void  addUser(User user);

    public void  deleteUser(int id);

    public void  updateUser(User user);

    public List<User> getUserList(User user);

}
