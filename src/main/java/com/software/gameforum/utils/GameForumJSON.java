package com.software.gameforum.utils;

import com.alibaba.fastjson.JSONObject;
import com.alibaba.fastjson.serializer.SerializerFeature;

public class GameForumJSON extends JSONObject {
    public GameForumJSON(){
        DEFFAULT_DATE_FORMAT="yyyy-MM-dd";
    }
    @Override
    public String toString() {
        return toJSONString(this, SerializerFeature.PrettyFormat,
                SerializerFeature.WriteMapNullValue,
                SerializerFeature.WriteNullListAsEmpty,SerializerFeature.WriteDateUseDateFormat);
    }
}
