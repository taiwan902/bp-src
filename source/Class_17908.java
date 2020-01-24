/*
 * Decompiled with CFR 0.145.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Lists
 */
import com.google.common.collect.Lists;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.util.ArrayList;
import java.util.List;

public class Class_17908 {
    private void Method_17909() {
        MethodHandle methodHandle = MethodHandles.constant(String.class, "MC|BlazingPack");
    }

    public static String Method_17910(String string, boolean bl) {
        return !bl && !Class_18.Field_89.Field_84.Field_39719 ? Class_5478.Method_5555(string) : string;
    }

    public static List Method_17911(Class_1782 class_1782, int n, Class_28636 class_28636, boolean bl, boolean bl2) {
        int n2 = 26112 & 2055;
        Class_2840 class_2840 = new Class_2840("");
        ArrayList arrayList = Lists.newArrayList();
        ArrayList arrayList2 = Lists.newArrayList((Iterable)class_1782);
        for (int i = -31452 & 2130; i < arrayList2.size(); ++i) {
            String string;
            String string2;
            Class_1782 class_17822 = (Class_1782)arrayList2.get(i);
            String string3 = class_17822.Method_1784();
            int n3 = 4552 & 18434;
            if (string3.contains("\n")) {
                int n4 = string3.indexOf(8202 & 42);
                string2 = string3.substring(n4 + (2071 & 521));
                string3 = string3.substring(12313 & -32704, n4 + (69 & 513));
                Class_2840 class_28402 = new Class_2840(string2);
                class_28402.\u0000strictfp(class_17822.Method_1789().Method_2947());
                arrayList2.add(i + (13905 & -32381), class_28402);
                n3 = 1095 & -16071;
            }
            string2 = (string = Class_17908.Method_17910(class_17822.Method_1789().Method_2912() + string3, bl2)).endsWith("\n") ? string.substring(40 & 323, string.length() - (-32085 & 11541)) : string;
            int n5 = class_28636.Method_28715(string2);
            Class_2840 class_28403 = new Class_2840(string2);
            class_28403.\u0000strictfp(class_17822.Method_1789().Method_2947());
            if (n2 + n5 > n) {
                String string4 = class_28636.Method_28720(string, n - n2, (16917 & 3202) != 0);
                String string5 = string4.length() < string.length() ? string.substring(string4.length()) : null;
                String string6 = Class_28636.Method_28693(string4);
                if (string5 != null && string5.length() > 0) {
                    int n6 = string4.lastIndexOf(" ");
                    if (n6 >= 0 && class_28636.Method_28715(string.substring(-22506 & 97, n6)) > 0) {
                        string4 = string.substring(-22374 & 16388, n6);
                        if (bl) {
                            ++n6;
                        }
                        string5 = string.substring(n6);
                    } else if (n2 > 0 && !string.contains(" ")) {
                        string4 = "";
                        string5 = string;
                    }
                    string5 = string6 + string5;
                    Class_2840 class_28404 = new Class_2840(string5);
                    class_28404.\u0000strictfp(class_17822.Method_1789().Method_2947());
                    arrayList2.add(i + (9739 & 4241), class_28404);
                }
                n5 = class_28636.Method_28715(string4);
                class_28403 = new Class_2840(string4);
                class_28403.\u0000strictfp(class_17822.Method_1789().Method_2947());
                n3 = -32759 & 18433;
            }
            if (n2 + n5 <= n) {
                n2 += n5;
                class_2840.Method_1787(class_28403);
            } else {
                n3 = -11607 & 9281;
            }
            if (n3 == 0) continue;
            arrayList.add(class_2840);
            n2 = 8 & 4113;
            class_2840 = new Class_2840("");
        }
        arrayList.add(class_2840);
        return arrayList;
    }
}

