package com.qintongxue.opensource.opensource_qintongxue.TaskTemplate.interfaces;

import java.util.Map;

/**
 * 统一的参数设计，规范
 */
public interface Param {

    Object getParam(String key);
    void addParam(String key, Object value);
    Map<String, Object> getParams();
    void setParams(Map<String, Object> params);
}
