package com.stone.multiproject.utils;

import com.google.common.base.Splitter;
import com.stone.multiproject.constant.Constant;
import lombok.experimental.UtilityClass;

@UtilityClass
public final class SplitterHelper {

    public final Splitter COMMA_SPLITTER = Splitter.on(Constant.COMMA).omitEmptyStrings().trimResults();
    public final Splitter UNDERLINE_SPLITTER = Splitter.on(Constant.UNDER_LINE).omitEmptyStrings().trimResults();
}
