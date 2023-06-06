package com.lee.mybatis.study.springboot;

import com.lee.mybatis.study.springboot.mapper.UserMapper;
import com.lee.mybatis.study.springboot.model.dto.UserDTO;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.IOException;
import java.io.Reader;

/**
 * @author liylw
 * @date 2023/6/6 10:43
 */
public class Test {
    private static SqlSessionFactory sqlSessionFactory;

    public static void main(String[] args) throws IOException {
        //1、创建SqlSessionFactory
        String resource = "mybatis-config.xml";
        final Reader reader = Resources.getResourceAsReader(resource);
        sqlSessionFactory = new SqlSessionFactoryBuilder().build(reader);
        reader.close();
        //2、获取sqlSession
        SqlSession sqlSession = sqlSessionFactory.openSession();

        //3、获取mapper
        UserMapper mapper = sqlSession.getMapper(UserMapper.class);//动态代理，代理对象

        //4、执行数据库操作，并处理结果集
        UserDTO goods = mapper.queryById(1L);
        System.out.println(goods);
    }

}
