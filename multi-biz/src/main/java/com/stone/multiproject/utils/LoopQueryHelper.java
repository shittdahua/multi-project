package com.stone.multiproject.utils;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import lombok.Setter;
import org.apache.commons.collections4.CollectionUtils;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;

@Setter
public abstract class LoopQueryHelper<T> {

    private int current = 1;
    private int size = 500;
    private int count = 0;
    private int maxCount = 10000;

    public List<T> loopQuery(Function<IPage, List<T>> dbQueryFunction) {
        Page page = new Page(current,size);
        List<T> result = new ArrayList<>();
        while (true) {
            page.setCurrent(current++);
            List<T> list = dbQueryFunction.apply(page);
            if (CollectionUtils.isNotEmpty(list)) {
                result.addAll(list);
                if (list.size() < size) {
                    return result;
                } else if (list.size() > size) {
                    throw new RuntimeException("dbQueryFunction query DB error:size is error");
                }
            } else {
                return result;
            }
            if (maxCount <= ++count) {
                return result;
            }
        }
    }

}
