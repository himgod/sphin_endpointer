package edu.cmu.sphinx.test;

import edu.cmu.sphinx.frontend.endpoint.SpeechClassifier;
import edu.cmu.sphinx.frontend.endpoint.SpeechMarker;
import edu.cmu.sphinx.util.Microphone;

public class VADTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		Microphone microphone = new Microphone(16000,16,1,true,true,true,10,true,"average",0,"default",6400);
		SpeechClassifier classifier = new SpeechClassifier(10,0.003,10,0);
		SpeechMarker marker = new SpeechMarker(200,500,50,30,50,15.0);
		marker.initialize();
		microphone.initialize();
		//classifier as microphone for data source
		classifier.setPredecessor(microphone);
		marker.setPredecessor(classifier);
		if(microphone.startRecording())
		{
			System.out.println("start recognizing");
		}
		
		while(true)
		{
			marker.getData();
		}
		
	}	

}
