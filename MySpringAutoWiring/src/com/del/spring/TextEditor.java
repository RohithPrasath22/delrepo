package com.del.spring;

import org.springframework.beans.factory.annotation.Required;

public class TextEditor {
	private SpellChecker spellChkr;

	public SpellChecker getSpellChkr() {
		return spellChkr;
	}

	public void setSpellChkr(SpellChecker spellChkr) {
		this.spellChkr = spellChkr;
	}
	
	public void spellCheck() {
		spellChkr.checkSpelling();
		System.out.println("in spell check");
	}
	
	

}
