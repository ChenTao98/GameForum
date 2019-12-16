package com.software.gameforum.utils;

import com.alibaba.fastjson.JSONObject;
import com.alibaba.fastjson.serializer.SerializerFeature;

public class GameForumJSON extends JSONObject {
    public GameForumJSON() {
        DEFFAULT_DATE_FORMAT = "yyyy-MM-dd HH:mm:ss";
    }

    public String toMyString(boolean writeNull) {
        if (writeNull) {
            return toJSONString(this, SerializerFeature.PrettyFormat,
                    SerializerFeature.WriteMapNullValue,
                    SerializerFeature.WriteNullListAsEmpty, SerializerFeature.WriteDateUseDateFormat);
        } else {
            return toJSONString(this, SerializerFeature.PrettyFormat, SerializerFeature.WriteDateUseDateFormat);
        }
    }

    public void setErrorCode(int errorCode, String message) {
        this.put("errorCode", errorCode);
        this.put("message", message);
    }

    public void setSuccessCode() {
        this.put("errorCode", 0);
        this.put("message", "成功");
    }
}
