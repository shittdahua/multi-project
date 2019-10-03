package com.stone.multiproject.entity;

import com.stone.multiproject.base.Base;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor(staticName = "of")
public class TicketMatchRule extends Base {

    private Integer winningLevel;

    private Integer normalNumber;

    private Integer specialNumber;

    private Integer money;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;

        if (o == null || getClass() != o.getClass()) return false;

        TicketMatchRule that = (TicketMatchRule) o;

        return new EqualsBuilder()
                .append(normalNumber, that.normalNumber)
                .append(specialNumber, that.specialNumber)
                .isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37)
                .append(normalNumber)
                .append(specialNumber)
                .toHashCode();
    }
}
