package com.yfy.dianping.dal;

import com.yfy.dianping.model.UserModel;

public interface UserModelMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table user
     *
     * @mbg.generated Sat Feb 22 13:07:26 CST 2020
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table user
     *
     * @mbg.generated Sat Feb 22 13:07:26 CST 2020
     */
    int insert(UserModel record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table user
     *
     * @mbg.generated Sat Feb 22 13:07:26 CST 2020
     */
    int insertSelective(UserModel record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table user
     *
     * @mbg.generated Sat Feb 22 13:07:26 CST 2020
     */
    UserModel selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table user
     *
     * @mbg.generated Sat Feb 22 13:07:26 CST 2020
     */
    int updateByPrimaryKeySelective(UserModel record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table user
     *
     * @mbg.generated Sat Feb 22 13:07:26 CST 2020
     */
    int updateByPrimaryKey(UserModel record);
}