package com.jobs.dao;

import com.jobs.dao.base.BaseDao;
import org.springframework.stereotype.Repository;

import java.util.List;
import com.jobs.model.User;
@Repository
public interface UserDao extends BaseDao{
    int deleteByPrimaryKey(Integer userId);

    int insert(User record);

    int insertSelective(User record);

    User selectByPrimaryKey(Integer userId);

    int updateByPrimaryKeySelective(User record);

    int updateByPrimaryKey(User record);

    List<User> selectAllUser();
}
