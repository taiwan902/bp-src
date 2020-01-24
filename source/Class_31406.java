/*
 * Decompiled with CFR 0.145.
 * 
 * Could not load the following classes:
 *  internal.org.lwjgl.input.Keyboard
 *  org.cef.browser.CefBrowserOsr
 */
import internal.org.lwjgl.input.Keyboard;
import java.awt.Component;
import java.awt.event.KeyEvent;
import java.io.PrintStream;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.reflect.Field;
import org.cef.browser.CefBrowserOsr;

public class Class_31406 {
    private static final Field Field_31407;
    private static int[] Field_31408;

    private static KeyEvent Method_31409(KeyEvent keyEvent, int n) {
        try {
            Field_31407.set(keyEvent, n);
        }
        catch (IllegalAccessException | IllegalArgumentException exception) {
            // empty catch block
        }
        return keyEvent;
    }

    public static int Method_31410() {
        int n = Class_1490.Method_1510() ? -7104 & 368 : 8192 & -29870;
        int n2 = Keyboard.isKeyDown((int)(-30664 & 25848)) ? 9089 & -32252 : 1667 & 120;
        int n3 = Keyboard.isKeyDown((int)(20125 & 12605)) || Keyboard.isKeyDown((int)(10655 & 5853)) ? 25216 & -32638 : 9216 & -32236;
        int n4 = Keyboard.isKeyDown((int)(763 & 26847)) || Keyboard.isKeyDown((int)(9436 & -30498)) ? 4352 & -31862 : -30712 & 160;
        int n5 = Keyboard.isKeyDown((int)(24761 & 7416)) ? 17040 & 649 : 9529 & 2180;
        return n | n2 | n3 | n4 | n5;
    }

    static {
        try {
            Field_31407 = KeyEvent.class.getDeclaredField(Class_31406.Method_31414("\u024b\u025b\u025b\u0254\u025b\u0257\u025e\u025f"));
            Field_31407.setAccessible((-8191 & 2947) != 0);
        }
        catch (NoSuchFieldException | SecurityException exception) {
            throw new RuntimeException(exception);
        }
        int[] arrn = new int[-3244 & 288];
        arrn[17440 & -26302] = 6154 & 1105;
        arrn[-28607 & 8839] = -31456 & 4120;
        arrn[-30566 & 12354] = 9217 & -29992;
        arrn[-24569 & 683] = 24951 & -32698;
        arrn[1292 & -32681] = 68 & 16387;
        arrn[16551 & 6237] = -26588 & 8386;
        arrn[271 & -16186] = 5648 & -24439;
        arrn[-15321 & 10391] = -6588 & 6416;
        arrn[10412 & 5131] = -32498 & 27663;
        arrn[8265 & 303] = 8207 & 1375;
        arrn[-27382 & 24730] = 5736 & 26752;
        arrn[29227 & -31605] = -30464 & 5634;
        arrn[-16308 & 6156] = 589 & 8428;
        arrn[12829 & 16781] = 28 & 5788;
        arrn[-27233 & 18510] = 1697 & -20472;
        arrn[13567 & 2063] = 2853 & -8176;
        arrn[2320 & 8213] = 4138 & 9258;
        arrn[-31465 & 25105] = 4863 & -32739;
        arrn[8211 & -14054] = 58 & -17287;
        arrn[21555 & -24549] = -25659 & 32;
        arrn[8404 & -28617] = 10810 & 16506;
        arrn[343 & -29163] = 16384 & 1345;
        arrn[2103 & -28258] = 4630 & 24833;
        arrn[535 & 20663] = -13696 & 31;
        arrn[22812 & 9784] = -32628 & 1859;
        arrn[-7909 & 29] = -25631 & 9234;
        arrn[4666 & 16410] = 352 & -14318;
        arrn[27 & 21567] = 13 & -30653;
        arrn[799 & -12036] = 4288 & 774;
        arrn[541 & -24227] = 4176 & -16127;
        arrn[24607 & -32514] = 23040 & -32496;
        arrn[4735 & -31713] = -13310 & 352;
        arrn[25782 & 40] = 8761 & 6201;
        arrn[-25935 & 8493] = 10313 & 17241;
        arrn[291 & 29734] = 83 & -29999;
        arrn[367 & -29661] = -24465 & 4319;
        arrn[36 & 5175] = 343 & 6759;
        arrn[2223 & 309] = -32693 & 1627;
        arrn[-8154 & 6830] = 78 & 1096;
        arrn[-15449 & 4143] = 9069 & 1229;
        arrn[-30085 & 28968] = -14256 & 13654;
        arrn[1193 & -28629] = 16488 & 3200;
        arrn[-31878 & 43] = -30576 & 16420;
        arrn[-24725 & 47] = 8232 & 16532;
        arrn[16429 & -24404] = -29612 & 4213;
        arrn[20527 & 1341] = 115 & 1106;
        arrn[702 & -19410] = 3155 & 4955;
        arrn[1087 & 13103] = 12403 & 99;
        arrn[-29515 & 112] = 16651 & 8331;
        arrn[1329 & 24631] = 10 & 24854;
        arrn[18162 & -24526] = -22629 & 20579;
        arrn[16499 & -31685] = -29828 & 8196;
        arrn[-8131 & 5364] = 16439 & -26363;
        arrn[117 & -27467] = 16958 & -31290;
        arrn[18551 & 1846] = 12591 & -31673;
        arrn[311 & -23433] = 8200 & 20056;
        arrn[4028 & 28728] = 4107 & 2541;
        arrn[313 & -15303] = 4394 & 16986;
        arrn[-32706 & 21307] = -32247 & 8514;
        arrn[10619 & -32197] = 17449 & -22206;
        arrn[-22468 & 6078] = 10257 & -31582;
        arrn[-32321 & 18493] = 386 & -28644;
        arrn[24638 & -30530] = 22564 & -24357;
        arrn[-8129 & 127] = -25536 & 18;
        arrn[12390 & 2368] = 15620 & -32016;
        arrn[67 & -21311] = 30 & -20353;
        arrn[614 & 11603] = 16690 & -20419;
        arrn[-31541 & 355] = -31442 & 20718;
        arrn[-18211 & 1604] = 17513 & 14640;
        arrn[71 & -32027] = 1107 & 4150;
        arrn[4166 & 2286] = 29369 & 2403;
        arrn[71 & -14265] = 34 & 8246;
        arrn[-23463 & 4680] = 12331 & -13261;
        arrn[93 & 17609] = 14103 & -30665;
        arrn[1882 & 4330] = 4069 & -8148;
        arrn[-32693 & 3179] = 16439 & 101;
        arrn[25166 & 7373] = 1318 & 20518;
        arrn[1373 & 719] = 12595 & 1150;
        arrn[-24322 & 4686] = 17463 & -21959;
        arrn[-31409 & 4175] = -6119 & 4508;
        arrn[114 & -30640] = -31587 & 8731;
        arrn[16721 & 4177] = 1332 & -32742;
        arrn[2642 & 28883] = 2075 & 13203;
        arrn[19667 & -32137] = 8671 & -32225;
        arrn[18005 & -28588] = 16662 & 573;
        arrn[-28329 & 2133] = -24426 & 4670;
        arrn[17495 & -24234] = 47 & -27025;
        arrn[-32009 & 2135] = 9265 & -32231;
        arrn[4185 & -14118] = 125 & 47;
        arrn[12377 & 18653] = -32747 & 11837;
        arrn[2138 & 506] = 5436 & -30164;
        arrn[-16293 & 8415] = 8923 & -31621;
        arrn[-29474 & 28764] = 7772 & -32420;
        arrn[17245 & 95] = 17245 & -29571;
        arrn[4447 & 24670] = 12864 & 1283;
        arrn[8287 & 735] = 95 & 18527;
        arrn[-15136 & 2935] = 14046 & 16466;
        arrn[6247 & 993] = 3823 & -20145;
        arrn[16483 & -23198] = 19288 & 8276;
        arrn[-28421 & 26723] = 8401 & 16465;
        arrn[20604 & 8292] = -32689 & 19787;
        arrn[101 & 18669] = 7372 & -24244;
        arrn[15982 & 119] = 26205 & 2415;
        arrn[8551 & 231] = 1351 & 24663;
        arrn[12392 & -15000] = 366 & 19529;
        arrn[12921 & 2409] = 4297 & 19023;
        arrn[4202 & -31637] = -16265 & 1983;
        arrn[-32661 & 21627] = 862 & -24337;
        arrn[8446 & 364] = 5122 & 160;
        arrn[111 & 381] = -23350 & 350;
        arrn[-32386 & 28782] = -22437 & 4947;
        arrn[-30593 & 111] = 437 & -31689;
        arrn[16496 & 5234] = 8767 & 18491;
        arrn[17785 & 241] = 60 & 29309;
        arrn[24947 & 1142] = 8829 & 2237;
        arrn[19575 & 379] = 1086 & 19262;
        arrn[8309 & -8332] = -13889 & 5247;
        arrn[119 & -26763] = -8126 & 2528;
        arrn[18039 & 126] = -11199 & 8785;
        arrn[8311 & -14985] = 26875 & 66;
        arrn[121 & 9336] = 24643 & -30469;
        arrn[-32387 & 31865] = 6238 & -24508;
        arrn[8315 & 2298] = 26711 & 4695;
        arrn[-24453 & 3451] = 2136 & 12409;
        arrn[4220 & 2684] = 4455 & 116;
        arrn[20607 & 8573] = 247 & 11629;
        arrn[17151 & 14462] = -15745 & 102;
        arrn[29823 & -32641] = -16273 & 12263;
        arrn[18832 & 651] = 18793 & 8440;
        arrn[-20345 & 18585] = 125 & -23701;
        arrn[5274 & 10374] = 22639 & -31622;
        arrn[-16137 & 4739] = 875 & 107;
        arrn[1245 & -32636] = 16750 & 9452;
        arrn[5591 & 16549] = 8941 & 109;
        arrn[2230 & 12742] = 8302 & -27537;
        arrn[967 & -30577] = -28042 & 1527;
        arrn[-30535 & 10124] = -30704 & 4108;
        arrn[13199 & 1257] = 4180 & -32383;
        arrn[-25974 & 16526] = 2048 & 453;
        arrn[-31605 & 24715] = -30144 & 16548;
        arrn[2188 & 478] = -5488 & 100;
        arrn[27293 & 143] = 16389 & -24544;
        arrn[-12082 & 910] = -31744 & 16393;
        arrn[9615 & 16527] = -30902 & 10373;
        arrn[20664 & 9425] = -6577 & 2373;
        arrn[16883 & 2201] = 28750 & -29369;
        arrn[4831 & -14926] = 18689 & 530;
        arrn[211 & 4539] = 1492 & 20995;
        arrn[-31850 & 1236] = 14344 & 17152;
        arrn[663 & -24427] = 20 & 13834;
        arrn[12470 & 150] = 128 & 23063;
        arrn[-22121 & 223] = 7682 & 8321;
        arrn[2714 & 30104] = 8512 & 22548;
        arrn[8409 & 3225] = 280 & -2910;
        arrn[2522 & 24734] = 1688 & 8454;
        arrn[8411 & -14177] = 4502 & -16344;
        arrn[16637 & -31586] = 580 & -30558;
        arrn[5533 & 17117] = 12 & 8449;
        arrn[1439 & 16542] = 30208 & 2378;
        arrn[-32353 & 2207] = 7436 & 24592;
        arrn[-31328 & 164] = 554 & -32465;
        arrn[3251 & -12063] = 119 & 1078;
        arrn[4258 & -31517] = 3229 & 29;
        arrn[8611 & 21239] = 4701 & 2205;
        arrn[25004 & 7845] = 185 & -20360;
        arrn[8381 & 229] = -31239 & 20536;
        arrn[190 & 231] = -32662 & 6890;
        arrn[16631 & -32593] = -30871 & 20605;
        arrn[4538 & -22808] = 103 & 20599;
        arrn[4777 & 10665] = 9340 & 6251;
        arrn[3242 & 234] = 253 & -31643;
        arrn[18175 & 6571] = 2406 & 16998;
        arrn[29356 & -32516] = 10739 & 4146;
        arrn[2223 & 9645] = 20513 & 2276;
        arrn[8366 & -32529] = 1278 & 12335;
        arrn[16815 & -23361] = 60 & 690;
        arrn[17842 & 6384] = 10329 & -28259;
        arrn[511 & -24399] = 4176 & 2193;
        arrn[-16206 & 8627] = 2341 & 628;
        arrn[24311 & 179] = -31449 & 24802;
        arrn[3004 & 24756] = 252 & -28562;
        arrn[16821 & -32523] = 1405 & 28781;
        arrn[-6985 & 254] = 17131 & 8575;
        arrn[14519 & 1727] = -24407 & 291;
        arrn[4282 & 12028] = 1670 & -30448;
        arrn[185 & -32583] = 512 & 5;
        arrn[-30470 & 9151] = 19495 & 823;
        arrn[9403 & -11841] = 13005 & 1053;
        arrn[18878 & 1724] = 12347 & 19059;
        arrn[767 & 7357] = 4140 & 77;
        arrn[2238 & 18110] = -32457 & 19644;
        arrn[2239 & -24321] = 509 & 3125;
        arrn[13780 & 738] = 26671 & 441;
        arrn[18665 & 705] = -13709 & 13683;
        arrn[482 & 3271] = 5503 & -21890;
        arrn[13047 & 16587] = 1088 & 6442;
        arrn[-16188 & 223] = -25950 & 16393;
        arrn[18629 & 8693] = -30928 & 10370;
        arrn[-12058 & 711] = 4146 & 2240;
        arrn[16847 & 8423] = 4648 & -29248;
        arrn[-23095 & 232] = 16408 & 1601;
        arrn[495 & 8905] = 880 & -28660;
        arrn[1278 & 2762] = -24104 & 4134;
        arrn[-19733 & 459] = -12012 & 40;
        arrn[-15378 & 6348] = 24628 & 7171;
        arrn[-14099 & 4317] = 16385 & -23536;
        arrn[206 & 4046] = 2658 & 8192;
        arrn[4815 & 207] = -32696 & 4146;
        arrn[212 & 16848] = -32014 & 28673;
        arrn[467 & 20701] = 26241 & 6452;
        arrn[16602 & 4310] = 8704 & 2330;
        arrn[-28197 & 10483] = 524 & 3474;
        arrn[727 & -22060] = 8 & 14470;
        arrn[17111 & -23339] = 24786 & 2085;
        arrn[8414 & 214] = 12880 & -32722;
        arrn[-23849 & 2263] = 18436 & 704;
        arrn[6872 & 9724] = 8450 & 6161;
        arrn[477 & 3289] = 856 & 9345;
        arrn[6622 & 16603] = 2564 & 8401;
        arrn[-32549 & 5087] = -29157 & 286;
        arrn[220 & 476] = 2155 & -23509;
        arrn[8413 & 20445] = 4191 & 3259;
        arrn[29406 & -32546] = -32152 & 13736;
        arrn[13567 & 18911] = -15296 & 4138;
        arrn[5857 & 224] = -32576 & 3602;
        arrn[6387 & 737] = 5137 & -32440;
        arrn[12514 & 1003] = -28066 & 19671;
        arrn[16867 & 10491] = -16106 & 1024;
        arrn[486 & 740] = 4426 & -32220;
        arrn[4853 & -29459] = 5925 & -24448;
        arrn[8678 & 238] = 25106 & -27612;
        arrn[3559 & 20735] = 72 & -17145;
        arrn[16617 & -17416] = 64 & -25214;
        arrn[1275 & -3607] = 21105 & -21391;
        arrn[-22293 & 4842] = 19422 & 9308;
        arrn[10747 & -27409] = 2171 & -15105;
        arrn[18924 & -32531] = 664 & 1346;
        arrn[2301 & 1775] = -5393 & 4207;
        arrn[495 & 238] = 16474 & 8827;
        arrn[10479 & 17151] = 6220 & -15439;
        arrn[29176 & -31501] = 3 & 8340;
        arrn[23027 & 241] = 8319 & 3035;
        arrn[17394 & 2302] = 3598 & 128;
        arrn[22771 & 1779] = -12161 & 2271;
        arrn[244 & 32508] = -30128 & 4512;
        arrn[765 & 17653] = 2014 & -16258;
        arrn[9462 & 758] = 2178 & -23251;
        arrn[247 & 10231] = -26982 & 8448;
        arrn[5370 & -32515] = 276 & 22691;
        arrn[-14599 & 251] = -15267 & 349;
        arrn[18682 & 250] = -24152 & 528;
        arrn[3067 & -32513] = 4219 & 11618;
        arrn[253 & 252] = -25464 & 24581;
        arrn[1789 & -22275] = -16350 & 1924;
        arrn[2302 & 8446] = 17168 & -31677;
        arrn[17663 & 6399] = -28414 & 18441;
        Field_31408 = arrn;
        Class_31406.Field_31408[1405 & -25923] = 12557 & -30195;
        Class_31406.Field_31408[29757 & 2093] = 16732 & 13358;
        Class_31406.Field_31408[1151 & -15781] = 4154 & -30118;
        Class_31406.Field_31408[2269 & 93] = -15717 & 11291;
        Class_31406.Field_31408[5470 & -23972] = -27845 & 3243;
        Class_31406.Field_31408[20283 & -24453] = 2087 & 375;
        Class_31406.Field_31408[1050 & -30546] = 796 & 4316;
        Class_31406.Field_31408[-32211 & 30764] = 25275 & 4147;
        Class_31406.Field_31408[-30913 & 12398] = 8566 & 22068;
        Class_31406.Field_31408[-24193 & 767] = -27693 & 115;
        Class_31406.Field_31408[4827 & 2207] = 598 & 16602;
        Class_31406.Field_31408[5103 & -31697] = 53 & 5111;
        Class_31406.Field_31408[4767 & -16166] = -18089 & 124;
    }

    private static int Method_31411(int n) {
        return Field_31408[n] != 0 ? Field_31408[n] : n;
    }

    public static void Method_31412() {
        long l = System.currentTimeMillis();
        boolean bl = Keyboard.getEventKeyState();
        int n = Keyboard.getEventCharacter();
        int n2 = Class_31406.Method_31416(Keyboard.getEventKey());
        int n3 = bl ? -15981 & 15837 : 17822 & 466;
        int n4 = Class_31406.Method_31410();
        Class_30724.Field_30732.sendKeyEvent(Class_31406.Method_31413(Class_31406.Method_31409(new KeyEvent(Class_30724.Field_30725, n3, l, n4, n2, (char)(n == 0 ? 581500927 & 65535 : n), -30560 & 1), Class_31406.Method_31411(n2))));
        if (n != 0) {
            Class_30724.Field_30732.sendKeyEvent(Class_31406.Method_31413(Class_31406.Method_31409(new KeyEvent(Class_30724.Field_30725, 404 & -28208, l, n4, 11305 & 262, (char)n, 257 & 8400), Class_31406.Method_31411(n2))));
        }
    }

    private static KeyEvent Method_31413(KeyEvent keyEvent) {
        return keyEvent;
    }

    private static String Method_31414(String string) {
        int n = 30803;
        char[] arrc = string.toCharArray();
        StackTraceElement[] arrstackTraceElement = new Throwable().getStackTrace();
        n = (char)(n ^ (char)arrstackTraceElement[0].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getClassName().hashCode());
        char c = (char)Class_8.Method_10(Class_31406.class, 1);
        n = (char)(n ^ c);
        char c2 = (char)(n >> 7);
        for (int n2 = 0; n2 < arrc.length; n2 = (int)((char)(n2 + 1))) {
            arrc[n2] = (char)(arrc[n2] ^ n ^ n2 & c2);
        }
        return new String(arrc);
    }

    private void Method_31415() {
        MethodHandle methodHandle = MethodHandles.constant(String.class, "MC|BlazingPack");
    }

    private static int Method_31416(int n) {
        switch (n) {
            case 1: {
                return 15679 & -32741;
            }
            case 2: {
                return -28551 & 2229;
            }
            case 3: {
                return 30835 & 58;
            }
            case 4: {
                return -32333 & 563;
            }
            case 5: {
                return 27188 & 1205;
            }
            case 6: {
                return 637 & -20427;
            }
            case 7: {
                return 20854 & -32066;
            }
            case 8: {
                return 183 & 17975;
            }
            case 9: {
                return 4472 & -14278;
            }
            case 10: {
                return 569 & 18685;
            }
            case 11: {
                return -25488 & 312;
            }
            case 12: {
                return 61 & 6063;
            }
            case 13: {
                return -5763 & 1085;
            }
            case 14: {
                return 8200 & -28086;
            }
            case 15: {
                return 18703 & -32695;
            }
            case 16: {
                return 209 & -32161;
            }
            case 17: {
                return -32137 & 471;
            }
            case 18: {
                return 17477 & 7023;
            }
            case 19: {
                return 26230 & -32686;
            }
            case 20: {
                return 4470 & -28972;
            }
            case 21: {
                return 477 & 28249;
            }
            case 22: {
                return -31659 & 24661;
            }
            case 23: {
                return 8411 & -27575;
            }
            case 24: {
                return 24655 & 1375;
            }
            case 25: {
                return 2128 & 853;
            }
            case 26: {
                return 2267 & 8795;
            }
            case 27: {
                return -16291 & 8415;
            }
            case 28: {
                return 170 & -30901;
            }
            case 29: {
                return 4881 & -15343;
            }
            case 30: {
                return 16451 & 6493;
            }
            case 31: {
                return 83 & 3411;
            }
            case 32: {
                return 16997 & -28348;
            }
            case 33: {
                return -16314 & 4958;
            }
            case 34: {
                return 1607 & 2119;
            }
            case 35: {
                return 219 & 23372;
            }
            case 36: {
                return 1354 & 2138;
            }
            case 37: {
                return -31669 & 107;
            }
            case 38: {
                return 1132 & 8654;
            }
            case 39: {
                return 16447 & -22213;
            }
            case 40: {
                return 222 & 6623;
            }
            case 41: {
                return -31552 & 8928;
            }
            case 42: {
                return 20 & 4689;
            }
            case 43: {
                return 4189 & -24068;
            }
            case 44: {
                return 25466 & -30630;
            }
            case 45: {
                return 4217 & 2650;
            }
            case 46: {
                return 455 & -13717;
            }
            case 47: {
                return -23458 & 214;
            }
            case 48: {
                return -31677 & 210;
            }
            case 49: {
                return 2670 & 4191;
            }
            case 50: {
                return 16717 & 2159;
            }
            case 51: {
                return -12884 & 44;
            }
            case 52: {
                return 11326 & -12241;
            }
            case 53: {
                return 943 & 63;
            }
            case 55: {
                return -32145 & 24938;
            }
            case 56: {
                return 18514 & -27118;
            }
            case 57: {
                return 16672 & 38;
            }
            case 58: {
                return 21020 & -32522;
            }
            case 59: {
                return 17008 & 3184;
            }
            case 60: {
                return 115 & 25713;
            }
            case 61: {
                return 10614 & 16634;
            }
            case 62: {
                return 243 & -32393;
            }
            case 63: {
                return 119 & -16268;
            }
            case 64: {
                return 8439 & -31627;
            }
            case 65: {
                return 26742 & 246;
            }
            case 66: {
                return 18047 & 119;
            }
            case 67: {
                return 8440 & 19070;
            }
            case 68: {
                return 19577 & -24327;
            }
            case 69: {
                return 144 & -23144;
            }
            case 70: {
                return 2271 & 913;
            }
            case 71: {
                return 8807 & 16487;
            }
            case 72: {
                return -20244 & 107;
            }
            case 73: {
                return 105 & 12527;
            }
            case 74: {
                return 1405 & 4207;
            }
            case 75: {
                return -30612 & 100;
            }
            case 76: {
                return 3189 & -32283;
            }
            case 77: {
                return -27545 & 25206;
            }
            case 78: {
                return -15121 & 4715;
            }
            case 79: {
                return -21775 & 353;
            }
            case 80: {
                return 17762 & 102;
            }
            case 81: {
                return 10343 & -32653;
            }
            case 82: {
                return 16484 & -18071;
            }
            case 83: {
                return -26257 & 8830;
            }
            case 87: {
                return 4346 & 12154;
            }
            case 88: {
                return 10367 & 4859;
            }
            case 100: {
                return 86047056 & 1883303948;
            }
            case 101: {
                return 2289665 & 1614870323;
            }
            case 102: {
                return 1355345922 & 606138390;
            }
            case 112: {
                return -7115 & 2901;
            }
            case 121: {
                return 10428 & 604;
            }
            case 123: {
                return -31203 & 4127;
            }
            case 144: {
                return 515 & 5090;
            }
            case 145: {
                return -30968 & 2562;
            }
            case 146: {
                return 517 & 25123;
            }
            case 147: {
                return 25099 & 2575;
            }
            case 148: {
                return -32103 & 25;
            }
            case 149: {
                return 131016 & 809828331;
            }
            case 181: {
                return 1263 & -18321;
            }
            case 197: {
                return 17011 & -31717;
            }
            case 199: {
                return 1572 & 16686;
            }
            case 200: {
                return 374 & 5671;
            }
            case 201: {
                return -26847 & 2227;
            }
            case 203: {
                return 37 & 23927;
            }
            case 205: {
                return 1703 & 295;
            }
            case 207: {
                return 8231 & -15197;
            }
            case 208: {
                return 12840 & -14870;
            }
            case 209: {
                return 18474 & 9891;
            }
            case 210: {
                return 16543 & -29029;
            }
            case 211: {
                return 16511 & 4223;
            }
            case 219: {
                return -28451 & 16829;
            }
            case 183: {
                return 10970 & 4250;
            }
            case 54: {
                return 4117 & 25242;
            }
        }
        System.out.println("Nieobslugiwany klawisz: " + Keyboard.getKeyName((int)n));
        return 4609 & 2080;
    }
}

