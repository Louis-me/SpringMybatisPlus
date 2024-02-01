import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import org.junit.Test;
import org.junit.runner.RunWith;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import xyz.shi.entity.User;
import xyz.shi.mapper.UserMapper;

import java.util.List;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:applicationContext.xml")
public class UserMapperTest {
    @Autowired
    UserMapper userDao;
    @Test
    public void selectById() {
       User user = userDao.selectById(50);
       System.out.println(user.getName());


    }
    @Test
    public void findPage() {
        Page<User> page = new Page<>(1, 10);
        List<User> userList = userDao.selectPage(page, null).getRecords();
        for(User user1: userList) {
            System.out.println(user1.getName());
        }
    }
    @Test
    public void save() {
        User user = new User();
        user.setName("mybatisplus");
        user.setPassword("11111");
        userDao.insert(user);
    }
    @Test
    public void update() {
        User user = new User();
        user.setId(61);
        user.setName("tst60");
        user.setPassword("2222");
        userDao.updateById(user);
    }
    @Test
    public void delete() {

        userDao.deleteById(61);
    }

}
