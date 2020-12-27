package com.packt.locator;

import java.util.HashMap;
import java.util.Map;

public class ServiceLocator {

	private Map<Class<?>,Map<String,Object>> serviceRegistry = new HashMap<Class<?>,Map<String,Object>>(); 
	private static ServiceLocator serviceLocator;
	
	// private constructor to make this class singleton 
	private ServiceLocator() {
		
	}
	
	//Static method to get only existing instance. If no instance is there, create the new one.
	public static ServiceLocator getInstance() {
		if(serviceLocator == null) {
			serviceLocator = new ServiceLocator();
		}
		return serviceLocator;
	}
	
	public <T> void registerService(Class<T> interfaceType, String key, Object serviceObject) {
		
		Map<String,Object> serviceOfSameTypeMap = serviceRegistry.get(interfaceType);
		
		if(serviceOfSameTypeMap !=null) {
			serviceRegistry.get(interfaceType).put(key, serviceObject);
		}else {
			serviceOfSameTypeMap = new HashMap<String,Object>();
			serviceOfSameTypeMap.put(key, serviceObject);
			
			serviceRegistry.put(interfaceType, serviceOfSameTypeMap);
		}
		
	}
	
	public <T> T getSerivce(Class<T> interfaceType, String key) {
		
		Map<String,Object> serviceOfSameTypeMap = serviceRegistry.get(interfaceType);
		if(serviceOfSameTypeMap != null) {
			T service  = (T)serviceOfSameTypeMap.get(key);
			if(service !=null) {
				return service;
			}else {
				System.out.println(" Service with key "+ key +" does not exist");
				return null;
			}
		}else {
			System.out.println(" Service of type "+ interfaceType.toString() + " does not exist");
			return null;
		}
	}
}
