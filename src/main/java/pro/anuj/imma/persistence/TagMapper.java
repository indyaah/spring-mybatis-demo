package pro.anuj.imma.persistence;

import org.apache.ibatis.annotations.Param;

/**
 * Mapper Interface For Mapping MyBatis XML To Java Code.
 * 
 * @author Anuj
 *
 */
public interface TagMapper {

	Integer searchTag(@Param("partner") String partner, @Param("property") String propery, @Param("device") String device, @Param("city") String city);
}
