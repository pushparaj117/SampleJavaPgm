package org.fbdrdn;

public class ExecutionCls extends BaseCls {

	public static void main(String[] args) throws InterruptedException {
		CreateAccPomPage c = new CreateAccPomPage();
		c.launchUrl("https://www.facebook.com/");
//		Thread.sleep(4000);
		clickFunc(c.getCreateBtn());
////		jsClick(c.getCreateBtn(),"arguments[0].click");
		dropDown(c.getDay(),"5", null, null);
		dropDown(c.getMonth(),null,"Sep", null);
		dropDown(c.getYear(), null, null, "3");
		
//		c.createAccBtn();
//		c.seleDropDown();
		
	}
	
	
}
