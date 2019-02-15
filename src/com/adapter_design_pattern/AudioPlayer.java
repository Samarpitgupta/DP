package com.adapter_design_pattern;

public class AudioPlayer implements MediaPlayer{

	
	MediaAdapter mediaAdapter;
	
	@Override
	public void play(String audioType, String fileName) {
	
	if(audioType.equalsIgnoreCase("MP3"))
	{
		System.out.println("Playing MP3 file name is: "+fileName);
	}
	else if(audioType.equalsIgnoreCase("VLC") || audioType.equalsIgnoreCase("MP3"))
	{
		mediaAdapter=new MediaAdapter(audioType);
		mediaAdapter.play(audioType, fileName);
		
	}
	else
	{
		System.out.println("Invalid Media " +audioType+" format not supported");
	}

	}
}
