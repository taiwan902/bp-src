/*
 * Decompiled with CFR 0.145.
 */
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;

public final class Class_27634
extends Enum {
    final byte[] Field_27635;
    final byte[] Field_27636;
    private static final Class_27634[] Field_27637;
    public static final /* enum */ Class_27634 Field_27638;
    public static final /* enum */ Class_27634 Field_27639;
    final boolean Field_27640;
    public static final /* enum */ Class_27634 Field_27641;

    private void Method_27642() {
        MethodHandle methodHandle = MethodHandles.constant(String.class, "MC|BlazingPack");
    }

    public static Class_27634[] Method_27643() {
        return (Class_27634[])Field_27637.clone();
    }

    private static String Method_27644(String string) {
        int n = 4067;
        char[] arrc = string.toCharArray();
        StackTraceElement[] arrstackTraceElement = new Throwable().getStackTrace();
        n = (char)(n ^ (char)arrstackTraceElement[0].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getClassName().hashCode());
        char c = (char)Class_8.Method_10(Class_27634.class, 1);
        n = (char)(n ^ c);
        char c2 = (char)(n >> 7);
        for (int n2 = 0; n2 < arrc.length; n2 = (int)((char)(n2 + 1))) {
            arrc[n2] = (char)(arrc[n2] ^ n ^ n2 & c2);
        }
        return new String(arrc);
    }

    public static Class_27634 Method_27645(String string) {
        return Enum.valueOf(Class_27634.class, string);
    }

    /*
     * Exception decompiling
     */
    private Class_27634(boolean var3_1) {
        // This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
        // java.lang.IllegalStateException
        // org.benf.cfr.reader.bytecode.analysis.variables.VariableFactory.localVariable(VariableFactory.java:53)
        // org.benf.cfr.reader.bytecode.analysis.opgraph.Op02WithProcessedDataAndRefs.mkRetrieve(Op02WithProcessedDataAndRefs.java:931)
        // org.benf.cfr.reader.bytecode.analysis.opgraph.Op02WithProcessedDataAndRefs.createStatement(Op02WithProcessedDataAndRefs.java:979)
        // org.benf.cfr.reader.bytecode.analysis.opgraph.Op02WithProcessedDataAndRefs.access$100(Op02WithProcessedDataAndRefs.java:56)
        // org.benf.cfr.reader.bytecode.analysis.opgraph.Op02WithProcessedDataAndRefs$11.call(Op02WithProcessedDataAndRefs.java:2060)
        // org.benf.cfr.reader.bytecode.analysis.opgraph.Op02WithProcessedDataAndRefs$11.call(Op02WithProcessedDataAndRefs.java:2057)
        // org.benf.cfr.reader.util.graph.AbstractGraphVisitorFI.process(AbstractGraphVisitorFI.java:60)
        // org.benf.cfr.reader.bytecode.analysis.opgraph.Op02WithProcessedDataAndRefs.convertToOp03List(Op02WithProcessedDataAndRefs.java:2069)
        // org.benf.cfr.reader.bytecode.CodeAnalyser.getAnalysisInner(CodeAnalyser.java:342)
        // org.benf.cfr.reader.bytecode.CodeAnalyser.getAnalysisOrWrapFail(CodeAnalyser.java:184)
        // org.benf.cfr.reader.bytecode.CodeAnalyser.getAnalysis(CodeAnalyser.java:129)
        // org.benf.cfr.reader.entities.attributes.AttributeCode.analyse(AttributeCode.java:96)
        // org.benf.cfr.reader.entities.Method.analyse(Method.java:397)
        // org.benf.cfr.reader.entities.ClassFile.analyseMid(ClassFile.java:906)
        // org.benf.cfr.reader.entities.ClassFile.analyseTop(ClassFile.java:797)
        // org.benf.cfr.reader.Driver.doJarVersionTypes(Driver.java:225)
        // org.benf.cfr.reader.Driver.doJar(Driver.java:109)
        // org.benf.cfr.reader.CfrDriverImpl.analyse(CfrDriverImpl.java:65)
        // org.benf.cfr.reader.Main.main(Main.java:48)
        throw new IllegalStateException("Decompilation failed");
    }

    private static String Method_27646(String string) {
        int n = 27705;
        char[] arrc = string.toCharArray();
        StackTraceElement[] arrstackTraceElement = new Throwable().getStackTrace();
        n = (char)(n ^ (char)arrstackTraceElement[0].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getClassName().hashCode());
        char c = (char)Class_8.Method_10(Class_27634.class, 2);
        n = (char)(n ^ c);
        char c2 = (char)(n >> 7);
        for (int n2 = 0; n2 < arrc.length; n2 = (int)((char)(n2 + 1))) {
            arrc[n2] = (char)(arrc[n2] ^ n ^ n2 & c2);
        }
        return new String(arrc);
    }

    static {
        byte[] arrby = new byte[4176 & -32570];
        arrby[5602 & -32756] = -23973 & 19685;
        arrby[-25973 & 65] = 2626 & 114;
        arrby[23 & 8226] = -16061 & 4811;
        arrby[23235 & 3] = -27420 & 16452;
        arrby[4102 & 1100] = 101 & -32691;
        arrby[95 & 26629] = 30022 & 127;
        arrby[22 & 12590] = 71 & -12553;
        arrby[647 & -30425] = 19418 & 4168;
        arrby[8330 & -26616] = 6605 & 8267;
        arrby[1033 & -28625] = 16970 & 14538;
        arrby[-28662 & 830] = -32145 & 19659;
        arrby[-28565 & 8347] = -16308 & 6735;
        arrby[12350 & 3084] = 77 & 351;
        arrby[11021 & 21695] = 13406 & -15794;
        arrby[1038 & 62] = 16735 & -29105;
        arrby[8463 & 1567] = 3673 & 82;
        arrby[2355 & -24560] = 4305 & -16039;
        arrby[-7149 & 4501] = -31917 & 210;
        arrby[29714 & -32745] = -15781 & 15443;
        arrby[21107 & 2335] = 14550 & -32652;
        arrby[4629 & 444] = 8309 & 215;
        arrby[21 & 12567] = 15990 & 16471;
        arrby[4630 & -24490] = 1239 & 4727;
        arrby[663 & -28361] = 124 & 11096;
        arrby[-12262 & 8541] = 16473 & -27555;
        arrby[-24547 & 473] = -5414 & 1150;
        arrby[4122 & 126] = -26519 & 1125;
        arrby[16927 & 2075] = -7834 & 7794;
        arrby[92 & -32707] = -31637 & 8803;
        arrby[16575 & 11293] = 8302 & 244;
        arrby[22558 & -32514] = -32155 & 5237;
        arrby[4159 & 10335] = -32410 & 3319;
        arrby[2683 & -28256] = 359 & 5223;
        arrby[4193 & -30679] = 4204 & 2664;
        arrby[20771 & 8358] = 8809 & 123;
        arrby[-12997 & 35] = 27758 & 106;
        arrby[-32668 & 4140] = -31893 & 9323;
        arrby[2215 & 25645] = 2157 & -31636;
        arrby[46 & 566] = -32145 & 109;
        arrby[16679 & 9471] = 1134 & 622;
        arrby[4136 & 9209] = 8559 & 19199;
        arrby[1199 & 2345] = 1520 & 120;
        arrby[6699 & -6806] = 5621 & 16497;
        arrby[747 & -29653] = -32270 & 4214;
        arrby[19244 & 44] = 8307 & 4343;
        arrby[-24529 & 45] = 886 & 23676;
        arrby[-12178 & 2863] = 4341 & -21387;
        arrby[16431 & 2175] = 13430 & 2166;
        arrby[312 & 245] = -21761 & 375;
        arrby[12597 & 16497] = 16634 & 2424;
        arrby[28790 & 179] = -14471 & 251;
        arrby[10611 & 5695] = 4346 & -31622;
        arrby[181 & 29236] = 27580 & 50;
        arrby[567 & -28483] = 51 & 13365;
        arrby[310 & -32642] = 9910 & 2363;
        arrby[1079 & 8567] = -30217 & 4147;
        arrby[1145 & 312] = -3980 & 52;
        arrby[4409 & 2105] = 2623 & 21813;
        arrby[2235 & -28358] = -13769 & 182;
        arrby[4539 & 127] = -15241 & 2239;
        arrby[-21956 & 444] = -30664 & 1849;
        arrby[125 & -24771] = 313 & 3131;
        arrby[62 & 126] = 16427 & -28629;
        arrby[7039 & -16321] = 47 & -27073;
        byte[] arrby2 = new byte[8575 & 1663];
        arrby2[0 & 8689] = -9 & -9;
        arrby2[-32239 & 393] = -1 & -9;
        arrby2[1610 & -7897] = -1 & -9;
        arrby2[2179 & -3557] = -1 & -9;
        arrby2[8772 & -28401] = -9 & -1;
        arrby2[1293 & 8757] = -9 & -9;
        arrby2[-28602 & 2446] = -9 & -9;
        arrby2[8239 & -28329] = -1 & -9;
        arrby2[8 & 5710] = -9 & -9;
        arrby2[2299 & -32503] = -5 & -1;
        arrby2[-24533 & 16798] = -5 & -1;
        arrby2[12747 & 3115] = -9 & -9;
        arrby2[1164 & 14878] = -9 & -9;
        arrby2[24717 & -31459] = -5 & -5;
        arrby2[10446 & 1806] = -9 & -9;
        arrby2[7567 & 16463] = -9 & -9;
        arrby2[25 & 1750] = -9 & -9;
        arrby2[12605 & 16915] = -9 & -1;
        arrby2[-13286 & 4118] = -1 & -9;
        arrby2[16987 & 12307] = -9 & -1;
        arrby2[-31948 & 25749] = -9 & -1;
        arrby2[3383 & 29] = -9 & -9;
        arrby2[19542 & 31] = -9 & -9;
        arrby2[2591 & 5143] = -9 & -1;
        arrby2[-29639 & 12376] = -1 & -9;
        arrby2[-13255 & 8345] = -9 & -1;
        arrby2[-31590 & 14939] = -1 & -9;
        arrby2[-23841 & 1051] = -9 & -9;
        arrby2[4733 & -14308] = -9 & -1;
        arrby2[-8131 & 1117] = -9 & -9;
        arrby2[21662 & 8286] = -9 & -9;
        arrby2[8511 & 1119] = -1 & -9;
        arrby2[-25167 & 25128] = -5 & -5;
        arrby2[611 & 13613] = -1 & -9;
        arrby2[12514 & -14790] = -1 & -9;
        arrby2[20523 & 8755] = -9 & -9;
        arrby2[25524 & -32667] = -9 & -9;
        arrby2[39 & -23315] = -9 & -9;
        arrby2[8358 & -12186] = -9 & -9;
        arrby2[-15321 & 8679] = -9 & -9;
        arrby2[17455 & -20440] = -9 & -9;
        arrby2[10601 & -27589] = -9 & -9;
        arrby2[10798 & -31446] = -9 & -1;
        arrby2[431 & 10283] = 318 & 1214;
        arrby2[44 & 3372] = -9 & -1;
        arrby2[1645 & 22573] = -9 & -1;
        arrby2[-9921 & 9262] = -9 & -9;
        arrby2[-27457 & 815] = 16575 & 1087;
        arrby2[112 & 22584] = 3124 & 4540;
        arrby2[-32449 & 16945] = 2103 & -24203;
        arrby2[-29581 & 50] = 8894 & -32714;
        arrby2[6399 & -32461] = 319 & 8311;
        arrby2[-9676 & 55] = 18172 & -24517;
        arrby2[629 & 309] = 16955 & 8249;
        arrby2[18871 & -32650] = 702 & 4155;
        arrby2[-31305 & 8311] = -31621 & 575;
        arrby2[9464 & 18488] = 4159 & 9596;
        arrby2[13691 & 16573] = 61 & 767;
        arrby2[9470 & 18490] = -9 & -9;
        arrby2[12859 & -32645] = -9 & -9;
        arrby2[-32451 & 572] = -9 & -9;
        arrby2[317 & 18493] = -1 & -1;
        arrby2[-16130 & 5182] = -9 & -9;
        arrby2[9791 & 16447] = -1 & -9;
        arrby2[26209 & 2392] = -9 & -1;
        arrby2[1091 & -28335] = 17600 & -32727;
        arrby2[9794 & 4190] = -14047 & 1045;
        arrby2[21195 & -31673] = -32505 & 14434;
        arrby2[588 & 8277] = -32753 & 2115;
        arrby2[-21307 & 631] = 17421 & 2374;
        arrby2[6758 & -32562] = 18949 & -32747;
        arrby2[10327 & 4167] = 4558 & 54;
        arrby2[5193 & -14260] = 20575 & -24441;
        arrby2[27743 & 361] = -31651 & 12808;
        arrby2[16970 & 5323] = 153 & 1357;
        arrby2[2379 & 9291] = -32006 & 8202;
        arrby2[23628 & 493] = 5403 & 171;
        arrby2[589 & -30499] = 12380 & -32626;
        arrby2[5071 & 8302] = 18029 & 8207;
        arrby2[-31505 & 18511] = 4622 & 18623;
        arrby2[592 & -32558] = -21489 & 15;
        arrby2[19667 & -32167] = 48 & -18411;
        arrby2[8530 & 243] = -19439 & 2419;
        arrby2[339 & 12499] = 21746 & 282;
        arrby2[9300 & 348] = 8347 & -28397;
        arrby2[10581 & 4311] = 8284 & 16533;
        arrby2[-29609 & 8278] = -32459 & 15069;
        arrby2[8279 & -32297] = 26230 & -32746;
        arrby2[2266 & 25208] = 24639 & -30441;
        arrby2[21339 & -29447] = 16796 & 2105;
        arrby2[1754 & -30373] = 9145 & -26533;
        arrby2[16987 & -31653] = -9 & -9;
        arrby2[4316 & -15011] = -9 & -9;
        arrby2[1373 & 12511] = -9 & -9;
        arrby2[1118 & -28065] = -9 & -1;
        arrby2[-28193 & 3167] = -9 & -9;
        arrby2[7277 & 480] = -1 & -9;
        arrby2[3177 & 4467] = -32742 & 6267;
        arrby2[16486 & -32030] = 155 & -24549;
        arrby2[-14741 & 8295] = 22686 & 8220;
        arrby2[24676 & -29073] = 1053 & 4159;
        arrby2[10357 & -15505] = -32194 & 15646;
        arrby2[2166 & -11153] = -13633 & 1055;
        arrby2[-31625 & 8295] = 32 & 18480;
        arrby2[1272 & 21098] = -31303 & 14883;
        arrby2[2159 & -2183] = 1074 & 4642;
        arrby2[16618 & 11887] = 359 & -11741;
        arrby2[4219 & 495] = 20644 & -32715;
        arrby2[16494 & -30612] = 26663 & -31707;
        arrby2[879 & 6253] = 3238 & 16678;
        arrby2[5614 & 2159] = -32729 & 8295;
        arrby2[-32145 & 8319] = 175 & 7224;
        arrby2[6260 & 632] = 299 & 169;
        arrby2[123 & -32267] = 24878 & 2171;
        arrby2[-32390 & 8818] = 2091 & 811;
        arrby2[17527 & 13043] = 6252 & -32723;
        arrby2[4212 & 16508] = 45 & -3521;
        arrby2[2677 & 5237] = -31186 & 16750;
        arrby2[1142 & 4990] = -19537 & 47;
        arrby2[503 & 17015] = 23344 & 1201;
        arrby2[120 & 1150] = 27185 & 1141;
        arrby2[633 & 2299] = 21119 & -32462;
        arrby2[20603 & 2174] = 4467 & -23361;
        arrby2[6523 & 639] = -9 & -9;
        arrby2[4607 & 124] = -9 & -9;
        arrby2[-32643 & 14463] = -9 & -1;
        arrby2[2686 & 127] = -9 & -9;
        Field_27641 = new Class_27634(Class_27634.Method_27644("\u085c\u085a\u084e\u0840\u084a\u084e\u085c\u084a"), 8455 & 72, arrby, arrby2, (4489 & 579) != 0);
        byte[] arrby3 = new byte[-16271 & 12616];
        arrby3[4113 & 832] = 193 & 25201;
        arrby3[4161 & 1697] = 82 & 5486;
        arrby3[2 & -27894] = 17603 & 2667;
        arrby3[1123 & -24569] = 20564 & 1348;
        arrby3[6020 & -32764] = -30491 & 8517;
        arrby3[5205 & 10407] = 374 & 8263;
        arrby3[-22522 & 1623] = -22697 & 4295;
        arrby3[-23281 & 20487] = 232 & 5724;
        arrby3[4616 & 1160] = 3451 & -11571;
        arrby3[11321 & 20875] = 10442 & 874;
        arrby3[26890 & 4747] = 1099 & 203;
        arrby3[5599 & 8203] = 16460 & 8318;
        arrby3[653 & -15028] = 589 & 24959;
        arrby3[15 & -3891] = 78 & 111;
        arrby3[591 & 398] = 79 & 17631;
        arrby3[4111 & 335] = 16723 & 10320;
        arrby3[6160 & 1654] = -13579 & 12633;
        arrby3[26653 & -28333] = -9901 & 222;
        arrby3[-32718 & 13843] = 14707 & 1747;
        arrby3[-24525 & 4115] = 3156 & -16164;
        arrby3[53 & 18462] = 4183 & 637;
        arrby3[17973 & 277] = -8106 & 4990;
        arrby3[-11498 & 8414] = 607 & 503;
        arrby3[-30697 & 8599] = -10020 & 8281;
        arrby3[17054 & 4184] = 19545 & 12889;
        arrby3[-32163 & 1211] = 638 & 16602;
        arrby3[25247 & 1050] = 4193 & 18657;
        arrby3[-32229 & 29087] = 1506 & 118;
        arrby3[2108 & -27876] = -31381 & 20579;
        arrby3[1053 & -32739] = 28773 & 612;
        arrby3[-31170 & 12511] = 7533 & 8309;
        arrby3[-27297 & 18463] = 126 & 12134;
        arrby3[22944 & 8232] = 14695 & 16615;
        arrby3[-31955 & 18531] = 5992 & 2155;
        arrby3[3250 & 12842] = 24937 & 4203;
        arrby3[-10205 & 8803] = 20587 & 126;
        arrby3[358 & 1188] = 619 & 111;
        arrby3[8229 & 17143] = 27503 & 124;
        arrby3[9847 & 4270] = 10349 & 1149;
        arrby3[1647 & 2359] = 639 & -21138;
        arrby3[-30677 & 16952] = -15761 & 4591;
        arrby3[-12247 & 8251] = 12409 & 3444;
        arrby3[4794 & 26670] = -24205 & 761;
        arrby3[-28497 & 2875] = 4215 & 378;
        arrby3[16428 & 1070] = 8307 & 6903;
        arrby3[13501 & 47] = 12404 & 372;
        arrby3[1342 & 20590] = -32649 & 10357;
        arrby3[8255 & 21039] = 27767 & 638;
        arrby3[112 & 697] = 2167 & 18175;
        arrby3[4147 & -32395] = 2684 & 4345;
        arrby3[3130 & 182] = 2297 & -7557;
        arrby3[563 & 3443] = -13698 & 13435;
        arrby3[-14276 & 118] = 180 & -1741;
        arrby3[4149 & -13897] = 8377 & -32395;
        arrby3[510 & 4150] = -32334 & 8246;
        arrby3[8311 & 567] = -24397 & 20595;
        arrby3[17464 & 12349] = 8244 & 766;
        arrby3[-32709 & 6777] = 6197 & -32201;
        arrby3[9403 & 570] = 6326 & 822;
        arrby3[16699 & -19909] = 12855 & 183;
        arrby3[956 & 24702] = 8251 & 2748;
        arrby3[1213 & 27197] = 18617 & 127;
        arrby3[702 & 8255] = 45 & -23763;
        arrby3[4799 & 1087] = 607 & 12671;
        byte[] arrby4 = new byte[16895 & 127];
        arrby4[-27632 & 16385] = -9 & -1;
        arrby4[20739 & 1733] = -9 & -1;
        arrby4[10003 & 20490] = -9 & -9;
        arrby4[23123 & 8583] = -9 & -9;
        arrby4[16436 & 6] = -9 & -1;
        arrby4[2309 & 213] = -9 & -1;
        arrby4[2087 & 654] = -1 & -9;
        arrby4[-30649 & 25095] = -9 & -9;
        arrby4[3086 & 16392] = -1 & -9;
        arrby4[-29125 & 16653] = -1 & -5;
        arrby4[8298 & 1055] = -5 & -5;
        arrby4[43 & -21873] = -1 & -9;
        arrby4[-32754 & 781] = -9 & -9;
        arrby4[16397 & -32497] = -5 & -1;
        arrby4[782 & -7122] = -1 & -9;
        arrby4[16687 & -26545] = -9 & -1;
        arrby4[-32490 & 8337] = -9 & -1;
        arrby4[7281 & 529] = -9 & -1;
        arrby4[-31658 & 8218] = -1 & -9;
        arrby4[6675 & 25747] = -9 & -9;
        arrby4[2071 & 5396] = -9 & -9;
        arrby4[11285 & -28577] = -1 & -9;
        arrby4[17183 & 8214] = -9 & -9;
        arrby4[11935 & -16329] = -9 & -9;
        arrby4[1241 & 10264] = -9 & -9;
        arrby4[-24423 & 1113] = -9 & -1;
        arrby4[12314 & 155] = -9 & -1;
        arrby4[4155 & 667] = -9 & -9;
        arrby4[3102 & -20420] = -9 & -1;
        arrby4[7197 & 797] = -9 & -1;
        arrby4[-30658 & 1630] = -9 & -9;
        arrby4[16415 & 31] = -9 & -9;
        arrby4[2464 & -28128] = -5 & -5;
        arrby4[2081 & -15691] = -9 & -9;
        arrby4[16422 & 8227] = -9 & -9;
        arrby4[-32733 & 9003] = -9 & -9;
        arrby4[2212 & 9508] = -9 & -1;
        arrby4[1189 & 2623] = -9 & -1;
        arrby4[102 & 9014] = -1 & -9;
        arrby4[1071 & -30681] = -1 & -9;
        arrby4[-24408 & 21563] = -1 & -9;
        arrby4[-32595 & 8809] = -9 & -1;
        arrby4[16494 & 42] = -9 & -9;
        arrby4[1071 & 6443] = -1 & -9;
        arrby4[4860 & 24622] = -9 & -9;
        arrby4[2365 & 5167] = -20417 & 318;
        arrby4[574 & -28562] = -9 & -9;
        arrby4[27327 & 1135] = -9 & -9;
        arrby4[8250 & 7349] = 6324 & 52;
        arrby4[-30477 & 1077] = 4213 & -31939;
        arrby4[14386 & 16439] = 10302 & 4598;
        arrby4[8243 & -26061] = 247 & -32713;
        arrby4[1078 & -19467] = 56 & -30664;
        arrby4[9271 & -32459] = -31557 & 8313;
        arrby4[17078 & 2102] = -28230 & 8254;
        arrby4[-28361 & 8255] = -32517 & 2875;
        arrby4[-15816 & 1467] = -31556 & 19006;
        arrby4[1337 & -16325] = 445 & -28035;
        arrby4[-11077 & 2682] = -9 & -9;
        arrby4[1147 & 59] = -9 & -9;
        arrby4[25663 & 4412] = -9 & -9;
        arrby4[4157 & 3135] = -1 & -1;
        arrby4[62 & 2110] = -9 & -9;
        arrby4[575 & 6399] = -9 & -9;
        arrby4[4168 & 450] = -9 & -9;
        arrby4[17473 & -26139] = 2451 & 4192;
        arrby4[16475 & 7906] = -12151 & 23;
        arrby4[-27413 & 16963] = 23619 & 9098;
        arrby4[230 & -32436] = 25879 & 67;
        arrby4[-31123 & 4183] = 165 & 5974;
        arrby4[-15161 & 374] = 21077 & 293;
        arrby4[1359 & 4839] = 599 & 1030;
        arrby4[844 & 24648] = 16407 & 687;
        arrby4[8139 & -24483] = -28497 & 19784;
        arrby4[8798 & 1130] = -32725 & 26185;
        arrby4[3279 & 16507] = 27754 & 414;
        arrby4[845 & -32690] = 8335 & 539;
        arrby4[205 & -32179] = 10252 & 94;
        arrby4[-23953 & 1486] = 8525 & -29553;
        arrby4[-24497 & 879] = -32578 & 30735;
        arrby4[-9007 & 80] = -25585 & 95;
        arrby4[87 & 18929] = 795 & 4180;
        arrby4[-32550 & 17746] = -30125 & 9493;
        arrby4[83 & -32393] = 307 & -16294;
        arrby4[10204 & 20566] = 243 & 4371;
        arrby4[16725 & -22283] = 564 & 4374;
        arrby4[26230 & 342] = 25813 & -32713;
        arrby4[4439 & 247] = 342 & 18582;
        arrby4[6363 & 600] = 87 & 1303;
        arrby4[-15779 & 9691] = 2204 & 16923;
        arrby4[2138 & 4703] = 9849 & 22681;
        arrby4[9343 & 4187] = -9 & -1;
        arrby4[732 & 20605] = -9 & -9;
        arrby4[4191 & -7331] = -9 & -1;
        arrby4[-32546 & 9567] = -1 & -9;
        arrby4[255 & 7263] = -28481 & 127;
        arrby4[-30492 & 880] = -9 & -9;
        arrby4[-7063 & 2273] = 16958 & 155;
        arrby4[2146 & -15774] = -20389 & 19131;
        arrby4[-30621 & 9583] = -30564 & 8733;
        arrby4[-30619 & 12406] = 2077 & 1183;
        arrby4[22885 & 1127] = 16607 & 1598;
        arrby4[4198 & 9710] = 703 & -32737;
        arrby4[2791 & 119] = -26840 & 18544;
        arrby4[-30598 & 4333] = 27831 & 97;
        arrby4[1641 & -30343] = 8483 & -32218;
        arrby4[4202 & 17278] = 35 & 18171;
        arrby4[2171 & -3605] = 308 & 17508;
        arrby4[2557 & -15250] = 4205 & 2981;
        arrby4[22653 & 9069] = 24742 & 638;
        arrby4[-31874 & 24814] = 8231 & -14297;
        arrby4[-7937 & 7023] = 8235 & 312;
        arrby4[20854 & -32528] = 9385 & -32451;
        arrby4[9205 & -13191] = 623 & 24618;
        arrby4[27250 & 370] = -27349 & 18479;
        arrby4[-30593 & 4211] = -17427 & 44;
        arrby4[-7820 & 4340] = 2095 & -4035;
        arrby4[2167 & 18293] = 3118 & 25455;
        arrby4[630 & -24201] = 5679 & 24879;
        arrby4[-21897 & 16503] = -22991 & 20594;
        arrby4[120 & 3448] = 6193 & 53;
        arrby4[16633 & 633] = -16205 & 1650;
        arrby4[9338 & 2170] = -32457 & 1587;
        arrby4[-29057 & 8315] = -9 & -9;
        arrby4[16636 & -23170] = -1 & -9;
        arrby4[-32643 & 5373] = -9 & -1;
        arrby4[17150 & 10366] = -1 & -9;
        Field_27639 = new Class_27634(Class_27634.Method_27646("\u4008\u400f\u4013\u4000\u400a\u4018\u401d\u401e"), 16773 & 7219, arrby3, arrby4, (544 & 6208) != 0);
        byte[] arrby5 = new byte[4419 & 2116];
        arrby5[532 & 4449] = 22063 & 8237;
        arrby5[4111 & 321] = 16442 & 14384;
        arrby5[1130 & -30201] = 49 & -30919;
        arrby5[4187 & -14585] = 1394 & 187;
        arrby5[5156 & 16388] = 4919 & 2099;
        arrby5[197 & 4103] = 2359 & 4156;
        arrby5[18758 & 518] = -10179 & 1719;
        arrby5[21511 & -24185] = -15042 & 695;
        arrby5[18446 & 12488] = 63 & -32201;
        arrby5[4105 & 17083] = 633 & -27464;
        arrby5[-23510 & 2058] = 249 & 825;
        arrby5[4267 & 2847] = -16319 & 4729;
        arrby5[16684 & 5774] = 19274 & -32702;
        arrby5[-32227 & 9231] = 16579 & 2659;
        arrby5[27470 & 14] = 8780 & -29370;
        arrby5[-32497 & 2751] = -32435 & 8261;
        arrby5[2098 & 24] = 4438 & -30138;
        arrby5[1181 & -30607] = -32681 & 8303;
        arrby5[4410 & -31658] = 4936 & 16634;
        arrby5[8247 & -28525] = 2409 & 4185;
        arrby5[10430 & 5204] = 8522 & 17514;
        arrby5[8213 & 149] = 8927 & 16459;
        arrby5[20542 & -21673] = 21615 & 8268;
        arrby5[16439 & 4383] = 4685 & -32691;
        arrby5[3736 & 24926] = -14002 & 1742;
        arrby5[1433 & -28643] = -32433 & 13023;
        arrby5[122 & 2587] = 9425 & 20828;
        arrby5[-32741 & 19995] = 3161 & 87;
        arrby5[-32196 & 28] = 8274 & 22354;
        arrby5[189 & 27165] = 627 & -16037;
        arrby5[3230 & -28065] = 6742 & -32676;
        arrby5[31 & 9311] = 9559 & 18525;
        arrby5[-31310 & 8737] = -13738 & 8278;
        arrby5[-30175 & 1397] = 20727 & 10327;
        arrby5[28715 & 1954] = 13404 & -16039;
        arrby5[24887 & 6179] = -16163 & 89;
        arrby5[18596 & -24474] = -24486 & 126;
        arrby5[-15043 & 679] = -7073 & 2175;
        arrby5[1191 & 102] = 4579 & 16489;
        arrby5[26543 & 103] = -31002 & 4466;
        arrby5[236 & -16328] = 883 & 16487;
        arrby5[-32711 & 16425] = 17508 & -20233;
        arrby5[42 & 13178] = 2277 & -23427;
        arrby5[2107 & 1387] = 8822 & 20591;
        arrby5[-32596 & 12844] = 7919 & -8089;
        arrby5[27181 & 1391] = -16136 & 10606;
        arrby5[-14098 & 8239] = 253 & -16277;
        arrby5[17519 & -24529] = -24210 & 4330;
        arrby5[689 & -1986] = -15745 & 107;
        arrby5[12337 & 19697] = 8300 & 4861;
        arrby5[1138 & 16562] = 20605 & 10349;
        arrby5[17715 & -21893] = 19438 & 111;
        arrby5[820 & 15412] = 17647 & 10351;
        arrby5[16437 & -32203] = 19698 & 4217;
        arrby5[566 & 24950] = -28431 & 18547;
        arrby5[-10057 & 8247] = 4210 & -22274;
        arrby5[12604 & 16954] = 4467 & 26739;
        arrby5[-22849 & 377] = 117 & 8436;
        arrby5[702 & 6203] = 5367 & 16757;
        arrby5[4667 & -6853] = -21898 & 4214;
        arrby5[1596 & 317] = -15753 & 12535;
        arrby5[-28545 & 11709] = 15480 & -15624;
        arrby5[62 & 1983] = -28039 & 26751;
        arrby5[13375 & 18623] = 5246 & 19066;
        byte[] arrby6 = new byte[9599 & -10113];
        arrby6[8304 & 18564] = -9 & -9;
        arrby6[22657 & -23539] = -9 & -1;
        arrby6[16519 & 12610] = -1 & -9;
        arrby6[2307 & 9223] = -9 & -9;
        arrby6[2085 & 8204] = -9 & -1;
        arrby6[16389 & -32241] = -9 & -9;
        arrby6[2222 & 24599] = -1 & -9;
        arrby6[583 & 10535] = -9 & -9;
        arrby6[1288 & 648] = -9 & -1;
        arrby6[4361 & -32739] = -1 & -5;
        arrby6[-21461 & 20894] = -5 & -5;
        arrby6[15 & 1515] = -9 & -9;
        arrby6[5388 & -22500] = -9 & -9;
        arrby6[2221 & -27123] = -5 & -5;
        arrby6[-18418 & 1214] = -1 & -9;
        arrby6[31 & 10255] = -1 & -9;
        arrby6[24720 & -30926] = -9 & -9;
        arrby6[-32751 & 19217] = -9 & -9;
        arrby6[-24238 & 16411] = -9 & -9;
        arrby6[21523 & 2363] = -9 & -9;
        arrby6[4765 & 17524] = -9 & -9;
        arrby6[-13771 & 4119] = -1 & -9;
        arrby6[-7977 & 310] = -9 & -1;
        arrby6[8727 & 2071] = -1 & -9;
        arrby6[24 & 2200] = -9 & -9;
        arrby6[4153 & 217] = -9 & -9;
        arrby6[315 & 30] = -9 & -9;
        arrby6[14751 & 539] = -9 & -9;
        arrby6[6175 & -14404] = -9 & -9;
        arrby6[-29219 & 29] = -9 & -9;
        arrby6[1118 & -13634] = -1 & -9;
        arrby6[-16065 & 5279] = -1 & -9;
        arrby6[20524 & -32416] = -5 & -1;
        arrby6[15481 & 16679] = -1 & -9;
        arrby6[366 & 16434] = -9 & -9;
        arrby6[-30669 & 1195] = -9 & -9;
        arrby6[12596 & -14299] = -9 & -9;
        arrby6[16557 & -30427] = -1 & -9;
        arrby6[55 & -23506] = -9 & -9;
        arrby6[19559 & 831] = -9 & -9;
        arrby6[18489 & 9834] = -1 & -9;
        arrby6[-22995 & 427] = -9 & -9;
        arrby6[16427 & 10474] = -1 & -9;
        arrby6[-15313 & 14395] = -1 & -9;
        arrby6[10607 & 16556] = -9 & -1;
        arrby6[557 & 12415] = -17727 & 32;
        arrby6[8302 & 4159] = -9 & -1;
        arrby6[4399 & -15809] = -9 & -1;
        arrby6[27699 & 432] = -18383 & 257;
        arrby6[-29133 & 12401] = 3074 & -32182;
        arrby6[2358 & -14670] = 16491 & 775;
        arrby6[1147 & 55] = 25644 & 789;
        arrby6[25012 & 4220] = 2757 & 37;
        arrby6[12341 & -30475] = 22551 & 1198;
        arrby6[6199 & -31754] = 39 & 23879;
        arrby6[5175 & 63] = 4648 & 1167;
        arrby6[19066 & -32712] = 4715 & -23543;
        arrby6[-31495 & 28733] = 110 & -28661;
        arrby6[22970 & -31686] = -9 & -9;
        arrby6[1211 & 6203] = -9 & -1;
        arrby6[-21444 & 380] = -9 & -9;
        arrby6[-32707 & 16639] = -1 & -1;
        arrby6[-30594 & 4286] = -9 & -1;
        arrby6[13375 & -30337] = -1 & -9;
        arrby6[26434 & 193] = -9 & -9;
        arrby6[3655 & -24255] = -28353 & 2187;
        arrby6[-32702 & 21886] = 26878 & 269;
        arrby6[-31633 & 67] = 301 & 1103;
        arrby6[-32700 & 16853] = -25554 & 206;
        arrby6[20557 & 869] = 25247 & -30417;
        arrby6[-31386 & 10838] = 1104 & 2106;
        arrby6[2135 & 17095] = 17429 & 8337;
        arrby6[29257 & -32408] = -15342 & 2422;
        arrby6[1113 & 2123] = 663 & -20461;
        arrby6[8654 & -26502] = 533 & 12310;
        arrby6[459 & -2485] = 789 & 4341;
        arrby6[11468 & 126] = 119 & 542;
        arrby6[10973 & 1101] = 543 & 16439;
        arrby6[8286 & 1390] = -29160 & 16856;
        arrby6[23631 & -24209] = 25625 & -32197;
        arrby6[3668 & 16624] = 29855 & 2586;
        arrby6[209 & 17751] = 2363 & -32741;
        arrby6[8278 & 16754] = 4124 & 16796;
        arrby6[-16301 & 1023] = 349 & 13469;
        arrby6[-23818 & 17756] = 94 & -23393;
        arrby6[2133 & 341] = -29505 & 607;
        arrby6[-25098 & 95] = -31695 & 292;
        arrby6[2519 & 4183] = 9249 & 689;
        arrby6[16734 & -24360] = 21170 & -32733;
        arrby6[-29063 & 8671] = 18531 & 419;
        arrby6[3194 & 8282] = 2093 & 54;
        arrby6[6235 & -31237] = -9 & -1;
        arrby6[16861 & -22436] = -9 & -9;
        arrby6[733 & 12383] = -9 & -9;
        arrby6[16510 & 222] = -9 & -9;
        arrby6[-32513 & 4191] = 16439 & 6245;
        arrby6[-27033 & 120] = -9 & -9;
        arrby6[8421 & -29847] = 16638 & 5158;
        arrby6[4206 & 1139] = 567 & 16743;
        arrby6[10611 & 5355] = 8296 & -25560;
        arrby6[14948 & 380] = -31063 & 4139;
        arrby6[1653 & 24815] = 10302 & 4394;
        arrby6[-30746 & 16510] = 16427 & 9643;
        arrby6[16503 & -28561] = 8364 & -16340;
        arrby6[-15254 & 4728] = -32467 & 25197;
        arrby6[5353 & 123] = 16686 & 3134;
        arrby6[18043 & -28566] = 16447 & -23761;
        arrby6[4203 & -21893] = 20656 & -31691;
        arrby6[1132 & 4476] = 3121 & 12345;
        arrby6[24685 & -26003] = -32717 & 9842;
        arrby6[24687 & 2430] = -32589 & 2611;
        arrby6[12415 & 17775] = 4148 & 2622;
        arrby6[624 & 5362] = 4661 & 24765;
        arrby6[9079 & -25479] = 62 & 21686;
        arrby6[20723 & -32654] = 8631 & 55;
        arrby6[-32141 & 12671] = -14151 & 4156;
        arrby6[-23306 & 2165] = 2877 & 12347;
        arrby6[4341 & -32139] = 1215 & 12410;
        arrby6[-26122 & 16511] = -12229 & 511;
        arrby6[8311 & 21879] = 24764 & 4668;
        arrby6[-16264 & 376] = 13375 & 829;
        arrby6[9465 & 2683] = 62 & 4414;
        arrby6[26362 & 383] = -23489 & 2815;
        arrby6[6779 & 123] = -9 & -9;
        arrby6[25724 & 2556] = -1 & -9;
        arrby6[16637 & -31617] = -9 & -9;
        arrby6[1151 & 29310] = -9 & -1;
        Field_27638 = new Class_27634(Class_27634.Method_27647("@@@@@@@"), -31678 & 25354, arrby5, arrby6, (4933 & -16373) != 0);
        Class_27634[] arrclass_27634 = new Class_27634[16451 & 1827];
        arrclass_27634[-32759 & 20886] = Field_27641;
        arrclass_27634[1089 & -32251] = Field_27639;
        arrclass_27634[18 & 16738] = Field_27638;
        Field_27637 = arrclass_27634;
    }

    private static String Method_27647(String string) {
        int n = 3568;
        char[] arrc = string.toCharArray();
        StackTraceElement[] arrstackTraceElement = new Throwable().getStackTrace();
        n = (char)(n ^ (char)arrstackTraceElement[0].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getClassName().hashCode());
        char c = (char)Class_8.Method_10(Class_27634.class, 3);
        n = (char)(n ^ c);
        char c2 = (char)(n >> 7);
        for (int n2 = 0; n2 < arrc.length; n2 = (int)((char)(n2 + 1))) {
            arrc[n2] = (char)(arrc[n2] ^ n ^ n2 & c2);
        }
        return new String(arrc);
    }
}

