package com.fupengpeng.serviceprovider;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

import com.fupengpeng.service.SubWayInterface;

/**
 * 
 * Title: ServiceManager
 * Description: �����ṩ��ע���� 
 * Company: �����ŵ�������Ϣ�������޹�˾
 * ProjectName: ServiceProviderFrame
 * @author fupengpeng
 * @date 2017��8��9�� ����3:23:04
 */
public class ServiceManager {
	
	private ServiceManager() {  
		  
    }  
  
    private static final Map<String, SubwayProviderInterface> providers = new ConcurrentHashMap<String, SubwayProviderInterface>();  
  
    public static void registerProvider(String name, SubwayProviderInterface p) {  
        providers.put(name, p);  
    }  
  
    public static SubWayInterface getService(String name) {  
  
        SubwayProviderInterface p = providers.get(name);  
  
        if (p == null) {  
            throw new IllegalArgumentException(  
                    "No provider registered with name:" + name);  
        }  
  
        return p.getService();  
  
    }  

}
