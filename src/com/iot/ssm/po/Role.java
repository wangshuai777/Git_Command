package com.iot.ssm.po;

import java.io.Serializable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Semaphore;

public class Role implements Serializable {
    private Long roleid;

    private String role;

    private String description;

    private static final long serialVersionUID = 1L;

    public Long getRoleid() {
        return roleid;
    }

    public  void setRoleid(Long roleid) {
        this.roleid = roleid;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role == null ? null : role.trim();
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description == null ? null : description.trim();
    }

    @Override
    public boolean equals(Object that) {
        if (this == that) {
            return true;
        }
        if (that == null) {
            return false;
        }
        if (getClass() != that.getClass()) {
            return false;
        }
        Role other = (Role) that;
        return (this.getRoleid() == null ? other.getRoleid() == null : this.getRoleid().equals(other.getRoleid()))
            && (this.getRole() == null ? other.getRole() == null : this.getRole().equals(other.getRole()))
            && (this.getDescription() == null ? other.getDescription() == null : this.getDescription().equals(other.getDescription()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getRoleid() == null) ? 0 : getRoleid().hashCode());
        result = prime * result + ((getRole() == null) ? 0 : getRole().hashCode());
        result = prime * result + ((getDescription() == null) ? 0 : getDescription().hashCode());
        return result;
    }
    
    public static String reverse(String str){
    	//System.out.println(str);
    	if(str.isEmpty()){
    		return str;
    	}
    	return reverse(str.substring(1))+str.charAt(0);
    }
    
    public static String foreach(String input){
    	if(input.isEmpty()){
    		return input;
    	}
    	StringBuilder sb=new StringBuilder();
    	char[] charArray = input.toCharArray();
    	for (int i = charArray.length-1; i>=0; i--) {
			sb.append(charArray[i]);
		}
    	return sb.toString();
    }
    
    //求n的阶乘
    
    public static long test(long n){
    	if(n==0){
    		return n;
    	}
    	return n+test(n-1);
    }
    
    public static void main(String[] args) {
    	 // 线程池 
        ExecutorService exec = Executors.newCachedThreadPool();
        // 只能5个线程同时访问 
        final Semaphore semp = new Semaphore(5);  
        // 模拟20个客户端访问 
        for (int index = 0; index < 20; index++) {
            final int NO = index;  
            Runnable run = new Runnable() {  
                public void run() {  
                    try {  
                        // 获取许可 
                        semp.acquire();  
                        System.out.println("Accessing: " + NO);
                        System.out.println("testGitCommand.....");
                        Thread.sleep((long) (Math.random() * 10000));  
                        // 访问完后，释放 ，如果屏蔽下面的语句，则在控制台只能打印5条记录，之后线程一直阻塞
                        semp.release();  
                    } catch (InterruptedException e) {  
                    }  
                }  
            };  
            exec.execute(run);  
        }  
        // 退出线程池 
        exec.shutdown();  
    }  
}