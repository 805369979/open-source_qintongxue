package com.qintongxue.opensource.opensource_qintongxue.TaskTemplate.task;

import com.qintongxue.opensource.opensource_qintongxue.TaskTemplate.interfaces.PrePostHandler;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
/**
 * 任务模板
 */
public abstract class AbstractTaskTemplate<T> implements PrePostHandler {
    /**
     * 获取告警Code
     */
    protected abstract String alarmCode();

    /**
     * 模拟子任务的不统一逻辑，但是返回数据一致格式的情况（返回的结果能否用统一的结构接收，需要仔细考虑）
     */
    protected abstract Map<String, T> getBusinessDataMap();

    /**
     * 模拟子任务的统一逻辑，不需要子任务都写一次，导致重复代码
     */
    protected List<String> getUserCode() {
        List<String> codes = Arrays.asList("data1", "data2", "data3");
        return codes;
    }

    /**
     * 数据落库，持久化数据
     */
    protected void insertData(String data) {
        System.out.println("用户数据保存成功");
    }
}

