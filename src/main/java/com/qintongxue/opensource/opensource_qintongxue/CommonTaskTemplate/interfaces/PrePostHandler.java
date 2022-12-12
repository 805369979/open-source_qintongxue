package com.qintongxue.opensource.opensource_qintongxue.TaskTemplate.interfaces;

/**
 * 接口前后置处理
 */
public interface PrePostHandler {
    /**
     * 前置处理
     */
    void preHandle();
    /**
     * 业务处理
     */
    void handle(Param param);
    /**
     * 后置处理
     */
    void postHandle();
}
