package banyuan.day10.package01;

import java.io.*;

/**
 * @author 陈浩
 * @date Created on 2019/11/4
 * 以文件流的方式把指定文件夹中的图片,mp3读取到指定的文件夹中去
 */
public class P01 {
    public static void main(String[] args) throws IOException {
        File file1 = new File("/Users/newpc/desktop/111");
        File file2 = new File("/Users/newpc/desktop");
        if (!file1.exists()) {
            file1.mkdirs();
        }
        //过滤出你想要的文件
        File[] str1 = file2.listFiles(new FilenameFilter() {
            @Override
            public boolean accept(File dir, String name) {
                if (dir.exists()) {
                    return name.endsWith(".mp3") || name.endsWith(".png");
                }
                return false;
            }
        });

        for (File f : str1) {

            FileInputStream is = new FileInputStream(f);
            //判断目标文件夹中是否有要复制的文件，如果没有，就创建一个再将文件读进去
            File newFile = new File(file1.getPath() + '/' + f.getName());
            if (!newFile.exists()) {
                newFile.createNewFile();
            }
            FileOutputStream os = new FileOutputStream(newFile);
            byte[] bytes = new byte[(int) f.length()];
            is.read(bytes);
            os.write(bytes);
            is.close();
            os.close();
        }
    }
}