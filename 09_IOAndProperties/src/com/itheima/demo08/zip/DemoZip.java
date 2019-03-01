package com.itheima.demo08.zip;

import java.io.File;
import java.io.IOException;
import java.util.zip.ZipEntry;
import java.util.zip.ZipOutputStream;

public class DemoZip {
    public static void main(String[] args){
        // 09_IOAndProperties
    }
    private static void compressDir(File dir, ZipOutputStream zos, String baseDir) {
        if (!dir.exists())
            return;
        File[] files = dir.listFiles();
        if(files.length == 0){
            try {
                zos.putNextEntry(new ZipEntry(baseDir + dir.getName() + File.separator));
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        for (File file : files) {
//            compressbyType(file, zos, baseDir + dir.getName() + File.separator);
        }
    }
}
