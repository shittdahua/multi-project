package com.stone.multiproject.utils;

import com.google.common.base.Splitter;
import lombok.experimental.UtilityClass;

@UtilityClass
public final class SplitterHelper {

    public final Splitter COMMA_SPLITTER = Splitter.on(",").omitEmptyStrings().trimResults();
    public final Splitter UNDERLINE_SPLITTER = Splitter.on("_").omitEmptyStrings().trimResults();
}
