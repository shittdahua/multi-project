package mapper;

import java.util.List;
import model.Lottery;
import model.LotteryExample;
import org.apache.ibatis.annotations.Param;

public interface LotteryMapper {
    /**
     * @mbg.generated generated automatically, do not modify!
     */
    long countByExample(LotteryExample example);

    /**
     * @mbg.generated generated automatically, do not modify!
     */
    int deleteByExample(LotteryExample example);

    /**
     * @mbg.generated generated automatically, do not modify!
     */
    int deleteByPrimaryKey(Long id);

    /**
     * @mbg.generated generated automatically, do not modify!
     */
    int insert(Lottery record);

    /**
     * @mbg.generated generated automatically, do not modify!
     */
    int insertSelective(Lottery record);

    /**
     * @mbg.generated generated automatically, do not modify!
     */
    List<Lottery> selectByExample(LotteryExample example);

    /**
     * @mbg.generated generated automatically, do not modify!
     */
    Lottery selectByPrimaryKey(Long id);

    /**
     * @mbg.generated generated automatically, do not modify!
     */
    int updateByExampleSelective(@Param("record") Lottery record, @Param("example") LotteryExample example);

    /**
     * @mbg.generated generated automatically, do not modify!
     */
    int updateByExample(@Param("record") Lottery record, @Param("example") LotteryExample example);

    /**
     * @mbg.generated generated automatically, do not modify!
     */
    int updateByPrimaryKeySelective(Lottery record);

    /**
     * @mbg.generated generated automatically, do not modify!
     */
    int updateByPrimaryKey(Lottery record);
}