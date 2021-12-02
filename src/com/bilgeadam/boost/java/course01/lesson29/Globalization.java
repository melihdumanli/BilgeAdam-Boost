package com.bilgeadam.boost.java.course01.lesson29;

public class Globalization {

	public static void main(String[] args) {
		
		GlobalStrings globalization;

		if (args.length == 1) {
			globalization = new GlobalStrings(args[0]);
		}
		else if (args.length == 2) {
			globalization = new GlobalStrings(args[0], args[1]);
		}
		else {
			globalization = new GlobalStrings();
		}
		
		System.out.println(globalization.getString("Globalization.HELLO")); //$NON-NLS-1$
		System.out.println(globalization.getString("Globalization.HOW_ARE_YOU")); //$NON-NLS-1$
		System.out.println(globalization.getString("Globalization.SPLITTER")); //$NON-NLS-1$
		System.out.println(globalization.getString("Globalization.THANKS")); //$NON-NLS-1$
		System.out.println(globalization.getString("Globalization.SPLITTER")); //$NON-NLS-1$
		System.out.println(globalization.getString("Globalization.BYE")); //$NON-NLS-1$
		double price = 100.0;
		
		String msg = globalization.getString("Globalization.MESSAGE");  
		// 100.0TL deðerindeki malýn %18 KDV ile deðeri 118.0TL'dir
		// $1$$4$ deðerindeki mal\u0131n %$2$ KDV ile deðeri $3$$4$'dir
		
		msg = msg.replace("$1$", ""+price);
		// 100.0$4$ de\u011Ferindeki mal\u0131n %$2$ KDV ile deðeri $3$$4$'dir
		msg = msg.replace("$4$", globalization.getString("Globalization.MONEY_SIGN"));
		// 100.0TL deðerindeki mal\u0131n %$2$ KDV ile deðeri $3$TL'dir
		String vatStr = globalization.getString("Globalization.VAT");
		int vat = Integer.parseInt(vatStr);
		
		double endPrice = price  + (price*vat/100);
		msg = msg.replace("$2$", ""+vatStr);
		// 100.0TL deðerindeki mal\u0131n %18 KDV ile deðeri $3$TL'dir
		msg = msg.replace("$3$", ""+endPrice);
		// 100.0TL deðerindeki mal\u0131n %18 KDV ile deðeri 118.0TL'dir
		System.out.println(msg); 
	}
}
