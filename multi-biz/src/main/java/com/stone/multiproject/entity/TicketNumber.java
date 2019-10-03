package com.stone.multiproject.entity;

import com.stone.multiproject.base.Base;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;

import java.util.Date;
import java.util.List;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor(staticName = "of")
public class TicketNumber extends Base {

    private static final long serialVersionUID = -7701728894245040660L;

    /**
     *  彩票期数
     */
    private String lotteryNo;

    /**
     * 开奖日期
     */
    private Date lotteryDate;

    /**
     * 彩票号码
     */
    private List<Integer> normalNumber;

    /**
     * 彩票特殊号码
     */
    private List<Integer> specialNumber;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;

        if (o == null || getClass() != o.getClass()) return false;

        TicketNumber that = (TicketNumber) o;

        return new EqualsBuilder()
                .append(lotteryNo, that.lotteryNo)
                .append(normalNumber, that.normalNumber)
                .append(specialNumber, that.specialNumber)
                .isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37)
                .append(lotteryNo)
                .append(normalNumber)
                .append(specialNumber)
                .toHashCode();
    }
}
