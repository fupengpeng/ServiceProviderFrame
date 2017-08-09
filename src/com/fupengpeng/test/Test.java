package com.fupengpeng.test;

import com.fupengpeng.service.SubWayInterface;
import com.fupengpeng.serviceprovider.ServiceManager;

/**
 * 
 * Title: Test
 * Description: 客户端测试类 
 * Company: 济宁九点连线信息技术有限公司
 * ProjectName: ServiceProviderFrame
 * @author fupengpeng
 * @date 2017年8月9日 下午3:25:05
 */
public class Test {
	
	
    public static void main(String[] args) throws ClassNotFoundException {
    	Class.forName("com.fupengpeng.serviceprovider.SubwayProviderImpl");  
        SubWayInterface swi = ServiceManager.getService("一卡通");  
        swi.in();  
        swi.out(); 
	} 

}
