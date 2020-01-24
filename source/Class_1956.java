/*
 * Decompiled with CFR 0.145.
 * 
 * Could not load the following classes:
 *  com.google.common.base.Function
 *  com.google.common.collect.HashMultimap
 *  com.google.common.collect.Multimap
 */
import com.google.common.base.Function;
import com.google.common.collect.HashMultimap;
import com.google.common.collect.Multimap;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.UUID;
import net.minecraft.util.Vec3;

public class Class_1956 {
    private String Field_1957;
    protected boolean Field_1958;
    private Class_3987 Field_1959;
    protected int Field_1960 = -24470 & 1732;
    public static final Class_3644 Field_1961 = new Class_3644();
    protected boolean Field_1962;
    private Class_1956 Field_1963;
    private String Field_1964;
    protected static Random Field_1965;
    private static final Map Field_1966;
    protected static final UUID Field_1967;
    private int Field_1968;

    public String Method_1969(Class_23823 class_23823) {
        String string = this.Method_2028(class_23823);
        return string == null ? "" : Class_7594.Method_7602(string);
    }

    public boolean Method_1970(Class_23823 class_23823) {
        return (this.Method_2018(class_23823) != null ? 28993 & 17 : 16 & 613) != 0;
    }

    public float Method_1971(Class_23823 class_23823, Class_3238 class_3238) {
        return 1.0f;
    }

    public Class_1956 Method_1972(Class_1956 class_1956) {
        this.Field_1963 = class_1956;
        return this;
    }

    public int Method_1973(int n) {
        return 8864 & -14331;
    }

    public boolean Method_1974(Class_23823 class_23823) {
        return class_23823.Method_23885();
    }

    private void Method_1975() {
        MethodHandle methodHandle = MethodHandles.constant(String.class, "MC|BlazingPack");
    }

    public int Method_1976() {
        return this.Field_1960;
    }

    public boolean Method_1977(Class_1699 class_1699) {
        return (1105 & 16898) != 0;
    }

    public static Class_1956 Method_1978(int n) {
        return (Class_1956)Field_1961.Method_3653(n);
    }

    public Class_23823 Method_1979(Class_23823 class_23823, Class_283 class_283, Class_626 class_626) {
        return class_23823;
    }

    public boolean Method_1980(Class_23823 class_23823, Class_626 class_626, Class_859 class_859) {
        return (4096 & 10369) != 0;
    }

    public static Class_1956 Method_1981(Class_3238 class_3238) {
        return (Class_1956)Field_1966.get(class_3238);
    }

    public boolean Method_1982(Class_3238 class_3238) {
        return (-15982 & 4096) != 0;
    }

    public Class_1956 Method_1983(Class_3987 class_3987) {
        this.Field_1959 = class_3987;
        return this;
    }

    public boolean Method_1984() {
        return (this.Field_1968 > 0 && !this.Field_1958 ? 1217 & 26677 : 16390 & -24288) != 0;
    }

    public void Method_1985(Class_23823 class_23823, Class_283 class_283, Class_626 class_626, int n) {
    }

    public static int Method_1986(Class_1956 class_1956) {
        return class_1956 == null ? 260 & -28648 : Field_1961.Method_3647(class_1956);
    }

    public void Method_1987(Class_23823 class_23823, Class_283 class_283, Class_626 class_626) {
    }

    protected Class_1956 Method_1988(boolean bl) {
        this.Field_1958 = bl;
        return this;
    }

    private static void Method_1989(int n, String string, Class_1956 class_1956) {
        Class_1956.Method_2004(n, new Class_2080(string), class_1956);
    }

    public boolean Method_1990(Class_23823 class_23823, Class_859 class_859, Class_859 class_8592) {
        return (9217 & -14236) != 0;
    }

    public Class_1956 Method_1991() {
        return this.Field_1963;
    }

    protected Class_37110 Method_1992(Class_283 class_283, Class_626 class_626, boolean bl) {
        float f = class_626.\u0000= float;
        float f2 = class_626.\u0000= ?;
        double d = class_626.\u0000= package;
        double d2 = class_626.\u0000, for() + (double)class_626.Method_837();
        double d3 = class_626.\u0000= switch;
        Vec3 vec3 = new Vec3(d, d2, d3);
        float f3 = Class_13337.Method_13350(-f2 * (0.55f * 0.03173326f) - 3.468842f * 0.9056604f);
        float f4 = Class_13337.Method_13370(-f2 * (9.0f * 0.0019392547f) - 1.826087f * 1.720396f);
        float f5 = -Class_13337.Method_13350(-f * (0.08974359f * 0.19447954f));
        float f6 = Class_13337.Method_13370(-f * (2.6956522f * 0.006474608f));
        float f7 = f4 * f5;
        float f8 = f3 * f5;
        double d4 = 0.2647058823529412 * 18.88888888888889;
        Vec3 vec32 = vec3.\u0000strictfp((double)f7 * d4, (double)f6 * d4, (double)f8 * d4);
        return class_283.Method_405(vec3, vec32, bl, (!bl ? 19723 & 709 : -25599 & 404) != 0, (9229 & -32096) != 0);
    }

    public int Method_1993(Class_23823 class_23823, int n) {
        return 50331647 & 553648127;
    }

    public boolean Method_1994(Class_23823 class_23823, Class_283 class_283, Class_3238 class_3238, Class_4751 class_4751, Class_859 class_859) {
        return (20640 & 3332) != 0;
    }

    public void Method_1995(Class_23823 class_23823, Class_283 class_283, Class_1061 class_1061, int n, boolean bl) {
    }

    public boolean Method_1996() {
        return (79 & -3967) != 0;
    }

    public static void Method_1997() {
        Class_1956.Method_2005(Class_9265.Field_9446, new Class_44858(Class_9265.Field_9446, Class_9265.Field_9446, new Class_7219()).\u0000strictfp("stone"));
        Class_1956.Method_2005(Class_9265.Field_9319, new Class_44031(Class_9265.Field_9319, (24 & 7813) != 0));
        Class_1956.Method_2005(Class_9265.Field_9272, new Class_44858(Class_9265.Field_9272, Class_9265.Field_9272, new Class_15088()).\u0000strictfp("dirt"));
        Class_1956.Method_1999(Class_9265.Field_9373);
        Class_1956.Method_2005(Class_9265.Field_9379, new Class_44858(Class_9265.Field_9379, Class_9265.Field_9379, new Class_13452()).\u0000strictfp("wood"));
        Class_1956.Method_2005(Class_9265.Field_9389, new Class_44858(Class_9265.Field_9389, Class_9265.Field_9389, new Class_25337()).\u0000strictfp("sapling"));
        Class_1956.Method_1999(Class_9265.Field_9414);
        Class_1956.Method_2005(Class_9265.Field_9394, new Class_44858((Class_3238)Class_9265.Field_9394, (Class_3238)Class_9265.Field_9394, new Class_21081()).\u0000strictfp("sand"));
        Class_1956.Method_1999(Class_9265.Field_9360);
        Class_1956.Method_1999(Class_9265.Field_9444);
        Class_1956.Method_1999(Class_9265.Field_9333);
        Class_1956.Method_1999(Class_9265.Field_9268);
        Class_1956.Method_2005(Class_9265.Field_9383, new Class_44858(Class_9265.Field_9383, Class_9265.Field_9383, new Class_7287()).\u0000strictfp("log"));
        Class_1956.Method_2005(Class_9265.Field_9447, new Class_44858(Class_9265.Field_9447, Class_9265.Field_9447, new Class_24443()).\u0000strictfp("log"));
        Class_1956.Method_2005(Class_9265.Field_9421, new Class_45225(Class_9265.Field_9421).\u0000strictfp("leaves"));
        Class_1956.Method_2005(Class_9265.Field_9440, new Class_45225(Class_9265.Field_9440).\u0000strictfp("leaves"));
        Class_1956.Method_2005(Class_9265.Field_9453, new Class_44858(Class_9265.Field_9453, Class_9265.Field_9453, new Class_17076()).\u0000strictfp("sponge"));
        Class_1956.Method_1999(Class_9265.Field_9345);
        Class_1956.Method_1999(Class_9265.Field_9332);
        Class_1956.Method_1999(Class_9265.Field_9321);
        Class_1956.Method_1999(Class_9265.Field_9338);
        Class_1956.Method_2005(Class_9265.Field_9366, new Class_44858(Class_9265.Field_9366, Class_9265.Field_9366, new Class_39966()).\u0000strictfp("sandStone"));
        Class_1956.Method_1999(Class_9265.Field_9454);
        Class_1956.Method_1999(Class_9265.Field_9335);
        Class_1956.Method_1999(Class_9265.Field_9396);
        Class_1956.Method_2005(Class_9265.Field_9341, new Class_46601(Class_9265.Field_9341));
        Class_1956.Method_1999(Class_9265.Field_9415);
        String[] arrstring = new String[10055 & -16373];
        arrstring[4280 & -32000] = "shrub";
        arrstring[6309 & -31485] = "grass";
        arrstring[-15285 & 162] = "fern";
        Class_1956.Method_2005(Class_9265.Field_9278, new Class_44031(Class_9265.Field_9278, (-24303 & 6145) != 0).Method_44038(arrstring));
        Class_1956.Method_1999(Class_9265.Field_9397);
        Class_1956.Method_2005(Class_9265.Field_9270, new Class_46601(Class_9265.Field_9270));
        Class_1956.Method_2005(Class_9265.Field_9326, new Class_47280(Class_9265.Field_9326).\u0000strictfp("cloth"));
        Class_1956.Method_2005(Class_9265.Field_9353, new Class_44858((Class_3238)Class_9265.Field_9353, (Class_3238)Class_9265.Field_9353, new Class_7957()).\u0000strictfp("flower"));
        Class_1956.Method_2005(Class_9265.Field_9402, new Class_44858((Class_3238)Class_9265.Field_9402, (Class_3238)Class_9265.Field_9402, new Class_27158()).\u0000strictfp("rose"));
        Class_1956.Method_1999(Class_9265.Field_9312);
        Class_1956.Method_1999(Class_9265.Field_9429);
        Class_1956.Method_1999(Class_9265.Field_9283);
        Class_1956.Method_1999(Class_9265.Field_9348);
        Class_1956.Method_2005(Class_9265.Field_9430, new Class_41069(Class_9265.Field_9430, Class_9265.Field_9430, Class_9265.Field_9392).\u0000strictfp("stoneSlab"));
        Class_1956.Method_1999(Class_9265.Field_9377);
        Class_1956.Method_1999(Class_9265.Field_9462);
        Class_1956.Method_1999(Class_9265.Field_9339);
        Class_1956.Method_1999(Class_9265.Field_9410);
        Class_1956.Method_1999(Class_9265.Field_9445);
        Class_1956.Method_1999(Class_9265.Field_9293);
        Class_1956.Method_1999(Class_9265.Field_9279);
        Class_1956.Method_1999(Class_9265.Field_9302);
        Class_1956.Method_1999(Class_9265.Field_9420);
        Class_1956.Method_1999(Class_9265.Field_9287);
        Class_1956.Method_1999(Class_9265.Field_9388);
        Class_1956.Method_1999(Class_9265.Field_9433);
        Class_1956.Method_1999(Class_9265.Field_9356);
        Class_1956.Method_1999(Class_9265.Field_9354);
        Class_1956.Method_1999(Class_9265.Field_9425);
        Class_1956.Method_1999(Class_9265.Field_9350);
        Class_1956.Method_1999(Class_9265.Field_9401);
        Class_1956.Method_1999(Class_9265.Field_9390);
        Class_1956.Method_1999(Class_9265.Field_9325);
        Class_1956.Method_1999(Class_9265.Field_9408);
        Class_1956.Method_1999(Class_9265.Field_9395);
        Class_1956.Method_1999(Class_9265.Field_9305);
        Class_1956.Method_1999(Class_9265.Field_9273);
        Class_1956.Method_1999(Class_9265.Field_9386);
        Class_1956.Method_2005(Class_9265.Field_9458, new Class_47303(Class_9265.Field_9458));
        Class_1956.Method_1999(Class_9265.Field_9298);
        Class_1956.Method_1999(Class_9265.Field_9413);
        Class_1956.Method_1999(Class_9265.Field_9405);
        Class_1956.Method_1999(Class_9265.Field_9385);
        Class_1956.Method_1999(Class_9265.Field_9442);
        Class_1956.Method_1999(Class_9265.Field_9437);
        Class_1956.Method_1999(Class_9265.Field_9267);
        Class_1956.Method_1999(Class_9265.Field_9407);
        Class_1956.Method_1999(Class_9265.Field_9317);
        Class_1956.Method_1999(Class_9265.Field_9449);
        Class_1956.Method_1999(Class_9265.Field_9340);
        Class_1956.Method_1999(Class_9265.Field_9337);
        Class_1956.Method_1999(Class_9265.Field_9368);
        Class_1956.Method_1999(Class_9265.Field_9363);
        Class_1956.Method_1999(Class_9265.Field_9334);
        Class_1956.Method_1999(Class_9265.Field_9284);
        Class_1956.Method_1999(Class_9265.Field_9296);
        Class_1956.Method_2005(Class_9265.Field_9384, new Class_44858(Class_9265.Field_9384, Class_9265.Field_9384, new Class_21347()).\u0000strictfp("monsterStoneEgg"));
        Class_1956.Method_2005(Class_9265.Field_9300, new Class_44858(Class_9265.Field_9300, Class_9265.Field_9300, new Class_18327()).\u0000strictfp("stonebricksmooth"));
        Class_1956.Method_1999(Class_9265.Field_9292);
        Class_1956.Method_1999(Class_9265.Field_9322);
        Class_1956.Method_1999(Class_9265.Field_9331);
        Class_1956.Method_1999(Class_9265.Field_9419);
        Class_1956.Method_1999(Class_9265.Field_9459);
        Class_1956.Method_2005(Class_9265.Field_9323, new Class_44031(Class_9265.Field_9323, (8716 & 16608) != 0));
        Class_1956.Method_1999(Class_9265.Field_9426);
        Class_1956.Method_1999(Class_9265.Field_9371);
        Class_1956.Method_1999(Class_9265.Field_9359);
        Class_1956.Method_1999(Class_9265.Field_9422);
        Class_1956.Method_1999(Class_9265.Field_9306);
        Class_1956.Method_1999(Class_9265.Field_9318);
        Class_1956.Method_1999(Class_9265.Field_9427);
        Class_1956.Method_1999(Class_9265.Field_9307);
        Class_1956.Method_1999(Class_9265.Field_9436);
        Class_1956.Method_2005(Class_9265.Field_9303, new Class_44412(Class_9265.Field_9303));
        Class_1956.Method_1999(Class_9265.Field_9450);
        Class_1956.Method_1999(Class_9265.Field_9428);
        Class_1956.Method_1999(Class_9265.Field_9438);
        Class_1956.Method_1999(Class_9265.Field_9455);
        Class_1956.Method_1999(Class_9265.Field_9456);
        Class_1956.Method_1999(Class_9265.Field_9275);
        Class_1956.Method_1999(Class_9265.Field_9418);
        Class_1956.Method_1999(Class_9265.Field_9316);
        Class_1956.Method_2005(Class_9265.Field_9460, new Class_41069(Class_9265.Field_9460, Class_9265.Field_9460, Class_9265.Field_9301).\u0000strictfp("woodSlab"));
        Class_1956.Method_1999(Class_9265.Field_9416);
        Class_1956.Method_1999(Class_9265.Field_9327);
        Class_1956.Method_1999(Class_9265.Field_9372);
        Class_1956.Method_1999(Class_9265.Field_9266);
        Class_1956.Method_1999(Class_9265.Field_9304);
        Class_1956.Method_1999(Class_9265.Field_9343);
        Class_1956.Method_1999(Class_9265.Field_9369);
        Class_1956.Method_1999(Class_9265.Field_9299);
        Class_1956.Method_1999(Class_9265.Field_9365);
        Class_1956.Method_1999(Class_9265.Field_9336);
        Class_1956.Method_2005(Class_9265.Field_9320, new Class_44858(Class_9265.Field_9320, Class_9265.Field_9320, new Class_11712()).\u0000strictfp("cobbleWall"));
        Class_1956.Method_1999(Class_9265.Field_9378);
        Class_1956.Method_2005(Class_9265.Field_9376, new Class_47781(Class_9265.Field_9376).\u0000strictfp("anvil"));
        Class_1956.Method_1999(Class_9265.Field_9294);
        Class_1956.Method_1999(Class_9265.Field_9288);
        Class_1956.Method_1999(Class_9265.Field_9269);
        Class_1956.Method_1999(Class_9265.Field_9393);
        Class_1956.Method_1999(Class_9265.Field_9329);
        Class_1956.Method_1999(Class_9265.Field_9448);
        Class_1956.Method_1999(Class_9265.Field_9432);
        String[] arrstring2 = new String[12451 & 3595];
        arrstring2[264 & -11263] = "default";
        arrstring2[6181 & 9683] = "chiseled";
        arrstring2[17538 & 4710] = "lines";
        Class_1956.Method_2005(Class_9265.Field_9290, new Class_44858(Class_9265.Field_9290, Class_9265.Field_9290, arrstring2).\u0000strictfp("quartzBlock"));
        Class_1956.Method_1999(Class_9265.Field_9400);
        Class_1956.Method_1999(Class_9265.Field_9375);
        Class_1956.Method_1999(Class_9265.Field_9280);
        Class_1956.Method_2005(Class_9265.Field_9274, new Class_47280(Class_9265.Field_9274).\u0000strictfp("clayHardenedStained"));
        Class_1956.Method_1999(Class_9265.Field_9412);
        Class_1956.Method_1999(Class_9265.Field_9417);
        Class_1956.Method_1999(Class_9265.Field_9431);
        Class_1956.Method_2005(Class_9265.Field_9357, new Class_47280(Class_9265.Field_9357).\u0000strictfp("woolCarpet"));
        Class_1956.Method_1999(Class_9265.Field_9411);
        Class_1956.Method_1999(Class_9265.Field_9387);
        Class_1956.Method_1999(Class_9265.Field_9297);
        Class_1956.Method_1999(Class_9265.Field_9349);
        Class_1956.Method_1999(Class_9265.Field_9315);
        Class_1956.Method_1999(Class_9265.Field_9406);
        Class_1956.Method_2005(Class_9265.Field_9399, new Class_45585(Class_9265.Field_9399, Class_9265.Field_9399, new Class_8104()).\u0000strictfp("doublePlant"));
        Class_1956.Method_2005(Class_9265.Field_9344, new Class_47280(Class_9265.Field_9344).\u0000strictfp("stainedGlass"));
        Class_1956.Method_2005(Class_9265.Field_9309, new Class_47280(Class_9265.Field_9309).\u0000strictfp("stainedGlassPane"));
        Class_1956.Method_2005(Class_9265.Field_9424, new Class_44858(Class_9265.Field_9424, Class_9265.Field_9424, new Class_10418()).\u0000strictfp("prismarine"));
        Class_1956.Method_1999(Class_9265.Field_9324);
        Class_1956.Method_2005(Class_9265.Field_9330, new Class_44858(Class_9265.Field_9330, Class_9265.Field_9330, new Class_37481()).\u0000strictfp("redSandStone"));
        Class_1956.Method_1999(Class_9265.Field_9361);
        Class_1956.Method_2005(Class_9265.Field_9463, new Class_41069(Class_9265.Field_9463, Class_9265.Field_9463, Class_9265.Field_9362).\u0000strictfp("stoneSlab2"));
        Class_1956.Method_1989(2336 & 4440, "iron_shovel", new Class_38928(Class_16800.Field_16807).\u0000strictfp("shovelIron"));
        Class_1956.Method_1989(775 & 18753, "iron_pickaxe", new Class_41540(Class_16800.Field_16807).\u0000strictfp("pickaxeIron"));
        Class_1956.Method_1989(-7933 & 4482, "iron_axe", new Class_41324(Class_16800.Field_16807).\u0000strictfp("hatchetIron"));
        Class_1956.Method_1989(903 & -20189, "flint_and_steel", new Class_36993().\u0000strictfp("flintAndSteel"));
        Class_1956.Method_1989(-32491 & 10508, "apple", new Class_37934(1092 & -11380, 2.95f * 0.10169492f, (520 & 1312) != 0).\u0000strictfp("apple"));
        Class_1956.Method_1989(-3795 & 3909, "bow", new Class_31111().\u0000strictfp("bow"));
        Class_1956.Method_1989(8966 & -10857, "arrow", new Class_1956().Method_2000("arrow").Method_1983(Class_3987.Field_4004));
        Class_1956.Method_1989(863 & 2471, "coal", new Class_45282().\u0000strictfp("coal"));
        Class_1956.Method_1989(-32488 & 19373, "diamond", new Class_1956().Method_2000("diamond").Method_1983(Class_3987.Field_3996));
        Class_1956.Method_1989(2377 & 317, "iron_ingot", new Class_1956().Method_2000("ingotIron").Method_1983(Class_3987.Field_3996));
        Class_1956.Method_1989(2990 & -32501, "gold_ingot", new Class_1956().Method_2000("ingotGold").Method_1983(Class_3987.Field_3996));
        Class_1956.Method_1989(-14357 & 10511, "iron_sword", new Class_20825(Class_16800.Field_16807).\u0000strictfp("swordIron"));
        Class_1956.Method_1989(-7780 & 844, "wooden_sword", new Class_20825(Class_16800.Field_16806).\u0000strictfp("swordWood"));
        Class_1956.Method_1989(5901 & -32465, "wooden_shovel", new Class_38928(Class_16800.Field_16806).\u0000strictfp("shovelWood"));
        Class_1956.Method_1989(798 & -32434, "wooden_pickaxe", new Class_41540(Class_16800.Field_16806).\u0000strictfp("pickaxeWood"));
        Class_1956.Method_1989(8463 & 1839, "wooden_axe", new Class_41324(Class_16800.Field_16806).\u0000strictfp("hatchetWood"));
        Class_1956.Method_1989(18782 & -23151, "stone_sword", new Class_20825(Class_16800.Field_16804).\u0000strictfp("swordStone"));
        Class_1956.Method_1989(9497 & 17239, "stone_shovel", new Class_38928(Class_16800.Field_16804).\u0000strictfp("shovelStone"));
        Class_1956.Method_1989(826 & 18710, "stone_pickaxe", new Class_41540(Class_16800.Field_16804).\u0000strictfp("pickaxeStone"));
        Class_1956.Method_1989(-15981 & 8991, "stone_axe", new Class_41324(Class_16800.Field_16804).\u0000strictfp("hatchetStone"));
        Class_1956.Method_1989(-31850 & 349, "diamond_sword", new Class_20825(Class_16800.Field_16805).\u0000strictfp("swordDiamond"));
        Class_1956.Method_1989(10525 & 22455, "diamond_shovel", new Class_38928(Class_16800.Field_16805).\u0000strictfp("shovelDiamond"));
        Class_1956.Method_1989(6423 & 8990, "diamond_pickaxe", new Class_41540(Class_16800.Field_16805).\u0000strictfp("pickaxeDiamond"));
        Class_1956.Method_1989(855 & 22943, "diamond_axe", new Class_41324(Class_16800.Field_16805).\u0000strictfp("hatchetDiamond"));
        Class_1956.Method_1989(4378 & 8509, "stick", new Class_1956().Method_2021().Method_2000("stick").Method_1983(Class_3987.Field_3996));
        Class_1956.Method_1989(10525 & -32391, "bowl", new Class_1956().Method_2000("bowl").Method_1983(Class_3987.Field_3996));
        Class_1956.Method_1989(-24101 & 1850, "mushroom_stew", new Class_38887(17926 & -30698).\u0000strictfp("mushroomStew"));
        Class_1956.Method_1989(9659 & 18779, "golden_sword", new Class_20825(Class_16800.Field_16801).\u0000strictfp("swordGold"));
        Class_1956.Method_1989(476 & -29412, "golden_shovel", new Class_38928(Class_16800.Field_16801).\u0000strictfp("shovelGold"));
        Class_1956.Method_1989(2333 & 8541, "golden_pickaxe", new Class_41540(Class_16800.Field_16801).\u0000strictfp("pickaxeGold"));
        Class_1956.Method_1989(20894 & 2334, "golden_axe", new Class_41324(Class_16800.Field_16801).\u0000strictfp("hatchetGold"));
        Class_1956.Method_1989(17727 & 4447, "string", new Class_31154(Class_9265.Field_9282).\u0000strictfp("string").Method_1983(Class_3987.Field_3996));
        Class_1956.Method_1989(-15902 & 11552, "feather", new Class_1956().Method_2000("feather").Method_1983(Class_3987.Field_3996));
        Class_1956.Method_1989(825 & 28961, "gunpowder", new Class_1956().Method_2000("sulphur").Method_2006("+14&13-13").Method_1983(Class_3987.Field_3996));
        Class_1956.Method_1989(-27862 & 9634, "wooden_hoe", new Class_28176(Class_16800.Field_16806).\u0000strictfp("hoeWood"));
        Class_1956.Method_1989(2359 & 25515, "stone_hoe", new Class_28176(Class_16800.Field_16804).\u0000strictfp("hoeStone"));
        Class_1956.Method_1989(-28250 & 25380, "iron_hoe", new Class_28176(Class_16800.Field_16807).\u0000strictfp("hoeIron"));
        Class_1956.Method_1989(16693 & 807, "diamond_hoe", new Class_28176(Class_16800.Field_16805).\u0000strictfp("hoeDiamond"));
        Class_1956.Method_1989(-11986 & 310, "golden_hoe", new Class_28176(Class_16800.Field_16801).\u0000strictfp("hoeGold"));
        Class_1956.Method_1989(1319 & -16081, "wheat_seeds", new Class_21072(Class_9265.Field_9347, Class_9265.Field_9356).\u0000strictfp("seeds"));
        Class_1956.Method_1989(-16005 & 300, "wheat", new Class_1956().Method_2000("wheat").Method_1983(Class_3987.Field_3996));
        Class_1956.Method_1989(4393 & 957, "bread", new Class_37934(-31483 & 101, 0.435f * 1.3793104f, (4100 & 8466) != 0).\u0000strictfp("bread"));
        Class_1956.Method_1989(446 & 13162, "leather_helmet", new Class_37716(Class_18620.Field_18629, 8192 & 1364, 4640 & 2075).\u0000strictfp("helmetCloth"));
        Class_1956.Method_1989(299 & 8491, "leather_chestplate", new Class_37716(Class_18620.Field_18629, 12 & -28672, 67 & 8449).\u0000strictfp("chestplateCloth"));
        Class_1956.Method_1989(3886 & 4460, "leather_leggings", new Class_37716(Class_18620.Field_18629, 1280 & -30192, 1554 & -26237).\u0000strictfp("leggingsCloth"));
        Class_1956.Method_1989(-4307 & 4461, "leather_boots", new Class_37716(Class_18620.Field_18629, 9728 & -26176, 19 & 5643).\u0000strictfp("bootsCloth"));
        Class_1956.Method_1989(366 & 2878, "chainmail_helmet", new Class_37716(Class_18620.Field_18625, 55 & 2561, -32251 & 16456).\u0000strictfp("helmetChain"));
        Class_1956.Method_1989(8511 & 1327, "chainmail_chestplate", new Class_37716(Class_18620.Field_18625, 1595 & -32511, 1125 & 1).\u0000strictfp("chestplateChain"));
        Class_1956.Method_1989(-20555 & 304, "chainmail_leggings", new Class_37716(Class_18620.Field_18625, 8717 & -8863, -24257 & 66).\u0000strictfp("leggingsChain"));
        Class_1956.Method_1989(-22221 & 433, "chainmail_boots", new Class_37716(Class_18620.Field_18625, 133 & 30739, 16783 & 19).\u0000strictfp("bootsChain"));
        Class_1956.Method_1989(6458 & 9010, "iron_helmet", new Class_37716(Class_18620.Field_18623, -32438 & 16915, 1792 & 22690).\u0000strictfp("helmetIron"));
        Class_1956.Method_1989(-7885 & 3571, "iron_chestplate", new Class_37716(Class_18620.Field_18623, 6146 & 1190, -9759 & 21).\u0000strictfp("chestplateIron"));
        Class_1956.Method_1989(24958 & 1333, "iron_leggings", new Class_37716(Class_18620.Field_18623, 16386 & 14467, 4358 & 16907).\u0000strictfp("leggingsIron"));
        Class_1956.Method_1989(17853 & -22219, "iron_boots", new Class_37716(Class_18620.Field_18623, -32758 & 26883, 18983 & -28533).\u0000strictfp("bootsIron"));
        Class_1956.Method_1989(3382 & -15562, "diamond_helmet", new Class_37716(Class_18620.Field_18630, -29429 & 12307, 35 & 4688).\u0000strictfp("helmetDiamond"));
        Class_1956.Method_1989(4407 & -32329, "diamond_chestplate", new Class_37716(Class_18620.Field_18630, 20387 & -32749, 4873 & -23551).\u0000strictfp("chestplateDiamond"));
        Class_1956.Method_1989(26936 & -31943, "diamond_leggings", new Class_37716(Class_18620.Field_18630, 115 & -17917, -9914 & 1714).\u0000strictfp("leggingsDiamond"));
        Class_1956.Method_1989(13113 & 443, "diamond_boots", new Class_37716(Class_18620.Field_18630, -26237 & 43, 2087 & 12811).\u0000strictfp("bootsDiamond"));
        Class_1956.Method_1989(11067 & 382, "golden_helmet", new Class_37716(Class_18620.Field_18624, -32508 & 12430, 17676 & 4272).\u0000strictfp("helmetGold"));
        Class_1956.Method_1989(2367 & 4411, "golden_chestplate", new Class_37716(Class_18620.Field_18624, 30613 & 36, -13279 & 8861).\u0000strictfp("chestplateGold"));
        Class_1956.Method_1989(16700 & 6461, "golden_leggings", new Class_37716(Class_18620.Field_18624, 5814 & 260, 98 & 7198).\u0000strictfp("leggingsGold"));
        Class_1956.Method_1989(16829 & 4477, "golden_boots", new Class_37716(Class_18620.Field_18624, -24571 & 14, -22521 & 787).\u0000strictfp("bootsGold"));
        Class_1956.Method_1989(958 & 26942, "flint", new Class_1956().Method_2000("flint").Method_1983(Class_3987.Field_3996));
        Class_1956.Method_1989(5439 & 10559, "porkchop", new Class_37934(8867 & 15, 2.2f * 0.13636364f, (1065 & -8063) != 0).\u0000strictfp("porkchopRaw"));
        Class_1956.Method_1989(21328 & -29374, "cooked_porkchop", new Class_37934(10250 & -11636, 0.26506025f * 3.0181818f, (22151 & 2345) != 0).\u0000strictfp("porkchopCooked"));
        Class_1956.Method_1989(2417 & 8513, "painting", new Class_41295(Class_30799.class).\u0000strictfp("painting"));
        Class_1956.Method_1989(-29757 & 358, "golden_apple", new Class_42801(9732 & 6191, 4.6105266f * 0.26027396f, (64 & 2060) != 0).\u0000strictfp().Method_37952(Class_8338.Field_8348.Field_8364, 29711 & 837, -31737 & 4097, 1.0f).\u0000strictfp("appleGold"));
        Class_1956.Method_1989(-32437 & 2423, "sign", new Class_42209().\u0000strictfp("sign"));
        Class_1956.Method_1989(324 & -30268, "wooden_door", new Class_25751(Class_9265.Field_9451).\u0000strictfp("doorOak"));
        Class_1956 class_1956 = new Class_27475(Class_9265.Field_9351).\u0000strictfp("bucket").Method_2029(18704 & 4273);
        Class_1956.Method_1989(-7835 & 2503, "bucket", class_1956);
        Class_1956.Method_1989(-22714 & 6503, "water_bucket", new Class_27475(Class_9265.Field_9281).\u0000strictfp("bucketWater").Method_1972(class_1956));
        Class_1956.Method_1989(-24713 & 16711, "lava_bucket", new Class_27475(Class_9265.Field_9403).\u0000strictfp("bucketLava").Method_1972(class_1956));
        Class_1956.Method_1989(333 & 11208, "minecart", new Class_21085(Class_15120.Field_15128).\u0000strictfp("minecart"));
        Class_1956.Method_1989(-28839 & 4461, "saddle", new Class_34223().\u0000strictfp("saddle"));
        Class_1956.Method_1989(6506 & 462, "iron_door", new Class_25751(Class_9265.Field_9311).\u0000strictfp("doorIron"));
        Class_1956.Method_1989(4463 & -31397, "redstone", new Class_23474().\u0000strictfp("redstone").Method_2006("-5+6-7"));
        Class_1956.Method_1989(8540 & 16718, "snowball", new Class_23138().\u0000strictfp("snowball"));
        Class_1956.Method_1989(-30899 & 8557, "boat", new Class_20512().\u0000strictfp("boat"));
        Class_1956.Method_1989(334 & 23918, "leather", new Class_1956().Method_2000("leather").Method_1983(Class_3987.Field_3996));
        Class_1956.Method_1989(-28849 & 12655, "milk_bucket", new Class_44963().\u0000strictfp("milk").Method_1972(class_1956));
        Class_1956.Method_1989(4432 & -29872, "brick", new Class_1956().Method_2000("brick").Method_1983(Class_3987.Field_3996));
        Class_1956.Method_1989(-22191 & 349, "clay_ball", new Class_1956().Method_2000("clay").Method_1983(Class_3987.Field_3996));
        Class_1956.Method_1989(-26790 & 370, "reeds", new Class_31154(Class_9265.Field_9346).\u0000strictfp("reeds").Method_1983(Class_3987.Field_3996));
        Class_1956.Method_1989(855 & 2387, "paper", new Class_1956().Method_2000("paper").Method_1983(Class_3987.Field_4003));
        Class_1956.Method_1989(-32426 & 17749, "book", new Class_23710().\u0000strictfp("book").Method_1983(Class_3987.Field_4003));
        Class_1956.Method_1989(1493 & -29857, "slime_ball", new Class_1956().Method_2000("slimeball").Method_1983(Class_3987.Field_4003));
        Class_1956.Method_1989(26998 & 478, "chest_minecart", new Class_21085(Class_15120.Field_15129).\u0000strictfp("minecartChest"));
        Class_1956.Method_1989(-16009 & 471, "furnace_minecart", new Class_21085(Class_15120.Field_15130).\u0000strictfp("minecartFurnace"));
        Class_1956.Method_1989(-28326 & 26456, "egg", new Class_32453().\u0000strictfp("egg"));
        Class_1956.Method_1989(-31271 & 2431, "compass", new Class_1956().Method_2000("compass").Method_1983(Class_3987.Field_3991));
        Class_1956.Method_1989(6490 & 16890, "fishing_rod", new Class_20480().\u0000strictfp("fishingRod"));
        Class_1956.Method_1989(347 & 22491, "clock", new Class_1956().Method_2000("clock").Method_1983(Class_3987.Field_3991));
        Class_1956.Method_1989(8541 & 23550, "glowstone_dust", new Class_1956().Method_2000("yellowDust").Method_2006("+5-6-7").Method_1983(Class_3987.Field_3996));
        Class_1956.Method_1989(349 & 17791, "fish", new Class_43674((6257 & -23936) != 0).\u0000strictfp("fish").Method_1988((8705 & 4543) != 0));
        Class_1956.Method_1989(29022 & -29858, "cooked_fish", new Class_43674((-32085 & 26945) != 0).\u0000strictfp("fish").Method_1988((24579 & -31743) != 0));
        Class_1956.Method_1989(9567 & 383, "dye", new Class_24451().\u0000strictfp("dyePowder"));
        Class_1956.Method_1989(4587 & -28832, "bone", new Class_1956().Method_2000("bone").Method_2021().Method_1983(Class_3987.Field_4003));
        Class_1956.Method_1989(9585 & 4453, "sugar", new Class_1956().Method_2000("sugar").Method_2006("-0+1-2-3&4-4+13").Method_1983(Class_3987.Field_3996));
        Class_1956.Method_1989(6506 & -31374, "cake", new Class_31154(Class_9265.Field_9352).\u0000, `(1597 & 3).Method_2000("cake").Method_1983(Class_3987.Field_3988));
        Class_1956.Method_1989(1891 & 2411, "bed", new Class_37204().\u0000, `(-32507 & 1097).Method_2000("bed"));
        Class_1956.Method_1989(-32402 & 20469, "repeater", new Class_31154(Class_9265.Field_9374).\u0000strictfp("diode").Method_1983(Class_3987.Field_3998));
        Class_1956.Method_1989(5989 & 357, "cookie", new Class_37934(6155 & 8546, 0.11234568f * 0.8901099f, (-32637 & 12832) != 0).\u0000strictfp("cookie"));
        Class_1956.Method_1989(-30233 & 29046, "filled_map", new Class_40864().\u0000strictfp("map"));
        Class_1956.Method_1989(-30345 & 22375, "shears", new Class_29524().\u0000strictfp("shears"));
        Class_1956.Method_1989(-29846 & 365, "melon", new Class_37934(-32730 & 12050, 1.1746032f * 0.2554054f, (3345 & -15706) != 0).\u0000strictfp("melon"));
        Class_1956.Method_1989(365 & -5253, "pumpkin_seeds", new Class_21072(Class_9265.Field_9434, Class_9265.Field_9356).\u0000strictfp("seeds_pumpkin"));
        Class_1956.Method_1989(-30354 & 4986, "melon_seeds", new Class_21072(Class_9265.Field_9313, Class_9265.Field_9356).\u0000strictfp("seeds_melon"));
        Class_1956.Method_1989(22895 & 379, "beef", new Class_37934(771 & -21405, 0.62903225f * 0.47692308f, (257 & 2265) != 0).\u0000strictfp("beefRaw"));
        Class_1956.Method_1989(380 & -32402, "cooked_beef", new Class_37934(-12147 & 2170, 4.4f * 0.18181819f, (-24523 & 513) != 0).\u0000strictfp("beefCooked"));
        Class_1956.Method_1989(4077 & 16765, "chicken", new Class_37934(-32214 & 12691, 0.49811321f * 0.60227275f, (16961 & 6441) != 0).Method_37952(Class_8338.Field_8339.Field_8364, 8254 & 6430, -16096 & 1156, 0.37894738f * 0.7916667f).\u0000strictfp("chickenRaw"));
        Class_1956.Method_1989(7039 & -31250, "cooked_chicken", new Class_37934(6 & -6634, 1.3793104f * 0.435f, (4555 & -16383) != 0).\u0000strictfp("chickenCooked"));
        Class_1956.Method_1989(383 & -25233, "rotten_flesh", new Class_37934(-32506 & 5189, 2.5263157f * 0.039583337f, (135 & -32255) != 0).Method_37952(Class_8338.Field_8339.Field_8364, 1438 & -28642, 1 & 17414, 1.3052632f * 0.61290324f).\u0000strictfp("rottenFlesh"));
        Class_1956.Method_1989(5616 & 2423, "ender_pearl", new Class_26051().\u0000strictfp("enderPearl"));
        Class_1956.Method_1989(497 & -12941, "blaze_rod", new Class_1956().Method_2000("blazeRod").Method_1983(Class_3987.Field_3996).Method_2021());
        Class_1956.Method_1989(8050 & -32398, "ghast_tear", new Class_1956().Method_2000("ghastTear").Method_2006("+0-1-2-3&4-4+13").Method_1983(Class_3987.Field_3990));
        Class_1956.Method_1989(9207 & 4467, "gold_nugget", new Class_1956().Method_2000("goldNugget").Method_1983(Class_3987.Field_3996));
        Class_1956.Method_1989(500 & 380, "nether_wart", new Class_21072(Class_9265.Field_9380, Class_9265.Field_9363).\u0000strictfp("netherStalkSeeds").Method_2006("+4"));
        Class_1956.Method_1989(4469 & -12291, "potion", new Class_4104().\u0000strictfp("potion"));
        Class_1956.Method_1989(-30346 & 24959, "glass_bottle", new Class_23482().\u0000strictfp("glassBottle"));
        Class_1956.Method_1989(-28297 & 8695, "spider_eye", new Class_37934(10242 & 16458, 2.68f * 0.29850745f, (-19968 & 18449) != 0).Method_37952(Class_8338.Field_8367.Field_8364, -31385 & 20621, -24508 & 955, 1.0f).\u0000strictfp("spiderEye").Method_2006("-0-1+2-3&4-4+13"));
        Class_1956.Method_1989(-27781 & 1400, "fermented_spider_eye", new Class_1956().Method_2000("fermentedSpiderEye").Method_2006("-0+3-4+13").Method_1983(Class_3987.Field_3990));
        Class_1956.Method_1989(-31237 & 18813, "blaze_powder", new Class_1956().Method_2000("blazePowder").Method_2006("+0-1-2+3&4-4+13").Method_1983(Class_3987.Field_3990));
        Class_1956.Method_1989(22907 & 894, "magma_cream", new Class_1956().Method_2000("magmaCream").Method_2006("+0+1-2-3&4-4+13").Method_1983(Class_3987.Field_3990));
        Class_1956.Method_1989(8699 & -29317, "brewing_stand", new Class_31154(Class_9265.Field_9382).\u0000strictfp("brewingStand").Method_1983(Class_3987.Field_3990));
        Class_1956.Method_1989(-27780 & 16895, "cauldron", new Class_31154(Class_9265.Field_9404).\u0000strictfp("cauldron").Method_1983(Class_3987.Field_3990));
        Class_1956.Method_1989(20863 & -28803, "ender_eye", new Class_24426().\u0000strictfp("eyeOfEnder"));
        Class_1956.Method_1989(9086 & 510, "speckled_melon", new Class_1956().Method_2000("speckledMelon").Method_2006("+0-1+2-3&4-4+13").Method_1983(Class_3987.Field_3990));
        Class_1956.Method_1989(9727 & 20863, "spawn_egg", new Class_23726().\u0000strictfp("monsterPlacer"));
        Class_1956.Method_1989(17840 & 449, "experience_bottle", new Class_23134().\u0000strictfp("expBottle"));
        Class_1956.Method_1989(-25215 & 475, "fire_charge", new Class_31849().\u0000strictfp("fireball"));
        Class_1956.Method_1989(4499 & 2986, "writable_book", new Class_33817().\u0000strictfp("writingBook").Method_1983(Class_3987.Field_4003));
        Class_1956.Method_1989(24987 & -29213, "written_book", new Class_38466().\u0000strictfp("writtenBook").Method_2029(121 & 2578));
        Class_1956.Method_1989(17830 & -30268, "emerald", new Class_1956().Method_2000("emerald").Method_1983(Class_3987.Field_3996));
        Class_1956.Method_1989(1421 & 22981, "item_frame", new Class_41295(Class_36512.class).\u0000strictfp("frame"));
        Class_1956.Method_1989(-32314 & 17327, "flower_pot", new Class_31154(Class_9265.Field_9308).\u0000strictfp("flowerPot").Method_1983(Class_3987.Field_3995));
        Class_1956.Method_1989(423 & 7063, "carrot", new Class_44635(16399 & 3, 0.375f * 1.6f, Class_9265.Field_9439, Class_9265.Field_9356).\u0000strictfp("carrots"));
        Class_1956.Method_1989(-24180 & 3994, "potato", new Class_44635(8239 & 2049, 0.53333336f * 0.5625f, Class_9265.Field_9295, Class_9265.Field_9356).\u0000strictfp("potato"));
        Class_1956.Method_1989(-26211 & 16841, "baked_potato", new Class_37934(-31995 & 3077, 0.2769231f * 2.1666667f, (36 & 2240) != 0).\u0000strictfp("potatoBaked"));
        Class_1956.Method_1989(9102 & 1450, "poisonous_potato", new Class_37934(2 & 4098, 3.1000001f * 0.09677419f, (10887 & -28592) != 0).Method_37952(Class_8338.Field_8367.Field_8364, 5 & 23797, 16552 & 272, 0.62650603f * 0.9576923f).\u0000strictfp("potatoPoisonous"));
        Class_1956.Method_1989(431 & 3467, "map", new Class_41319().\u0000strictfp("emptyMap"));
        Class_1956.Method_1989(8589 & -32372, "golden_carrot", new Class_37934(70 & -27593, 3.2129035f * 0.37349397f, (20868 & 8290) != 0).\u0000strictfp("carrotGolden").Method_2006("-0+1+2-3+13&4-4").Method_1983(Class_3987.Field_3990));
        Class_1956.Method_1989(-32369 & 15261, "skull", new Class_20646().\u0000strictfp("skull"));
        Class_1956.Method_1989(4046 & 398, "carrot_on_a_stick", new Class_31934().\u0000strictfp("carrotOnAStick"));
        Class_1956.Method_1989(399 & -15409, "nether_star", new Class_22773().\u0000strictfp("netherStar").Method_1983(Class_3987.Field_3996));
        Class_1956.Method_1989(410 & 18320, "pumpkin_pie", new Class_37934(16393 & 4200, 2.7272727f * 0.11000001f, (19494 & 512) != 0).\u0000strictfp("pumpkinPie").Method_1983(Class_3987.Field_3988));
        Class_1956.Method_1989(-20071 & 1425, "fireworks", new Class_26380().\u0000strictfp("fireworks"));
        Class_1956.Method_1989(434 & -10278, "firework_charge", new Class_26392().\u0000strictfp("fireworksCharge").Method_1983(Class_3987.Field_4003));
        Class_1956.Method_1989(411 & 27059, "enchanted_book", new Class_21684().\u0000, `(-28543 & 269).Method_2000("enchantedBook"));
        Class_1956.Method_1989(-26188 & 17364, "comparator", new Class_31154(Class_9265.Field_9435).\u0000strictfp("comparator").Method_1983(Class_3987.Field_3998));
        Class_1956.Method_1989(1437 & -15979, "netherbrick", new Class_1956().Method_2000("netherbrick").Method_1983(Class_3987.Field_3996));
        Class_1956.Method_1989(12694 & 2966, "quartz", new Class_1956().Method_2000("netherquartz").Method_1983(Class_3987.Field_3996));
        Class_1956.Method_1989(4543 & 407, "tnt_minecart", new Class_21085(Class_15120.Field_15126).\u0000strictfp("minecartTnt"));
        Class_1956.Method_1989(25020 & 2456, "hopper_minecart", new Class_21085(Class_15120.Field_15121).\u0000strictfp("minecartHopper"));
        Class_1956.Method_1989(-15975 & 13213, "prismarine_shard", new Class_1956().Method_2000("prismarineShard").Method_1983(Class_3987.Field_3996));
        Class_1956.Method_1989(4059 & -32326, "prismarine_crystals", new Class_1956().Method_2000("prismarineCrystals").Method_1983(Class_3987.Field_3996));
        Class_1956.Method_1989(8667 & 16795, "rabbit", new Class_37934(9219 & 20551, 0.047368422f * 6.3333335f, (1357 & 20609) != 0).\u0000strictfp("rabbitRaw"));
        Class_1956.Method_1989(23964 & 9212, "cooked_rabbit", new Class_37934(159 & 9285, 1.0666667f * 0.5625f, (2057 & 1747) != 0).\u0000strictfp("rabbitCooked"));
        Class_1956.Method_1989(19357 & -32353, "rabbit_stew", new Class_38887(8523 & 2058).\u0000strictfp("rabbitStew"));
        Class_1956.Method_1989(25502 & 4510, "rabbit_foot", new Class_1956().Method_2000("rabbitFoot").Method_2006("+0+1-2+3&4-4+13").Method_1983(Class_3987.Field_3990));
        Class_1956.Method_1989(-31777 & 5535, "rabbit_hide", new Class_1956().Method_2000("rabbitHide").Method_1983(Class_3987.Field_3996));
        Class_1956.Method_1989(4524 & -24141, "armor_stand", new Class_2031().\u0000strictfp("armorStand").Method_2029(-8109 & 7312));
        Class_1956.Method_1989(993 & -2639, "iron_horse_armor", new Class_1956().Method_2000("horsearmormetal").Method_2029(-15983 & 12801).Method_1983(Class_3987.Field_4003));
        Class_1956.Method_1989(18851 & 930, "golden_horse_armor", new Class_1956().Method_2000("horsearmorgold").Method_2029(9217 & 4577).Method_1983(Class_3987.Field_4003));
        Class_1956.Method_1989(427 & 8179, "diamond_horse_armor", new Class_1956().Method_2000("horsearmordiamond").Method_2029(25233 & 4111).Method_1983(Class_3987.Field_4003));
        Class_1956.Method_1989(12708 & 420, "lead", new Class_30873().\u0000strictfp("leash"));
        Class_1956.Method_1989(14247 & -32339, "name_tag", new Class_23631().\u0000strictfp("nameTag"));
        Class_1956.Method_1989(1014 & 6574, "command_block_minecart", new Class_21085(Class_15120.Field_15131).\u0000strictfp("minecartCommandBlock").Method_1983(null));
        Class_1956.Method_1989(14823 & 1983, "mutton", new Class_37934(35 & 9746, 0.23913044f * 1.2545455f, (65 & 28809) != 0).\u0000strictfp("muttonRaw"));
        Class_1956.Method_1989(-21075 & 16808, "cooked_mutton", new Class_37934(21031 & 2254, 1.728f * 0.46296296f, (133 & 25697) != 0).\u0000strictfp("muttonCooked"));
        Class_1956.Method_1989(-26629 & 8617, "banner", new Class_44516().\u0000strictfp("banner"));
        Class_1956.Method_1989(2475 & -23633, "spruce_door", new Class_25751(Class_9265.Field_9271).\u0000strictfp("doorSpruce"));
        Class_1956.Method_1989(2492 & -20050, "birch_door", new Class_25751(Class_9265.Field_9423).\u0000strictfp("doorBirch"));
        Class_1956.Method_1989(25021 & 2541, "jungle_door", new Class_25751(Class_9265.Field_9381).\u0000strictfp("doorJungle"));
        Class_1956.Method_1989(7662 & -32338, "acacia_door", new Class_25751(Class_9265.Field_9276).\u0000strictfp("doorAcacia"));
        Class_1956.Method_1989(-23121 & 17391, "dark_oak_door", new Class_25751(Class_9265.Field_9289).\u0000strictfp("doorDarkOak"));
        Class_1956.Method_1989(7120 & 19664, "record_13", new Class_32145("13").\u0000strictfp("record"));
        Class_1956.Method_1989(-13615 & 6397, "record_cat", new Class_32145("cat").\u0000strictfp("record"));
        Class_1956.Method_1989(-5934 & 3283, "record_blocks", new Class_32145("blocks").\u0000strictfp("record"));
        Class_1956.Method_1989(2259 & 10483, "record_chirp", new Class_32145("chirp").\u0000strictfp("record"));
        Class_1956.Method_1989(10453 & 2262, "record_far", new Class_32145("far").\u0000strictfp("record"));
        Class_1956.Method_1989(-30251 & 7391, "record_mall", new Class_32145("mall").\u0000strictfp("record"));
        Class_1956.Method_1989(10462 & -25386, "record_mellohi", new Class_32145("mellohi").\u0000strictfp("record"));
        Class_1956.Method_1989(2295 & 10463, "record_stal", new Class_32145("stal").\u0000strictfp("record"));
        Class_1956.Method_1989(2264 & 4056, "record_strad", new Class_32145("strad").\u0000strictfp("record"));
        Class_1956.Method_1989(-26407 & 2777, "record_ward", new Class_32145("ward").\u0000strictfp("record"));
        Class_1956.Method_1989(-30498 & 23546, "record_11", new Class_32145("11").\u0000strictfp("record"));
        Class_1956.Method_1989(6623 & 18651, "record_wait", new Class_32145("wait").\u0000strictfp("record"));
    }

    public boolean Method_1998(Class_23823 class_23823, Class_23823 class_238232) {
        return (17418 & 6324) != 0;
    }

    private static void Method_1999(Class_3238 class_3238) {
        Class_1956.Method_2005(class_3238, new Class_41056(class_3238));
    }

    static {
        Field_1966 = new HashMap();
        Field_1967 = UUID.fromString(Class_1956.Method_2020("\u4602\u4603\u4600\u4605\u4604\u4604\u4607\u4600\u460c\u460f\u460f\u460e\u460a\u460c\u460f\u460d\u4602\u4601\u4606\u4602\u4605\u4600\u4604\u4606\u4608\u460a\u460a\u4608\u4608\u460a\u4608\u460f\u4603\u4604\u4600\u4605"));
        Field_1965 = new Random();
    }

    public Class_1956 Method_2000(String string) {
        this.Field_1964 = string;
        return this;
    }

    public boolean Method_2001() {
        return this.Field_1958;
    }

    public int Method_2002() {
        return 12321 & -32684;
    }

    public void Method_2003(Class_23823 class_23823, Class_626 class_626, List list, boolean bl) {
    }

    private static void Method_2004(int n, Class_2080 class_2080, Class_1956 class_1956) {
        Field_1961.Method_3649(n, class_2080, class_1956);
    }

    protected static void Method_2005(Class_3238 class_3238, Class_1956 class_1956) {
        Class_1956.Method_2004(Class_3238.Method_3435(class_3238), (Class_2080)Class_3238.Field_3271.\u0000, `((Object)class_3238), class_1956);
        Field_1966.put(class_3238, class_1956);
    }

    protected Class_1956 Method_2006(String string) {
        this.Field_1957 = string;
        return this;
    }

    public int Method_2007(Class_23823 class_23823) {
        return 6148 & 771;
    }

    public boolean Method_2008(Class_23823 class_23823, Class_626 class_626, Class_283 class_283, Class_4751 class_4751, Class_4595 class_4595, float f, float f2, float f3) {
        return (5376 & -15722) != 0;
    }

    public boolean Method_2009() {
        return (12952 & 0) != 0;
    }

    public int Method_2010() {
        return this.Field_1968;
    }

    public boolean Method_2011() {
        return this.Field_1962;
    }

    public Multimap Method_2012() {
        return HashMultimap.create();
    }

    protected Class_1956 Method_2013(int n) {
        this.Field_1968 = n;
        return this;
    }

    public boolean Method_2014() {
        return (8213 & 1088) != 0;
    }

    public static Class_1956 Method_2015(String string) {
        Class_1956 class_1956 = (Class_1956)Field_1961.Method_3650(new Class_2080(string));
        if (class_1956 == null) {
            try {
                return Class_1956.Method_1978(Integer.parseInt(string));
            }
            catch (NumberFormatException numberFormatException) {
                // empty catch block
            }
        }
        return class_1956;
    }

    public void Method_2016(Class_1956 class_1956, Class_3987 class_3987, List list) {
        list.add(new Class_23823(class_1956, 137 & 14421, 10824 & -32381));
    }

    public boolean Method_2017() {
        return (64 & 1042) != 0;
    }

    public String Method_2018(Class_23823 class_23823) {
        return this.Field_1957;
    }

    public Class_25567 Method_2019(Class_23823 class_23823) {
        return Class_25567.Field_25572;
    }

    private static String Method_2020(String string) {
        int n = 19666;
        char[] arrc = string.toCharArray();
        StackTraceElement[] arrstackTraceElement = new Throwable().getStackTrace();
        n = (char)(n ^ (char)arrstackTraceElement[0].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getClassName().hashCode());
        char c = (char)Class_8.Method_10(Class_1956.class, 1);
        n = (char)(n ^ c);
        char c2 = (char)(n >> 7);
        for (int n2 = 0; n2 < arrc.length; n2 = (int)((char)(n2 + 1))) {
            arrc[n2] = (char)(arrc[n2] ^ n ^ n2 & c2);
        }
        return new String(arrc);
    }

    public Class_1956 Method_2021() {
        this.Field_1962 = 617 & 4113;
        return this;
    }

    public Class_41140 Method_2022(Class_23823 class_23823) {
        return class_23823.Method_23885() ? Class_41140.Field_41141 : Class_41140.Field_41146;
    }

    public boolean Method_2023(Class_23823 class_23823) {
        return (this.Method_1976() == (2571 & 33) && this.Method_1984() ? -31629 & 12289 : 1024 & 4516) != 0;
    }

    public boolean Method_2024() {
        return (this.Field_1963 != null ? -6783 & 33 : 10752 & 21554) != 0;
    }

    public Class_3987 Method_2025() {
        return this.Field_1959;
    }

    public String Method_2026() {
        return "item." + this.Field_1964;
    }

    public Class_23823 Method_2027(Class_23823 class_23823, Class_283 class_283, Class_626 class_626) {
        return class_23823;
    }

    public String Method_2028(Class_23823 class_23823) {
        return "item." + this.Field_1964;
    }

    public Class_1956 Method_2029(int n) {
        this.Field_1960 = n;
        return this;
    }

    public String Method_2030(Class_23823 class_23823) {
        return ("" + Class_7594.Method_7602(this.Method_1969(class_23823) + ".name")).trim();
    }
}

