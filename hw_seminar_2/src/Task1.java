public class Task1 {

    // 1) Дана строка sql-запроса "select * from students where ". Сформируйте часть
    // WHERE этого запроса, используя StringBuilder. Данные для фильтрации приведены
    // ниже в виде json-строки.
    // Если значение null, то параметр не должен попадать в запрос.
    // Параметры для фильтрации: {"name":"Ivanov", "country":"Russia",
    // "city":"Moscow", "age":"null"}

    // 2) Реализуйте алгоритм сортировки пузырьком числового массива, результат
    // после каждой итерации запишите в лог-файл.

    public static void execute() {

        String strSelect = "select * from students where ";
        String strWhere = "{\"name\":\"Ivanov\", \"country\":\"Russia\", \"city\":\"Moscow\", \"age\":\"null\"}";
        String resultStr = "";

        resultStr = strSelect + parseStr(strWhere);

        System.out.println(resultStr);
    }

    private static String parseStr(String str) {

        str = formattedStr(str);
        String[] arrWhere = strToArr(str);
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < arrWhere.length; i++) {
            if (!arrWhere[i].split(":")[1].equalsIgnoreCase("null")) {
                sb.append(arrWhere[i].split(":")[0]);
                sb.append(" = '");
                sb.append(arrWhere[i].split(":")[1]);
                if ((i < arrWhere.length - 1) && (!arrWhere[i + 1].split(":")[1].equalsIgnoreCase("null"))) {

                    sb.append("' and");

                } else {

                    // if (!arrWhere[i].split(":")[1].equalsIgnoreCase("null")) {
                    sb.append("'");

                    // }
                }
            }
        }

        return sb.toString();
    }

    private static String[] strToArr(String str) {
        if (str.indexOf(",") >= 0) {
            return str.split(",");
        }
        return null;

    }

    private static String formattedStr(String str) {
        if ((str.indexOf("{") >= 0) || (str.indexOf("}") >= 0) || (str.indexOf("\"") >= 0)) {
            str = str.replace("{", "");
            str = str.replace("}", "");
            str = str.replace("\"", "");
            str = str.strip();
        }

        return str;
    }
}
