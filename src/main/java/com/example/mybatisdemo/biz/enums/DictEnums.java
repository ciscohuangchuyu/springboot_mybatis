package com.example.mybatisdemo.biz.enums;

/**
 * 应用层枚举字典
 * Created by Cisco on 2018/10/31
 */
public enum  DictEnums{
    // 是否删除
    IS_DELETE("已删除", "1"),
    NO_DELETE("未删除", "0");
    private String key;
    private String  eval;
    private DictEnums(String key,String val){
        this.key=key;
        this.eval=val;
    }

    public String getEval() {
        return eval;
    }
    public String getKey() {
        return key;
    }
    public Byte getToByte(){
        return Byte.valueOf(eval,10);
    }
}
