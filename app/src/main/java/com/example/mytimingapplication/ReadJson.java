package com.example.mytimingapplication;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

//解析Json数据类
public class ReadJson {
    public String getJson() {
        //将json数据变成字符串
        StringBuilder stringBuilder = new StringBuilder();
        try {
            //获取assets资源管理器
            InputStream is = ReadJson.this.getClass().getClassLoader().getResourceAsStream("assets/" + "data.json");
            InputStreamReader streamReader = new InputStreamReader(is);
            BufferedReader bf = new BufferedReader(streamReader);
            String line;
            while ((line = bf.readLine()) != null) {
                stringBuilder.append(line);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return stringBuilder.toString();
    }
}
