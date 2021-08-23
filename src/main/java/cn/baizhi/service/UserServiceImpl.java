package cn.baizhi.service;

import cn.baizhi.dao.UserDao;
import cn.baizhi.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.UUID;

@Transactional
@Service("userService")
public class UserServiceImpl implements UserService{

    @Autowired
    private UserDao ud;


    @Transactional(propagation = Propagation.SUPPORTS)
    @Override
    public List<User> selectAll() {
        return ud.selectAll();
    }


    @Transactional(propagation = Propagation.SUPPORTS)
    @Override
    public User selectBy(String id) {
        return ud.selectBy(id);
    }

    @Override
    public void insert(User user) {
        user.setId(UUID.randomUUID().toString());
        ud.insert(user);
    }

    @Override
    public void delete(String id) {
        ud.delete(id);
    }

    @Override
    public void update(User user) {
        ud.update(user);;
    }
}
