
package Defender20XX;

import java.awt.event.KeyEvent;
import java.util.Iterator;

public class TestSceneDelete extends Scene {
    final private Building building;
    TestSceneDelete() {
        building = new Building(10, 10);
        sceneObjects.add(building);
    }
}
