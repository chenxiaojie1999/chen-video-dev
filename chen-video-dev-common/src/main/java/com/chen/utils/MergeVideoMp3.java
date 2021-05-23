package com.chen.utils;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class MergeVideoMp3 {

	private String ffmpegEXE;

	public MergeVideoMp3(String ffmpegEXE) {
		super();
		this.ffmpegEXE = ffmpegEXE;
	}
	/**
	 * 视频添加背景音乐
	 * @param videoInputPath
	 * @param mp3InputPath
	 * @param seconds
	 * @param videoOutputPath
	 * @throws Exception
	 */
	public void convertor(String videoInputPath, String mp3InputPath,
						  double seconds, String videoOutputPath) throws Exception {

//    ffmpeg.exe -i 苏州大裤衩.mp4 -i bgm.mp3 -t 7 -y -map 0:v:0 -map 1:a:0 新的视频.mp4
		List<String> command = new ArrayList<>();
		command.add(ffmpegEXE);

		command.add("-i");
		command.add(videoInputPath);
		command.add("-i");
		command.add(mp3InputPath);
		command.add("-t");
		command.add(String.valueOf(seconds));
		command.add("-y");

		// 覆盖原有视频中的音频
		command.add("-map");
		command.add("0:v:0");
		command.add("-map");
		command.add("1:a:0");

		command.add(videoOutputPath);
		this.processed(command);

	}



	/**
	 * 执行FFmpeg命令
	 * @param command
	 * @throws IOException
	 */
	private void processed(List<String> command) throws IOException {
		ProcessBuilder builder = new ProcessBuilder(command);
		Process process = builder.start();

		InputStream errorStream = process.getErrorStream();
		InputStreamReader inputStreamReader = new InputStreamReader(errorStream);
		BufferedReader br = new BufferedReader(inputStreamReader);

		String line = "";
		while ( (line = br.readLine()) != null ) {
		}
		if (br != null) {
			br.close();
		}
		if (inputStreamReader != null) {
			inputStreamReader.close();
		}
		if (errorStream != null) {
			errorStream.close();
		}
	}
}
