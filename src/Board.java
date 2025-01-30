import java.awt.Color;

public class Board {
    
    Property[][] properties = new Property[11][11];

    public Board() {

        Display.properties= properties;

<<<<<<< HEAD
        properties[10][10] = new Property(new Color(102, 102, 102), "Go", "0", 0, 0);
        properties[10][9] = new Property(new Color(0, 114, 187), "Boardwalk", "400", 200, 220);
        properties[10][8] = new Property(new Color(205, 230, 208), "Luxury Tax", "100", 0, 0);
        properties[10][7] = new Property(new Color(0, 114, 187), "Park Place", "350", 175, 193);
        properties[10][6] = new Property(new Color(205, 230, 208), "Chance", "0", 0, 0);
        properties[10][5] = new Property(new Color(0, 0, 0), "Short Line Railroad", "200", 100, 110);
        properties[10][4] = new Property(new Color(31, 178, 90), "Pennsylvania Avenue", "320", 160, 176);
        properties[10][3] = new Property(new Color(205, 230, 208), "Community Chest", "0", 0, 0);
        properties[10][2] = new Property(new Color(31, 178, 90), "North Carolina Avenue", "300", 150, 165);
        properties[10][1] = new Property(new Color(31, 178, 90), "Pacific Avenue", "300", 150, 165);
        properties[10][0] = new Property(new Color(102, 102, 102), "Go to Jail", "0", 0, 0);

        properties[9][0] = new Property(new Color(254, 242, 0), "Marvin Gardens", "280", 140, 154);
        properties[8][0] = new Property(new Color(255, 255, 255), "Water Works", "150", 75, 83);
        properties[7][0] = new Property(new Color(254, 242, 0), "Ventnor Avenue", "260", 130, 143);
        properties[6][0] = new Property(new Color(254, 242, 0), "Atlantic Avenue", "260", 130, 143);
        properties[5][0] = new Property(new Color(0, 0, 0), "B.&O. Railroad", "200", 100, 110);
        properties[4][0] = new Property(new Color(237, 27, 36), "Illinois Avenue", "240", 120, 132);
        properties[3][0] = new Property(new Color(237, 27, 36), "Indiana Avenue", "220", 110, 121);
        properties[2][0] = new Property(new Color(205, 230, 208), "Chance", "0", 0, 0);
        properties[1][0] = new Property(new Color(237, 27, 36), "Kentucky Avenue", "220", 110, 121);
        properties[0][0] = new Property(new Color(102, 102, 102), "Free Parking", "0", 0, 0);

        properties[0][1] = new Property(new Color(247, 148, 29), "New York Avenue", "200", 100, 110);
        properties[0][2] = new Property(new Color(247, 148, 29), "Tennessee Avenue", "180", 90, 99);
        properties[0][3] = new Property(new Color(205, 230, 208), "Community Chest", "0", 0, 0);
        properties[0][4] = new Property(new Color(247, 148, 29), "St. James Place", "180", 90, 99);
        properties[0][5] = new Property(new Color(0, 0, 0), "Pennsylvania Railroad", "200", 100, 110);
        properties[0][6] = new Property(new Color(217, 58, 150), "Virginia Avenue", "160", 80, 88);
        properties[0][7] = new Property(new Color(217, 58, 150), "States Avenue", "140", 70, 77);
        properties[0][8] = new Property(new Color(255, 255, 255), "Electric Company", "150", 75, 83);
        properties[0][9] = new Property(new Color(217, 58, 150), "St. Charles Place", "140", 70, 77);   
        properties[0][10] = new Property(new Color(102, 102, 102), "Jail", "0", 0, 0);
=======
        properties[10][10] = new Property(new Color(205, 230, 208), "Go", null, 0, 0, 0, 0, null, false, false, false, false, false);
        properties[10][9] = new Property(new Color(0, 114, 187), "Boardwalk", null, 0, 0, 0, 0, new int[]{}, false, false, true, false, false);
        properties[10][8] = new Property(new Color(205, 230, 208), "Luxury Tax", null, 0, 0, 0, 0, null, false, false, false, false, false);
        properties[10][7] = new Property(new Color(0, 114, 187), "Park Place", null, 0, 0, 0, 0, new int[]{}, false, false, true, false, false);
        properties[10][6] = new Property(new Color(205, 230, 208), "Chance", null, 0, 0, 0, 0, null, false, false, false, true, false);
        properties[10][5] = new Property(new Color(0, 0, 0), "Short Line Railroad", null, 0, 0, 0, 0, new int[]{}, true, false, true, false, false);
        properties[10][4] = new Property(new Color(31, 178, 90), "Pennsylvania Avenue", null, 0, 0, 0, 0, new int[]{}, false, false, true, false, false);
        properties[10][3] = new Property(new Color(205, 230, 208), "Community Chest", null, 0, 0, 0, 0, null, false, false, false, false, true);
        properties[10][2] = new Property(new Color(31, 178, 90), "North Carolina Avenue", null, 0, 0, 0, 0, new int[]{}, false, false, true, false, false);
        properties[10][1] = new Property(new Color(31, 178, 90), "Pacific Avenue", null, 0, 0, 0, 0, new int[]{}, false, false, true, false, false);
        properties[10][0] = new Property(new Color(205, 230, 208), "Go to Jail", null, 0, 0, 0, 0, null, false, false, false, false, false);

        properties[9][0] = new Property(new Color(254, 242, 0), "Marvin Gardens", null, 0, 0, 0, 0, new int[]{}, false, false, true, false, false);
        properties[8][0] = new Property(new Color(255, 255, 255), "Water Works", null, 0, 0, 0, 0, new int[]{}, false, true, true, false, false);
        properties[7][0] = new Property(new Color(254, 242, 0), "Ventnor Avenue", null, 0, 0, 0, 0, new int[]{}, false, false, true, false, false);
        properties[6][0] = new Property(new Color(254, 242, 0), "Atlantic Avenue", null, 0, 0, 0, 0, new int[]{}, false, false, true, false, false);
        properties[5][0] = new Property(new Color(0, 0, 0), "B.&O. Railroad", null, 0, 0, 0, 0, new int[]{}, true, false, true , false, false);
        properties[4][0] = new Property(new Color(237, 27, 36), "Illinois Avenue", null, 0, 0, 0, 0, new int[]{}, false, false, true, false, false);
        properties[3][0] = new Property(new Color(237, 27, 36), "Indiana Avenue", null, 0, 0, 0, 0, new int[]{}, false, false, true, false, false);
        properties[2][0] = new Property(new Color(205, 230, 208), "Chance", null, 0, 0, 0, 0, null, false, false, false, true, false);
        properties[1][0] = new Property(new Color(237, 27, 36), "Kentucky Avenue", null, 0, 0, 0, 0, new int[]{}, false, false, true, false, false);
        properties[0][0] = new Property(new Color(205, 230, 208), "Free Parking", null, 0, 0, 0, 0, null, false, false, false, false, false);

        properties[0][1] = new Property(new Color(247, 148, 29), "New York Avenue", null, 0, 0, 0, 0, new int[]{}, false, false, true, false, false);
        properties[0][2] = new Property(new Color(247, 148, 29), "Tennessee Avenue", null, 0, 0, 0, 0, new int[]{}, false, false, true, false, false);
        properties[0][3] = new Property(new Color(205, 230, 208), "Community Chest", null, 0, 0, 0, 0, null, false, false, false, false, true);
        properties[0][4] = new Property(new Color(247, 148, 29), "St. James Place", null, 0, 0, 0, 0, new int[]{}, false, false, true, false, false);
        properties[0][5] = new Property(new Color(0, 0, 0), "Pennsylvania Railroad", null, 0, 0, 0, 0, new int[]{}, true, false, true, false, false);
        properties[0][6] = new Property(new Color(217, 58, 150), "Virginia Avenue", null, 0, 88, 0, 0, new int[]{}, false, false, true, false, false);
        properties[0][7] = new Property(new Color(217, 58, 150), "States Avenue", null, 0, 0, 0, 0, new int[]{}, false, false, true, false, false);
        properties[0][8] = new Property(new Color(255, 255, 255), "Electric Compan", null, 0, 0, 0, 0, new int[]{}, false, true, true, false, false);
        properties[0][9] = new Property(new Color(217, 58, 150), "St. Charles Place", null, 0, 0, 0, 0, new int[]{}, false, false, true, false, false);   
        properties[0][10] = new Property(new Color(205, 230, 208), "Jail", "0", 0, 0, 0, 0, null, false, false, false, false, false);
>>>>>>> 24c2a930a4b23cf7afe41b32eae5ce11cd5e2ed9

        properties[1][10] = new Property(new Color(170, 224, 250), "Connecticut Avenue", "120", 60, 66, 0, 0, null, false, false, false, false, false);
        properties[2][10] = new Property(new Color(170, 224, 250), "Vermont Avenue", "100", 50, 55, 0, 0, null, false, false, false, false, false);
        properties[3][10] = new Property(new Color(205, 230, 208), "Chance", "0", 0, 0, 0, 0, null, false, false, false, false, false);
        properties[4][10] = new Property(new Color(170, 224, 250), "Oriental Avenue", "100", 50, 55, 0, 0, null, false, false, false, false, false);
        properties[5][10] = new Property(new Color(0, 0, 0), "Reading Railroad", "200", 100, 110, 0, 0, null, false, false, false, false, false);
        properties[6][10] = new Property(new Color(205, 230, 208), "Income Tax", "0", 0, 0, 0, 0, null, false, false, false, false, false);
        properties[7][10] = new Property(new Color(139,87,59), "Baltic Avenue", "60", 30, 33, 0, 0, null, false, false, false, false, false);
        properties[8][10] = new Property(new Color(205, 230, 208), "Community Chest", "0", 0, 0, 0, 0, null, false, false, false, false, false);
        properties[9][10] = new Property(new Color(139,87,59), "Mediterranean Avenue", "60", 30, 33, 0, 0, null, false, false, false, false, false);
    }
}
