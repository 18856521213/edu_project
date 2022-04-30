package com.wang.ioTest;

import org.junit.Test;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

public class FIleTest {
    @Test
    public void newFile() {
//        isDirectory() 是否为文件夹
//        isFile() 是否为文件
//        getPath() 得到file的路径
//        getName() 得到最后一层的名字
//        getParent() 得到去掉最后一层的路径
//        getParentFile() 得到父类路径的新文件
//        renameTo() 改名
//        mkdir() 创建新文件夹，只能创建一层
//        mkdirs() 创建新文件夹，可以多层
//        createNewFile() 创建新文件，只能一层
//        exists() 路径是否存在
//        delete() 删除文件或者目录（为空的目录）
//        list() 返回该路径下文件或者文件夹的名字数组
//        listFiles() 返回该路径下文件或者文件夹组成的File数组
//        separator 代替文件或文件夹路径的斜线或反斜线，防止跨平台出现错误

        File f = new File("E:\\FileTest");
        File[] ss = f.listFiles();
        for (File s : ss) {
            System.out.println(s.getName());
        }
    }

    @Test
    public void ioTest() throws IOException {
        File f = new File("E:\\FileTest\\aa.txt");
        OutputStream os = new FileOutputStream(f, true);
        os.write("dhsauidhas".getBytes());
        os.close();
    }
}
