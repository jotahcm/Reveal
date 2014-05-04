package com.threeds.reveal;

import java.util.HashMap;

import android.content.Context;
import android.speech.tts.TextToSpeech;
import android.speech.tts.TextToSpeech.OnInitListener;


public class TextSpeaker {

	private static final int DATA_CHECK = 123;
	private TextToSpeech newTTS;
	
	public TextSpeaker(Context context, OnInitListener listener) {
		newTTS = new TextToSpeech(context, listener);
	}
	
	public void speak(String text, HashMap<String, String> params) {
		newTTS.speak(text, TextToSpeech.QUEUE_FLUSH, params);
	}
	
}
