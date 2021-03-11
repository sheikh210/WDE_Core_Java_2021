package dataStructures;

public class LearnMultiDimensionalArrays {


    public static void main(String[] args) {
//
//        String[] names = {"Sami", "Furqan", "Alexandra", "Lamia", "Lamara", "Neila"};
//
//        for (String x : names) {
//            System.out.println(x);
//        }
                                           // Rows // Columns
//        String[][] studentInfo = new String   [6]      [3];
//
//        studentInfo[0][0] = "Sami";
//        studentInfo[0][1] = "Sheikh";
//        studentInfo[0][2] = "3472NY";
//
//        studentInfo[1][0] = "Furqan";
//        studentInfo[1][1] = "Javed";
//        studentInfo[1][2] = "8449KS";
//
//        studentInfo[2][0] = "Alexandra";
//        studentInfo[2][1] = "Erdely";
//        studentInfo[2][2] = "9336VA";
//
//        studentInfo[3][0] = "Lamia";
//        studentInfo[3][1] = "Bedjou";
//        studentInfo[3][2] = "8454OH";
//
//        studentInfo[4][0] = "Lamara";
//        studentInfo[4][1] = "Benz";
//        studentInfo[4][2] = "3113NY";
//
//        studentInfo[5][0] = "Neila";
//        studentInfo[5][1] = "Baileche";
//        studentInfo[5][2] = "4640PA";
//
//        for(String[] array : studentInfo){
//            for(String s : array){
//                System.out.println(s);
//            }
//            System.out.println();
//        }


        // Artist Name, Album Title, Year

        String[][] albums = new String[5][3];

        albums[0][0] = "Lil' Baby";
        albums[0][1] = "Harder Than Ever";
        albums[0][2] = "2018";

        albums[1][0] = "Cheb Khaled";
        albums[1][1] = "Kutche";
        albums[1][2] = "1988";

        albums[2][0] = "BTS";
        albums[2][1] = "Dark & Wild";
        albums[2][2] = "2014";

        albums[3][0] = "Drake";
        albums[3][1] = "Views";
        albums[3][2] = "2016";

        albums[4][0] = "50 Cent";
        albums[4][1] = "Get Rich Or Die Tryin'";
        albums[4][2] = "2003";

        for (String[] album : albums) {
            for (String s : album) {
                System.out.println(s);
            }
            System.out.println();
        }

    }



}
