package com.fupengpeng.serviceprovider;

import com.fupengpeng.service.SubWayImpl;
import com.fupengpeng.service.SubWayInterface;

/**
 * 
 * Title: SubwayProviderImpl
 * Description: �����ṩ��ʵ���� 
 * Company: �����ŵ�������Ϣ�������޹�˾
 * ProjectName: ServiceProviderFrame
 * @author fupengpeng
 * @date 2017��8��9�� ����3:22:30
 */
public class SubwayProviderImpl implements SubwayProviderInterface {  
  
    static {  
        ServiceManager.registerProvider("һ��ͨ", new SubwayProviderImpl());  
    }  
  
    public SubWayInterface getService() {  
        return new SubWayImpl();  
    }  
	
}
