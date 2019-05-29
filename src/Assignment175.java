
public class Assignment175 {


public static String lameDb(String db, String op, String id, String data) {
	String[] dbArr = db.split("#");
	switch (op) {
	case "add":
		return db + "#" + id + data;
	case "edit":
		dbArr[Integer.parseInt(id) - 1] = id + data;
		break;
	case "delete":
		dbArr[Integer.parseInt(id) - 1] = "";
		break;
	default:
		return db;

	}

	String result = "";
	for (int i = 0; i < dbArr.length; i++) {
		if (dbArr[i] != "") {
			result += dbArr[i] + "#";
		}
	}

	result = result.substring(0, result.length() - 1);

	return result;
	

}
}