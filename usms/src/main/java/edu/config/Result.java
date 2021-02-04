package edu.config;

import java.util.HashMap;

public class Result {
    public static final String success = "200";

    public static final String fail = "-1";

    public static final String msg = "操作成功";

    public static final String failMsg = "操作失败";

    private static HashMap<String,Object> result = new HashMap<String,Object>();

    public static HashMap<String,Object> make(String code,String msg,Object data){
        result.put("code", code);
        result.put("msg", msg);
        result.put("data", data);
        return result;
    }
}
