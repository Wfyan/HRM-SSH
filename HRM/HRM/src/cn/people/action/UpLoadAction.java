package cn.people.action;

import java.io.*;
import org.apache.struts2.ServletActionContext;
import com.opensymphony.xwork2.ActionSupport;

public class UpLoadAction extends ActionSupport
{
	private File upload;                  //封装上传文件
	private String uploadContentType;     //封装上传文件类型
	private String uploadFileName;        //封装上传文件名
	private String savePath;              //封装上传文件在服务器tomcat容器上的保存路径
	private FileInputStream fileInput;
	private FileOutputStream fileOutput;
	
	public File getUpload() {
		return upload;
	}
	public void setUpload(File upload) {
		this.upload = upload;
	}
	public String getUploadContentType() {
		return uploadContentType;
	}
	public void setUploadContentType(String uploadContentType) {
		this.uploadContentType = uploadContentType;
	}
	public String getUploadFileName() {
		return uploadFileName;
	}
	public void setUploadFileName(String uploadFileName) {
		this.uploadFileName = uploadFileName;
	}
	
	public String getSavePath()
	{
		//以下ServletActionContext.getServletContext().getRealPath(“”)方法获取本工程在tomcat容器中的真实绝对路径，加上参数savepath，进一步得到下一级savepath的绝对路径
		String realpath = ServletActionContext.getServletContext().getRealPath(savePath);
		return realpath;
	}

	public void setSavePath(String savePath) {
		this.savePath = savePath;
	}

	public String execute() throws Exception
	{
		upload.getAbsolutePath();
		fileInput = new FileInputStream(getUpload());     //创建文件输入流
		fileOutput = new FileOutputStream(getSavePath() + "\\" + getUploadFileName());  //创建文件输出流
		byte[] b = new  byte[2048];    //缓冲数组大小2KB
		int len = 0;
		while((len=fileInput.read(b))>0)    //finout.read(b)实现从输入流读2KB数据到数组b中,返回读取的字节数len，遇到文件尾返回-1
		{
			fileOutput.write(b,0,len);     //将b中len字节数据写到输出流中
		}
		fileInput.close();              //关闭输入流
		fileOutput.close();              //关闭输出流
		return "success";
	}
}
