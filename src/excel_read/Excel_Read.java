package excel_read;

import java.io.File;
import jxl.Cell;
import jxl.Sheet;
import jxl.Workbook;

public class Excel_Read {

    public static void main(String[] args) throws Exception{
        File f = new File("C:\\Users\\Noor\\Desktop\\Hello World Two.xls");
        Workbook wb = Workbook.getWorkbook(f);
        Sheet s = wb.getSheet(0);
        int row = s.getRows();
        int col = s.getColumns();
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                Cell c = s.getCell(j, i);
                System.out.println(c.getContents()+"\t\t");
            }
        }
    }
    
}
