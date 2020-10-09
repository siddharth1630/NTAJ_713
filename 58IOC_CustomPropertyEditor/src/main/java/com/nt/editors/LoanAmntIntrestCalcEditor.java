package com.nt.editors;

import java.beans.PropertyEditorSupport;

import com.nt.beans.LoanAmntDetail;

public class LoanAmntIntrestCalcEditor extends PropertyEditorSupport{
	public LoanAmntIntrestCalcEditor() {
		System.out.println("LoanAmntIntrestCalcEditor.LoanAmntIntrestCalcEditor()");
	}
	
	@Override
	public void setAsText(String text) throws IllegalArgumentException {
		float pAmnt=0.0f;
		float rate=0.0f;
		int time=0;
		LoanAmntDetail detail;
		String info[]=null;
		
			pAmnt=Float.parseFloat(text.substring(0, text.indexOf(",")));
			rate=Float.parseFloat(text.substring(text.indexOf(",")+1,text.lastIndexOf(",") ));
			time=Integer.parseInt(text.substring(text.lastIndexOf(",")+1,text.length()  ));
	//		System.out.println(rate=Float.parseFloat(text.substring(text.indexOf(",")+1,text.lastIndexOf(",",-1) )));
		
		/*info=text.split(",");
		pAmnt=Float.parseFloat( info[0]);
		rate=Float.parseFloat( info[1]);
		time=Integer.parseInt(info[2]);
		*/
		
		// set to the beans
		detail=new LoanAmntDetail();
		detail.setPAmnt(pAmnt);
		detail.setRate(rate);
		detail.setTime(time);
		// set detail object to bean property value
		setValue(detail);
	}
}
