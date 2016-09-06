/**  
 * Copyright © 2016xiaomi. All rights reserved.
 *
 * @Title: TestFTP.java
 * @Prject: taotao-manager-web
 * @Package: com.taotao.controller
 * @Description: TODO
 * @author: 小米  
 * @date: 2016年9月6日 上午1:07:58
 * @version: V1.0  
 */
package com.taotao.controller;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.commons.net.ftp.FTPClient;
import org.junit.Test;

import com.taotaoutil.FtpUtil;

/**
 * @ClassName: TestFTP
 * @Description: TODO
 * @author: 小米
 * @date: 2016年9月6日 上午1:07:58
 */
public class TestFTP {
	@Test
	public void testFtp() throws Exception {
		//1、连接ftp服务器
		FTPClient ftpClient = new FTPClient();
		ftpClient.connect("192.168.91.133", 21);
		//2、登录ftp服务器
		ftpClient.login("ftpuser", "ftpuser");
		//3、读取本地文件
		FileInputStream inputStream = new FileInputStream(new File("D:\\mine.jpg"));
		//4、上传文件
		//1）指定上传目录
		ftpClient.changeWorkingDirectory("/home/ftpuser/www/images");
		//2）指定文件类型
		ftpClient.setFileType(FTPClient.BINARY_FILE_TYPE);
		//第一个参数：文件在远程服务器的名称
		//第二个参数：文件流
		ftpClient.storeFile("hello.jpg", inputStream);
		//5、退出登录
		ftpClient.logout();
	}
	@Test
	public void testFTPUtil() throws IOException{
		FileInputStream fis = new FileInputStream(new File("D:\\mine.jpg"));
		FtpUtil.uploadFile("192.168.91.133", 21, "ftpuser", "ftpuser", "/home/ftpuser/www/images", "2015/09/04", "213412da5ytrgf.jpg", fis);
		fis.close();
	}
}
