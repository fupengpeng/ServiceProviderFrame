package com.fupengpeng.service;



/**
 * 
 * Title: SubWayImpl
 * Description: һ��ͨ������������ʵ��
 * Company: �����ŵ�������Ϣ�������޹�˾
 * ProjectName: ServiceProviderFrame
 * @author fupengpeng
 * @date 2017��8��9�� ����3:20:14
 */
public class SubWayImpl implements SubWayInterface {  
  
    public boolean in() {  
        System.out.println("ͨ��һ��ͨ�������");  
        /** 
         * ����һЩ����Ȼ�󷵻��Ƿ���� 
         */  
        return false;  
    }  
  
    public boolean out() {  
        System.out.println("ͨ��һ��ͨ������");  
        /** 
         * ����һЩ����Ȼ�󷵻��Ƿ���� 
         */  
        return false;  
    } 
	
}
