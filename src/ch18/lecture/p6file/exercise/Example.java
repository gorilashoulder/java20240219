package ch18.lecture.p6file.exercise;

import java.io.*;
import java.util.Scanner;

public class Example{
    public static void main(String[] args) throws IOException {
        Scanner scanner=new Scanner(System.in);

        System.out.print("원본 파일 경로:");
        String originFilePath= scanner.nextLine();

        System.out.print("복사 파일 경로:");
        String copyFilePath= scanner.nextLine();

        File orginfile=new File(originFilePath);
        if(!orginfile.exists()){
            System.out.println("originfile = 존재하지않습니다");
        }

        File targetFile = new File(copyFilePath);
        File parentFile = targetFile.getParentFile();
        if(!parentFile.exists()){
            parentFile.mkdirs();
        }

        BufferedInputStream bis = new BufferedInputStream(new FileInputStream(originFilePath));
        BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream(copyFilePath));

        byte[] data = new byte[1024]; int num = -1;
        while(true) {
            num = bis.read(data);
            if(num == -1) break;
            bos.write(data, 0, num);
        }
        System.out.println("복사가 성공되었습니다.");

        bis.close();
        bos.close();

    }
}
