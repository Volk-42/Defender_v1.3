
package Defender20XX;

import java.io.BufferedReader;
import java.io.FileReader;

public class SpriteLoader {
    private int[][] spriteGrid;
    SpriteLoader(String fileName) {
        String s = "";
        try {
            BufferedReader br = new BufferedReader(new FileReader(fileName));
            s = br.readLine();
        }
        catch (Exception e) {
            System.out.println(e);
        }
        String[] stringArray = s.split(",");
        int length = stringArray.length/2;
        spriteGrid = new int[length][2];
        int index = 0;
        for(int i = 0; i < length; i++) {
            spriteGrid[i][0] = Integer.parseInt(stringArray[index]);
            spriteGrid[i][1] = Integer.parseInt(stringArray[index+1]);
            index+=2;
        }
    }
    public int[][] getSprite() {
        return spriteGrid;
    }
}
