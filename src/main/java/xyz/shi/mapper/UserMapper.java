package xyz.shi.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;
import xyz.shi.entity.User;

@Mapper
// BaseMapper中包含了常用的增删改查的方法
public interface UserMapper extends BaseMapper<User> {
//    @Select("SELECT * FROM users WHERE id = #{id}")
//    User getUserById(int id);
//
//    @Insert("INSERT INTO users(name,) VALUES(#{name}})")
//    int insertUser(User user);
//
////    @Update("UPDATE user SET name = #{name}, age = #{age} WHERE id = #{id}")
//    @Update("UPDATE user SET name = #{name} WHERE id = #{id}")
//    int updateUser(User user);
//
//    @Select("SELECT * FROM users WHERE name = #{name}")
//    List<User> getUsersByName(String name);
}