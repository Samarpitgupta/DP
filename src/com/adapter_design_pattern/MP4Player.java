package com.adapter_design_pattern;

public class MP4Player implements AdvancedMediaPlayer{

	
	@Override
	public void playVlc(String fileName) {
				
	}

	@Override
	public void playMP4(String fileName) {
			System.out.println("MP4 player start playing file: "+ fileName);
	}

}
