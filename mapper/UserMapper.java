package mapper;

import java.util.List;
import model.User;
import model.UserExample;
import org.apache.ibatis.annotations.Param;

public interface UserMapper {
    /**
     * @mbg.generated generated automatically, do not modify!
     */
    long countByExample(UserExample example);

    /**
     * @mbg.generated generated automatically, do not modify!
     */
    int deleteByExample(UserExample example);

    /**
     * @mbg.generated generated automatically, do not modify!
     */
    int deleteByPrimaryKey(Long id);

    /**
     * @mbg.generated generated automatically, do not modify!
     */
    int insert(User record);

    /**
     * @mbg.generated generated automatically, do not modify!
     */
    int insertSelective(User record);

    /**
     * @mbg.generated generated automatically, do not modify!
     */
    List<User> selectByExample(UserExample example);

    /**
     * @mbg.generated generated automatically, do not modify!
     */
    User selectByPrimaryKey(Long id);

    /**
     * @mbg.generated generated automatically, do not modify!
     */
    int updateByExampleSelective(@Param("record") User record, @Param("example") UserExample example);

    /**
     * @mbg.generated generated automatically, do not modify!
     */
    int updateByExample(@Param("record") User record, @Param("example") UserExample example);

    /**
     * @mbg.generated generated automatically, do not modify!
     */
    int updateByPrimaryKeySelective(User record);

    /**
     * @mbg.generated generated automatically, do not modify!
     */
    int updateByPrimaryKey(User record);
}