package age.of.civilizations2.jakowski.lukasz;

import com.badlogic.gdx.Gdx;
import java.util.ArrayList;

public class CivArmyMission_NavalInvasion extends CivArmyMission {
    public int iCivID;
    public int moveArmyInNextXTurns = 1;
    public int numOfUnitsMoved = 0;

    public CivArmyMission_NavalInvasion(int nCivID, int fromProvinceID, int toProvinceID) {
        this.iProvinceID = fromProvinceID;
        this.toProvinceID = toProvinceID;
        this.MISSION_ID = -1;
        this.iCivID = nCivID;
        this.MISSION_TYPE = CivArmyMission_Type.NAVAL_INVASION;
        this.TURN_ID = Game_Calendar.TURN_ID;
        this.iObsolate = 10;
        this.iArmy = (int) (((float) CFG.game.getProvince(fromProvinceID).getArmyCivID(nCivID)) * (0.685f + (((float) CFG.oR.nextInt(25)) / 100.0f)));
    }

    public boolean canMakeAction(int nCivID, int iTurnsLeft) {
        return true;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0129, code lost:
        if (action_BuildPort(r17.iProvinceID, r17.toProvinceID) != false) goto L_0x012b;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean action(int r18) {
        /*
            r17 = this;
            age.of.civilizations2.jakowski.lukasz.Game r1 = age.of.civilizations2.jakowski.lukasz.CFG.game
            age.of.civilizations2.jakowski.lukasz.Game r2 = age.of.civilizations2.jakowski.lukasz.CFG.game
            r0 = r17
            int r3 = r0.toProvinceID
            age.of.civilizations2.jakowski.lukasz.Province r2 = r2.getProvince(r3)
            int r2 = r2.getCivID()
            r0 = r18
            boolean r1 = r1.getCivsAtWar(r0, r2)
            if (r1 != 0) goto L_0x006c
            age.of.civilizations2.jakowski.lukasz.Game r1 = age.of.civilizations2.jakowski.lukasz.CFG.game
            age.of.civilizations2.jakowski.lukasz.Game r2 = age.of.civilizations2.jakowski.lukasz.CFG.game
            r0 = r17
            int r3 = r0.toProvinceID
            age.of.civilizations2.jakowski.lukasz.Province r2 = r2.getProvince(r3)
            int r2 = r2.getCivID()
            r0 = r18
            boolean r1 = r1.getCivsAreAllied(r0, r2)
            if (r1 != 0) goto L_0x0037
            r1 = 0
            r0 = r17
            r0.iObsolate = r1
            r1 = 1
        L_0x0036:
            return r1
        L_0x0037:
            age.of.civilizations2.jakowski.lukasz.Game r1 = age.of.civilizations2.jakowski.lukasz.CFG.game
            age.of.civilizations2.jakowski.lukasz.Game r2 = age.of.civilizations2.jakowski.lukasz.CFG.game
            r0 = r17
            int r3 = r0.toProvinceID
            age.of.civilizations2.jakowski.lukasz.Province r2 = r2.getProvince(r3)
            int r2 = r2.getCivID()
            age.of.civilizations2.jakowski.lukasz.Civilization r1 = r1.getCiv(r2)
            age.of.civilizations2.jakowski.lukasz.Game r2 = age.of.civilizations2.jakowski.lukasz.CFG.game
            r0 = r17
            int r3 = r0.toProvinceID
            age.of.civilizations2.jakowski.lukasz.Province r2 = r2.getProvince(r3)
            int r2 = r2.getCivRegionID()
            age.of.civilizations2.jakowski.lukasz.Civilization_Region r1 = r1.getCivRegion(r2)
            r0 = r18
            boolean r1 = r1.checkRegionBordersWithEnemy(r0)
            if (r1 != 0) goto L_0x006c
            r1 = 0
            r0 = r17
            r0.iObsolate = r1
            r1 = 1
            goto L_0x0036
        L_0x006c:
            age.of.civilizations2.jakowski.lukasz.Game r1 = age.of.civilizations2.jakowski.lukasz.CFG.game
            r0 = r17
            int r2 = r0.iProvinceID
            age.of.civilizations2.jakowski.lukasz.Province r1 = r1.getProvince(r2)
            boolean r1 = r1.getBordersWithEnemy()
            if (r1 == 0) goto L_0x0083
            r1 = 0
            r0 = r17
            r0.iObsolate = r1
            r1 = 1
            goto L_0x0036
        L_0x0083:
            age.of.civilizations2.jakowski.lukasz.Game r1 = age.of.civilizations2.jakowski.lukasz.CFG.game
            age.of.civilizations2.jakowski.lukasz.Game r2 = age.of.civilizations2.jakowski.lukasz.CFG.game
            r0 = r17
            int r3 = r0.iProvinceID
            age.of.civilizations2.jakowski.lukasz.Province r2 = r2.getProvince(r3)
            int r2 = r2.getCivID()
            age.of.civilizations2.jakowski.lukasz.Civilization r1 = r1.getCiv(r2)
            age.of.civilizations2.jakowski.lukasz.Game r2 = age.of.civilizations2.jakowski.lukasz.CFG.game
            r0 = r17
            int r3 = r0.iProvinceID
            age.of.civilizations2.jakowski.lukasz.Province r2 = r2.getProvince(r3)
            int r2 = r2.getCivRegionID()
            age.of.civilizations2.jakowski.lukasz.Civilization_Region r1 = r1.getCivRegion(r2)
            r0 = r18
            boolean r1 = r1.checkRegionBordersWithEnemy(r0)
            if (r1 == 0) goto L_0x00b9
            r1 = 0
            r0 = r17
            r0.iObsolate = r1
            r1 = 1
            goto L_0x0036
        L_0x00b9:
            age.of.civilizations2.jakowski.lukasz.Game r1 = age.of.civilizations2.jakowski.lukasz.CFG.game
            r0 = r18
            age.of.civilizations2.jakowski.lukasz.Civilization r1 = r1.getCiv(r0)
            int r1 = r1.getMovePoints()
            float r1 = (float) r1
            age.of.civilizations2.jakowski.lukasz.Ideologies_Manager r2 = age.of.civilizations2.jakowski.lukasz.CFG.ideologiesManager
            age.of.civilizations2.jakowski.lukasz.Game r3 = age.of.civilizations2.jakowski.lukasz.CFG.game
            r0 = r18
            age.of.civilizations2.jakowski.lukasz.Civilization r3 = r3.getCiv(r0)
            int r3 = r3.getIdeologyID()
            age.of.civilizations2.jakowski.lukasz.Ideology r2 = r2.getIdeology(r3)
            int r2 = r2.COST_OF_MOVE
            float r2 = (float) r2
            r3 = 1075838976(0x40200000, float:2.5)
            float r2 = r2 * r3
            int r1 = (r1 > r2 ? 1 : (r1 == r2 ? 0 : -1))
            if (r1 >= 0) goto L_0x00e5
            r1 = 0
            goto L_0x0036
        L_0x00e5:
            com.badlogic.gdx.Application r1 = com.badlogic.gdx.Gdx.app
            java.lang.String r2 = "AoC"
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r5 = "NavalInvasion -> "
            java.lang.StringBuilder r3 = r3.append(r5)
            age.of.civilizations2.jakowski.lukasz.Game r5 = age.of.civilizations2.jakowski.lukasz.CFG.game
            r0 = r18
            age.of.civilizations2.jakowski.lukasz.Civilization r5 = r5.getCiv(r0)
            java.lang.String r5 = r5.getCivName()
            java.lang.StringBuilder r3 = r3.append(r5)
            java.lang.String r3 = r3.toString()
            r1.log(r2, r3)
            age.of.civilizations2.jakowski.lukasz.Game r1 = age.of.civilizations2.jakowski.lukasz.CFG.game
            r0 = r17
            int r2 = r0.iProvinceID
            age.of.civilizations2.jakowski.lukasz.Province r1 = r1.getProvince(r2)
            int r1 = r1.getLevelOfPort()
            if (r1 <= 0) goto L_0x012b
            r0 = r17
            int r1 = r0.iProvinceID
            r0 = r17
            int r2 = r0.toProvinceID
            r0 = r17
            boolean r1 = r0.action_BuildPort(r1, r2)
            if (r1 == 0) goto L_0x0704
        L_0x012b:
            com.badlogic.gdx.Application r1 = com.badlogic.gdx.Gdx.app
            java.lang.String r2 = "AoC"
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r5 = "NavalInvasion -> 000, moveArmyInNextXTurns: "
            java.lang.StringBuilder r3 = r3.append(r5)
            r0 = r17
            int r5 = r0.moveArmyInNextXTurns
            java.lang.StringBuilder r3 = r3.append(r5)
            java.lang.String r3 = r3.toString()
            r1.log(r2, r3)
            age.of.civilizations2.jakowski.lukasz.Game r1 = age.of.civilizations2.jakowski.lukasz.CFG.game
            r0 = r17
            int r2 = r0.iProvinceID
            age.of.civilizations2.jakowski.lukasz.Province r1 = r1.getProvince(r2)
            r0 = r18
            int r1 = r1.getArmyCivID(r0)
            if (r1 <= 0) goto L_0x050f
            r0 = r17
            int r1 = r0.moveArmyInNextXTurns
            int r2 = r1 + -1
            r0 = r17
            r0.moveArmyInNextXTurns = r2
            if (r1 > 0) goto L_0x050f
            age.of.civilizations2.jakowski.lukasz.RegroupArmy_Data_AtWar r15 = new age.of.civilizations2.jakowski.lukasz.RegroupArmy_Data_AtWar
            r0 = r17
            int r1 = r0.iProvinceID
            r0 = r17
            int r2 = r0.toProvinceID
            r0 = r18
            r15.<init>(r0, r1, r2)
            int r1 = r15.getRouteSize()
            if (r1 > 0) goto L_0x0184
            r1 = 0
            r0 = r17
            r0.iObsolate = r1
            r1 = 1
            goto L_0x0036
        L_0x0184:
            age.of.civilizations2.jakowski.lukasz.Game r1 = age.of.civilizations2.jakowski.lukasz.CFG.game
            r0 = r17
            int r2 = r0.iProvinceID
            age.of.civilizations2.jakowski.lukasz.Province r1 = r1.getProvince(r2)
            r0 = r18
            int r4 = r1.getArmyCivID(r0)
            r11 = 0
            age.of.civilizations2.jakowski.lukasz.Game r1 = age.of.civilizations2.jakowski.lukasz.CFG.game
            age.of.civilizations2.jakowski.lukasz.Game r2 = age.of.civilizations2.jakowski.lukasz.CFG.game
            r0 = r17
            int r3 = r0.toProvinceID
            age.of.civilizations2.jakowski.lukasz.Province r2 = r2.getProvince(r3)
            int r2 = r2.getCivID()
            r0 = r18
            boolean r1 = r1.getCivsAtWar(r0, r2)
            if (r1 == 0) goto L_0x020e
            r12 = 0
        L_0x01ae:
            age.of.civilizations2.jakowski.lukasz.Game r1 = age.of.civilizations2.jakowski.lukasz.CFG.game
            age.of.civilizations2.jakowski.lukasz.Game r2 = age.of.civilizations2.jakowski.lukasz.CFG.game
            r0 = r17
            int r3 = r0.toProvinceID
            age.of.civilizations2.jakowski.lukasz.Province r2 = r2.getProvince(r3)
            int r2 = r2.getCivID()
            age.of.civilizations2.jakowski.lukasz.Civilization r1 = r1.getCiv(r2)
            age.of.civilizations2.jakowski.lukasz.Game r2 = age.of.civilizations2.jakowski.lukasz.CFG.game
            r0 = r17
            int r3 = r0.toProvinceID
            age.of.civilizations2.jakowski.lukasz.Province r2 = r2.getProvince(r3)
            int r2 = r2.getCivRegionID()
            age.of.civilizations2.jakowski.lukasz.Civilization_Region r1 = r1.getCivRegion(r2)
            int r1 = r1.getProvincesSize()
            if (r12 >= r1) goto L_0x0244
            age.of.civilizations2.jakowski.lukasz.Game r1 = age.of.civilizations2.jakowski.lukasz.CFG.game
            age.of.civilizations2.jakowski.lukasz.Game r2 = age.of.civilizations2.jakowski.lukasz.CFG.game
            age.of.civilizations2.jakowski.lukasz.Game r3 = age.of.civilizations2.jakowski.lukasz.CFG.game
            r0 = r17
            int r5 = r0.toProvinceID
            age.of.civilizations2.jakowski.lukasz.Province r3 = r3.getProvince(r5)
            int r3 = r3.getCivID()
            age.of.civilizations2.jakowski.lukasz.Civilization r2 = r2.getCiv(r3)
            age.of.civilizations2.jakowski.lukasz.Game r3 = age.of.civilizations2.jakowski.lukasz.CFG.game
            r0 = r17
            int r5 = r0.toProvinceID
            age.of.civilizations2.jakowski.lukasz.Province r3 = r3.getProvince(r5)
            int r3 = r3.getCivRegionID()
            age.of.civilizations2.jakowski.lukasz.Civilization_Region r2 = r2.getCivRegion(r3)
            int r2 = r2.getProvince(r12)
            int r1 = r1.getProvinceArmy(r2)
            int r11 = r11 + r1
            int r12 = r12 + 1
            goto L_0x01ae
        L_0x020e:
            age.of.civilizations2.jakowski.lukasz.Game r1 = age.of.civilizations2.jakowski.lukasz.CFG.game
            age.of.civilizations2.jakowski.lukasz.Game r2 = age.of.civilizations2.jakowski.lukasz.CFG.game
            r0 = r17
            int r3 = r0.toProvinceID
            age.of.civilizations2.jakowski.lukasz.Province r2 = r2.getProvince(r3)
            int r2 = r2.getCivID()
            age.of.civilizations2.jakowski.lukasz.Civilization r1 = r1.getCiv(r2)
            age.of.civilizations2.jakowski.lukasz.Game r2 = age.of.civilizations2.jakowski.lukasz.CFG.game
            r0 = r17
            int r3 = r0.toProvinceID
            age.of.civilizations2.jakowski.lukasz.Province r2 = r2.getProvince(r3)
            int r2 = r2.getCivRegionID()
            age.of.civilizations2.jakowski.lukasz.Civilization_Region r1 = r1.getCivRegion(r2)
            r0 = r18
            boolean r1 = r1.checkRegionBordersWithEnemy(r0)
            if (r1 != 0) goto L_0x0244
            r1 = 0
            r0 = r17
            r0.iObsolate = r1
            r1 = 1
            goto L_0x0036
        L_0x0244:
            com.badlogic.gdx.Application r1 = com.badlogic.gdx.Gdx.app
            java.lang.String r2 = "AoC"
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r5 = "NavalInvasion -> enemyArmy: "
            java.lang.StringBuilder r3 = r3.append(r5)
            java.lang.StringBuilder r3 = r3.append(r11)
            java.lang.String r3 = r3.toString()
            r1.log(r2, r3)
            float r1 = (float) r11
            r2 = 1062417203(0x3f533333, float:0.825)
            float r1 = r1 * r2
            age.of.civilizations2.jakowski.lukasz.Game r2 = age.of.civilizations2.jakowski.lukasz.CFG.game
            r0 = r18
            age.of.civilizations2.jakowski.lukasz.Civilization r2 = r2.getCiv(r0)
            int r2 = r2.getNumOfUnits()
            float r2 = (float) r2
            int r1 = (r1 > r2 ? 1 : (r1 == r2 ? 0 : -1))
            if (r1 <= 0) goto L_0x028d
            r0 = r17
            int r1 = r0.moveArmyInNextXTurns
            r2 = 3
            int r1 = java.lang.Math.max(r1, r2)
            r0 = r17
            r0.moveArmyInNextXTurns = r1
            com.badlogic.gdx.Application r1 = com.badlogic.gdx.Gdx.app
            java.lang.String r2 = "AoC"
            java.lang.String r3 = "NavalInvasion -> enemyArmy: RETURN 000"
            r1.log(r2, r3)
            r1 = 0
            goto L_0x0036
        L_0x028d:
            float r1 = (float) r11
            r2 = 1063927153(0x3f6a3d71, float:0.915)
            float r1 = r1 * r2
            r0 = r17
            int r2 = r0.numOfUnitsMoved
            int r2 = r2 + r4
            float r2 = (float) r2
            int r1 = (r1 > r2 ? 1 : (r1 == r2 ? 0 : -1))
            if (r1 <= 0) goto L_0x02b5
            r0 = r17
            int r1 = r0.moveArmyInNextXTurns
            r2 = 3
            int r1 = java.lang.Math.max(r1, r2)
            r0 = r17
            r0.moveArmyInNextXTurns = r1
            com.badlogic.gdx.Application r1 = com.badlogic.gdx.Gdx.app
            java.lang.String r2 = "AoC"
            java.lang.String r3 = "NavalInvasion -> enemyArmy: RETURN 1111"
            r1.log(r2, r3)
            r1 = 0
            goto L_0x0036
        L_0x02b5:
            float r1 = (float) r4
            float r2 = (float) r11
            r3 = 1066821222(0x3f966666, float:1.175)
            float r2 = r2 * r3
            int r1 = (r1 > r2 ? 1 : (r1 == r2 ? 0 : -1))
            if (r1 <= 0) goto L_0x039b
            age.of.civilizations2.jakowski.lukasz.Game r1 = age.of.civilizations2.jakowski.lukasz.CFG.game
            age.of.civilizations2.jakowski.lukasz.Game r2 = age.of.civilizations2.jakowski.lukasz.CFG.game
            r0 = r17
            int r3 = r0.toProvinceID
            age.of.civilizations2.jakowski.lukasz.Province r2 = r2.getProvince(r3)
            int r2 = r2.getCivID()
            age.of.civilizations2.jakowski.lukasz.Civilization r1 = r1.getCiv(r2)
            long r1 = r1.getMoney()
            float r1 = (float) r1
            r2 = 0
            age.of.civilizations2.jakowski.lukasz.Game r3 = age.of.civilizations2.jakowski.lukasz.CFG.game
            age.of.civilizations2.jakowski.lukasz.Game r5 = age.of.civilizations2.jakowski.lukasz.CFG.game
            r0 = r17
            int r6 = r0.toProvinceID
            age.of.civilizations2.jakowski.lukasz.Province r5 = r5.getProvince(r6)
            int r5 = r5.getCivID()
            age.of.civilizations2.jakowski.lukasz.Civilization r3 = r3.getCiv(r5)
            int r3 = r3.iBudget
            float r3 = (float) r3
            r5 = 1069547520(0x3fc00000, float:1.5)
            float r3 = r3 * r5
            float r2 = java.lang.Math.max(r2, r3)
            float r1 = r1 + r2
            r2 = 0
            int r1 = (r1 > r2 ? 1 : (r1 == r2 ? 0 : -1))
            if (r1 <= 0) goto L_0x03f6
            float r1 = (float) r4
            long r2 = (long) r11
            age.of.civilizations2.jakowski.lukasz.Game r5 = age.of.civilizations2.jakowski.lukasz.CFG.game
            age.of.civilizations2.jakowski.lukasz.Game r6 = age.of.civilizations2.jakowski.lukasz.CFG.game
            r0 = r17
            int r7 = r0.toProvinceID
            age.of.civilizations2.jakowski.lukasz.Province r6 = r6.getProvince(r7)
            int r6 = r6.getCivID()
            age.of.civilizations2.jakowski.lukasz.Civilization r5 = r5.getCiv(r6)
            long r5 = r5.getMoney()
            r7 = 5
            long r5 = r5 / r7
            long r2 = r2 + r5
            float r2 = (float) r2
            r3 = 1066821222(0x3f966666, float:1.175)
            float r2 = r2 * r3
            int r1 = (r1 > r2 ? 1 : (r1 == r2 ? 0 : -1))
            if (r1 <= 0) goto L_0x039b
            double r1 = (double) r4
            java.util.concurrent.ThreadLocalRandom r3 = age.of.civilizations2.jakowski.lukasz.CFG.oR
            r5 = 10
            int r3 = r3.nextInt(r5)
            int r3 = r3 + 5
            double r5 = (double) r3
            float r3 = (float) r11
            age.of.civilizations2.jakowski.lukasz.Game r7 = age.of.civilizations2.jakowski.lukasz.CFG.game
            age.of.civilizations2.jakowski.lukasz.Game r8 = age.of.civilizations2.jakowski.lukasz.CFG.game
            r0 = r17
            int r9 = r0.toProvinceID
            age.of.civilizations2.jakowski.lukasz.Province r8 = r8.getProvince(r9)
            int r8 = r8.getCivID()
            age.of.civilizations2.jakowski.lukasz.Civilization r7 = r7.getCiv(r8)
            long r7 = r7.getMoney()
            float r7 = (float) r7
            r8 = 0
            age.of.civilizations2.jakowski.lukasz.Game r9 = age.of.civilizations2.jakowski.lukasz.CFG.game
            age.of.civilizations2.jakowski.lukasz.Game r10 = age.of.civilizations2.jakowski.lukasz.CFG.game
            r0 = r17
            int r0 = r0.toProvinceID
            r16 = r0
            r0 = r16
            age.of.civilizations2.jakowski.lukasz.Province r10 = r10.getProvince(r0)
            int r10 = r10.getCivID()
            age.of.civilizations2.jakowski.lukasz.Civilization r9 = r9.getCiv(r10)
            int r9 = r9.iBudget
            float r9 = (float) r9
            r10 = 1069547520(0x3fc00000, float:1.5)
            float r9 = r9 * r10
            float r8 = java.lang.Math.max(r8, r9)
            float r7 = r7 + r8
            r8 = 1084227584(0x40a00000, float:5.0)
            float r7 = r7 / r8
            float r3 = r3 + r7
            r7 = 1066821222(0x3f966666, float:1.175)
            float r3 = r3 * r7
            r7 = 1071602729(0x3fdf5c29, float:1.745)
            java.util.concurrent.ThreadLocalRandom r8 = age.of.civilizations2.jakowski.lukasz.CFG.oR
            r9 = 925(0x39d, float:1.296E-42)
            int r8 = r8.nextInt(r9)
            float r8 = (float) r8
            r9 = 1148846080(0x447a0000, float:1000.0)
            float r8 = r8 / r9
            float r7 = r7 + r8
            float r3 = r3 * r7
            double r7 = (double) r3
            double r7 = java.lang.Math.ceil(r7)
            double r5 = r5 + r7
            double r1 = java.lang.Math.min(r1, r5)
            int r4 = (int) r1
            com.badlogic.gdx.Application r1 = com.badlogic.gdx.Gdx.app
            java.lang.String r2 = "AoC"
            java.lang.String r3 = "NavalInvasion -> enemyArmy: UPDATE 000"
            r1.log(r2, r3)
        L_0x039b:
            float r1 = (float) r4
            age.of.civilizations2.jakowski.lukasz.Game r2 = age.of.civilizations2.jakowski.lukasz.CFG.game
            r0 = r18
            age.of.civilizations2.jakowski.lukasz.Civilization r2 = r2.getCiv(r0)
            int r2 = r2.getNumOfUnits()
            float r2 = (float) r2
            r3 = 1057384038(0x3f066666, float:0.525)
            java.util.concurrent.ThreadLocalRandom r5 = age.of.civilizations2.jakowski.lukasz.CFG.oR
            r6 = 150(0x96, float:2.1E-43)
            int r5 = r5.nextInt(r6)
            float r5 = (float) r5
            r6 = 1148846080(0x447a0000, float:1000.0)
            float r5 = r5 / r6
            float r3 = r3 + r5
            float r2 = r2 * r3
            int r1 = (r1 > r2 ? 1 : (r1 == r2 ? 0 : -1))
            if (r1 <= 0) goto L_0x042a
            age.of.civilizations2.jakowski.lukasz.Game r1 = age.of.civilizations2.jakowski.lukasz.CFG.game
            r0 = r18
            age.of.civilizations2.jakowski.lukasz.Civilization r1 = r1.getCiv(r0)
            int r1 = r1.getNumOfUnits()
            r0 = r17
            int r2 = r0.numOfUnitsMoved
            int r1 = r1 - r2
            float r1 = (float) r1
            r2 = 1057384038(0x3f066666, float:0.525)
            java.util.concurrent.ThreadLocalRandom r3 = age.of.civilizations2.jakowski.lukasz.CFG.oR
            r5 = 150(0x96, float:2.1E-43)
            int r3 = r3.nextInt(r5)
            float r3 = (float) r3
            r5 = 1148846080(0x447a0000, float:1000.0)
            float r3 = r3 / r5
            float r2 = r2 + r3
            float r1 = r1 * r2
            int r4 = (int) r1
            if (r4 > 0) goto L_0x0457
            int r1 = r15.getRouteSize()
            int r1 = r1 + 6
            r0 = r17
            r0.moveArmyInNextXTurns = r1
            r1 = 0
            r0 = r17
            r0.iArmy = r1
            r1 = 0
            goto L_0x0036
        L_0x03f6:
            double r1 = (double) r4
            java.util.concurrent.ThreadLocalRandom r3 = age.of.civilizations2.jakowski.lukasz.CFG.oR
            r5 = 10
            int r3 = r3.nextInt(r5)
            int r3 = r3 + 5
            double r5 = (double) r3
            float r3 = (float) r11
            r7 = 1071602729(0x3fdf5c29, float:1.745)
            java.util.concurrent.ThreadLocalRandom r8 = age.of.civilizations2.jakowski.lukasz.CFG.oR
            r9 = 925(0x39d, float:1.296E-42)
            int r8 = r8.nextInt(r9)
            float r8 = (float) r8
            r9 = 1148846080(0x447a0000, float:1000.0)
            float r8 = r8 / r9
            float r7 = r7 + r8
            float r3 = r3 * r7
            double r7 = (double) r3
            double r7 = java.lang.Math.ceil(r7)
            double r5 = r5 + r7
            double r1 = java.lang.Math.min(r1, r5)
            int r4 = (int) r1
            com.badlogic.gdx.Application r1 = com.badlogic.gdx.Gdx.app
            java.lang.String r2 = "AoC"
            java.lang.String r3 = "NavalInvasion -> enemyArmy: UPDATE 111"
            r1.log(r2, r3)
            goto L_0x039b
        L_0x042a:
            r0 = r17
            int r1 = r0.numOfUnitsMoved
            int r1 = r1 + r4
            float r1 = (float) r1
            age.of.civilizations2.jakowski.lukasz.Game r2 = age.of.civilizations2.jakowski.lukasz.CFG.game
            r0 = r18
            age.of.civilizations2.jakowski.lukasz.Civilization r2 = r2.getCiv(r0)
            int r2 = r2.getNumOfUnits()
            float r2 = (float) r2
            r3 = 1057384038(0x3f066666, float:0.525)
            float r2 = r2 * r3
            int r1 = (r1 > r2 ? 1 : (r1 == r2 ? 0 : -1))
            if (r1 <= 0) goto L_0x0457
            int r1 = r15.getRouteSize()
            int r1 = r1 + 5
            r0 = r17
            r0.moveArmyInNextXTurns = r1
            r1 = 0
            r0 = r17
            r0.iArmy = r1
            r1 = 0
            goto L_0x0036
        L_0x0457:
            age.of.civilizations2.jakowski.lukasz.Game r1 = age.of.civilizations2.jakowski.lukasz.CFG.game
            r0 = r18
            age.of.civilizations2.jakowski.lukasz.Civilization r1 = r1.getCiv(r0)
            int r1 = r1.getBordersWithEnemy()
            if (r1 != 0) goto L_0x04a1
            age.of.civilizations2.jakowski.lukasz.Game r1 = age.of.civilizations2.jakowski.lukasz.CFG.game
            r0 = r17
            int r2 = r0.iProvinceID
            age.of.civilizations2.jakowski.lukasz.Province r1 = r1.getProvince(r2)
            int r1 = r1.getCivID()
            r0 = r18
            if (r1 != r0) goto L_0x04a1
            age.of.civilizations2.jakowski.lukasz.Game r1 = age.of.civilizations2.jakowski.lukasz.CFG.game
            r0 = r17
            int r2 = r0.toProvinceID
            age.of.civilizations2.jakowski.lukasz.Province r1 = r1.getProvince(r2)
            int r1 = r1.getCivID()
            r0 = r18
            if (r1 == r0) goto L_0x04a1
            float r1 = (float) r4
            r2 = 1055622431(0x3eeb851f, float:0.46)
            java.util.concurrent.ThreadLocalRandom r3 = age.of.civilizations2.jakowski.lukasz.CFG.oR
            r5 = 33
            int r3 = r3.nextInt(r5)
            float r3 = (float) r3
            r5 = 1120403456(0x42c80000, float:100.0)
            float r3 = r3 / r5
            float r2 = r2 + r3
            float r1 = r1 * r2
            double r1 = (double) r1
            double r1 = java.lang.Math.ceil(r1)
            int r4 = (int) r1
        L_0x04a1:
            com.badlogic.gdx.Application r1 = com.badlogic.gdx.Gdx.app
            java.lang.String r2 = "AoC"
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r5 = "NavalInvasion -> enemyArmy: tArmyToRecruit_PRE: "
            java.lang.StringBuilder r3 = r3.append(r5)
            java.lang.StringBuilder r3 = r3.append(r4)
            java.lang.String r3 = r3.toString()
            r1.log(r2, r3)
            int r1 = r15.getRouteSize()
            r2 = 1
            if (r1 != r2) goto L_0x05f5
            age.of.civilizations2.jakowski.lukasz.Game_Action r1 = age.of.civilizations2.jakowski.lukasz.CFG.gameAction
            r0 = r17
            int r2 = r0.iProvinceID
            r0 = r17
            int r3 = r0.toProvinceID
            r6 = 1
            r7 = 0
            r5 = r18
            boolean r1 = r1.moveArmy(r2, r3, r4, r5, r6, r7)
            if (r1 == 0) goto L_0x050a
            r1 = 3
            r0 = r17
            r0.moveArmyInNextXTurns = r1
            r0 = r17
            int r1 = r0.numOfUnitsMoved
            int r1 = r1 + r4
            r0 = r17
            r0.numOfUnitsMoved = r1
            age.of.civilizations2.jakowski.lukasz.Game r1 = age.of.civilizations2.jakowski.lukasz.CFG.game
            r0 = r18
            age.of.civilizations2.jakowski.lukasz.Civilization r1 = r1.getCiv(r0)
            age.of.civilizations2.jakowski.lukasz.Save_Civ_GameData r1 = r1.civGameData
            int r2 = age.of.civilizations2.jakowski.lukasz.Game_Calendar.TURN_ID
            int r2 = r2 + 4
            int r3 = r15.getRouteSize()
            int r2 = r2 + r3
            java.util.concurrent.ThreadLocalRandom r3 = age.of.civilizations2.jakowski.lukasz.CFG.oR
            r5 = 14
            int r3 = r3.nextInt(r5)
            int r2 = r2 + r3
            r1.iNextPossibleNavalInvastionTurnID = r2
            r1 = 0
            r0 = r17
            r0.iObsolate = r1
            r1 = 1
            goto L_0x0036
        L_0x050a:
            r1 = 1
            r0 = r17
            r0.moveArmyInNextXTurns = r1
        L_0x050f:
            com.badlogic.gdx.Application r1 = com.badlogic.gdx.Gdx.app
            java.lang.String r2 = "AoC"
            java.lang.String r3 = "NavalInvasion -> 111"
            r1.log(r2, r3)
            r17.action_RecruitArmy(r18)
            com.badlogic.gdx.Application r1 = com.badlogic.gdx.Gdx.app
            java.lang.String r2 = "AoC"
            java.lang.String r3 = "NavalInvasion -> 222"
            r1.log(r2, r3)
            age.of.civilizations2.jakowski.lukasz.Game r1 = age.of.civilizations2.jakowski.lukasz.CFG.game
            r0 = r18
            age.of.civilizations2.jakowski.lukasz.Civilization r1 = r1.getCiv(r0)
            int r1 = r1.getMovePoints()
            age.of.civilizations2.jakowski.lukasz.Ideologies_Manager r2 = age.of.civilizations2.jakowski.lukasz.CFG.ideologiesManager
            age.of.civilizations2.jakowski.lukasz.Game r3 = age.of.civilizations2.jakowski.lukasz.CFG.game
            r0 = r18
            age.of.civilizations2.jakowski.lukasz.Civilization r3 = r3.getCiv(r0)
            int r3 = r3.getIdeologyID()
            age.of.civilizations2.jakowski.lukasz.Ideology r2 = r2.getIdeology(r3)
            int r2 = r2.COST_OF_RECRUIT
            age.of.civilizations2.jakowski.lukasz.Ideologies_Manager r3 = age.of.civilizations2.jakowski.lukasz.CFG.ideologiesManager
            age.of.civilizations2.jakowski.lukasz.Game r5 = age.of.civilizations2.jakowski.lukasz.CFG.game
            r0 = r18
            age.of.civilizations2.jakowski.lukasz.Civilization r5 = r5.getCiv(r0)
            int r5 = r5.getIdeologyID()
            age.of.civilizations2.jakowski.lukasz.Ideology r3 = r3.getIdeology(r5)
            int r3 = r3.COST_OF_MOVE_OWN_PROVINCE
            int r2 = r2 + r3
            if (r1 < r2) goto L_0x06fb
            r0 = r17
            int r1 = r0.iObsolate
            r2 = 1
            if (r1 <= r2) goto L_0x06fb
            age.of.civilizations2.jakowski.lukasz.AI r5 = age.of.civilizations2.jakowski.lukasz.CFG.oAI
            r0 = r17
            int r6 = r0.iProvinceID
            r0 = r17
            int r8 = r0.iObsolate
            java.util.ArrayList r9 = new java.util.ArrayList
            r9.<init>()
            java.util.ArrayList r10 = new java.util.ArrayList
            r10.<init>()
            r7 = r18
            java.util.List r14 = r5.getAllNeighboringProvincesInRange_Regroup_ForNavalInvasion(r6, r7, r8, r9, r10)
            int r1 = r14.size()
            if (r1 <= 0) goto L_0x06fb
        L_0x0582:
            age.of.civilizations2.jakowski.lukasz.Game r1 = age.of.civilizations2.jakowski.lukasz.CFG.game
            r0 = r18
            age.of.civilizations2.jakowski.lukasz.Civilization r1 = r1.getCiv(r0)
            int r1 = r1.getMovePoints()
            age.of.civilizations2.jakowski.lukasz.Ideologies_Manager r2 = age.of.civilizations2.jakowski.lukasz.CFG.ideologiesManager
            age.of.civilizations2.jakowski.lukasz.Game r3 = age.of.civilizations2.jakowski.lukasz.CFG.game
            r0 = r18
            age.of.civilizations2.jakowski.lukasz.Civilization r3 = r3.getCiv(r0)
            int r3 = r3.getIdeologyID()
            age.of.civilizations2.jakowski.lukasz.Ideology r2 = r2.getIdeology(r3)
            int r2 = r2.COST_OF_RECRUIT
            age.of.civilizations2.jakowski.lukasz.Ideologies_Manager r3 = age.of.civilizations2.jakowski.lukasz.CFG.ideologiesManager
            age.of.civilizations2.jakowski.lukasz.Game r5 = age.of.civilizations2.jakowski.lukasz.CFG.game
            r0 = r18
            age.of.civilizations2.jakowski.lukasz.Civilization r5 = r5.getCiv(r0)
            int r5 = r5.getIdeologyID()
            age.of.civilizations2.jakowski.lukasz.Ideology r3 = r3.getIdeology(r5)
            int r3 = r3.COST_OF_MOVE_OWN_PROVINCE
            int r2 = r2 + r3
            if (r1 < r2) goto L_0x06fb
            int r1 = r14.size()
            if (r1 <= 0) goto L_0x06fb
            r13 = 0
            int r1 = r14.size()
            int r12 = r1 + -1
        L_0x05c6:
            if (r12 <= 0) goto L_0x065a
            age.of.civilizations2.jakowski.lukasz.Game r2 = age.of.civilizations2.jakowski.lukasz.CFG.game
            java.lang.Object r1 = r14.get(r12)
            age.of.civilizations2.jakowski.lukasz.AI_NeighProvinces r1 = (age.of.civilizations2.jakowski.lukasz.AI_NeighProvinces) r1
            int r1 = r1.iProvinceID
            age.of.civilizations2.jakowski.lukasz.Province r1 = r2.getProvince(r1)
            r0 = r18
            int r2 = r1.getArmyCivID(r0)
            age.of.civilizations2.jakowski.lukasz.Game r3 = age.of.civilizations2.jakowski.lukasz.CFG.game
            java.lang.Object r1 = r14.get(r13)
            age.of.civilizations2.jakowski.lukasz.AI_NeighProvinces r1 = (age.of.civilizations2.jakowski.lukasz.AI_NeighProvinces) r1
            int r1 = r1.iProvinceID
            age.of.civilizations2.jakowski.lukasz.Province r1 = r3.getProvince(r1)
            r0 = r18
            int r1 = r1.getArmyCivID(r0)
            if (r2 > r1) goto L_0x0658
        L_0x05f2:
            int r12 = r12 + -1
            goto L_0x05c6
        L_0x05f5:
            age.of.civilizations2.jakowski.lukasz.Game_Action r1 = age.of.civilizations2.jakowski.lukasz.CFG.gameAction
            r0 = r17
            int r2 = r0.iProvinceID
            r3 = 0
            int r3 = r15.getRoute(r3)
            r6 = 1
            r7 = 0
            r5 = r18
            boolean r1 = r1.moveArmy(r2, r3, r4, r5, r6, r7)
            if (r1 == 0) goto L_0x050f
            r1 = 0
            int r1 = r15.getRoute(r1)
            r15.setFromProvinceID(r1)
            r1 = 0
            r15.removeRoute(r1)
            r15.setNumOfUnits(r4)
            age.of.civilizations2.jakowski.lukasz.Game r1 = age.of.civilizations2.jakowski.lukasz.CFG.game
            r0 = r18
            age.of.civilizations2.jakowski.lukasz.Civilization r1 = r1.getCiv(r0)
            r1.addRegroupArmy(r15)
            r1 = 3
            r0 = r17
            r0.moveArmyInNextXTurns = r1
            r0 = r17
            int r1 = r0.numOfUnitsMoved
            int r1 = r1 + r4
            r0 = r17
            r0.numOfUnitsMoved = r1
            age.of.civilizations2.jakowski.lukasz.Game r1 = age.of.civilizations2.jakowski.lukasz.CFG.game
            r0 = r18
            age.of.civilizations2.jakowski.lukasz.Civilization r1 = r1.getCiv(r0)
            age.of.civilizations2.jakowski.lukasz.Save_Civ_GameData r1 = r1.civGameData
            int r2 = age.of.civilizations2.jakowski.lukasz.Game_Calendar.TURN_ID
            int r2 = r2 + 4
            int r3 = r15.getRouteSize()
            int r2 = r2 + r3
            java.util.concurrent.ThreadLocalRandom r3 = age.of.civilizations2.jakowski.lukasz.CFG.oR
            r5 = 14
            int r3 = r3.nextInt(r5)
            int r2 = r2 + r3
            r1.iNextPossibleNavalInvastionTurnID = r2
            r1 = 0
            r0 = r17
            r0.iObsolate = r1
            r1 = 1
            goto L_0x0036
        L_0x0658:
            r13 = r12
            goto L_0x05f2
        L_0x065a:
            age.of.civilizations2.jakowski.lukasz.Game r2 = age.of.civilizations2.jakowski.lukasz.CFG.game
            java.lang.Object r1 = r14.get(r13)
            age.of.civilizations2.jakowski.lukasz.AI_NeighProvinces r1 = (age.of.civilizations2.jakowski.lukasz.AI_NeighProvinces) r1
            int r1 = r1.iProvinceID
            age.of.civilizations2.jakowski.lukasz.Province r1 = r2.getProvince(r1)
            r0 = r18
            int r2 = r1.getArmyCivID(r0)
            age.of.civilizations2.jakowski.lukasz.Game r1 = age.of.civilizations2.jakowski.lukasz.CFG.game
            r0 = r18
            age.of.civilizations2.jakowski.lukasz.Civilization r1 = r1.getCiv(r0)
            age.of.civilizations2.jakowski.lukasz.Save_Civ_GameData r1 = r1.civGameData
            age.of.civilizations2.jakowski.lukasz.CivPlans r3 = r1.civPlans
            java.lang.Object r1 = r14.get(r13)
            age.of.civilizations2.jakowski.lukasz.AI_NeighProvinces r1 = (age.of.civilizations2.jakowski.lukasz.AI_NeighProvinces) r1
            int r1 = r1.iProvinceID
            int r1 = r3.haveMission_Army(r1)
            int r4 = r2 - r1
            if (r4 <= 0) goto L_0x06c2
            age.of.civilizations2.jakowski.lukasz.RegroupArmy_Data r15 = new age.of.civilizations2.jakowski.lukasz.RegroupArmy_Data
            java.lang.Object r1 = r14.get(r13)
            age.of.civilizations2.jakowski.lukasz.AI_NeighProvinces r1 = (age.of.civilizations2.jakowski.lukasz.AI_NeighProvinces) r1
            int r1 = r1.iProvinceID
            r0 = r17
            int r2 = r0.iProvinceID
            r0 = r18
            r15.<init>(r0, r1, r2)
            int r1 = r15.getRouteSize()
            if (r1 <= 0) goto L_0x06c2
            int r1 = r15.getRouteSize()
            r2 = 1
            if (r1 != r2) goto L_0x06c7
            age.of.civilizations2.jakowski.lukasz.Game_Action r1 = age.of.civilizations2.jakowski.lukasz.CFG.gameAction
            java.lang.Object r2 = r14.get(r13)
            age.of.civilizations2.jakowski.lukasz.AI_NeighProvinces r2 = (age.of.civilizations2.jakowski.lukasz.AI_NeighProvinces) r2
            int r2 = r2.iProvinceID
            r0 = r17
            int r3 = r0.iProvinceID
            r6 = 1
            r7 = 0
            r5 = r18
            boolean r1 = r1.moveArmy(r2, r3, r4, r5, r6, r7)
            if (r1 != 0) goto L_0x06c2
        L_0x06c2:
            r14.remove(r13)
            goto L_0x0582
        L_0x06c7:
            age.of.civilizations2.jakowski.lukasz.Game_Action r1 = age.of.civilizations2.jakowski.lukasz.CFG.gameAction
            java.lang.Object r2 = r14.get(r13)
            age.of.civilizations2.jakowski.lukasz.AI_NeighProvinces r2 = (age.of.civilizations2.jakowski.lukasz.AI_NeighProvinces) r2
            int r2 = r2.iProvinceID
            r3 = 0
            int r3 = r15.getRoute(r3)
            r6 = 1
            r7 = 0
            r5 = r18
            boolean r1 = r1.moveArmy(r2, r3, r4, r5, r6, r7)
            if (r1 == 0) goto L_0x06c2
            r1 = 0
            int r1 = r15.getRoute(r1)
            r15.setFromProvinceID(r1)
            r1 = 0
            r15.removeRoute(r1)
            r15.setNumOfUnits(r4)
            age.of.civilizations2.jakowski.lukasz.Game r1 = age.of.civilizations2.jakowski.lukasz.CFG.game
            r0 = r18
            age.of.civilizations2.jakowski.lukasz.Civilization r1 = r1.getCiv(r0)
            r1.addRegroupArmy(r15)
            goto L_0x06c2
        L_0x06fb:
            com.badlogic.gdx.Application r1 = com.badlogic.gdx.Gdx.app
            java.lang.String r2 = "AoC"
            java.lang.String r3 = "NavalInvasion -> 333"
            r1.log(r2, r3)
        L_0x0704:
            age.of.civilizations2.jakowski.lukasz.Game r1 = age.of.civilizations2.jakowski.lukasz.CFG.game
            r0 = r17
            int r2 = r0.iProvinceID
            age.of.civilizations2.jakowski.lukasz.Province r1 = r1.getProvince(r2)
            r0 = r18
            int r1 = r1.getArmyCivID(r0)
            float r1 = (float) r1
            r2 = 1060068393(0x3f2f5c29, float:0.685)
            java.util.concurrent.ThreadLocalRandom r3 = age.of.civilizations2.jakowski.lukasz.CFG.oR
            r5 = 25
            int r3 = r3.nextInt(r5)
            float r3 = (float) r3
            r5 = 1120403456(0x42c80000, float:100.0)
            float r3 = r3 / r5
            float r2 = r2 + r3
            float r1 = r1 * r2
            int r1 = (int) r1
            r0 = r17
            r0.iArmy = r1
            r1 = 0
            goto L_0x0036
        */
        throw new UnsupportedOperationException("Method not decompiled: age.of.civilizations2.jakowski.lukasz.CivArmyMission_NavalInvasion.action(int):boolean");
    }

    public final boolean action_RecruitArmy(int nCivID) {
        Gdx.app.log("AoC", "NavalInvasion -> action_RecruitArmy");
        if (CFG.ideologiesManager.getIdeology(CFG.game.getCiv(this.iCivID).getIdeologyID()).COST_OF_RECRUIT <= CFG.game.getCiv(this.iCivID).getMovePoints()) {
            ArrayList<AI_ProvinceInfo_War> nProvinces = new ArrayList<>();
            nProvinces.add(new AI_ProvinceInfo_War(this.iProvinceID, 100, true));
            CFG.oAI.getAI_Style(CFG.game.getCiv(nCivID).getAI_Style()).moveAtWar_Recruit(nCivID, nProvinces, new ArrayList(), true);
        }
        Gdx.app.log("AoC", "NavalInvasion -> action_RecruitArmy END");
        return true;
    }

    public final boolean action_BuildPort(int nFromProvinceID, int toProvinceID) {
        if (CFG.game.getProvince(nFromProvinceID).getLevelOfPort() != 0) {
            return true;
        }
        if (CFG.game.getProvince(nFromProvinceID).getCivID() != this.iCivID) {
            this.iObsolate = 0;
            return false;
        } else if (CFG.game.getCiv(this.iCivID).isInConstruction(nFromProvinceID, ConstructionType.PORT) != 0) {
            return false;
        } else {
            if (BuildingsManager.constructPort(nFromProvinceID, this.iCivID)) {
                this.iObsolate = 10;
                return false;
            }
            lockTreasury_Port(nFromProvinceID);
            return false;
        }
    }

    public final void lockTreasury_Port(int nProvinceID) {
        int colonizeCost = (int) (((float) BuildingsManager.getPort_BuildCost(CFG.game.getProvince(nProvinceID).getLevelOfPort() + 1, nProvinceID)) * 1.05f);
        CFG.game.getCiv(this.iCivID).civGameData.iLockTreasury = Math.max(CFG.game.getCiv(this.iCivID).civGameData.iLockTreasury, colonizeCost);
        if (CFG.game.getCiv(this.iCivID).iBudget <= 0 || CFG.game.getCiv(this.iCivID).getMoney() <= 0 || CFG.game.getCiv(this.iCivID).getMoney() < ((long) colonizeCost)) {
        }
    }
}
