package com.stylefeng.guns.core.util;

import com.baomidou.mybatisplus.toolkit.IdWorker;

/**
 * 唯一id生成器
 *
-08-23 11:10
 */
public class IdGenerator {

    public static String getId() {
        return String.valueOf(IdWorker.getId());
    }

    public static long getIdLong() {
        return IdWorker.getId();
    }
}
