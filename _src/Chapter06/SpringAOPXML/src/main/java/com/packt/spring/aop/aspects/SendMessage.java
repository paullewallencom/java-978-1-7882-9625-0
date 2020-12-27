package com.packt.spring.aop.aspects;

import org.aspectj.lang.JoinPoint;

public class SendMessage {

		//Advise method after successful existing of target method.
		public String sendMessageOnSuccessExit(JoinPoint joinPoint,String retVal) {
			System.out.println(" ****** Method '"+joinPoint.getSignature().getName()+"' of "+joinPoint.getTarget().getClass()+" is executed successfully...");
			System.out.println(" The return value is -->"+retVal);
			return "Successfully exited with return val is -->"+retVal;
		}
		
		//Advise method on existing of target method with some error / exception
		public void sendMessageOnErrorExit(JoinPoint joinPoint) {
			System.out.println(" ****** Method '"+joinPoint.getSignature().getName()+"' of "+joinPoint.getTarget().getClass()+" has some error ...");
		}
}
