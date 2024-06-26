package com.entity;

import com.annotation.ColumnInfo;
import javax.validation.constraints.*;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import java.lang.reflect.InvocationTargetException;
import java.io.Serializable;
import java.util.*;
import org.apache.tools.ant.util.DateUtils;
import org.springframework.format.annotation.DateTimeFormat;
import com.fasterxml.jackson.annotation.JsonFormat;
import org.apache.commons.beanutils.BeanUtils;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableName;
import com.baomidou.mybatisplus.enums.IdType;
import com.baomidou.mybatisplus.enums.FieldFill;
import com.utils.DateUtil;


/**
 * 药品
 *
 * @author 
 * @email
 */
@TableName("yaopin")
public class YaopinEntity<T> implements Serializable {
    private static final long serialVersionUID = 1L;


	public YaopinEntity() {

	}

	public YaopinEntity(T t) {
		try {
			BeanUtils.copyProperties(this, t);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}


    /**
     * 主键
     */
    @TableId(type = IdType.AUTO)
    @ColumnInfo(comment="主键",type="int(11)")
    @TableField(value = "id")

    private Integer id;


    /**
     * 药品名称
     */
    @ColumnInfo(comment="药品名称",type="varchar(200)")
    @TableField(value = "yaopin_name")

    private String yaopinName;


    /**
     * 药品编号
     */
    @ColumnInfo(comment="药品编号",type="varchar(200)")
    @TableField(value = "yaopin_uuid_number")

    private String yaopinUuidNumber;


    /**
     * 药品照片
     */
    @ColumnInfo(comment="药品照片",type="varchar(200)")
    @TableField(value = "yaopin_photo")

    private String yaopinPhoto;


    /**
     * 处方药
     */
    @ColumnInfo(comment="处方药",type="int(11)")
    @TableField(value = "chufangyao_types")

    private Integer chufangyaoTypes;


    /**
     * 药品类型
     */
    @ColumnInfo(comment="药品类型",type="int(11)")
    @TableField(value = "yaopin_types")

    private Integer yaopinTypes;


    /**
     * 二级类型
     */
    @ColumnInfo(comment="二级类型",type="int(11)")
    @TableField(value = "yaopin_erji_types")

    private Integer yaopinErjiTypes;


    /**
     * 药品库存
     */
    @ColumnInfo(comment="药品库存",type="int(11)")
    @TableField(value = "yaopin_kucun_number")

    private Integer yaopinKucunNumber;


    /**
     * 赞
     */
    @ColumnInfo(comment="赞",type="int(11)")
    @TableField(value = "zan_number")

    private Integer zanNumber;


    /**
     * 踩
     */
    @ColumnInfo(comment="踩",type="int(11)")
    @TableField(value = "cai_number")

    private Integer caiNumber;


    /**
     * 药品原价
     */
    @ColumnInfo(comment="药品原价",type="decimal(10,2)")
    @TableField(value = "yaopin_old_money")

    private Double yaopinOldMoney;


    /**
     * 现价
     */
    @ColumnInfo(comment="现价",type="decimal(10,2)")
    @TableField(value = "yaopin_new_money")

    private Double yaopinNewMoney;


    /**
     * 药品热度
     */
    @ColumnInfo(comment="药品热度",type="int(11)")
    @TableField(value = "yaopin_clicknum")

    private Integer yaopinClicknum;


    /**
     * 药品功效
     */
    @ColumnInfo(comment="药品功效",type="longtext")
    @TableField(value = "yaopin_gongxiao_content")

    private String yaopinGongxiaoContent;


    /**
     * 药品禁忌
     */
    @ColumnInfo(comment="药品禁忌",type="longtext")
    @TableField(value = "yaopin_jinji_content")

    private String yaopinJinjiContent;


    /**
     * 药品说明
     */
    @ColumnInfo(comment="药品说明",type="longtext")
    @TableField(value = "yaopin_content")

    private String yaopinContent;


    /**
     * 是否上架
     */
    @ColumnInfo(comment="是否上架",type="int(11)")
    @TableField(value = "shangxia_types")

    private Integer shangxiaTypes;


    /**
     * 逻辑删除
     */
    @ColumnInfo(comment="逻辑删除",type="int(11)")
    @TableField(value = "yaopin_delete")

    private Integer yaopinDelete;


    /**
     * 录入时间
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
    @ColumnInfo(comment="录入时间",type="timestamp")
    @TableField(value = "insert_time",fill = FieldFill.INSERT)

    private Date insertTime;


    /**
     * 创建时间
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
    @ColumnInfo(comment="创建时间",type="timestamp")
    @TableField(value = "create_time",fill = FieldFill.INSERT)

    private Date createTime;


    /**
	 * 获取：主键
	 */
    public Integer getId() {
        return id;
    }
    /**
	 * 设置：主键
	 */

    public void setId(Integer id) {
        this.id = id;
    }
    /**
	 * 获取：药品名称
	 */
    public String getYaopinName() {
        return yaopinName;
    }
    /**
	 * 设置：药品名称
	 */

    public void setYaopinName(String yaopinName) {
        this.yaopinName = yaopinName;
    }
    /**
	 * 获取：药品编号
	 */
    public String getYaopinUuidNumber() {
        return yaopinUuidNumber;
    }
    /**
	 * 设置：药品编号
	 */

    public void setYaopinUuidNumber(String yaopinUuidNumber) {
        this.yaopinUuidNumber = yaopinUuidNumber;
    }
    /**
	 * 获取：药品照片
	 */
    public String getYaopinPhoto() {
        return yaopinPhoto;
    }
    /**
	 * 设置：药品照片
	 */

    public void setYaopinPhoto(String yaopinPhoto) {
        this.yaopinPhoto = yaopinPhoto;
    }
    /**
	 * 获取：处方药
	 */
    public Integer getChufangyaoTypes() {
        return chufangyaoTypes;
    }
    /**
	 * 设置：处方药
	 */

    public void setChufangyaoTypes(Integer chufangyaoTypes) {
        this.chufangyaoTypes = chufangyaoTypes;
    }
    /**
	 * 获取：药品类型
	 */
    public Integer getYaopinTypes() {
        return yaopinTypes;
    }
    /**
	 * 设置：药品类型
	 */

    public void setYaopinTypes(Integer yaopinTypes) {
        this.yaopinTypes = yaopinTypes;
    }
    /**
	 * 获取：二级类型
	 */
    public Integer getYaopinErjiTypes() {
        return yaopinErjiTypes;
    }
    /**
	 * 设置：二级类型
	 */

    public void setYaopinErjiTypes(Integer yaopinErjiTypes) {
        this.yaopinErjiTypes = yaopinErjiTypes;
    }
    /**
	 * 获取：药品库存
	 */
    public Integer getYaopinKucunNumber() {
        return yaopinKucunNumber;
    }
    /**
	 * 设置：药品库存
	 */

    public void setYaopinKucunNumber(Integer yaopinKucunNumber) {
        this.yaopinKucunNumber = yaopinKucunNumber;
    }
    /**
	 * 获取：赞
	 */
    public Integer getZanNumber() {
        return zanNumber;
    }
    /**
	 * 设置：赞
	 */

    public void setZanNumber(Integer zanNumber) {
        this.zanNumber = zanNumber;
    }
    /**
	 * 获取：踩
	 */
    public Integer getCaiNumber() {
        return caiNumber;
    }
    /**
	 * 设置：踩
	 */

    public void setCaiNumber(Integer caiNumber) {
        this.caiNumber = caiNumber;
    }
    /**
	 * 获取：药品原价
	 */
    public Double getYaopinOldMoney() {
        return yaopinOldMoney;
    }
    /**
	 * 设置：药品原价
	 */

    public void setYaopinOldMoney(Double yaopinOldMoney) {
        this.yaopinOldMoney = yaopinOldMoney;
    }
    /**
	 * 获取：现价
	 */
    public Double getYaopinNewMoney() {
        return yaopinNewMoney;
    }
    /**
	 * 设置：现价
	 */

    public void setYaopinNewMoney(Double yaopinNewMoney) {
        this.yaopinNewMoney = yaopinNewMoney;
    }
    /**
	 * 获取：药品热度
	 */
    public Integer getYaopinClicknum() {
        return yaopinClicknum;
    }
    /**
	 * 设置：药品热度
	 */

    public void setYaopinClicknum(Integer yaopinClicknum) {
        this.yaopinClicknum = yaopinClicknum;
    }
    /**
	 * 获取：药品功效
	 */
    public String getYaopinGongxiaoContent() {
        return yaopinGongxiaoContent;
    }
    /**
	 * 设置：药品功效
	 */

    public void setYaopinGongxiaoContent(String yaopinGongxiaoContent) {
        this.yaopinGongxiaoContent = yaopinGongxiaoContent;
    }
    /**
	 * 获取：药品禁忌
	 */
    public String getYaopinJinjiContent() {
        return yaopinJinjiContent;
    }
    /**
	 * 设置：药品禁忌
	 */

    public void setYaopinJinjiContent(String yaopinJinjiContent) {
        this.yaopinJinjiContent = yaopinJinjiContent;
    }
    /**
	 * 获取：药品说明
	 */
    public String getYaopinContent() {
        return yaopinContent;
    }
    /**
	 * 设置：药品说明
	 */

    public void setYaopinContent(String yaopinContent) {
        this.yaopinContent = yaopinContent;
    }
    /**
	 * 获取：是否上架
	 */
    public Integer getShangxiaTypes() {
        return shangxiaTypes;
    }
    /**
	 * 设置：是否上架
	 */

    public void setShangxiaTypes(Integer shangxiaTypes) {
        this.shangxiaTypes = shangxiaTypes;
    }
    /**
	 * 获取：逻辑删除
	 */
    public Integer getYaopinDelete() {
        return yaopinDelete;
    }
    /**
	 * 设置：逻辑删除
	 */

    public void setYaopinDelete(Integer yaopinDelete) {
        this.yaopinDelete = yaopinDelete;
    }
    /**
	 * 获取：录入时间
	 */
    public Date getInsertTime() {
        return insertTime;
    }
    /**
	 * 设置：录入时间
	 */

    public void setInsertTime(Date insertTime) {
        this.insertTime = insertTime;
    }
    /**
	 * 获取：创建时间
	 */
    public Date getCreateTime() {
        return createTime;
    }
    /**
	 * 设置：创建时间
	 */

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    @Override
    public String toString() {
        return "Yaopin{" +
            ", id=" + id +
            ", yaopinName=" + yaopinName +
            ", yaopinUuidNumber=" + yaopinUuidNumber +
            ", yaopinPhoto=" + yaopinPhoto +
            ", chufangyaoTypes=" + chufangyaoTypes +
            ", yaopinTypes=" + yaopinTypes +
            ", yaopinErjiTypes=" + yaopinErjiTypes +
            ", yaopinKucunNumber=" + yaopinKucunNumber +
            ", zanNumber=" + zanNumber +
            ", caiNumber=" + caiNumber +
            ", yaopinOldMoney=" + yaopinOldMoney +
            ", yaopinNewMoney=" + yaopinNewMoney +
            ", yaopinClicknum=" + yaopinClicknum +
            ", yaopinGongxiaoContent=" + yaopinGongxiaoContent +
            ", yaopinJinjiContent=" + yaopinJinjiContent +
            ", yaopinContent=" + yaopinContent +
            ", shangxiaTypes=" + shangxiaTypes +
            ", yaopinDelete=" + yaopinDelete +
            ", insertTime=" + DateUtil.convertString(insertTime,"yyyy-MM-dd") +
            ", createTime=" + DateUtil.convertString(createTime,"yyyy-MM-dd") +
        "}";
    }
}
