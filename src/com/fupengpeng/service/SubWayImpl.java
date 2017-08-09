package com.fupengpeng.service;



/**
 * 
 * Title: SubWayImpl
 * Description: 一卡通地铁进出服务实现
 * Company: 济宁九点连线信息技术有限公司
 * ProjectName: ServiceProviderFrame
 * @author fupengpeng
 * @date 2017年8月9日 下午3:20:14
 */
public class SubWayImpl implements SubWayInterface {  
  
    public boolean in() {  
        System.out.println("通过一卡通进入地铁");  
        /** 
         * 进行一些处理，然后返回是否放行 
         */  
        return false;  
    }  
  
    public boolean out() {  
        System.out.println("通过一卡通出地铁");  
        /** 
         * 进行一些处理，然后返回是否放行 
         */  
        return false;  
    } 
	
}
