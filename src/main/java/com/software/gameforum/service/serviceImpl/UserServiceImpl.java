package com.software.gameforum.service.serviceImpl;

import com.software.gameforum.dao.UserDao;
import com.software.gameforum.entity.User;
import com.software.gameforum.entity.UserExample;
import com.software.gameforum.service.UserService;
import com.software.gameforum.utils.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private UserDao userDao;

    @Override
    public int register(User user) {
        UserExample userExample = new UserExample();
        userExample.createCriteria().andPhonenumEqualTo(user.getPhonenum());
        userExample.or().andEmailEqualTo(user.getEmail());
        List<User> userList = userDao.selectByExample(userExample);
        if (userList.size() != 0) {
            return -1;
        }
        return userDao.insertSelective(user);
    }

    @Override
    public User login(String username, String password) {
        UserExample userExample = new UserExample();
        userExample.createCriteria().andEmailEqualTo(username).andPasswordEqualTo(password);
        List<User> userList = userDao.selectByExample(userExample);
        return userList.size() > 0 ? userList.get(0) : null;
    }

    @Override
    public int modifyInfo(User user) {
        String email = user.getEmail();
        String phone = user.getPhonenum();
        if (email != null || phone != null) {
            UserExample userExample = new UserExample();
            if (email != null) {
                userExample.createCriteria().andEmailEqualTo(email);
            }
            if (phone != null) {
                userExample.or().andPhonenumEqualTo(phone);
            }
            List<User> userList = userDao.selectByExample(userExample);
            if (userList.size() > 0) {
                return -1;
            }
        }
        return userDao.updateByPrimaryKeySelective(user);
    }

    @Override
    public User getUserById(int id) {
        return userDao.selectByPrimaryKey(id);
    }
}
