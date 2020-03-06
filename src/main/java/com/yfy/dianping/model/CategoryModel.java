package com.yfy.dianping.model;

import java.util.Date;

public class CategoryModel {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column category.id
     *
     * @mbg.generated Sat Feb 29 23:29:50 CST 2020
     */
    private Integer id;


    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column category.created_at
     *
     * @mbg.generated Sat Feb 29 23:29:50 CST 2020
     */
    private Date createdAt;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column category.updated_at
     *
     * @mbg.generated Sat Feb 29 23:29:50 CST 2020
     */
    private Date updatedAt;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column category.name
     *
     * @mbg.generated Sat Feb 29 23:29:50 CST 2020
     */
    private String name;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column category.icon_url
     *
     * @mbg.generated Sat Feb 29 23:29:50 CST 2020
     */
    private String iconUrl;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column category.sort
     *
     * @mbg.generated Sat Feb 29 23:29:50 CST 2020
     */
    private Integer sort;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column category.id
     *
     * @return the value of category.id
     *
     * @mbg.generated Sat Feb 29 23:29:50 CST 2020
     */
    public Integer getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column category.id
     *
     * @param id the value for category.id
     *
     * @mbg.generated Sat Feb 29 23:29:50 CST 2020
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column category.created_at
     *
     * @return the value of category.created_at
     *
     * @mbg.generated Sat Feb 29 23:29:50 CST 2020
     */
    public Date getCreatedAt() {
        return createdAt;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column category.created_at
     *
     * @param createdAt the value for category.created_at
     *
     * @mbg.generated Sat Feb 29 23:29:50 CST 2020
     */
    public void setCreatedAt(Date createdAt) {
        this.createdAt = createdAt;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column category.updated_at
     *
     * @return the value of category.updated_at
     *
     * @mbg.generated Sat Feb 29 23:29:50 CST 2020
     */
    public Date getUpdatedAt() {
        return updatedAt;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column category.updated_at
     *
     * @param updatedAt the value for category.updated_at
     *
     * @mbg.generated Sat Feb 29 23:29:50 CST 2020
     */
    public void setUpdatedAt(Date updatedAt) {
        this.updatedAt = updatedAt;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column category.name
     *
     * @return the value of category.name
     *
     * @mbg.generated Sat Feb 29 23:29:50 CST 2020
     */
    public String getName() {
        return name;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column category.name
     *
     * @param name the value for category.name
     *
     * @mbg.generated Sat Feb 29 23:29:50 CST 2020
     */
    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column category.icon_url
     *
     * @return the value of category.icon_url
     *
     * @mbg.generated Sat Feb 29 23:29:50 CST 2020
     */
    public String getIconUrl() {
        return iconUrl;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column category.icon_url
     *
     * @param iconUrl the value for category.icon_url
     *
     * @mbg.generated Sat Feb 29 23:29:50 CST 2020
     */
    public void setIconUrl(String iconUrl) {
        this.iconUrl = iconUrl == null ? null : iconUrl.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column category.sort
     *
     * @return the value of category.sort
     *
     * @mbg.generated Sat Feb 29 23:29:50 CST 2020
     */
    public Integer getSort() {
        return sort;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column category.sort
     *
     * @param sort the value for category.sort
     *
     * @mbg.generated Sat Feb 29 23:29:50 CST 2020
     */
    public void setSort(Integer sort) {
        this.sort = sort;
    }
}