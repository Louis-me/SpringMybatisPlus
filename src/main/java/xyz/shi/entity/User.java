package xyz.shi.entity;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;
@Data
@TableName("users")

public class User {
    @TableId
    private int id;
    private String name;
    private String password;
}