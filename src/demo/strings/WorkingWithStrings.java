package demo.strings;

public class WorkingWithStrings {
    public static void main(String[] args) {
        String str = "Welcome";
        str = "Hello World";
        System.out.println(str);

        // Not recommended
        String query = "Select * from table";
        query = query + " where id = 1";
        query = query + " and name = '' ";

        // Older, slower but thread safe class
        StringBuffer buffer = new StringBuffer();
        buffer.append("");

        // Newer, faster and non thread safe, also recommended by Java
        StringBuilder builder = new StringBuilder();
        builder.append("Select * from table_name");
        builder.append("Select * from table_name");

    }
}
