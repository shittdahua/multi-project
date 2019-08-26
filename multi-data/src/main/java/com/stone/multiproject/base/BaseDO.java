package com.stone.multiproject.base;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Date;

@Getter
@Setter
@NoArgsConstructor
public class BaseDO extends Base {

    private static final long serialVersionUID = -1278235472059430325L;
    private Long id;
    private Date gmtCreate;
    private Date gmtModified;
}
