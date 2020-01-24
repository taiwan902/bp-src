/*
 * Decompiled with CFR 0.145.
 * 
 * Could not load the following classes:
 *  com.google.common.base.Predicate
 *  com.google.common.primitives.Floats
 */
import com.google.common.base.Predicate;
import com.google.common.primitives.Floats;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.util.List;
import java.util.Random;

public class Class_29800
extends Class_1490
implements Class_11214,
Class_11216 {
    private Class_25402 Field_29801 = new Class_25402();
    protected String Field_29802 = "Customize World Settings";
    private Class_42376 Field_29803;
    private Class_44039 Field_29804;
    protected String Field_29805 = "Basic Settings";
    private boolean Field_29806 = -32376 & 24644;
    private Class_42376 Field_29807;
    private int Field_29808 = -32760 & 18470;
    private Class_42376 Field_29809;
    private Random Field_29810 = new Random();
    private Class_42376 Field_29811;
    private Class_42376 Field_29812;
    private Predicate Field_29813 = new Class_14525(this);
    private Class_42376 Field_29814;
    private Class_25402 Field_29815;
    private Class_42376 Field_29816;
    protected String[] Field_29817 = new String[-32756 & 15492];
    protected String Field_29818 = "Page 1 of 3";
    private Class_38966 Field_29819;
    private Class_42376 Field_29820;
    private boolean Field_29821 = 4417 & -21880;

    private void Method_29822() {
        Class_14944[] arrclass_14944 = new Class_14944[1043 & 12698];
        arrclass_14944[-32124 & 6408] = new Class_23438(11945 & -32544, Class_9802.Method_9806("createWorld.customize.custom.seaLevel", new Object[-31726 & 8741]), (-12183 & 131) != 0, this, 1.0f, 1.1428572f * 223.12498f, this.Field_29815.Field_25409);
        arrclass_14944[11595 & -32751] = new Class_25268(732 & 149, Class_9802.Method_9806("createWorld.customize.custom.useCaves", new Object[2 & 4480]), (6145 & -16205) != 0, this.Field_29815.Field_25418);
        arrclass_14944[29062 & 2] = new Class_25268(662 & 4278, Class_9802.Method_9806("createWorld.customize.custom.useStrongholds", new Object[20498 & -31892]), (-20459 & 16555) != 0, this.Field_29815.Field_25420);
        arrclass_14944[-30693 & 16419] = new Class_25268(8375 & -15465, Class_9802.Method_9806("createWorld.customize.custom.useVillages", new Object[17410 & -32735]), (2177 & 24933) != 0, this.Field_29815.Field_25457);
        arrclass_14944[-24506 & 4740] = new Class_25268(-32610 & 26808, Class_9802.Method_9806("createWorld.customize.custom.useMineShafts", new Object[5124 & 2112]), (3073 & -8021) != 0, this.Field_29815.Field_25460);
        arrclass_14944[17029 & 12301] = new Class_25268(21151 & -24391, Class_9802.Method_9806("createWorld.customize.custom.useTemples", new Object[277 & 14336]), (8709 & 20497) != 0, this.Field_29815.Field_25477);
        arrclass_14944[2070 & 12550] = new Class_25268(20690 & 223, Class_9802.Method_9806("createWorld.customize.custom.useMonuments", new Object[4112 & -32660]), (-31199 & 2369) != 0, this.Field_29815.Field_25406);
        arrclass_14944[16391 & 14791] = new Class_25268(-29506 & 154, Class_9802.Method_9806("createWorld.customize.custom.useRavines", new Object[4997 & -15328]), (10251 & -31983) != 0, this.Field_29815.Field_25403);
        arrclass_14944[-7158 & 40] = new Class_25268(21141 & 439, Class_9802.Method_9806("createWorld.customize.custom.useDungeons", new Object[4136 & 3728]), (-28511 & 593) != 0, this.Field_29815.Field_25453);
        arrclass_14944[-22481 & 4761] = new Class_23438(-30563 & 16541, Class_9802.Method_9806("createWorld.customize.custom.dungeonChance", new Object[-20224 & 512]), (5713 & 10401) != 0, this, 1.0f, 1.0f * 100.0f, this.Field_29815.Field_25451);
        arrclass_14944[8607 & 1034] = new Class_25268(155 & -4453, Class_9802.Method_9806("createWorld.customize.custom.useWaterLakes", new Object[7 & 1592]), (4213 & 11) != 0, this.Field_29815.Field_25444);
        arrclass_14944[5775 & 26683] = new Class_23438(28830 & -31778, Class_9802.Method_9806("createWorld.customize.custom.waterLakeChance", new Object[-24572 & 418]), (-27607 & 8209) != 0, this, 1.0f, 90.12345f * 1.1095891f, this.Field_29815.Field_25462);
        arrclass_14944[-29155 & 12558] = new Class_25268(-3684 & 188, Class_9802.Method_9806("createWorld.customize.custom.useLavaLakes", new Object[-14335 & 4178]), (-32351 & 7681) != 0, this.Field_29815.Field_25452);
        arrclass_14944[95 & -4723] = new Class_23438(-32353 & 13503, Class_9802.Method_9806("createWorld.customize.custom.lavaLakeChance", new Object[17448 & 322]), (8253 & 21633) != 0, this, 2.310345f * 4.328358f, 160.86957f * 0.6216216f, this.Field_29815.Field_25440);
        arrclass_14944[21582 & 559] = new Class_25268(1705 & 161, Class_9802.Method_9806("createWorld.customize.custom.useLavaOceans", new Object[1664 & 66]), (25863 & 2161) != 0, this.Field_29815.Field_25447);
        arrclass_14944[13583 & -16209] = new Class_23438(1186 & 167, Class_9802.Method_9806("createWorld.customize.custom.fixedBiome", new Object[-28062 & 1425]), (-30695 & 67) != 0, this, -4.2941175f * 0.23287672f, 35.0f * 1.0571429f, this.Field_29815.Field_25426);
        arrclass_14944[-28400 & 24758] = new Class_23438(-28249 & 24755, Class_9802.Method_9806("createWorld.customize.custom.biomeSize", new Object[-24272 & 7183]), (17025 & 6225) != 0, this, 1.0f, 13.428572f * 0.59574467f, this.Field_29815.Field_25473);
        arrclass_14944[8593 & 1593] = new Class_23438(933 & 180, Class_9802.Method_9806("createWorld.customize.custom.riverSize", new Object[5248 & 578]), (31761 & -32223) != 0, this, 1.0f, 7.0833335f * 0.7058823f, this.Field_29815.Field_25422);
        Class_14944[] arrclass_149442 = arrclass_14944;
        Class_14944[] arrclass_149443 = new Class_14944[2154 & -27566];
        arrclass_149443[9216 & -32448] = new Class_15395(8688 & 1441, Class_9802.Method_9806("tile.dirt.name", new Object[2112 & 8460]), (25688 & 290) != 0);
        arrclass_149443[1 & -21479] = null;
        arrclass_149443[-7670 & 130] = new Class_23438(-12059 & 2229, Class_9802.Method_9806("createWorld.customize.custom.size", new Object[5531 & 8256]), (16898 & -32624) != 0, this, 1.0f, 45.384613f * 1.101695f, this.Field_29815.Field_25445);
        arrclass_149443[4739 & 16651] = new Class_23438(24998 & 743, Class_9802.Method_9806("createWorld.customize.custom.count", new Object[24576 & -27891]), (-32503 & 19044) != 0, this, 0.0f, 1.8125f * 22.068966f, this.Field_29815.Field_25454);
        arrclass_149443[2060 & 708] = new Class_23438(-23897 & 17639, Class_9802.Method_9806("createWorld.customize.custom.minHeight", new Object[-32766 & 8]), (1174 & 8224) != 0, this, 0.0f, 0.91566265f * 278.48685f, this.Field_29815.Field_25476);
        arrclass_149443[3461 & -28659] = new Class_23438(20904 & 764, Class_9802.Method_9806("createWorld.customize.custom.maxHeight", new Object[9472 & 16995]), (24632 & -32444) != 0, this, 0.0f, 1.0333333f * 246.7742f, this.Field_29815.Field_25471);
        arrclass_149443[1934 & 16454] = new Class_15395(-28247 & 487, Class_9802.Method_9806("tile.gravel.name", new Object[288 & 29]), (9264 & 129) != 0);
        arrclass_149443[263 & -32761] = null;
        arrclass_149443[8205 & 16392] = new Class_23438(-32519 & 2477, Class_9802.Method_9806("createWorld.customize.custom.size", new Object[8353 & 1048]), (-4086 & 192) != 0, this, 1.0f, 0.43956044f * 113.75f, this.Field_29815.Field_25443);
        arrclass_149443[1737 & 24591] = new Class_23438(-32597 & 30890, Class_9802.Method_9806("createWorld.customize.custom.count", new Object[19552 & 522]), (-30700 & 329) != 0, this, 0.0f, 24.166666f * 1.6551725f, this.Field_29815.Field_25411);
        arrclass_149443[4138 & -30326] = new Class_23438(5803 & 10671, Class_9802.Method_9806("createWorld.customize.custom.minHeight", new Object[-31999 & 2116]), (16424 & -31104) != 0, this, 0.0f, 2.0555556f * 124.054054f, this.Field_29815.Field_25464);
        arrclass_149443[9547 & 43] = new Class_23438(2220 & 4799, Class_9802.Method_9806("createWorld.customize.custom.maxHeight", new Object[1008 & 19456]), (156 & 4163) != 0, this, 0.0f, 1.6f * 159.375f, this.Field_29815.Field_25428);
        arrclass_149443[5166 & 140] = new Class_15395(16803 & 3562, Class_9802.Method_9806("tile.stone.granite.name", new Object[24576 & 4656]), (-5110 & 176) != 0);
        arrclass_149443[-32755 & 47] = null;
        arrclass_149443[-24354 & 15] = new Class_23438(2221 & 8365, Class_9802.Method_9806("createWorld.customize.custom.size", new Object[5320 & -30668]), (524 & 2) != 0, this, 1.0f, 65.38461f * 0.7647059f, this.Field_29815.Field_25427);
        arrclass_149443[271 & 22063] = new Class_23438(-24402 & 238, Class_9802.Method_9806("createWorld.customize.custom.count", new Object[13316 & 528]), (0 & 4642) != 0, this, 0.0f, 48.219177f * 0.82954544f, this.Field_29815.Field_25478);
        arrclass_149443[-26444 & 8208] = new Class_23438(767 & 175, Class_9802.Method_9806("createWorld.customize.custom.minHeight", new Object[1050 & 12676]), (4492 & 24609) != 0, this, 0.0f, 74.83695f * 3.4074075f, this.Field_29815.Field_25465);
        arrclass_149443[17009 & 1301] = new Class_23438(2744 & 16560, Class_9802.Method_9806("createWorld.customize.custom.maxHeight", new Object[2624 & 17544]), (-14208 & 8211) != 0, this, 0.0f, 208.63637f * 1.2222222f, this.Field_29815.Field_25469);
        arrclass_149443[28250 & -32718] = new Class_15395(5099 & 1443, Class_9802.Method_9806("tile.stone.diorite.name", new Object[-31552 & 4]), (-2655 & 512) != 0);
        arrclass_149443[12307 & 19347] = null;
        arrclass_149443[-31659 & 916] = new Class_23438(2293 & 4529, Class_9802.Method_9806("createWorld.customize.custom.size", new Object[16899 & -32604]), (1024 & 12512) != 0, this, 1.0f, 91.666664f * 0.54545456f, this.Field_29815.Field_25430);
        arrclass_149443[-32619 & 1045] = new Class_23438(-19270 & 18615, Class_9802.Method_9806("createWorld.customize.custom.count", new Object[3 & 960]), (25245 & 1122) != 0, this, 0.0f, 0.06329114f * 632.0f, this.Field_29815.Field_25405);
        arrclass_149443[-32682 & 9246] = new Class_23438(3251 & 16567, Class_9802.Method_9806("createWorld.customize.custom.minHeight", new Object[-28402 & 9216]), (9733 & 18560) != 0, this, 0.0f, 247.11339f * 1.031915f, this.Field_29815.Field_25410);
        arrclass_149443[31 & 12759] = new Class_23438(18868 & -27404, Class_9802.Method_9806("createWorld.customize.custom.maxHeight", new Object[1152 & 8456]), (1089 & 14370) != 0, this, 0.0f, 16.346153f * 15.6f, this.Field_29815.Field_25431);
        arrclass_149443[15388 & -32358] = new Class_15395(-32345 & 436, Class_9802.Method_9806("tile.stone.andesite.name", new Object[23340 & -32751]), (6144 & -32007) != 0);
        arrclass_149443[2457 & 1625] = null;
        arrclass_149443[26 & 16538] = new Class_23438(7349 & -32587, Class_9802.Method_9806("createWorld.customize.custom.size", new Object[257 & 28800]), (-31704 & 128) != 0, this, 1.0f, 1.1125f * 44.94382f, this.Field_29815.Field_25458);
        arrclass_149443[6683 & -32325] = new Class_23438(4278 & -21322, Class_9802.Method_9806("createWorld.customize.custom.count", new Object[-28350 & 16561]), (-32000 & 67) != 0, this, 0.0f, 0.7083333f * 56.47059f, this.Field_29815.Field_25435);
        arrclass_149443[5471 & 28] = new Class_23438(6327 & -31049, Class_9802.Method_9806("createWorld.customize.custom.minHeight", new Object[4160 & 24736]), (4100 & 1832) != 0, this, 0.0f, 392.7f * 0.64935064f, this.Field_29815.Field_25408);
        arrclass_149443[4125 & 191] = new Class_23438(25785 & 4284, Class_9802.Method_9806("createWorld.customize.custom.maxHeight", new Object[4258 & 8192]), (2049 & 9240) != 0, this, 0.0f, 0.13131313f * 1941.9231f, this.Field_29815.Field_25416);
        arrclass_149443[-7138 & 639] = new Class_15395(-13907 & 485, Class_9802.Method_9806("tile.oreCoal.name", new Object[8880 & -32692]), (-30400 & 29214) != 0);
        arrclass_149443[27807 & 95] = null;
        arrclass_149443[-4048 & 171] = new Class_23438(12477 & 18873, Class_9802.Method_9806("createWorld.customize.custom.size", new Object[-27552 & 516]), (1 & -32680) != 0, this, 1.0f, 2.857143f * 17.5f, this.Field_29815.Field_25480);
        arrclass_149443[17657 & 12577] = new Class_23438(10938 & 1471, Class_9802.Method_9806("createWorld.customize.custom.count", new Object[-31744 & 20520]), (3175 & 20632) != 0, this, 0.0f, 2.7575758f * 14.505494f, this.Field_29815.Field_25463);
        arrclass_149443[8382 & -32734] = new Class_23438(20667 & -31557, Class_9802.Method_9806("createWorld.customize.custom.minHeight", new Object[-28671 & 28202]), (12802 & -14231) != 0, this, 0.0f, 164.33333f * 1.5517242f, this.Field_29815.Field_25424);
        arrclass_149443[16819 & 10351] = new Class_23438(189 & -32001, Class_9802.Method_9806("createWorld.customize.custom.maxHeight", new Object[26 & -7136]), (10246 & -30816) != 0, this, 0.0f, 9.0f * 28.333334f, this.Field_29815.Field_25421);
        arrclass_149443[19557 & 9140] = new Class_15395(-31322 & 31158, Class_9802.Method_9806("tile.oreIron.name", new Object[-23486 & 6428]), (528 & 16642) != 0);
        arrclass_149443[1893 & 55] = null;
        arrclass_149443[6694 & -24210] = new Class_23438(5310 & -15874, Class_9802.Method_9806("createWorld.customize.custom.size", new Object[4098 & -13404]), (26834 & 1032) != 0, this, 1.0f, 31.382978f * 1.5932204f, this.Field_29815.Field_25450);
        arrclass_149443[8231 & -29465] = new Class_23438(12479 & 17599, Class_9802.Method_9806("createWorld.customize.custom.count", new Object[544 & 4115]), (-15867 & 3458) != 0, this, 0.0f, 1960.0f * 0.020408163f, this.Field_29815.Field_25414);
        arrclass_149443[16956 & 104] = new Class_23438(20720 & 10436, Class_9802.Method_9806("createWorld.customize.custom.minHeight", new Object[-30654 & 8596]), (517 & 4096) != 0, this, 0.0f, 0.24489796f * 1041.25f, this.Field_29815.Field_25441);
        arrclass_149443[-25431 & 8761] = new Class_23438(489 & 8405, Class_9802.Method_9806("createWorld.customize.custom.maxHeight", new Object[-16377 & 10256]), (18448 & 6) != 0, this, 0.0f, 0.5492958f * 464.23077f, this.Field_29815.Field_25436);
        arrclass_149443[1066 & 17130] = new Class_15395(431 & -32329, Class_9802.Method_9806("tile.oreGold.name", new Object[17409 & 8582]), (-16384 & 8939) != 0);
        arrclass_149443[43 & -1861] = null;
        arrclass_149443[239 & -16068] = new Class_23438(-32574 & 2530, Class_9802.Method_9806("createWorld.customize.custom.size", new Object[520 & 0]), (1282 & 20524) != 0, this, 1.0f, 2.8181818f * 17.741936f, this.Field_29815.Field_25432);
        arrclass_149443[1069 & -9937] = new Class_23438(20675 & 219, Class_9802.Method_9806("createWorld.customize.custom.count", new Object[580 & 8224]), (16657 & 2088) != 0, this, 0.0f, 2.0217392f * 19.784945f, this.Field_29815.Field_25429);
        arrclass_149443[6782 & 8495] = new Class_23438(4293 & 19910, Class_9802.Method_9806("createWorld.customize.custom.minHeight", new Object[18447 & -28480]), (8 & 10630) != 0, this, 0.0f, 0.19565217f * 1303.3334f, this.Field_29815.Field_25423);
        arrclass_149443[47 & -20993] = new Class_23438(1005 & 28887, Class_9802.Method_9806("createWorld.customize.custom.maxHeight", new Object[-6132 & 338]), (-672 & 29) != 0, this, 0.0f, 22.5f * 11.333333f, this.Field_29815.Field_25442);
        arrclass_149443[1072 & 22904] = new Class_15395(4520 & 17323, Class_9802.Method_9806("tile.oreRedstone.name", new Object[-24384 & 20236]), (-8056 & 5154) != 0);
        arrclass_149443[-31695 & 55] = null;
        arrclass_149443[314 & 22578] = new Class_23438(4318 & 16870, Class_9802.Method_9806("createWorld.customize.custom.size", new Object[16400 & 14955]), (-27135 & 16416) != 0, this, 1.0f, 163.7931f * 0.30526316f, this.Field_29815.Field_25468);
        arrclass_149443[8823 & -15045] = new Class_23438(10439 & 1263, Class_9802.Method_9806("createWorld.customize.custom.count", new Object[-32764 & 4353]), (648 & 4145) != 0, this, 0.0f, 30.333334f * 1.3186812f, this.Field_29815.Field_25449);
        arrclass_149443[8436 & 2620] = new Class_23438(478 & 6376, Class_9802.Method_9806("createWorld.customize.custom.minHeight", new Object[6450 & 17089]), (10560 & -28670) != 0, this, 0.0f, 1020.0f * 0.25f, this.Field_29815.Field_25470);
        arrclass_149443[4151 & 17205] = new Class_23438(19147 & 201, Class_9802.Method_9806("createWorld.customize.custom.maxHeight", new Object[133 & 9248]), (-9904 & 10) != 0, this, 0.0f, 0.12195122f * 2091.0f, this.Field_29815.Field_25433);
        arrclass_149443[1214 & -30666] = new Class_15395(-31303 & 8619, Class_9802.Method_9806("tile.oreDiamond.name", new Object[24832 & 1198]), (50 & 29825) != 0);
        arrclass_149443[25975 & -28481] = null;
        arrclass_149443[8760 & -29639] = new Class_23438(26826 & 4331, Class_9802.Method_9806("createWorld.customize.custom.size", new Object[1064 & 2368]), (4410 & 9280) != 0, this, 1.0f, 66.37931f * 0.7532467f, this.Field_29815.Field_25459);
        arrclass_149443[25209 & 1213] = new Class_23438(715 & -31269, Class_9802.Method_9806("createWorld.customize.custom.count", new Object[15653 & 16448]), (22 & -29272) != 0, this, 0.0f, 0.10204082f * 392.0f, this.Field_29815.Field_25412);
        arrclass_149443[16634 & 4159] = new Class_23438(16588 & 494, Class_9802.Method_9806("createWorld.customize.custom.minHeight", new Object[-32120 & 16496]), (8192 & 104) != 0, this, 0.0f, 0.9f * 283.33334f, this.Field_29815.Field_25415);
        arrclass_149443[26815 & -28357] = new Class_23438(-28467 & 765, Class_9802.Method_9806("createWorld.customize.custom.maxHeight", new Object[-16884 & 16723]), (1032 & 19347) != 0, this, 0.0f, 423.48212f * 0.60215056f, this.Field_29815.Field_25461);
        arrclass_149443[-31684 & 30908] = new Class_15395(3050 & 16810, Class_9802.Method_9806("tile.oreLapis.name", new Object[-25468 & 8208]), (7248 & -16128) != 0);
        arrclass_149443[-32643 & 25405] = null;
        arrclass_149443[-32194 & 28798] = new Class_23438(-32513 & 3278, Class_9802.Method_9806("createWorld.customize.custom.size", new Object[16832 & 7]), (-28528 & 8229) != 0, this, 1.0f, 48.148148f * 1.0384616f, this.Field_29815.Field_25425);
        arrclass_149443[639 & -22209] = new Class_23438(16623 & -30001, Class_9802.Method_9806("createWorld.customize.custom.count", new Object[6178 & 16412]), (10210 & 2056) != 0, this, 0.0f, 0.5f * 80.0f, this.Field_29815.Field_25434);
        arrclass_149443[1137 & -30526] = new Class_23438(12753 & 1272, Class_9802.Method_9806("createWorld.customize.custom.center", new Object[-28409 & 16400]), (4224 & 270) != 0, this, 0.0f, 0.20879121f * 1221.3158f, this.Field_29815.Field_25479);
        arrclass_149443[1619 & 489] = new Class_23438(4305 & 8921, Class_9802.Method_9806("createWorld.customize.custom.spread", new Object[-30512 & 16649]), (-30586 & 21016) != 0, this, 0.0f, 28.333334f * 9.0f, this.Field_29815.Field_25417);
        Class_14944[] arrclass_149444 = arrclass_149443;
        Class_14944[] arrclass_149445 = new Class_14944[-30438 & 4849];
        arrclass_149445[16416 & 1296] = new Class_23438(4324 & 8574, Class_9802.Method_9806("createWorld.customize.custom.mainNoiseScaleX", new Object[1026 & -16156]), (14376 & -32640) != 0, this, 1.0f, 0.875f * 5714.2856f, this.Field_29815.Field_25448);
        arrclass_149445[-29687 & 12293] = new Class_23438(8303 & 6501, Class_9802.Method_9806("createWorld.customize.custom.mainNoiseScaleY", new Object[-28395 & 1088]), (32 & -32640) != 0, this, 1.0f, 779.2208f * 6.4166665f, this.Field_29815.Field_25472);
        arrclass_149445[9242 & -10238] = new Class_23438(8574 & 3686, Class_9802.Method_9806("createWorld.customize.custom.mainNoiseScaleZ", new Object[324 & -22520]), (-28032 & 304) != 0, this, 1.0f, 1.9411764f * 2575.7576f, this.Field_29815.Field_25474);
        arrclass_149445[1219 & 18487] = new Class_23438(-15633 & 1127, Class_9802.Method_9806("createWorld.customize.custom.depthNoiseScaleX", new Object[17568 & 13080]), (4163 & 768) != 0, this, 1.0f, 0.6119403f * 3268.2925f, this.Field_29815.Field_25467);
        arrclass_149445[20997 & -32754] = new Class_23438(17128 & 8312, Class_9802.Method_9806("createWorld.customize.custom.depthNoiseScaleZ", new Object[36 & -11559]), (176 & -16383) != 0, this, 1.0f, 0.24242425f * 8250.0f, this.Field_29815.Field_25456);
        arrclass_149445[1285 & 24645] = new Class_23438(-31123 & 22905, Class_9802.Method_9806("createWorld.customize.custom.depthNoiseScaleExponent", new Object[8192 & -31215]), (512 & 28941) != 0, this, 7.594936E-4f * 13.166667f, 2.6363637f * 7.5862064f, this.Field_29815.Field_25419);
        arrclass_149445[-24154 & 582] = new Class_23438(635 & -24338, Class_9802.Method_9806("createWorld.customize.custom.baseSize", new Object[16676 & 8707]), (2 & -32504) != 0, this, 1.0f, 40.0f * 0.625f, this.Field_29815.Field_25481);
        arrclass_149445[-22513 & 16391] = new Class_23438(8315 & -11921, Class_9802.Method_9806("createWorld.customize.custom.coordinateScale", new Object[12448 & 3090]), (16396 & -31744) != 0, this, 1.0f, 54000.0f * 0.11111111f, this.Field_29815.Field_25466);
        arrclass_149445[17417 & 6920] = new Class_23438(9196 & 16493, Class_9802.Method_9806("createWorld.customize.custom.heightScale", new Object[-30612 & 256]), (6 & 21736) != 0, this, 1.0f, 69000.0f * 0.08695652f, this.Field_29815.Field_25407);
        arrclass_149445[-31667 & 21145] = new Class_23438(-15747 & 111, Class_9802.Method_9806("createWorld.customize.custom.stretchY", new Object[1424 & 4103]), (586 & -23259) != 0, this, 0.011016949f * 0.9076923f, 114.0f * 0.4385965f, this.Field_29815.Field_25404);
        arrclass_149445[3242 & -16305] = new Class_23438(-31361 & 238, Class_9802.Method_9806("createWorld.customize.custom.upperLimitScale", new Object[13440 & 2312]), (-16380 & 8714) != 0, this, 1.0f, 7.2f * 694.44446f, this.Field_29815.Field_25438);
        arrclass_149445[1995 & 16427] = new Class_23438(-32145 & 10351, Class_9802.Method_9806("createWorld.customize.custom.lowerLimitScale", new Object[10778 & 20800]), (2402 & 20993) != 0, this, 1.0f, 4940.476f * 1.0120482f, this.Field_29815.Field_25439);
        arrclass_149445[156 & 15148] = new Class_23438(4336 & 24698, Class_9802.Method_9806("createWorld.customize.custom.biomeDepthWeight", new Object[17194 & -30588]), (-32380 & 2051) != 0, this, 1.0f, 1.4457831f * 13.833333f, this.Field_29815.Field_25455);
        arrclass_149445[-3059 & 525] = new Class_23438(8817 & 6385, Class_9802.Method_9806("createWorld.customize.custom.biomeDepthOffset", new Object[525 & 19858]), (-29312 & 2) != 0, this, 0.0f, 23.043478f * 0.8679245f, this.Field_29815.Field_25446);
        arrclass_149445[20590 & -32241] = new Class_23438(2162 & 9203, Class_9802.Method_9806("createWorld.customize.custom.biomeScaleWeight", new Object[4096 & 264]), (448 & -31202) != 0, this, 1.0f, 2.0526316f * 9.743589f, this.Field_29815.Field_25413);
        arrclass_149445[4431 & -32737] = new Class_23438(1919 & 24819, Class_9802.Method_9806("createWorld.customize.custom.biomeScaleOffset", new Object[-16248 & 2112]), (8 & 31363) != 0, this, 0.0f, 0.025316456f * 790.0f, this.Field_29815.Field_25437);
        Class_14944[] arrclass_149446 = arrclass_149445;
        Class_14944[] arrclass_149447 = new Class_14944[10365 & -12254];
        arrclass_149447[-31744 & 8322] = new Class_15395(3569 & -15980, Class_9802.Method_9806("createWorld.customize.custom.mainNoiseScaleX", new Object[306 & 23169]) + ":", (14484 & 1290) != 0);
        Object[] arrobject = new Object[2567 & 8321];
        arrobject[8330 & 3137] = Float.valueOf(this.Field_29815.Field_25448);
        arrclass_149447[-16365 & 9029] = new Class_18167(4246 & 16516, String.format("%5.3f", arrobject), (481 & 8196) != 0, this.Field_29813);
        arrclass_149447[18946 & 4226] = new Class_15395(17813 & -27663, Class_9802.Method_9806("createWorld.customize.custom.mainNoiseScaleY", new Object[8836 & 370]) + ":", (-22393 & 1368) != 0);
        Object[] arrobject2 = new Object[257 & 2241];
        arrobject2[-27568 & 18984] = Float.valueOf(this.Field_29815.Field_25472);
        arrclass_149447[-32725 & 17859] = new Class_18167(20935 & 8373, String.format("%5.3f", arrobject2), (16515 & -27808) != 0, this.Field_29813);
        arrclass_149447[-21804 & 16654] = new Class_15395(5522 & 8658, Class_9802.Method_9806("createWorld.customize.custom.mainNoiseScaleZ", new Object[-28672 & 16512]) + ":", (24928 & -32637) != 0);
        Object[] arrobject3 = new Object[11591 & -28527];
        arrobject3[1024 & 4378] = Float.valueOf(this.Field_29815.Field_25474);
        arrclass_149447[-28667 & 525] = new Class_18167(-15482 & 191, String.format("%5.3f", arrobject3), (8193 & -32608) != 0, this.Field_29813);
        arrclass_149447[21006 & -32761] = new Class_15395(1975 & -30253, Class_9802.Method_9806("createWorld.customize.custom.depthNoiseScaleX", new Object[8 & -23435]) + ":", (1540 & 26) != 0);
        Object[] arrobject4 = new Object[26697 & 645];
        arrobject4[896 & 3184] = Float.valueOf(this.Field_29815.Field_25467);
        arrclass_149447[1031 & 375] = new Class_18167(4231 & 3063, String.format("%5.3f", arrobject4), (3281 & -28158) != 0, this.Field_29813);
        arrclass_149447[1800 & 2058] = new Class_15395(8701 & 1428, Class_9802.Method_9806("createWorld.customize.custom.depthNoiseScaleZ", new Object[-7608 & 130]) + ":", (19456 & -32174) != 0);
        Object[] arrobject5 = new Object[-32767 & 26145];
        arrobject5[-20477 & 18228] = Float.valueOf(this.Field_29815.Field_25456);
        arrclass_149447[747 & -29687] = new Class_18167(17048 & 1162, String.format("%5.3f", arrobject5), (8453 & -16176) != 0, this.Field_29813);
        arrclass_149447[4362 & -14326] = new Class_15395(917 & 437, Class_9802.Method_9806("createWorld.customize.custom.depthNoiseScaleExponent", new Object[-20212 & 18432]) + ":", (-32472 & 10754) != 0);
        Object[] arrobject6 = new Object[25617 & -30711];
        arrobject6[2060 & 17473] = Float.valueOf(this.Field_29815.Field_25419);
        arrclass_149447[-15601 & 7195] = new Class_18167(-24183 & 16589, String.format("%2.3f", arrobject6), (-28670 & 8676) != 0, this.Field_29813);
        arrclass_149447[20540 & 1165] = new Class_15395(20991 & -24170, Class_9802.Method_9806("createWorld.customize.custom.baseSize", new Object[-30663 & 450]) + ":", (128 & 10256) != 0);
        Object[] arrobject7 = new Object[-32767 & 9363];
        arrobject7[8267 & 176] = Float.valueOf(this.Field_29815.Field_25481);
        arrclass_149447[15 & 16877] = new Class_18167(154 & -3893, String.format("%2.3f", arrobject7), (25216 & 4102) != 0, this.Field_29813);
        arrclass_149447[26702 & 5391] = new Class_15395(991 & 439, Class_9802.Method_9806("createWorld.customize.custom.coordinateScale", new Object[2305 & 16424]) + ":", (512 & 10352) != 0);
        Object[] arrobject8 = new Object[16417 & 6429];
        arrobject8[348 & 5664] = Float.valueOf(this.Field_29815.Field_25466);
        arrclass_149447[527 & 4431] = new Class_18167(5071 & -31557, String.format("%5.3f", arrobject8), (4114 & -22200) != 0, this.Field_29813);
        arrclass_149447[85 & 19226] = new Class_15395(22937 & 474, Class_9802.Method_9806("createWorld.customize.custom.heightScale", new Object[31770 & 993]) + ":", (-12397 & 100) != 0);
        Object[] arrobject9 = new Object[20557 & 8209];
        arrobject9[16548 & 18] = Float.valueOf(this.Field_29815.Field_25407);
        arrclass_149447[10769 & -12109] = new Class_18167(22764 & 1676, String.format("%5.3f", arrobject9), (-25228 & 8193) != 0, this.Field_29813);
        arrclass_149447[8218 & -26410] = new Class_15395(2457 & -26695, Class_9802.Method_9806("createWorld.customize.custom.stretchY", new Object[192 & 11520]) + ":", (-16256 & 8725) != 0);
        Object[] arrobject10 = new Object[4385 & 27717];
        arrobject10[585 & 38] = Float.valueOf(this.Field_29815.Field_25404);
        arrclass_149447[-27493 & 2355] = new Class_18167(143 & -26627, String.format("%2.3f", arrobject10), (-32352 & 25110) != 0, this.Field_29813);
        arrclass_149447[84 & 6164] = new Class_15395(4542 & 10139, Class_9802.Method_9806("createWorld.customize.custom.upperLimitScale", new Object[-30654 & 17792]) + ":", (22592 & 8961) != 0);
        Object[] arrobject11 = new Object[45 & -13501];
        arrobject11[544 & 4224] = Float.valueOf(this.Field_29815.Field_25438);
        arrclass_149447[8501 & 2581] = new Class_18167(10926 & 4254, String.format("%5.3f", arrobject11), (1090 & -21868) != 0, this.Field_29813);
        arrclass_149447[17430 & 4854] = new Class_15395(22011 & -29793, Class_9802.Method_9806("createWorld.customize.custom.lowerLimitScale", new Object[26724 & 2]) + ":", (8224 & 19536) != 0);
        Object[] arrobject12 = new Object[-24575 & 21733];
        arrobject12[17412 & 8306] = Float.valueOf(this.Field_29815.Field_25439);
        arrclass_149447[-31529 & 535] = new Class_18167(4239 & 9455, String.format("%5.3f", arrobject12), (6152 & 1795) != 0, this.Field_29813);
        arrclass_149447[2204 & 569] = new Class_15395(1470 & 988, Class_9802.Method_9806("createWorld.customize.custom.biomeDepthWeight", new Object[14353 & -16370]) + ":", (2336 & 640) != 0);
        Object[] arrobject13 = new Object[13317 & -30197];
        arrobject13[538 & 4129] = Float.valueOf(this.Field_29815.Field_25455);
        arrclass_149447[59 & -30691] = new Class_18167(8400 & -29284, String.format("%2.3f", arrobject13), (0 & 19779) != 0, this.Field_29813);
        arrclass_149447[-32486 & 26] = new Class_15395(2557 & -18531, Class_9802.Method_9806("createWorld.customize.custom.biomeDepthOffset", new Object[6528 & -8184]) + ":", (-31968 & 10434) != 0);
        Object[] arrobject14 = new Object[20761 & 10789];
        arrobject14[2320 & -32765] = Float.valueOf(this.Field_29815.Field_25446);
        arrclass_149447[11999 & 59] = new Class_18167(-23919 & 2455, String.format("%2.3f", arrobject14), (29827 & 376) != 0, this.Field_29813);
        arrclass_149447[28 & 17724] = new Class_15395(-15938 & 414, Class_9802.Method_9806("createWorld.customize.custom.biomeScaleWeight", new Object[270 & 6161]) + ":", (9473 & 17056) != 0);
        Object[] arrobject15 = new Object[-11735 & 129];
        arrobject15[24844 & 529] = Float.valueOf(this.Field_29815.Field_25413);
        arrclass_149447[4159 & -16355] = new Class_18167(4254 & 3507, String.format("%2.3f", arrobject15), (-14182 & 9252) != 0, this.Field_29813);
        arrclass_149447[4351 & 2334] = new Class_15395(17407 & -18017, Class_9802.Method_9806("createWorld.customize.custom.biomeScaleOffset", new Object[26919 & -28664]) + ":", (-32766 & 193) != 0);
        Object[] arrobject16 = new Object[10241 & 257];
        arrobject16[2059 & 12720] = Float.valueOf(this.Field_29815.Field_25437);
        arrclass_149447[-31713 & 30751] = new Class_18167(8855 & 147, String.format("%2.3f", arrobject16), (1584 & 16397) != 0, this.Field_29813);
        Class_14944[] arrclass_149448 = arrclass_149447;
        Class_14944[][] arrclass_149449 = new Class_14944[16388 & -31124][];
        arrclass_149449[672 & -25516] = arrclass_149442;
        arrclass_149449[18561 & 13321] = arrclass_149444;
        arrclass_149449[2050 & 9610] = arrclass_149446;
        arrclass_149449[24735 & 1027] = arrclass_149448;
        this.Field_29804 = new Class_44039(this.\u0000strictfp, this.\u0000= final, this.\u0000, `, -32608 & 3682, this.\u0000, ` - (6176 & -16352), 17049 & 9305, this, arrclass_149449);
        for (int i = -27616 & 537; i < (3340 & -8172); ++i) {
            this.Field_29817[i] = Class_9802.Method_9806("createWorld.customize.custom.page" + i, new Object[5316 & -30695]);
        }
        this.Method_29832();
    }

    public void Method_29823(int n, int n2, float f) {
        this.\u0000, 2();
        this.Field_29804.\u0000strictfp(n, n2, f);
        this.\u0000strictfp(this.\u0000strictfp, this.Field_29802, this.\u0000= final / (3202 & -20473), -15861 & 22, -788529153 & 100663295);
        this.\u0000strictfp(this.\u0000strictfp, this.Field_29818, this.\u0000= final / (-26206 & 8282), 16733 & 3116, 16777215 & -1040187393);
        this.\u0000strictfp(this.\u0000strictfp, this.Field_29805, this.\u0000= final / (24474 & -24570), 4662 & -21474, 486539263 & 1090519039);
        super.Method_1545(n, n2, f);
        if (this.Field_29808 != 0) {
            Class_29800.\u0000, `((int)(448 & 26168), (int)(11463 & 16656), (int)this.\u0000= final, (int)this.\u0000, `, (int)(-2062809576 & -769470074));
            this.\u0000strictfp(this.\u0000= final / (21659 & -24478) - (2139 & -23969), this.\u0000= final / (430 & 3602) + (6239 & -7302), 17259 & 4323, -1640224 & -2039069);
            this.\u0000strictfp(this.\u0000= final / (18946 & -20282) - (4443 & 16603), this.\u0000= final / (8282 & 1030) + (91 & 18650), -32583 & 18361, -6250310 & -1855836);
            this.\u0000, `(this.\u0000= final / (20518 & -30206) - (9051 & 5211), 7283 & -32149, 16569 & 3321, -2037252 & -1908511);
            this.\u0000, `(this.\u0000= final / (-28366 & 3074) + (-22146 & 730), 4207 & -14237, 2555 & 4281, -155168 & -6250333);
            float f2 = 88.54167f * 0.96f;
            float f3 = 0.3877551f * 464.21054f;
            Class_16867.Method_16931();
            Class_16867.Method_16954();
            Class_7644 class_7644 = Class_7644.Method_7649();
            Class_22385 class_22385 = class_7644.Method_7648();
            this.\u0000strictfp.Method_253().Method_34707(\u0000, `);
            Class_16867.Method_16924(1.0f, 1.0f, 1.0f, 1.0f);
            float f4 = 1.195122f * 26.775509f;
            class_22385.Method_22417(711 & 14631, Class_29585.Field_29586);
            class_22385.Method_22443(this.\u0000= final / (-31725 & 4102) - (-32678 & 222), 0.37333333333333335 * 495.5357142857143, 0.0).Method_22433(0.0, 4.39094387755102 * 0.6049382716049383).Method_22424(8916 & 64, 6348 & 66, 3669 & 24776, -25528 & 24902).Method_22451();
            class_22385.Method_22443(this.\u0000= final / (24082 & 202) + (21342 & -30630), 172.86885245901638 * 1.0701754385964912, 0.0).Method_22433(2.607142857142857 * 2.1575342465753424, 0.40865384615384615 * 6.5).Method_22424(-32140 & 24640, -32414 & 12496, 320 & 25682, -5950 & 320).Method_22451();
            class_22385.Method_22443(this.\u0000= final / (-31741 & 2186) + (16602 & -23173), 3.0 * 33.333333333333336, 0.0).Method_22433(2.03125 * 2.769230769230769, 0.0).Method_22424(11496 & 4178, -20156 & 17009, 581 & -32704, -32191 & 196).Method_22451();
            class_22385.Method_22443(this.\u0000= final / (6594 & -23525) - (28763 & 122), 90.625 * 1.103448275862069, 0.0).Method_22433(0.0, 0.0).Method_22424(8268 & 6112, 602 & 9316, 17985 & -28342, 64 & -15251).Method_22451();
            class_7644.Method_7647();
            this.\u0000strictfp(this.\u0000strictfp, Class_9802.Method_9806("createWorld.customize.custom.confirmTitle", new Object[16406 & -30720]), this.\u0000= final / (-22333 & 1078), -23173 & 6249, -1056964609 & 16777215);
            this.\u0000strictfp(this.\u0000strictfp, Class_9802.Method_9806("createWorld.customize.custom.confirm1", new Object[-5112 & 770]), this.\u0000= final / (18 & 8514), 6655 & -31619, 16777215 & -1728053249);
            this.\u0000strictfp(this.\u0000strictfp, Class_9802.Method_9806("createWorld.customize.custom.confirm2", new Object[24 & 2368]), this.\u0000= final / (16422 & 8267), 135 & 399, 285212671 & 1090519039);
            this.Field_29812.Method_42401(this.\u0000strictfp, n, n2);
            this.Field_29803.Method_42401(this.\u0000strictfp, n, n2);
        }
    }

    private void Method_29824(boolean bl) {
        this.Field_29821 = bl;
        this.Field_29809.Field_42388 = bl;
    }

    private void Method_29825(boolean bl) {
        this.Field_29812.Field_42378 = bl;
        this.Field_29803.Field_42378 = bl;
        this.Field_29816.Field_42388 = !bl ? 561 & 4357 : 29730 & 576;
        this.Field_29811.Field_42388 = !bl ? 27015 & 73 : 16512 & 3842;
        this.Field_29807.Field_42388 = !bl ? 8197 & -32767 : -16224 & 2054;
        this.Field_29820.Field_42388 = !bl ? 81 & 19981 : 2 & 5224;
        this.Field_29809.Field_42388 = this.Field_29821 && !bl ? 7169 & -24543 : 17446 & 2433;
        this.Field_29814.Field_42388 = !bl ? -8045 & 5381 : 288 & -10750;
        this.Field_29804.Method_44064((!bl ? 4739 & -14071 : 8458 & 2740) != 0);
    }

    public void Method_29826(int n, float f) {
        Class_1551 class_1551;
        switch (n) {
            case 100: {
                this.Field_29815.Field_25448 = f;
                break;
            }
            case 101: {
                this.Field_29815.Field_25472 = f;
                break;
            }
            case 102: {
                this.Field_29815.Field_25474 = f;
                break;
            }
            case 103: {
                this.Field_29815.Field_25467 = f;
                break;
            }
            case 104: {
                this.Field_29815.Field_25456 = f;
                break;
            }
            case 105: {
                this.Field_29815.Field_25419 = f;
                break;
            }
            case 106: {
                this.Field_29815.Field_25481 = f;
                break;
            }
            case 107: {
                this.Field_29815.Field_25466 = f;
                break;
            }
            case 108: {
                this.Field_29815.Field_25407 = f;
                break;
            }
            case 109: {
                this.Field_29815.Field_25404 = f;
                break;
            }
            case 110: {
                this.Field_29815.Field_25438 = f;
                break;
            }
            case 111: {
                this.Field_29815.Field_25439 = f;
                break;
            }
            case 112: {
                this.Field_29815.Field_25455 = f;
                break;
            }
            case 113: {
                this.Field_29815.Field_25446 = f;
                break;
            }
            case 114: {
                this.Field_29815.Field_25413 = f;
                break;
            }
            case 115: {
                this.Field_29815.Field_25437 = f;
            }
            default: {
                break;
            }
            case 157: {
                this.Field_29815.Field_25451 = (int)f;
                break;
            }
            case 158: {
                this.Field_29815.Field_25462 = (int)f;
                break;
            }
            case 159: {
                this.Field_29815.Field_25440 = (int)f;
                break;
            }
            case 160: {
                this.Field_29815.Field_25409 = (int)f;
                break;
            }
            case 162: {
                this.Field_29815.Field_25426 = (int)f;
                break;
            }
            case 163: {
                this.Field_29815.Field_25473 = (int)f;
                break;
            }
            case 164: {
                this.Field_29815.Field_25422 = (int)f;
                break;
            }
            case 165: {
                this.Field_29815.Field_25445 = (int)f;
                break;
            }
            case 166: {
                this.Field_29815.Field_25454 = (int)f;
                break;
            }
            case 167: {
                this.Field_29815.Field_25476 = (int)f;
                break;
            }
            case 168: {
                this.Field_29815.Field_25471 = (int)f;
                break;
            }
            case 169: {
                this.Field_29815.Field_25443 = (int)f;
                break;
            }
            case 170: {
                this.Field_29815.Field_25411 = (int)f;
                break;
            }
            case 171: {
                this.Field_29815.Field_25464 = (int)f;
                break;
            }
            case 172: {
                this.Field_29815.Field_25428 = (int)f;
                break;
            }
            case 173: {
                this.Field_29815.Field_25427 = (int)f;
                break;
            }
            case 174: {
                this.Field_29815.Field_25478 = (int)f;
                break;
            }
            case 175: {
                this.Field_29815.Field_25465 = (int)f;
                break;
            }
            case 176: {
                this.Field_29815.Field_25469 = (int)f;
                break;
            }
            case 177: {
                this.Field_29815.Field_25430 = (int)f;
                break;
            }
            case 178: {
                this.Field_29815.Field_25405 = (int)f;
                break;
            }
            case 179: {
                this.Field_29815.Field_25410 = (int)f;
                break;
            }
            case 180: {
                this.Field_29815.Field_25431 = (int)f;
                break;
            }
            case 181: {
                this.Field_29815.Field_25458 = (int)f;
                break;
            }
            case 182: {
                this.Field_29815.Field_25435 = (int)f;
                break;
            }
            case 183: {
                this.Field_29815.Field_25408 = (int)f;
                break;
            }
            case 184: {
                this.Field_29815.Field_25416 = (int)f;
                break;
            }
            case 185: {
                this.Field_29815.Field_25480 = (int)f;
                break;
            }
            case 186: {
                this.Field_29815.Field_25463 = (int)f;
                break;
            }
            case 187: {
                this.Field_29815.Field_25424 = (int)f;
                break;
            }
            case 189: {
                this.Field_29815.Field_25421 = (int)f;
                break;
            }
            case 190: {
                this.Field_29815.Field_25450 = (int)f;
                break;
            }
            case 191: {
                this.Field_29815.Field_25414 = (int)f;
                break;
            }
            case 192: {
                this.Field_29815.Field_25441 = (int)f;
                break;
            }
            case 193: {
                this.Field_29815.Field_25436 = (int)f;
                break;
            }
            case 194: {
                this.Field_29815.Field_25432 = (int)f;
                break;
            }
            case 195: {
                this.Field_29815.Field_25429 = (int)f;
                break;
            }
            case 196: {
                this.Field_29815.Field_25423 = (int)f;
                break;
            }
            case 197: {
                this.Field_29815.Field_25442 = (int)f;
                break;
            }
            case 198: {
                this.Field_29815.Field_25468 = (int)f;
                break;
            }
            case 199: {
                this.Field_29815.Field_25449 = (int)f;
                break;
            }
            case 200: {
                this.Field_29815.Field_25470 = (int)f;
                break;
            }
            case 201: {
                this.Field_29815.Field_25433 = (int)f;
                break;
            }
            case 202: {
                this.Field_29815.Field_25459 = (int)f;
                break;
            }
            case 203: {
                this.Field_29815.Field_25412 = (int)f;
                break;
            }
            case 204: {
                this.Field_29815.Field_25415 = (int)f;
                break;
            }
            case 205: {
                this.Field_29815.Field_25461 = (int)f;
                break;
            }
            case 206: {
                this.Field_29815.Field_25425 = (int)f;
                break;
            }
            case 207: {
                this.Field_29815.Field_25434 = (int)f;
                break;
            }
            case 208: {
                this.Field_29815.Field_25479 = (int)f;
                break;
            }
            case 209: {
                this.Field_29815.Field_25417 = (int)f;
            }
        }
        if (n >= (16741 & 10342) && n < (-30476 & 8311) && (class_1551 = this.Field_29804.Method_44068(n - (-22154 & 5220) + (18612 & -24443))) != null) {
            ((Class_38813)class_1551).Method_38853(this.Method_29840(n, f));
        }
        if (!this.Field_29815.Method_25482(this.Field_29801)) {
            this.Method_29824((1 & -2799) != 0);
        }
    }

    public void Method_29827(int n, String string) {
        float f = 0.0f;
        try {
            f = Float.parseFloat(string);
        }
        catch (NumberFormatException numberFormatException) {
            // empty catch block
        }
        float f2 = 0.0f;
        switch (n) {
            case 132: {
                f2 = this.Field_29815.Field_25448 = Class_13337.Method_13360(f, 1.0f, 7.2f * 694.44446f);
                break;
            }
            case 133: {
                f2 = this.Field_29815.Field_25472 = Class_13337.Method_13360(f, 1.0f, 0.36666667f * 13636.363f);
                break;
            }
            case 134: {
                f2 = this.Field_29815.Field_25474 = Class_13337.Method_13360(f, 1.0f, 1.175f * 4255.3193f);
                break;
            }
            case 135: {
                f2 = this.Field_29815.Field_25467 = Class_13337.Method_13360(f, 1.0f, 6142.857f * 0.3255814f);
                break;
            }
            case 136: {
                f2 = this.Field_29815.Field_25456 = Class_13337.Method_13360(f, 1.0f, 0.10714286f * 18666.666f);
                break;
            }
            case 137: {
                f2 = this.Field_29815.Field_25419 = Class_13337.Method_13360(f, 0.012999999f * 0.7692308f, 31.199999f * 0.64102566f);
                break;
            }
            case 138: {
                f2 = this.Field_29815.Field_25481 = Class_13337.Method_13360(f, 1.0f, 2.9f * 8.620689f);
                break;
            }
            case 139: {
                f2 = this.Field_29815.Field_25466 = Class_13337.Method_13360(f, 1.0f, 4608.696f * 1.3018868f);
                break;
            }
            case 140: {
                f2 = this.Field_29815.Field_25407 = Class_13337.Method_13360(f, 1.0f, 5414.634f * 1.1081082f);
                break;
            }
            case 141: {
                f2 = this.Field_29815.Field_25404 = Class_13337.Method_13360(f, 0.58536583f * 0.017083334f, 8.0f * 6.25f);
                break;
            }
            case 142: {
                f2 = this.Field_29815.Field_25438 = Class_13337.Method_13360(f, 1.0f, 24285.715f * 0.20588236f);
                break;
            }
            case 143: {
                f2 = this.Field_29815.Field_25439 = Class_13337.Method_13360(f, 1.0f, 1.5263158f * 3275.862f);
                break;
            }
            case 144: {
                f2 = this.Field_29815.Field_25455 = Class_13337.Method_13360(f, 1.0f, 0.37931034f * 52.727272f);
                break;
            }
            case 145: {
                f2 = this.Field_29815.Field_25446 = Class_13337.Method_13360(f, 0.0f, 0.10843374f * 184.44444f);
                break;
            }
            case 146: {
                f2 = this.Field_29815.Field_25413 = Class_13337.Method_13360(f, 1.0f, 0.14130434f * 141.53847f);
                break;
            }
            case 147: {
                f2 = this.Field_29815.Field_25437 = Class_13337.Method_13360(f, 0.0f, 0.84210527f * 23.75f);
            }
        }
        if (f2 != f && f != 0.0f) {
            ((Class_38813)this.Field_29804.Method_44068(n)).Method_38853(this.Method_29840(n, f2));
        }
        ((Class_43880)this.Field_29804.Method_44068(n - (661 & -28284) + (-16281 & 2020))).Method_43896(f2, (14128 & -16384) != 0);
        if (!this.Field_29815.Method_25482(this.Field_29801)) {
            this.Method_29824((-32475 & 1113) != 0);
        }
    }

    private void Method_29828() {
        MethodHandle methodHandle = MethodHandles.constant(String.class, "MC|BlazingPack");
    }

    protected void Method_29829(int n, int n2, int n3) {
        super.Method_1537(n, n2, n3);
        if (this.Field_29808 == 0 && !this.Field_29806) {
            this.Field_29804.Method_44058(n, n2, n3);
        }
    }

    public void Method_29830(int n, boolean bl) {
        switch (n) {
            case 148: {
                this.Field_29815.Field_25418 = bl;
                break;
            }
            case 149: {
                this.Field_29815.Field_25453 = bl;
                break;
            }
            case 150: {
                this.Field_29815.Field_25420 = bl;
                break;
            }
            case 151: {
                this.Field_29815.Field_25457 = bl;
                break;
            }
            case 152: {
                this.Field_29815.Field_25460 = bl;
                break;
            }
            case 153: {
                this.Field_29815.Field_25477 = bl;
                break;
            }
            case 154: {
                this.Field_29815.Field_25403 = bl;
                break;
            }
            case 155: {
                this.Field_29815.Field_25444 = bl;
                break;
            }
            case 156: {
                this.Field_29815.Field_25452 = bl;
                break;
            }
            case 161: {
                this.Field_29815.Field_25447 = bl;
                break;
            }
            case 210: {
                this.Field_29815.Field_25406 = bl;
            }
        }
        if (!this.Field_29815.Method_25482(this.Field_29801)) {
            this.Method_29824((12801 & 155) != 0);
        }
    }

    protected void Method_29831(char c, int n) {
        super.Method_1525(c, n);
        if (this.Field_29808 == 0) {
            switch (n) {
                case 200: {
                    this.Method_29841(1.0f);
                    break;
                }
                case 208: {
                    this.Method_29841(1.057971f * -0.9452055f);
                    break;
                }
                default: {
                    this.Field_29804.Method_44053(c, n);
                }
            }
        }
    }

    private void Method_29832() {
        this.Field_29807.Field_42388 = this.Field_29804.Method_44066() != 0 ? 185 & 22341 : -32616 & 2052;
        this.Field_29820.Field_42388 = this.Field_29804.Method_44066() != this.Field_29804.Method_44054() - (97 & -29559) ? 9221 & 16393 : -23406 & 17249;
        Object[] arrobject = new Object[-32510 & 25643];
        arrobject[24576 & -24991] = this.Field_29804.Method_44066() + (4113 & -29975);
        arrobject[-16095 & 15965] = this.Field_29804.Method_44054();
        this.Field_29818 = Class_9802.Method_9806("book.pageIndicator", arrobject);
        this.Field_29805 = this.Field_29817[this.Field_29804.Method_44066()];
        this.Field_29816.Field_42388 = this.Field_29804.Method_44066() != this.Field_29804.Method_44054() - (16541 & 8961) ? 5 & 12057 : 17988 & 8577;
    }

    protected void Method_29833(Class_42376 class_42376) {
        if (class_42376.Field_42388) {
            switch (class_42376.Field_42392) {
                case 300: {
                    this.Field_29819.Field_38968 = this.Field_29815.Method_25484();
                    this.\u0000strictfp.Method_218(this.Field_29819);
                    break;
                }
                case 301: {
                    for (int i = 16 & 1152; i < this.Field_29804.Method_44067(); ++i) {
                        Class_1551 class_1551;
                        Class_23503 class_23503 = this.Field_29804.Method_44062(i);
                        Class_1551 class_15512 = class_23503.Method_23526();
                        if (class_15512 instanceof Class_42376) {
                            class_1551 = (Class_42376)class_15512;
                            if (class_1551 instanceof Class_43880) {
                                float f = ((Class_43880)class_1551).Method_43893() * (0.05263158f * 14.25f + this.Field_29810.nextFloat() * (0.24242425f * 2.0625f)) + (this.Field_29810.nextFloat() * (0.21351351f * 0.46835443f) - 0.040625f * 1.2307693f);
                                ((Class_43880)class_1551).Method_43897(Class_13337.Method_13360(f, 0.0f, 1.0f));
                            } else if (class_1551 instanceof Class_47574) {
                                ((Class_47574)class_1551).Method_47578(this.Field_29810.nextBoolean());
                            }
                        }
                        if (!((class_1551 = class_23503.Method_23515()) instanceof Class_42376)) continue;
                        Class_1551 class_15513 = class_1551;
                        if (class_15513 instanceof Class_43880) {
                            float f = ((Class_43880)class_15513).Method_43893() * (3.5625f * 0.21052632f + this.Field_29810.nextFloat() * (0.0057471264f * 87.0f)) + (this.Field_29810.nextFloat() * (1.12f * 0.08928572f) - 0.5f * 0.1f);
                            ((Class_43880)class_15513).Method_43897(Class_13337.Method_13360(f, 0.0f, 1.0f));
                            continue;
                        }
                        if (!(class_15513 instanceof Class_47574)) continue;
                        ((Class_47574)class_15513).Method_47578(this.Field_29810.nextBoolean());
                    }
                    return;
                }
                case 302: {
                    this.Field_29804.Method_44051();
                    this.Method_29832();
                    break;
                }
                case 303: {
                    this.Field_29804.Method_44063();
                    this.Method_29832();
                    break;
                }
                case 304: {
                    if (!this.Field_29821) break;
                    this.Method_29839(5427 & 308);
                    break;
                }
                case 305: {
                    this.\u0000strictfp.Method_218(new Class_18901(this));
                    break;
                }
                case 306: {
                    this.Method_29837();
                    break;
                }
                case 307: {
                    this.Field_29808 = 1100 & -16112;
                    this.Method_29837();
                }
            }
        }
    }

    public String Method_29834() {
        return this.Field_29815.Method_25484().replace("\n", "");
    }

    public void Method_29835() {
        super.Method_1544();
        this.Field_29804.\u0000, for();
    }

    public void Method_29836() {
        int n = 6405 & -31646;
        int n2 = -31700 & 12992;
        if (this.Field_29804 != null) {
            n = this.Field_29804.Method_44066();
            n2 = this.Field_29804.\u0000= switch();
        }
        this.Field_29802 = Class_9802.Method_9806("options.customizeTitle", new Object[17025 & 10246]);
        this.\u0000strictfp.clear();
        this.Field_29807 = new Class_42376(5039 & 11566, 701 & 8212, 4357 & 8365, -26670 & 18524, -4682 & 533, Class_9802.Method_9806("createWorld.customize.custom.prev", new Object[3072 & 20640]));
        this.\u0000strictfp.add(this.Field_29807);
        this.Field_29820 = new Class_42376(9647 & -27857, this.\u0000= final - (100 & -32515), 9285 & -11993, 5105 & -32676, 9238 & -29859, Class_9802.Method_9806("createWorld.customize.custom.next", new Object[16498 & 10756]));
        this.\u0000strictfp.add(this.Field_29820);
        this.Field_29809 = new Class_42376(505 & -30416, this.\u0000= final / (2370 & 55) - (699 & 20923), this.\u0000, ` - (-32101 & 29727), 19930 & 4190, -24364 & 16438, Class_9802.Method_9806("createWorld.customize.custom.defaults", new Object[537 & -24540]));
        this.\u0000strictfp.add(this.Field_29809);
        this.Field_29816 = new Class_42376(-23235 & 2541, this.\u0000= final / (-31734 & 22531) - (2140 & 4861), this.\u0000, ` - (-24005 & 4127), -28070 & 90, 7700 & 8212, Class_9802.Method_9806("createWorld.customize.custom.randomize", new Object[16401 & 232]));
        this.\u0000strictfp.add(this.Field_29816);
        this.Field_29814 = new Class_42376(-31439 & 18743, this.\u0000= final / (771 & -32674) + (3075 & -24037), this.\u0000, ` - (19867 & 12347), 8415 & 4442, 9173 & 20508, Class_9802.Method_9806("createWorld.customize.custom.presets", new Object[1120 & -1277]));
        this.\u0000strictfp.add(this.Field_29814);
        this.Field_29811 = new Class_42376(-30291 & 29484, this.\u0000= final / (2326 & -11198) + (3555 & 24686), this.\u0000, ` - (-32453 & 21211), 2138 & 346, 2100 & -24299, Class_9802.Method_9806("gui.done", new Object[-32704 & 1810]));
        this.\u0000strictfp.add(this.Field_29811);
        this.Field_29809.Field_42388 = this.Field_29821;
        this.Field_29812 = new Class_42376(-27341 & 446, this.\u0000= final / (16402 & -32214) - (25143 & 311), -22560 & 4276, 886 & -19405, 6518 & 8220, Class_9802.Method_9806("gui.yes", new Object[8273 & -32120]));
        this.Field_29812.Field_42378 = 6304 & 16400;
        this.\u0000strictfp.add(this.Field_29812);
        this.Field_29803 = new Class_42376(-24261 & 7091, this.\u0000= final / (3850 & -32750) + (8549 & 645), 4275 & 11500, 28991 & 178, -24460 & 18964, Class_9802.Method_9806("gui.no", new Object[-29687 & 20]));
        this.Field_29803.Field_42378 = 2048 & 9553;
        this.\u0000strictfp.add(this.Field_29803);
        if (this.Field_29808 != 0) {
            this.Field_29812.Field_42378 = 225 & -11747;
            this.Field_29803.Field_42378 = -8163 & 4163;
        }
        this.Method_29822();
        if (n != 0) {
            this.Field_29804.Method_44055(n);
            this.Field_29804.\u0000, `(n2);
            this.Method_29832();
        }
    }

    private void Method_29837() {
        switch (this.Field_29808) {
            case 300: {
                this.Method_29833((Class_47574)this.Field_29804.Method_44068(428 & 16685));
                break;
            }
            case 304: {
                this.Method_29844();
            }
        }
        this.Field_29808 = 5378 & -32704;
        this.Field_29806 = 131 & 565;
        this.Method_29825((-23325 & 2312) != 0);
    }

    public String Method_29838(int n, String string, float f) {
        return string + ": " + this.Method_29840(n, f);
    }

    private void Method_29839(int n) {
        this.Field_29808 = n;
        this.Method_29825((2257 & -31711) != 0);
    }

    private String Method_29840(int n, float f) {
        switch (n) {
            case 100: 
            case 101: 
            case 102: 
            case 103: 
            case 104: 
            case 107: 
            case 108: 
            case 110: 
            case 111: 
            case 132: 
            case 133: 
            case 134: 
            case 135: 
            case 136: 
            case 139: 
            case 140: 
            case 142: 
            case 143: {
                Object[] arrobject = new Object[6321 & -15355];
                arrobject[8554 & 7172] = Float.valueOf(f);
                return String.format("%5.3f", arrobject);
            }
            case 105: 
            case 106: 
            case 109: 
            case 112: 
            case 113: 
            case 114: 
            case 115: 
            case 137: 
            case 138: 
            case 141: 
            case 144: 
            case 145: 
            case 146: 
            case 147: {
                Object[] arrobject = new Object[-19935 & 2265];
                arrobject[10272 & 0] = Float.valueOf(f);
                return String.format("%2.3f", arrobject);
            }
            default: {
                Object[] arrobject = new Object[8723 & -16251];
                arrobject[-32636 & 13576] = (int)f;
                return String.format("%d", arrobject);
            }
            case 162: 
        }
        if (f < 0.0f) {
            return Class_9802.Method_9806("gui.all", new Object[8322 & 1793]);
        }
        if ((int)f >= Class_17281.Field_17327.Field_17343) {
            Class_17281 class_17281 = Class_17281.Method_17425()[(int)f + (-26542 & 25094)];
            return class_17281 != null ? class_17281.Field_17355 : "?";
        }
        Class_17281 class_17281 = Class_17281.Method_17425()[(int)f];
        return class_17281 != null ? class_17281.Field_17355 : "?";
    }

    private void Method_29841(float f) {
        Class_1551 class_1551 = this.Field_29804.Method_44071();
        if (class_1551 instanceof Class_38813) {
            Float f2;
            Class_38813 class_38813;
            float f3 = f;
            if (Class_1490.Method_1510()) {
                f3 = f * (2.2857144f * 0.04375f);
                if (Class_1490.Method_1538()) {
                    f3 *= 0.21052632f * 0.475f;
                }
            } else if (Class_1490.Method_1538()) {
                f3 = f * (0.16923077f * 59.090908f);
                if (Class_1490.Method_1515()) {
                    f3 *= 16.458334f * 0.6075949f;
                }
            }
            if ((f2 = Floats.tryParse((String)(class_38813 = (Class_38813)class_1551).Method_38848())) != null) {
                f2 = Float.valueOf(f2.floatValue() + f3);
                int n = class_38813.Method_38872();
                String string = this.Method_29840(class_38813.Method_38872(), f2.floatValue());
                class_38813.Method_38853(string);
                this.Method_29827(n, string);
            }
        }
    }

    protected void Method_29842(int n, int n2, int n3) {
        super.Method_1518(n, n2, n3);
        if (this.Field_29806) {
            this.Field_29806 = -23552 & 4554;
        } else if (this.Field_29808 == 0) {
            this.Field_29804.\u0000strictfp(n, n2, n3);
        }
    }

    public Class_29800(Class_1490 class_1490, String string) {
        this.Field_29819 = (Class_38966)class_1490;
        this.Method_29843(string);
    }

    public void Method_29843(String string) {
        this.Field_29815 = string != null && string.length() != 0 ? Class_25402.Method_25487(string) : new Class_25402();
    }

    private void Method_29844() {
        this.Field_29815.Method_25486();
        this.Method_29822();
        this.Method_29824((21088 & 8578) != 0);
    }
}

