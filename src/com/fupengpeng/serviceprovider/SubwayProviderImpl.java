package com.fupengpeng.serviceprovider;

import com.fupengpeng.service.SubWayImpl;
import com.fupengpeng.service.SubWayInterface;

/**
 * 
 * Title: SubwayProviderImpl
 * Description: 服务提供者实现类 
 * Company: 济宁九点连线信息技术有限公司
 * ProjectName: ServiceProviderFrame
 * @author fupengpeng
 * @date 2017年8月9日 下午3:22:30
 */
public class SubwayProviderImpl implements SubwayProviderInterface {  
  
    static {  
        ServiceManager.registerProvider("一卡通", new SubwayProviderImpl());  
    }  
  
    public SubWayInterface getService() {  
        return new SubWayImpl();  
    }  
	
}
