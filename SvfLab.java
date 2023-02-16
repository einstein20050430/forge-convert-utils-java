package com.dh.etl.lmsvf;

import com.dh.etl.lmsvf.common.Scene;
import com.dh.etl.lmsvf.svf.SvfReader;

public class SvfLab {
	public static void main(String[] args) {
		String svfPath = "D:\\exercise\\myexercise\\myforge\\models\\fenghuo\\3d.svf";
		SvfReader reader = new SvfReader();
		reader.FromFileSystem(svfPath);
		Scene scene = reader.read();
		System.out.println("success! ");
	}
}
