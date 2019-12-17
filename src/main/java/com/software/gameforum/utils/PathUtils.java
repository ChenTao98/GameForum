package com.software.gameforum.utils;

public class PathUtils {
    //开发环境
//    final private static String HOST_PATH = "http://localhost:19999";
//    final private static String DIR_PATH = "F:\\gameforum\\";
//    final public static String USER_HEAD_PIC_PATH = DIR_PATH + "image\\user\\";
//    final public static String GAME_ICON_PATH = DIR_PATH + "image\\game\\";

    //部署环境
    final private static String HOST_PATH = "http://47.100.106.153:19999";
    final private static String DIR_PATH = "/home/gameforum/";
    final public static String USER_HEAD_PIC_PATH = DIR_PATH + "image/user/";
    final public static String GAME_ICON_PATH = DIR_PATH + "image/game/";

    //共享
    final public static String USER_HEAD_PIC_PATH_HTML = HOST_PATH + "/image/user/";
    final public static String GAME_ICON_PATH_HTML = HOST_PATH + "/image/game/";
    final public static String POST_URL_PREFIX = HOST_PATH + "/api/post/";
    final public static String DEFAULT_IMAGE_NAME = "default.jpg";
}
