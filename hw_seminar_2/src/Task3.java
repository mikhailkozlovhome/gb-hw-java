import java.util.Arrays;

public class Task3 {
    public static void execute() {
        /*
         * Дана json-строка (можно сохранить в файл и читать из файла)
         * [{"фамилия":"Иванов","оценка":"5","предмет":"Математика"},{"фамилия":
         * "Петрова","оценка":"4","предмет":"Информатика"},{"фамилия":"Краснов","оценка"
         * :"5","предмет":"Физика"}]
         * Написать метод(ы), который распарсит json и, используя StringBuilder, создаст
         * строки вида: Студент [фамилия] получил [оценка] по предмету [предмет].
         * Пример вывода:
         * Студент Иванов получил 5 по предмету Математика.
         * Студент Петрова получил 4 по предмету Информатика.
         * Студент Краснов получил 5 по предмету Физика.
         */

        
        String strJson = "{\"фамилия\":\"Иванов\",\"оценка\":\"5\",\"предмет\":\"Математика\"},{\"фамилия\":\"Петрова\",\"оценка\":\"4\",\"предмет\":\"Информатика\"},{\"фамилия\":\"Краснов\",\"оценка\":\"5\",\"предмет\":\"Физика\"}";
        String resultStr = parseStr(strJson);

        System.out.println(resultStr);
    }
    private static String parseStr(String str) {

        str = formattedStr(str);
        String[] arr = strToArr(str);
        StringBuilder sb = new StringBuilder();
        // for (int i = 0; i < arr.length; i++) {
        //     sb.append("Студент");
        //         sb.append(arr[i].split(":")[1]);
        //         sb.append(" = '");
        //         sb.append(arr[i].split(":")[1]);
        //         if ((i < arr.length - 1) && (!arr[i + 1].split(":")[1].equalsIgnoreCase("null"))) {

        //             sb.append("' and");

        //         } else {

        //             // if (!arrWhere[i].split(":")[1].equalsIgnoreCase("null")) {
        //             sb.append("'");

        //             // }
        //         }
        //     }
        // }

        //return sb.toString();
        return Arrays.toString(arr);
    }

    private static String[] strToArr(String str) {
        if (str.indexOf(",") >= 0) {
        return str.split("\\},\\{");
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


