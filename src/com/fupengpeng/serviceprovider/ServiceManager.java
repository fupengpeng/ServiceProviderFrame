package com.fupengpeng.serviceprovider;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

import com.fupengpeng.service.SubWayInterface;

/**
 * 
 * Title: ServiceManager
 * Description: 服务提供者注册类 
 * Company: 济宁九点连线信息技术有限公司
 * ProjectName: ServiceProviderFrame
 * @author fupengpeng
 * @date 2017年8月9日 下午3:23:04
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
