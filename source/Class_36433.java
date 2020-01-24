/*
 * Decompiled with CFR 0.145.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Maps
 */
import com.google.common.collect.Maps;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.util.Map;
import java.util.Set;

public class Class_36433 {
    private final Class_8702 Field_36434 = new Class_8702();
    private final Class_39372 Field_36435;
    private final Map Field_36436 = Maps.newIdentityHashMap();

    public Class_11372 Method_36437(Class_3436 class_3436) {
        Class_3238 class_3238 = class_3436.Method_3442();
        Class_31211 class_31211 = this.Method_36444(class_3436);
        if (class_31211 == null || class_31211 == this.Field_36435.Method_39379()) {
            if (class_3238 == Class_9265.Field_9285 || class_3238 == Class_9265.Field_9367 || class_3238 == Class_9265.Field_9420 || class_3238 == Class_9265.Field_9294 || class_3238 == Class_9265.Field_9409 || class_3238 == Class_9265.Field_9328) {
                return this.Field_36435.Method_39382().Method_24109("minecraft:blocks/planks_oak");
            }
            if (class_3238 == Class_9265.Field_9372) {
                return this.Field_36435.Method_39382().Method_24109("minecraft:blocks/obsidian");
            }
            if (class_3238 == Class_9265.Field_9403 || class_3238 == Class_9265.Field_9358) {
                return this.Field_36435.Method_39382().Method_24109("minecraft:blocks/lava_still");
            }
            if (class_3238 == Class_9265.Field_9281 || class_3238 == Class_9265.Field_9286) {
                return this.Field_36435.Method_39382().Method_24109("minecraft:blocks/water_still");
            }
            if (class_3238 == Class_9265.Field_9314) {
                return this.Field_36435.Method_39382().Method_24109("minecraft:blocks/soul_sand");
            }
            if (class_3238 == Class_9265.Field_9412) {
                return this.Field_36435.Method_39382().Method_24109("minecraft:items/barrier");
            }
        }
        if (class_31211 == null) {
            class_31211 = this.Field_36435.Method_39379();
        }
        return class_31211.Method_31216();
    }

    private void Method_36438() {
        Class_3238[] arrclass_3238 = new Class_3238[-15823 & 88];
        arrclass_3238[4385 & 130] = Class_9265.Field_9351;
        arrclass_3238[-14847 & 45] = Class_9265.Field_9281;
        arrclass_3238[28818 & -32698] = Class_9265.Field_9286;
        arrclass_3238[19 & -24349] = Class_9265.Field_9403;
        arrclass_3238[-24570 & 23557] = Class_9265.Field_9358;
        arrclass_3238[16495 & 4229] = Class_9265.Field_9457;
        arrclass_3238[8774 & 5286] = Class_9265.Field_9420;
        arrclass_3238[5263 & 16951] = Class_9265.Field_9372;
        arrclass_3238[8 & 6361] = Class_9265.Field_9294;
        arrclass_3238[16409 & 13] = Class_9265.Field_9367;
        arrclass_3238[6731 & 410] = Class_9265.Field_9314;
        arrclass_3238[-32757 & 16591] = Class_9265.Field_9398;
        arrclass_3238[652 & -28372] = Class_9265.Field_9412;
        arrclass_3238[-32739 & 24653] = Class_9265.Field_9285;
        arrclass_3238[10287 & -27122] = Class_9265.Field_9328;
        arrclass_3238[25743 & -28401] = Class_9265.Field_9409;
        this.Method_36442(arrclass_3238);
        this.Method_36439(Class_9265.Field_9446, new Class_18681().Method_18685(Class_3903.Field_3904).Method_18687());
        this.Method_36439(Class_9265.Field_9424, new Class_18681().Method_18685(Class_11865.Field_11866).Method_18687());
        Class_3538[] arrclass_3538 = new Class_3538[28042 & 102];
        arrclass_3538[1701 & 4184] = Class_4720.Field_4725;
        arrclass_3538[6275 & 8529] = Class_4720.Field_4723;
        this.Method_36439(Class_9265.Field_9421, new Class_18681().Method_18685(Class_4704.Field_4705).Method_18689("_leaves").Method_18686(arrclass_3538).Method_18687());
        Class_3538[] arrclass_35382 = new Class_3538[20503 & -30398];
        arrclass_35382[-31731 & 4208] = Class_4720.Field_4725;
        arrclass_35382[-19709 & 2273] = Class_4720.Field_4723;
        this.Method_36439(Class_9265.Field_9440, new Class_18681().Method_18685(Class_30767.Field_30768).Method_18689("_leaves").Method_18686(arrclass_35382).Method_18687());
        Class_3538[] arrclass_35383 = new Class_3538[-16213 & 5697];
        arrclass_35383[16535 & 4160] = Class_21807.Field_21808;
        this.Method_36439(Class_9265.Field_9405, new Class_18681().Method_18686(arrclass_35383).Method_18687());
        Class_3538[] arrclass_35384 = new Class_3538[16705 & 43];
        arrclass_35384[24704 & 1048] = Class_17448.Field_17449;
        this.Method_36439(Class_9265.Field_9346, new Class_18681().Method_18686(arrclass_35384).Method_18687());
        Class_3538[] arrclass_35385 = new Class_3538[6657 & -24541];
        arrclass_35385[-30155 & 320] = Class_12211.Field_12212;
        this.Method_36439(Class_9265.Field_9442, new Class_18681().Method_18686(arrclass_35385).Method_18687());
        Class_3538[] arrclass_35386 = new Class_3538[17921 & 12673];
        arrclass_35386[9 & 9378] = Class_14103.Field_14104;
        this.Method_36439(Class_9265.Field_9365, new Class_18681().Method_18686(arrclass_35386).Method_18687());
        this.Method_36439(Class_9265.Field_9320, new Class_18681().Method_18685(Class_33671.Field_33673).Method_18689("_wall").Method_18687());
        Class_3538[] arrclass_35387 = new Class_3538[5451 & 2581];
        arrclass_35387[-26328 & 87] = Class_3563.Field_3564;
        this.Method_36439(Class_9265.Field_9399, new Class_18681().Method_18685(Class_3563.Field_3565).Method_18686(arrclass_35387).Method_18687());
        Class_3538[] arrclass_35388 = new Class_3538[-23917 & 265];
        arrclass_35388[-29696 & 12512] = Class_20919.Field_20921;
        this.Method_36439(Class_9265.Field_9426, new Class_18681().Method_18686(arrclass_35388).Method_18687());
        Class_3538[] arrclass_35389 = new Class_3538[16547 & 6173];
        arrclass_35389[132 & 19008] = Class_20919.Field_20921;
        this.Method_36439(Class_9265.Field_9371, new Class_18681().Method_18686(arrclass_35389).Method_18687());
        Class_3538[] arrclass_353810 = new Class_3538[4321 & -31459];
        arrclass_353810[10388 & 512] = Class_20919.Field_20921;
        this.Method_36439(Class_9265.Field_9359, new Class_18681().Method_18686(arrclass_353810).Method_18687());
        Class_3538[] arrclass_353811 = new Class_3538[669 & -22495];
        arrclass_353811[12034 & -12159] = Class_20919.Field_20921;
        this.Method_36439(Class_9265.Field_9422, new Class_18681().Method_18686(arrclass_353811).Method_18687());
        Class_3538[] arrclass_353812 = new Class_3538[4481 & 24597];
        arrclass_353812[1024 & -30601] = Class_20919.Field_20921;
        this.Method_36439(Class_9265.Field_9306, new Class_18681().Method_18686(arrclass_353812).Method_18687());
        Class_3538[] arrclass_353813 = new Class_3538[-31295 & 2583];
        arrclass_353813[2316 & 4098] = Class_20919.Field_20921;
        this.Method_36439(Class_9265.Field_9318, new Class_18681().Method_18686(arrclass_353813).Method_18687());
        Class_3538[] arrclass_353814 = new Class_3538[28674 & -32637];
        arrclass_353814[8 & -25232] = Class_25178.Field_25182;
        arrclass_353814[225 & 25097] = Class_25178.Field_25179;
        this.Method_36439(Class_9265.Field_9282, new Class_18681().Method_18686(arrclass_353814).Method_18687());
        this.Method_36439(Class_9265.Field_9301, new Class_18681().Method_18685(Class_4221.Field_4222).Method_18689("_double_slab").Method_18687());
        this.Method_36439(Class_9265.Field_9460, new Class_18681().Method_18685(Class_4221.Field_4222).Method_18689("_slab").Method_18687());
        Class_3538[] arrclass_353815 = new Class_3538[10433 & 303];
        arrclass_353815[8330 & 17457] = Class_5798.Field_5799;
        this.Method_36439(Class_9265.Field_9462, new Class_18681().Method_18686(arrclass_353815).Method_18687());
        Class_3538[] arrclass_353816 = new Class_3538[4615 & 8481];
        arrclass_353816[4172 & -22736] = Class_5859.Field_5869;
        this.Method_36439(Class_9265.Field_9342, new Class_18681().Method_18686(arrclass_353816).Method_18687());
        Class_3538[] arrclass_353817 = new Class_3538[8841 & 1089];
        arrclass_353817[-7262 & 81] = Class_17176.Field_17182;
        this.Method_36439(Class_9265.Field_9443, new Class_18681().Method_18686(arrclass_353817).Method_18687());
        Class_3538[] arrclass_353818 = new Class_3538[14947 & 1033];
        arrclass_353818[8512 & 4238] = Class_16100.Field_16103;
        this.Method_36439(Class_9265.Field_9451, new Class_18681().Method_18686(arrclass_353818).Method_18687());
        Class_3538[] arrclass_353819 = new Class_3538[-28655 & 20193];
        arrclass_353819[25376 & 4096] = Class_16100.Field_16103;
        this.Method_36439(Class_9265.Field_9271, new Class_18681().Method_18686(arrclass_353819).Method_18687());
        Class_3538[] arrclass_353820 = new Class_3538[67 & 25353];
        arrclass_353820[6155 & 9408] = Class_16100.Field_16103;
        this.Method_36439(Class_9265.Field_9423, new Class_18681().Method_18686(arrclass_353820).Method_18687());
        Class_3538[] arrclass_353821 = new Class_3538[1041 & 6251];
        arrclass_353821[562 & -30720] = Class_16100.Field_16103;
        this.Method_36439(Class_9265.Field_9381, new Class_18681().Method_18686(arrclass_353821).Method_18687());
        Class_3538[] arrclass_353822 = new Class_3538[515 & 1289];
        arrclass_353822[12608 & 2107] = Class_16100.Field_16103;
        this.Method_36439(Class_9265.Field_9276, new Class_18681().Method_18686(arrclass_353822).Method_18687());
        Class_3538[] arrclass_353823 = new Class_3538[-15615 & 3105];
        arrclass_353823[953 & 0] = Class_16100.Field_16103;
        this.Method_36439(Class_9265.Field_9289, new Class_18681().Method_18686(arrclass_353823).Method_18687());
        Class_3538[] arrclass_353824 = new Class_3538[4097 & 3189];
        arrclass_353824[8192 & -15391] = Class_16100.Field_16103;
        this.Method_36439(Class_9265.Field_9311, new Class_18681().Method_18686(arrclass_353824).Method_18687());
        this.Method_36439(Class_9265.Field_9326, new Class_18681().Method_18685(Class_5383.Field_5384).Method_18689("_wool").Method_18687());
        this.Method_36439(Class_9265.Field_9357, new Class_18681().Method_18685(Class_5383.Field_5384).Method_18689("_carpet").Method_18687());
        this.Method_36439(Class_9265.Field_9274, new Class_18681().Method_18685(Class_5383.Field_5384).Method_18689("_stained_hardened_clay").Method_18687());
        this.Method_36439(Class_9265.Field_9309, new Class_18681().Method_18685(Class_5383.Field_5384).Method_18689("_stained_glass_pane").Method_18687());
        this.Method_36439(Class_9265.Field_9344, new Class_18681().Method_18685(Class_5383.Field_5384).Method_18689("_stained_glass").Method_18687());
        this.Method_36439(Class_9265.Field_9366, new Class_18681().Method_18685(Class_5049.Field_5050).Method_18687());
        this.Method_36439(Class_9265.Field_9330, new Class_18681().Method_18685(Class_21186.Field_21187).Method_18687());
        this.Method_36439(Class_9265.Field_9278, new Class_18681().Method_18685(Class_5320.Field_5321).Method_18687());
        Class_3538[] arrclass_353825 = new Class_3538[8227 & 5145];
        arrclass_353825[-28152 & 17473] = Class_5108.Field_5110;
        this.Method_36439(Class_9265.Field_9441, new Class_18681().Method_18686(arrclass_353825).Method_18687());
        this.Method_36439(Class_9265.Field_9353, new Class_18681().Method_18685(Class_9265.Field_9353.Method_5603()).Method_18687());
        this.Method_36439(Class_9265.Field_9402, new Class_18681().Method_18685(Class_9265.Field_9402.Method_5603()).Method_18687());
        this.Method_36439(Class_9265.Field_9430, new Class_18681().Method_18685(Class_5700.Field_5701).Method_18689("_slab").Method_18687());
        this.Method_36439(Class_9265.Field_9463, new Class_18681().Method_18685(Class_38701.Field_38703).Method_18689("_slab").Method_18687());
        this.Method_36439(Class_9265.Field_9384, new Class_18681().Method_18685(Class_25738.Field_25739).Method_18689("_monster_egg").Method_18687());
        this.Method_36439(Class_9265.Field_9300, new Class_18681().Method_18685(Class_17834.Field_17835).Method_18687());
        Class_3538[] arrclass_353826 = new Class_3538[3 & 14657];
        arrclass_353826[18762 & 512] = Class_4850.Field_4852;
        this.Method_36439(Class_9265.Field_9338, new Class_18681().Method_18686(arrclass_353826).Method_18687());
        Class_3538[] arrclass_353827 = new Class_3538[65 & 21795];
        arrclass_353827[4378 & 1220] = Class_41925.\u0000strictfp;
        this.Method_36439(Class_9265.Field_9280, new Class_18681().Method_18686(arrclass_353827).Method_18687());
        this.Method_36439(Class_9265.Field_9383, new Class_18681().Method_18685(Class_4544.Field_4545).Method_18689("_log").Method_18687());
        this.Method_36439(Class_9265.Field_9447, new Class_18681().Method_18685(Class_10020.Field_10021).Method_18689("_log").Method_18687());
        this.Method_36439(Class_9265.Field_9379, new Class_18681().Method_18685(Class_4221.Field_4222).Method_18689("_planks").Method_18687());
        this.Method_36439(Class_9265.Field_9389, new Class_18681().Method_18685(Class_4266.Field_4267).Method_18689("_sapling").Method_18687());
        this.Method_36439(Class_9265.Field_9394, new Class_18681().Method_18685(Class_4465.Field_4466).Method_18687());
        Class_3538[] arrclass_353828 = new Class_3538[19469 & 12417];
        arrclass_353828[-32632 & 9778] = Class_15219.Field_15221;
        this.Method_36439(Class_9265.Field_9432, new Class_18681().Method_18686(arrclass_353828).Method_18687());
        Class_3538[] arrclass_353829 = new Class_3538[8705 & 16711];
        arrclass_353829[18435 & -32732] = Class_8151.Field_8153;
        this.Method_36439(Class_9265.Field_9308, new Class_18681().Method_18686(arrclass_353829).Method_18687());
        this.Method_36439(Class_9265.Field_9290, new Class_42879(this));
        this.Method_36439(Class_9265.Field_9397, new Class_42280(this));
        this.Method_36439(Class_9265.Field_9434, new Class_42590(this));
        this.Method_36439(Class_9265.Field_9313, new Class_44433(this));
        this.Method_36439(Class_9265.Field_9272, new Class_43006(this));
        this.Method_36439(Class_9265.Field_9392, new Class_44116(this));
        this.Method_36439(Class_9265.Field_9362, new Class_46425(this));
    }

    public void Method_36439(Class_3238 class_3238, Class_34361 class_34361) {
        this.Field_36434.Method_8707(class_3238, class_34361);
    }

    public Class_8702 Method_36440() {
        return this.Field_36434;
    }

    public void Method_36441() {
        this.Field_36436.clear();
        for (Map.Entry entry : this.Field_36434.Method_8706().entrySet()) {
            this.Field_36436.put(entry.getKey(), this.Field_36435.Method_39380((Class_41302)entry.getValue()));
        }
    }

    public void Method_36442(Class_3238 ... arrclass_3238) {
        this.Field_36434.Method_8708(arrclass_3238);
    }

    public Class_36433(Class_39372 class_39372) {
        this.Field_36435 = class_39372;
        this.Method_36438();
    }

    public Class_39372 Method_36443() {
        return this.Field_36435;
    }

    public Class_31211 Method_36444(Class_3436 class_3436) {
        Class_31211 class_31211 = (Class_31211)this.Field_36436.get(class_3436);
        if (class_31211 == null) {
            class_31211 = this.Field_36435.Method_39379();
        }
        return class_31211;
    }

    private void Method_36445() {
        MethodHandle methodHandle = MethodHandles.constant(String.class, "MC|BlazingPack");
    }
}

