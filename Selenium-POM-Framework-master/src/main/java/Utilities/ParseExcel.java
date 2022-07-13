package Utilities;

import java.io.File;
import java.util.HashMap;
import java.util.Map;

import Variables.variableProvider;
import jxl.Sheet;
import jxl.Workbook;


public class ParseExcel extends variableProvider{
	
	public static Map<String, String> get_data(String file, String sheetName) throws Exception{
		Workbook workbook = Workbook.getWorkbook(new File(file));
		Sheet sheet = workbook.getSheet(sheetName);
		int records = sheet.getRows()-1;
		int currentPosition = 1;
		int cols = 2;
		String[][] values = new String[records][cols];
		for(int i = 0 ; i < records ; i++, currentPosition++){
			for(int j = 0 ; j < cols ; j++) values[i][j] = sheet.getCell(j, currentPosition).getContents();
		}
		workbook.close();
		final Map<String, String> map = new HashMap<String, String>();
		for (String[] mapping : values)
		{
		    map.put(mapping[0], mapping[1]);
		}
		return map;	
	}

}
