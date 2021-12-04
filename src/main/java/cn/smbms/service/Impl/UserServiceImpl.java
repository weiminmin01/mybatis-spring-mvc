package cn.smbms.service.Impl;

import cn.smbms.beans.User;
import cn.smbms.dao.UserDao;
import cn.smbms.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import java.util.List;
@Service("userService")
public class UserServiceImpl implements UserService {
 @Autowired
 @Qualifier("userDao")
 private UserDao userDao;
    @Override
    public void addUser(User user) {
      userDao.addUser(user);
    }

    @Override
    public void deleteUser(int id) {
       userDao.deleteUser(id);
    }

    @Override
    public void updateUser(User user) {
       userDao.updateUser(user);
    }

    @Override
    public List<User> getUserList(User user) {
     List<User> userList=userDao.getUserList(user);
     for(User u:userList){
         System.out.println(u.toString());
     }
        return userList;
    }

    @Override
    public User  dologin(String userCode, String userPassword) {
      User user= userDao.dologin(userCode,userPassword);
       return user;
    }
}
