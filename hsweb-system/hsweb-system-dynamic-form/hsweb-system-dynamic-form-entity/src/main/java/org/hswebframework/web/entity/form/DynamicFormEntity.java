package org.hswebframework.web.entity.form;

import org.hswebframework.web.commons.entity.GenericEntity;

/**
 * 动态表单 实体
 *
 * @author hsweb-generator-online
 */
public interface DynamicFormEntity extends GenericEntity<String> {
 /*-------------------------------------------
    |               属性名常量               |
    ===========================================*/
    /**
     * 表单名称
     */
    String name = "name";
    /**
     * 数据库表名
     */
    String tableName = "tableName";
    /**
     * 备注
     */
    String describe = "describe";
    /**
     * 版本
     */
    String version = "version";
    /**
     * 创建人id
     */
    String creatorId = "creatorId";
    /**
     * 创建时间
     */
    String createTime = "createTime";
    /**
     * 修改时间
     */
    String updateTime = "updateTime";
    /**
     * 是否已发布
     */
    String deployed = "deployed";
    /**
     * 别名
     */
    String alias = "alias";
    /**
     * 触发器
     */
    String triggers = "triggers";
    /**
     * 表链接
     */
    String correlations = "correlations";
    /**
     * 数据源id,为空使用默认数据源
     */
    String dataSourceId = "dataSourceId";
    /**
     * 其他配置
     */
    String properties = "properties";
    /**
     * 表单类型
     */
    String type = "type";

    /**
     * @return 表单名称
     */
    String getName();

    /**
     * @param name 表单名称
     */
    void setName(String name);

    /**
     * @return 数据库表名
     */
    String getTableName();

    /**
     * @param tableName 数据库表名
     */
    void setTableName(String tableName);

    /**
     * @return 备注
     */
    String getDescribe();

    /**
     * @param describe 备注
     */
    void setDescribe(String describe);

    /**
     * @return 版本
     */
    Long getVersion();

    /**
     * @param version 版本
     */
    void setVersion(Long version);

    /**
     * @return 创建人id
     */
    String getCreatorId();

    /**
     * @param creatorId 创建人id
     */
    void setCreatorId(String creatorId);

    /**
     * @return 创建时间
     */
    Long getCreateTime();

    /**
     * @param createTime 创建时间
     */
    void setCreateTime(Long createTime);

    /**
     * @return 修改时间
     */
    Long getUpdateTime();

    /**
     * @param updateTime 修改时间
     */
    void setUpdateTime(Long updateTime);

    /**
     * @return 是否已发布
     */
    Boolean isDeployed();

    /**
     * @param deployed 是否已发布
     */
    void setDeployed(Boolean deployed);

    /**
     * @return 别名
     */
    String getAlias();

    /**
     * @param alias 别名
     */
    void setAlias(String alias);

    /**
     * @return 触发器
     */
    String getTriggers();

    /**
     * @param triggers 触发器
     */
    void setTriggers(String triggers);

    /**
     * @return 表链接
     */
    String getCorrelations();

    /**
     * @param correlations 表链接
     */
    void setCorrelations(String correlations);

    /**
     * @return 数据源id, 为空使用默认数据源
     */
    String getDataSourceId();

    /**
     * @param dataSourceId 数据源id,为空使用默认数据源
     */
    void setDataSourceId(String dataSourceId);

    /**
     * @return 表单类型
     */
    String getType();

    /**
     * @param type 表单类型
     */
    void setType(String type);

}