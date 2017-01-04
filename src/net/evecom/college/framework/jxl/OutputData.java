package net.evecom.college.framework.jxl;


import com.jfinal.core.Controller;
import jxl.Cell;
import jxl.Sheet;
import jxl.Workbook;
import jxl.read.biff.BiffException;
import net.evecom.college.framework.model.EmpStudentBaseInfo;

import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;

/**
 * Created by Ezreal on 2017/1/2.
 */
public class OutputData extends Controller {


    public void readExcel() throws BiffException, IOException {
        //创建一个list 用来存储读取的内容
        ArrayList<String[]> list = new ArrayList();
        Workbook rwb = null;
        Cell cell = null;

        //创建输入流
        InputStream stream = Thread.currentThread().getContextClassLoader().getResourceAsStream("collegeList.xls");
        //InputStream stream = new FileInputStream(new File("src/collegeList.xls"));

        //获取Excel文件对象
        rwb = Workbook.getWorkbook(stream);

        //获取文件的指定工作表 默认的第一个
        Sheet sheet = rwb.getSheet(0);

        EmpStudentBaseInfo info = null;
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
            EmpStudentBaseInfo.dao.saveExcelList(list);
        }
        for (int i = 0; i < list.size(); i++) {
            String[] str = (String[]) list.get(i);
            for (int j = 0; j < str.length; j++) {
                System.out.println(str[j]);
            }
        }

        setAttr("first", list.get(1));
        renderJson();
    }

}
