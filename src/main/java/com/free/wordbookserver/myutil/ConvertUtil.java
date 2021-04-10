package com.free.wordbookserver.myutil;


import org.springframework.beans.BeanUtils;
import org.springframework.context.annotation.Bean;
import org.springframework.util.CollectionUtils;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ConvertUtil {


    /**
     * @param source 源
     * @param clazz  类 target
     * @param <T>    泛型
     * @return 返回
     */
    public static <T> List<T> convert(List source, Class<T> clazz) {
        List<T> target = new ArrayList<>();
        if (!CollectionUtils.isEmpty(source)) {
            for (Object c : source) {
                T obj = copy(c, clazz);
                target.add(obj);
            }
        }
        return target;
    }

    private static <T> T copy(Object source, Class<T> clazz) {
        if (source == null) {
            return null;

        }
        T obj = null;
        try {
            obj = clazz.newInstance();

        } catch (InstantiationException | IllegalAccessException e) {
            e.printStackTrace();
        }
        BeanUtils.copyProperties(source, obj);
        return obj;
    }

}
