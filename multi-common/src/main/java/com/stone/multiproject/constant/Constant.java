package com.stone.multiproject.constant;

import lombok.experimental.UtilityClass;

@UtilityClass
public class Constant {

    public final String DLT_TICKET = "dlt";
    public final String COMMA = ",";
    public final String UNDER_LINE = "_";

    /**
     * 5个常规数字，最大为35
     * 2个特殊数字，最大为12
     */
    public final int[] DLT_THRESHOLD  = {5,35,2,12};
}
