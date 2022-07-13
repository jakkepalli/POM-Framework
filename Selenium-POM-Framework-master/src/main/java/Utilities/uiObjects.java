package Utilities;

import java.util.Map;


public class uiObjects extends ParseExcel{
	
	private String excelSheet;
	
	public uiObjects(String excelSheet) {
		this.excelSheet = excelSheet;
	}
	public Map<String, String> getUiObjects() throws Exception{
		return get_data(OBJECTS_EXCEL_FILE, excelSheet);
	}
}
