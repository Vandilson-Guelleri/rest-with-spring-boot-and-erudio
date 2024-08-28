package br.com.erudio.mapper;

import java.util.ArrayList;
import java.util.List;

//import org.apache.catalina.mapper.Mapper;

import com.github.dozermapper.core.DozerBeanMapperBuilder;
import com.github.dozermapper.core.Mapper;

public class DozerMapper {

	private static Mapper mapper = DozerBeanMapperBuilder.buildDefault();
	
	//private static ModelMapper mapper = new ModelMapper();
	
	// O = Origem, D = Destino
	public static <O, D> D parseObject(O origin, Class<D> destination) {
		return mapper.map(origin, destination);
	} 
	
	public static <O, D> List<D> parseListObjects(List<O> origin, Class<D> destination) {
		List<D> desctinationObjects = new ArrayList<D>();
		for (O o : origin) {
			desctinationObjects.add(mapper.map(o, destination));
		}
		return desctinationObjects;
	} 
}
