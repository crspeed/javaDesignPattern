package resource.serviceImpl;

import resource.service.AdvancedMediaPlayer;

public class VlcPlayer implements AdvancedMediaPlayer{

	@Override
	public void playMp4(String fileName) {
		//nothing to do
	}

	@Override
	public void playVlc(String fileName) {
		// TODO 自動生成されたメソッド・スタブ
		System.out.println("playing vlc filename" + fileName);
	}

}
