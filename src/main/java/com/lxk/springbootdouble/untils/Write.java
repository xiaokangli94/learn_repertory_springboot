package com.fcc.test;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Write {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		webWriteToFolder("","");
	}

	/**
	 * 网页数据写入文件夹 {方法功能中文描述}
	 * @author:付景波
	 */
	public static void webWriteToFolder(String webAddress,String EFileSaveAddress) {
		StringBuffer outBuf = new StringBuffer();
		String s = "";
		//java.net.URL url;
		try {
			//url = new java.net.URL(webAdd);
			File file = new File("G:\\电力交易中心\\读取网页文件\\EMS.htm");
			BufferedReader input = new BufferedReader(new InputStreamReader(new FileInputStream(file),"GBK"));
			while ((s = input.readLine()) != null) {
				if (s.trim().equals("") || s.contains("html") || s.contains("meta") || s.contains("title")
						|| s.contains("head") || s.contains("body") || s.contains("<!")// || s.contains(".dat")
						|| s.contains("//"))// 忽略无用标签和字符
				{
					continue;
				}
				Pattern pattern1 = Pattern.compile("</.*::.*>");
				Matcher matcher1 = pattern1.matcher(s);
				if (matcher1.find()) {
					s = s.replaceAll(matcher1.group(), matcher1.group() + "\r\n");
				}
				String s1 = "";
				s1 = s.replaceAll("<br/>", "\r\n").replaceAll("</br>", "\r\n").replaceAll("<br>", "\r\n");
				if (s1.equals(s) && !s1.equals("")) {
					s1 = s1 + "\r\n";
				}
				outBuf.append(s1);
			}
			SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd-HH-mm-ss");

			String saveAddr ="G:\\电力交易中心\\读取网页文件\\" + sdf.format(new Date()) + ".rb";
			File file1 = new File(saveAddr);
			FileOutputStream fos = new FileOutputStream(file1);
			PrintWriter pw = new PrintWriter(fos);
			pw.write(outBuf.toString().toCharArray());
			pw.flush();

			pw.close();
			fos.close();
			input.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
