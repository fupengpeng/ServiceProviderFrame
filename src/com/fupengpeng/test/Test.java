package com.fupengpeng.test;

import com.fupengpeng.service.SubWayInterface;
import com.fupengpeng.serviceprovider.ServiceManager;

/**
 * 
 * Title: Test
 * Description: �ͻ��˲����� 
 * Company: �����ŵ�������Ϣ�������޹�˾
 * ProjectName: ServiceProviderFrame
 * @author fupengpeng
 * @date 2017��8��9�� ����3:25:05
 */
public class Test {
	
	
    public static void main(String[] args) throws ClassNotFoundException {
    	Class.forName("com.fupengpeng.serviceprovider.SubwayProviderImpl");  
        SubWayInterface swi = ServiceManager.getService("һ��ͨ");  
        swi.in();  
        swi.out(); 
	} 

}
