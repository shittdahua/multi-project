package com.stone.multiproject.entity;

import com.stone.multiproject.base.Base;
import lombok.*;

import java.util.Date;
import java.util.List;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class TicketResult extends Base {

    private static final long serialVersionUID = 8064318211819283112L;

    /**
     * 彩票编码
     */
    private String ticketCode;

    /**
     * 彩票日期
     */
    private Date ticketDate;

    /**
     * 推荐购买的彩票号码
     */
    private List<TicketNumber> ticketData;
}
