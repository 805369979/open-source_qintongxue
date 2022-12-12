package com.qintongxue.opensource.opensource_qintongxue.TaskTemplate.task;
import com.qintongxue.opensource.opensource_qintongxue.TaskTemplate.enums.BusinessEnum;
import com.qintongxue.opensource.opensource_qintongxue.TaskTemplate.interfaces.Param;
import lombok.extern.slf4j.Slf4j;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.Map;

/**
 * 洁祎~   任务执行模板
 */
@Service
public class Task extends AbstractTaskTemplate<String> {

    public Task() {
    }

    /**
     * 设置业务处理code
     */
    @Override
    public String alarmCode() {
        return BusinessEnum.test_code.getCode();
    }

    /**
     * 统一数据获取渠道
     * @return map
     */
    @Override
    protected Map<String, String> getBusinessDataMap() {
        Map<String, String> dataMap = new HashMap<>();
        dataMap.put("data1", "获取的业务数据1");
        dataMap.put("data2", "获取的业务数据2");
        return dataMap;
    }

    /**
     * 任务处理入口函数
     */
    @Override
    public void handle(Param param) {
        preHandle();
        // 1. 获取数据操作
        Map<String, String> businessDataMap = getBusinessDataMap();
        // 2. 业务逻辑处理操作
        System.out.println("任务参数为"+ param +"开始运行了");
        System.out.println("任务1需要用的业务数据是"+businessDataMap.toString());
        //3.持久化数据库操作
        insertData("插入数据");
        postHandle();
    }

    /**
     * 前置处理
     */
    @Override
    public void preHandle() {
        System.out.println("前置处理，可用于数据准备工作操作或者日志记录等");
    }

    /**
     * 后置处理
     */
    @Override
    public void postHandle() {
        System.out.println("后置处理，可用于回收资源等操作");
    }
}