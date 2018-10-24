package resource.serviceImpl;

import resource.service.MediaPlayer;

public class AudioPlayer implements MediaPlayer{
	MediaAdapter mediaAdapter;

	@Override
	public void play(String audioType, String fileName) {
		// TODO 自動生成されたメソッド・スタブ
		 // mp3 inner support
	      if(audioType.equalsIgnoreCase("mp3")){
	         System.out.println("Playing mp3 file. Name: "+ fileName);
	      }
	      //other support
	      else if(audioType.equalsIgnoreCase("vlc")
	         || audioType.equalsIgnoreCase("mp4")){
	         mediaAdapter = new MediaAdapter(audioType);
	         mediaAdapter.play(audioType, fileName);
	      }
	      else{
	         System.out.println("Invalid media. "+
	            audioType + " format not supported");
	      }
	}

}
