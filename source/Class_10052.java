/*
 * Decompiled with CFR 0.145.
 */
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;

public class Class_10052 {
    private String[][] Field_10053;
    private Class_1956[][] Field_10054;

    public Class_10052() {
        String[][] arrarrstring = new String[-32116 & 5141][];
        String[] arrstring = new String[16419 & 9226];
        arrstring[2308 & 29731] = "XXX";
        arrstring[8265 & 163] = "X X";
        arrarrstring[16896 & -28604] = arrstring;
        String[] arrstring2 = new String[-16381 & 35];
        arrstring2[-20469 & 560] = "X X";
        arrstring2[149 & -19359] = "XXX";
        arrstring2[9866 & -16302] = "XXX";
        arrarrstring[6257 & 24713] = arrstring2;
        String[] arrstring3 = new String[2191 & 339];
        arrstring3[4100 & 20176] = "XXX";
        arrstring3[-26583 & 8195] = "X X";
        arrstring3[23118 & -24542] = "X X";
        arrarrstring[26690 & -32474] = arrstring3;
        String[] arrstring4 = new String[866 & 10394];
        arrstring4[4098 & -30919] = "X X";
        arrstring4[515 & -11135] = "X X";
        arrarrstring[17707 & 8903] = arrstring4;
        this.Field_10053 = arrarrstring;
        Class_1956[][] arrarrclass_1956 = new Class_1956[20045 & -28409][];
        Class_1956[] arrclass_1956 = new Class_1956[-23484 & 2830];
        arrclass_1956[22793 & 592] = Class_10527.Field_10620;
        arrclass_1956[27153 & -31603] = Class_10527.Field_10565;
        arrclass_1956[16470 & 13090] = Class_10527.Field_10673;
        arrclass_1956[-23101 & 16927] = Class_10527.Field_10705;
        arrarrclass_1956[1025 & 17112] = arrclass_1956;
        Class_1956[] arrclass_19562 = new Class_1956[8196 & -32227];
        arrclass_19562[16390 & 6328] = Class_10527.Field_10547;
        arrclass_19562[24971 & 2049] = Class_10527.Field_10667;
        arrclass_19562[7094 & -31741] = Class_10527.Field_10599;
        arrclass_19562[-32477 & 25091] = Class_10527.Field_10596;
        arrarrclass_1956[8203 & 549] = arrclass_19562;
        Class_1956[] arrclass_19563 = new Class_1956[6157 & -32602];
        arrclass_19563[18437 & 648] = Class_10527.Field_10619;
        arrclass_19563[17489 & 41] = Class_10527.Field_10600;
        arrclass_19563[-24542 & 2] = Class_10527.Field_10714;
        arrclass_19563[3115 & -32697] = Class_10527.Field_10683;
        arrarrclass_1956[-15225 & 4210] = arrclass_19563;
        Class_1956[] arrclass_19564 = new Class_1956[-16372 & 2999];
        arrclass_19564[6144 & 1476] = Class_10527.Field_10549;
        arrclass_19564[16927 & 2113] = Class_10527.Field_10628;
        arrclass_19564[8430 & -30446] = Class_10527.Field_10672;
        arrclass_19564[25747 & -28633] = Class_10527.Field_10636;
        arrarrclass_1956[7 & 10451] = arrclass_19564;
        Class_1956[] arrclass_19565 = new Class_1956[-7900 & 516];
        arrclass_19565[2400 & 24600] = Class_10527.Field_10640;
        arrclass_19565[145 & -8087] = Class_10527.Field_10686;
        arrclass_19565[4147 & 3722] = Class_10527.Field_10529;
        arrclass_19565[14499 & 7] = Class_10527.Field_10635;
        arrarrclass_1956[6190 & 17412] = arrclass_19565;
        this.Field_10054 = arrarrclass_1956;
    }

    private void Method_10055() {
        MethodHandle methodHandle = MethodHandles.constant(String.class, "MC|BlazingPack");
    }

    public void Method_10056(Class_22497 class_22497) {
        for (int i = 14338 & 337; i < this.Field_10054[4 & 14506].length; ++i) {
            Class_1956 class_1956 = this.Field_10054[12418 & 16744][i];
            for (int j = 321 & 2176; j < this.Field_10054.length - (12837 & -15103); ++j) {
                Class_1956 class_19562 = this.Field_10054[j + (-32415 & 4225)][i];
                Object[] arrobject = new Object[35 & 4167];
                arrobject[6192 & 8320] = this.Field_10053[j];
                arrobject[26689 & -28657] = Character.valueOf((char)(218 & -32676));
                arrobject[1090 & -15966] = class_1956;
                class_22497.Method_22503(new Class_23823(class_19562), arrobject);
            }
        }
    }
}

