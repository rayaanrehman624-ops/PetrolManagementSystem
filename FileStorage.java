package petrolmanagementsystem;

import java.io.*;

public class FileStorage {

    private static final String FILE_NAME = "storage.txt";

    public static void saveData(String data, String string, String data2) {

        try (BufferedWriter writer =
                 new BufferedWriter(new FileWriter(FILE_NAME, true))) {

            writer.write(data);
            writer.newLine();

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static String loadData() {

        StringBuilder sb = new StringBuilder();

        try {

            File file = new File(FILE_NAME);

            if (!file.exists()) {
                file.createNewFile();
            }

            BufferedReader br =
                    new BufferedReader(new FileReader(file));

            String line;

            while ((line = br.readLine()) != null) {
                sb.append(line).append("\n");
            }

            br.close();

        } catch (IOException e) {
            e.printStackTrace();
        }

        return sb.toString();
    }

	public static String readData(String string, String string2) {
		// TODO Auto-generated method stub
		return null;
	}
}
