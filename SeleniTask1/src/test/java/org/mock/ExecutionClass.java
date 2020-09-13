package org.mock;

public class ExecutionClass extends BaseClass {
	
	
	
public static void main(String[] args) throws InterruptedException {
	
	PomTaskMock pomTask= new PomTaskMock();
	launchApp("https://www.facebook.com/");
//	Thread.sleep(4000);
	pomTask.btnClick();
//	Thread.sleep(4000);
	drdn(pomTask.getSelDay(), "2",null, null);
	drdn(pomTask.getSelMon(), null,"Sep", null);
	drdn(pomTask.getSelYear(), null,null, "1");
	
}
}
