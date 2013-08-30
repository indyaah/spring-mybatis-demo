package pro.anuj.imma.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import pro.anuj.imma.cache.Cache;
import pro.anuj.imma.persistence.TagMapper;

/**
 * @author Anuj
 * 
 * Service Class Impelmenting Mapper Interface For Tag Domain.
 */
@Service
public class TagService implements TagMapper {

	@Autowired
	TagMapper tagMapper;
	
	private Cache<Integer> cache = new Cache<Integer>();

	public Integer searchTag(String partner, String propery, String device, String city) {
		if (partner == null)
			return -1;
		String cacheKey = partner;
		if (propery != null)
			cacheKey += "-" + propery;
		if (device != null)
			cacheKey += "-" + device;
		if (city != null)
			cacheKey += "-" + city;
		Integer id = cache.get(cacheKey);
		if (id != null) {
			return id;
		} else {
			Integer resultInteger = tagMapper.searchTag(partner, propery, device, city);
			cache.put(cacheKey, resultInteger);
			return (resultInteger == null) ? -1 : resultInteger;
		}
	}

}
