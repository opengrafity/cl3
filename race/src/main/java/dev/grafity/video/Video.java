package dev.grafity.video;

import java.util.Arrays;

public class Video {
	private String title;
	private String channelName;
	private int noOfViews;
	private int noOfLikes;
	private int noOfComments;
	private float length;
	private int playSpeed;
	private float playingAt;
	private String[] comments = new String[Integer.MAX_VALUE];
	public Video(String title, String channelName, float length) {
		this.title = title;
		this.channelName = channelName;
		this.length = length;
	}
	
	public Video(String title, String channelName) {
		this.title = title;
		this.channelName = channelName;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getChannelName() {
		return channelName;
	}

	public void setChannelName(String channelName) {
		this.channelName = channelName;
	}

	public int getPlaySpeed() {
		return playSpeed;
	}

	public void setPlaySpeed(int playSpeed) {
		this.playSpeed = playSpeed;
	}

	public int getNoOfViews() {
		return noOfViews;
	}

	public int getNoOfLikes() {
		return noOfLikes;
	}

	public int getNoOfComments() {
		return noOfComments;
	}

	public float getLength() {
		return length;
	}

	public float getPlayingAt() {
		return playingAt;
	}

	public String[] getComments() {
		return comments;
	}

	@Override
	public String toString() {
		return "Video [title=" + title + ", channelName=" + channelName + ", noOfViews=" + noOfViews + ", noOfLikes="
				+ noOfLikes + ", noOfComments=" + noOfComments + ", length=" + length + ", playSpeed=" + playSpeed
				+ ", playingAt=" + playingAt + ", comments=" + Arrays.toString(comments) + "]";
	}
	
	public void addComment(String comment) {
		this.comments[this.noOfComments++] = comment;		
	}
	
	public void forward() {
		this.playingAt = increaseByTenSecs(this.playingAt);
	}
	
	private float increaseByTenSecs(float playingAt) {		 
		float forwardBy = 0.10F;
		int playingAtMins = (int)playingAt;
		float playingAtSecs = playingAt-playingAtMins;
		
		int forwardTo = (int)((playingAtSecs+forwardBy)*100);
		
		int incMinBy = 0;		
		float incSecBy = 0;
		
		if(forwardTo >= 60) {
			incMinBy = forwardTo/60;
			incSecBy = (forwardTo % 60)*0.01F;
			playingAt = (playingAtMins + incMinBy) + incSecBy;
		}else {
			playingAt = playingAtMins + (forwardTo*0.01F);
		}
		return playingAt;
	}
}

