package com.lxy.newsshow.Mappers;

import com.lxy.newsshow.entities.Userinfo;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import java.util.List;

public interface UserMapper {
    @Select("select * from userinfo where id = #{id}")
    public Userinfo getUserById(Integer id);
    @Select("select * from userinfo where username = #{username}")
    public Userinfo getUserByName(String username);
    @Select("select id from friend where id = #{id} ")
    public List<Userinfo> getAllFriends(Integer id);
    @Insert({
            "insert into userinfo(UserName,UserPassword,Age,Gender,Telephone,Address) " +
            "values(#{username},#{password},#{age},#{gender},#{telephone},#{address})"
            })
    public boolean InsertIntoUserInfo(String username,String password,
                                      Integer age,String gender,
                                      String telephone,String address);
    @Delete("delete from userinfo where id = #{id}")
    public boolean DeleteByUserID(Integer id);
    @Update("update Userinfo set UserName=#{username},UserPassword=#{password},Age=#{age},Gender=#{gender},Telephone=#{telephone},Address=#{address} where id = #{id}")
    public boolean UpdateByUserID(Userinfo userinfo);
}
