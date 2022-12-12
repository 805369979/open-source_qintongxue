package com.qintongxue.opensource.opensource_qintongxue.TaskTemplate.enums;

import java.util.ArrayList;
import java.util.List;

/**
 * 秦同学 任务code枚举类
 */
public enum BusinessEnum {
    test_code("test_ode");
    private String code;

    BusinessEnum(String code) {
        this.code = code;
    }

    public String getCode() {
        return code;
    }
    @Override
    public String toString() {
        return super.toString();
    }

    /**
     * 保存code的列表
     */
    public static List<String> businessLists = new ArrayList<>();

    static{
        for (BusinessEnum i : BusinessEnum.values()){
            businessLists.add(i.getCode());
        }
    }
}
