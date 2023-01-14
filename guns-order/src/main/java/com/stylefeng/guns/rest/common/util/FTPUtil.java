package com.stylefeng.guns.rest.common.util;

import lombok.Data;
import lombok.extern.slf4j.Slf4j;
import org.apache.commons.net.ftp.FTPClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;

import java.io.*;

@Slf4j
@Data
@Configuration
@ConfigurationProperties(prefix = "ftp")
public class FTPUtil {

    // 地址 端口 用户名 密码
    private String hostName="81.69.189.208";
    private Integer port=21;
    private String userName="root";
    private String password="Wsjisyou88.";

    private FTPClient ftpClient = null;

    private void initFTPClient(){
        try{
            ftpClient = new FTPClient();
            ftpClient.setControlEncoding("utf-8");
            ftpClient.connect(hostName,port);
            ftpClient.login(userName,password);
        }catch (Exception e){
            log.error("初始化FTP失败",e);
        }
    }

    // 输入一个路径，然后将路径里的文件转换成字符串返回给我
    public String getFileStrByAddress(String fileAddress){
        //BufferedReader bufferedReader = null;
        try{
            FileReader fileReader = new FileReader("C:\\Users\\Lenovo\\Desktop\\新建文件夹\\mksz273-Dubbo主流版本打造仿猫眼项目-理解微服务核心思想-366元-完结{推荐}\\00-课程资源软件源码\\coding-273\\源码\\guns\\guns-order\\src\\main\\java\\com\\stylefeng\\guns\\rest\\common\\util\\cgs.json");
            Reader reader = new InputStreamReader(new FileInputStream("C:\\Users\\Lenovo\\Desktop\\新建文件夹\\mksz273-Dubbo主流版本打造仿猫眼项目-理解微服务核心思想-366元-完结{推荐}\\00-课程资源软件源码\\coding-273\\源码\\guns\\guns-order\\src\\main\\java\\com\\stylefeng\\guns\\rest\\common\\util\\cgs.json"), "Utf-8");
            int ch = 0;
            StringBuffer sb = new StringBuffer();
            while ((ch = reader.read()) != -1) {
                sb.append((char) ch);
            }
            fileReader.close();
            reader.close();
            String jsonStr = sb.toString();


            return sb.toString();
        }catch (Exception e){
            log.error("获取文件信息失败",e);
        }
        return null;
    }

    public static void main(String[] args) {

        FTPUtil ftpUtil = new FTPUtil();
        String fileStrByAddress = ftpUtil.getFileStrByAddress("seats/cgs.json");

        System.out.println(fileStrByAddress);
    }

}
