package main;

import Entities.NPC_Oldman;
import object.OBJ_Door;
import object.OBJ_Key;


public class ObjectHandler {

    GamePanel gp;

    public ObjectHandler(GamePanel gp) {
        this.gp = gp;
    }

    public void setObject() {
        gp.obj[0] = new OBJ_Key(gp);
        gp.obj[0].worldX = gp.tileSize * 21;
        gp.obj[0].worldY = gp.tileSize * 22;

        gp.obj[1] = new OBJ_Door(gp);
        gp.obj[1].worldX = gp.tileSize * 23;
        gp.obj[1].worldY = gp.tileSize * 25;

    }

    public void setNpc() {

        gp.npc[0] = new NPC_Oldman(gp);
        gp.npc[0].worldX = gp.tileSize * 21;
        gp.npc[0].worldY = gp.tileSize * 21;

        gp.npc[1] = new NPC_Oldman(gp);
        gp.npc[1].worldX = gp.tileSize * 11;
        gp.npc[1].worldY = gp.tileSize * 21;


        gp.npc[2] = new NPC_Oldman(gp);
        gp.npc[2].worldX = gp.tileSize * 31;
        gp.npc[2].worldY = gp.tileSize * 21;


        gp.npc[3] = new NPC_Oldman(gp);
        gp.npc[3].worldX = gp.tileSize * 21;
        gp.npc[3].worldY = gp.tileSize * 11;

        gp.npc[4] = new NPC_Oldman(gp);
        gp.npc[4].worldX = gp.tileSize * 21;
        gp.npc[4].worldY = gp.tileSize * 31;

    }
}
