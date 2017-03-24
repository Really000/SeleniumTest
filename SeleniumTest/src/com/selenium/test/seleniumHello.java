package com.selenium.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class seleniumHello {
	public static void main(String[] args) {
        //�����������û��Ĭ�ϰ�װ��C�̣���Ҫ�ƶ���·��
        System.setProperty("webdriver.firefox.bin", "C:/Program Files (x86)/Mozilla Firefox/firefox.exe"); 

        //������������Ϊ FirefoxDriver ����
        WebDriver driver = new FirefoxDriver();


        //��������ַ
        driver.get("http://www.baidu.com/");


        //��������ڱ��
        driver.manage().window().maximize();

        //��λ�����Ԫ��
        WebElement txtbox = driver.findElement(By.name("wd"));

        //������������ı�
        txtbox.sendKeys("HelloWorld");

        //��λ��ťԪ��
        WebElement btn = driver.findElement(By.id("su"));

        //�����ť
        btn.click();


        //�ر�����
        driver.close();


    }
}
