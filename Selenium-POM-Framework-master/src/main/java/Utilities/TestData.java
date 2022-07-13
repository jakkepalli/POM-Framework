package Utilities;

import java.util.Map;

public class TestData extends ParseExcel {
	public static Map<String, String> getTestData() throws Exception{
		return get_data(TEST_DATA_EXCEL_FILE, TEST_DATA_EXCEL_SHEET);
	}
}
