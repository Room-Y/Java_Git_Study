package mapper;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.ResultMap;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;
import pojo.Brand;
import service.BrandService;

import java.util.List;

/**
 * @author: Java_cmr
 * @Date: 2023/2/13 - 15:41
 */
public interface BrandMapper {

    @Select("select * from test.tb_brand")
    @ResultMap("brandResultMap")
    List<Brand> selectAll();

    @Insert("insert into test.tb_brand values(null, #{brandName}, #{companyName}, #{ordered}, #{description}, #{status})")
    void add(Brand brand);

    @Select("select * from test.tb_brand where id = #{id}")
    @ResultMap("brandResultMap")
    Brand selectById(int id);

    @Update("update test.tb_brand set brand_name=#{brandName}, company_name=#{companyName}, ordered=#{ordered}, description=#{description}, status=#{status} where id=#{id}")
    @ResultMap("brandResultMap")
    void update(Brand brand);

}
