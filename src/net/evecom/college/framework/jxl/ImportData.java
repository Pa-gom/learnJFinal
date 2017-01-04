package net.evecom.college.framework.jxl;


import com.jfinal.core.Controller;
import com.jfinal.kit.PathKit;
import com.jfinal.upload.UploadFile;
import jxl.Cell;
import jxl.Sheet;
import jxl.Workbook;
import jxl.read.biff.BiffException;
import net.evecom.college.framework.model.EmpStudentBaseInfo;
import net.sf.json.JSONObject;

import java.io.*;
import java.nio.channels.FileChannel;
import java.util.*;

/**
 * Created by Ezreal on 2017/1/2.
 */
public class ImportData extends Controller {


    public void submitStuFile() {
        System.out.print("$$$$$$$$$$$$$");
        UploadFile uploadFile = getFile();

        String fileName = uploadFile.getOriginalFileName();


        File file = uploadFile.getFile();
        FileService fs = new FileService();
        File t = new File("\\" + UUID.randomUUID().toString());
        try {
            t.createNewFile();
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        fs.fileChannelCopy(file, t);
        file.delete();
        this.renderHtml("success,<a href=\"./\">back</a>");
    }


    /**
     * excel文件导入学生基本信息
     *
     * @throws BiffException
     * @throws IOException
     */
    public void readStuInfo() throws BiffException, IOException {


        // 异步上传时，无法通过uploadFile.getFileName()获取文件名
        String fileName = getPara("stuFile");
        System.out.print(fileName);
        fileName = fileName.substring(fileName.lastIndexOf("\\") + 1); // 去掉路径

        // 异步上传时，无法通过File source = uploadFile.getFile();获取文件
        File source = new File(PathKit.getWebRootPath() + "/temp/" + fileName); // 获取临时文件对象

        String extension = fileName.substring(fileName.lastIndexOf("."));
        String savePath = PathKit.getWebRootPath() + "/upload/"
                + "123";
        JSONObject json = new JSONObject();

        if (".png".equals(extension) || ".jpg".equals(extension)
                || ".gif".equals(extension) || "jpeg".equals(extension)
                || "bmp".equals(extension)) {
            fileName = "123" + extension;

            try {
                FileInputStream fis = new FileInputStream(source);

                File targetDir = new File(savePath);
                if (!targetDir.exists()) {
                    targetDir.mkdirs();
                }

                File target = new File(targetDir, fileName);
                if (!target.exists()) {
                    target.createNewFile();
                }

                FileOutputStream fos = new FileOutputStream(target);
                byte[] bts = new byte[1024 * 20];
                while (fis.read(bts, 0, 1024 * 20) != -1) {
                    fos.write(bts, 0, 1024 * 20);
                }

                fos.close();
                fis.close();
                json.put("error", 0);
                json.put("src", "upload/images/" + "123"
                        + "/" + fileName); // 相对地址，显示图片用
                source.delete();

            } catch (FileNotFoundException e) {
                json.put("error", 1);
                json.put("message", "上传出现错误，请稍后再上传");
            } catch (IOException e) {
                json.put("error", 1);
                json.put("message", "文件写入服务器出现错误，请稍后再上传");
            }
        } else {
            source.delete();
            json.put("error", 1);
            json.put("message", "只允许上传png,jpg,jpeg,gif,bmp类型的图片文件");
        }

        ArrayList<String[]> list = new ArrayList<>();
        Workbook rwb = null;
        Cell cell = null;

        //创建输入流
        //InputStream stream = Thread.currentThread().getContextClassLoader().getResourceAsStream(up.getUploadPath());
        InputStream stream = new FileInputStream(source);

        //获取Excel文件对象
        rwb = Workbook.getWorkbook(stream);

        //获取文件的指定工作表 默认的第一个
        Sheet sheet = rwb.getSheet(0);

        //行数(表头的目录不需要，从1开始)
        for (int i = 0; i < sheet.getRows(); i++) {
            //创建一个数组 用来存储每一列的值
            String[] str = new String[sheet.getColumns()];
            //列数
            for (int j = 0; j < sheet.getColumns(); j++) {
                //获取第i行，第j列的值
                cell = sheet.getCell(j, i);
                str[j] = cell.getContents();

            }
            //把刚获取的列存入list
            list.add(str);
        }
        EmpStudentBaseInfo.dao.saveExcelList(list);
        renderJson();
    }

    /**
     * 打开上传导入学生信息excel框
     */
    public void stu() {
        renderFreeMarker("/admin/dialog/dialogImportStu.jsp");
    }

    private String generateWord() {
        String[] beforeShuffle = new String[]{"2", "3", "4", "5", "6", "7",
                "8", "9", "A", "B", "C", "D", "E", "F", "G", "H", "I", "J",
                "K", "L", "M", "N", "O", "P", "Q", "R", "S", "T", "U", "V",
                "W", "X", "Y", "Z"};
        List<String> list = Arrays.asList(beforeShuffle);
        Collections.shuffle(list);
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < list.size(); i++) {
            sb.append(list.get(i));
        }
        String afterShuffle = sb.toString();
        String result = afterShuffle.substring(5, 9);
        return result;
    }


    public class FileService {

        public void fileChannelCopy(File s, File t) {

            FileInputStream fi = null;

            FileOutputStream fo = null;

            FileChannel in = null;

            FileChannel out = null;

            try {

                fi = new FileInputStream(s);

                fo = new FileOutputStream(t);

                in = fi.getChannel();// 得到对应的文件通道

                out = fo.getChannel();// 得到对应的文件通道

                in.transferTo(0, in.size(), out);// 连接两个通道，并且从in通道读取，然后写入out通道

            } catch (IOException e) {

                e.printStackTrace();

            } finally {

                try {

                    fi.close();

                    in.close();

                    fo.close();

                    out.close();

                } catch (IOException e) {

                    e.printStackTrace();

                }

            }

        }
    }
}
