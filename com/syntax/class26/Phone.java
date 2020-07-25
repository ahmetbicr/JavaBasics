package com.syntax.class26;

public abstract class Phone {

	public void makeCall() {
		System.out.println("Phone makes call");
	}

	public void sendText() {
		System.out.println("Phone sends text");
	}

	public abstract void navigate();

	public abstract void playMusic();

//	public abstract void takePicture();

}

class Samsung extends Phone {

	@Override
	public void navigate() {
		System.out.println("Samsung navigates...");
	}

	@Override
	public void playMusic() {
		System.out.println("Samsung plays music from google store");
	}

}

class IPhone extends Phone {

	@Override
	public void navigate() {
		System.out.println("Iphone navigates gps from apple store");
	}

	@Override
	public void playMusic() {
		System.out.println("iPhone plays music in apple store");
	}

}
