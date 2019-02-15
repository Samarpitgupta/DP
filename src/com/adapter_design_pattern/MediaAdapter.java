package com.adapter_design_pattern;

public class MediaAdapter implements MediaPlayer {

	AdvancedMediaPlayer advancedMusicPlayer;

	public  MediaAdapter(String audioType) {
		
		if(audioType.equalsIgnoreCase("VLC"))
		{
			advancedMusicPlayer=new VlcPlayer();
		}
		else if(audioType.equalsIgnoreCase("MP4"))
		{
			advancedMusicPlayer=new MP4Player();
		}
	}	
	
	@Override
	public void play(String audioType, String fileName) {

		if(audioType.equalsIgnoreCase("VLC"))
		{
			advancedMusicPlayer.playVlc(fileName);
		}
		else if(audioType.equals("MP4"))
		{
			advancedMusicPlayer.playMP4(fileName);	
		}
	}

}
