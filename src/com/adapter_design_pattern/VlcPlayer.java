package com.adapter_design_pattern;

public class VlcPlayer implements AdvancedMediaPlayer {

	@Override
	public void playVlc(String fileName) {
	
		System.out.println("VLC Player start playing file" +fileName);
	}

	@Override
	public void playMP4(String fileName) {
		
	}



}
