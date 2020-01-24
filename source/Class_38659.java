/*
 * Decompiled with CFR 0.145.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Lists
 *  com.google.common.collect.Sets
 */
import com.google.common.collect.Lists;
import com.google.common.collect.Sets;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.UUID;

public class Class_38659
extends Class_36787 {
    protected void Method_38660(Class_1367 class_1367, String[] arrstring, int n) {
        Class_20976 class_20976 = this.Method_38676();
        String string = arrstring[n++];
        int n2 = Class_20976.Method_20985(string);
        Class_7873 class_7873 = null;
        if (arrstring.length == (20493 & 8772)) {
            class_7873 = this.Method_38666(arrstring[n], (-32448 & 48) != 0);
        }
        if (n2 < 0) {
            Object[] arrobject = new Object[-30715 & 20867];
            arrobject[6273 & 540] = string;
            throw new Class_30034("commands.scoreboard.objectives.setdisplay.invalidSlot", arrobject);
        }
        class_20976.Method_20999(n2, class_7873);
        if (class_7873 != null) {
            Object[] arrobject = new Object[106 & 4098];
            arrobject[26913 & 4168] = Class_20976.Method_20992(n2);
            arrobject[7169 & 323] = class_7873.Method_7881();
            Class_38659.\u0000strictfp((Class_1367)class_1367, (Class_26550)this, (String)"commands.scoreboard.objectives.setdisplay.successSet", (Object[])arrobject);
        } else {
            Object[] arrobject = new Object[12867 & 1045];
            arrobject[-31549 & 12] = Class_20976.Method_20992(n2);
            Class_38659.\u0000strictfp((Class_1367)class_1367, (Class_26550)this, (String)"commands.scoreboard.objectives.setdisplay.successCleared", (Object[])arrobject);
        }
    }

    protected void Method_38661(Class_1367 class_1367, String[] arrstring, int n) {
        Class_20976 class_20976 = this.Method_38676();
        Class_22057 class_22057 = this.Method_38670(arrstring[n]);
        if (class_22057 != null) {
            ArrayList arrayList = Lists.newArrayList((Iterable)class_22057.Method_22087());
            class_1367.Method_1374(Class_26261.Field_26268, arrayList.size());
            if (arrayList.isEmpty()) {
                Object[] arrobject = new Object[17 & 521];
                arrobject[16392 & -29760] = class_22057.Method_22075();
                throw new Class_30034("commands.scoreboard.teams.empty.alreadyEmpty", arrobject);
            }
            for (String string : arrayList) {
                class_20976.Method_21017(string, class_22057);
            }
            Object[] arrobject = new Object[-30138 & 17442];
            arrobject[20992 & 416] = arrayList.size();
            arrobject[16385 & 8533] = class_22057.Method_22075();
            Class_38659.\u0000strictfp((Class_1367)class_1367, (Class_26550)this, (String)"commands.scoreboard.teams.empty.success", (Object[])arrobject);
        }
    }

    protected void Method_38662(Class_1367 class_1367, String[] arrstring, int n) {
        Class_20976 class_20976 = this.Method_38676();
        Class_22057 class_22057 = this.Method_38670(arrstring[n]);
        if (class_22057 != null) {
            class_20976.Method_21012(class_22057);
            Object[] arrobject = new Object[289 & 24705];
            arrobject[8200 & 3714] = class_22057.Method_22075();
            Class_38659.\u0000strictfp((Class_1367)class_1367, (Class_26550)this, (String)"commands.scoreboard.teams.remove.success", (Object[])arrobject);
        }
    }

    protected void Method_38663(Class_1367 class_1367, String string) {
        Class_20976 class_20976 = this.Method_38676();
        Class_7873 class_7873 = this.Method_38666(string, (25664 & -32712) != 0);
        class_20976.Method_21013(class_7873);
        Object[] arrobject = new Object[-30687 & 463];
        arrobject[-24046 & 257] = string;
        Class_38659.\u0000strictfp((Class_1367)class_1367, (Class_26550)this, (String)"commands.scoreboard.objectives.remove.success", (Object[])arrobject);
    }

    public boolean Method_38664(String[] arrstring, int n) {
        return (!arrstring[-6080 & 40].equalsIgnoreCase("players") ? (arrstring[-28416 & 16929].equalsIgnoreCase("teams") ? (n == (24627 & 4098) ? 923 & -14267 : 9672 & 22560) : 10817 & -16384) : (arrstring.length > (1541 & 20611) && arrstring[521 & 10545].equalsIgnoreCase("operation") ? (n == (-28669 & 11086) || n == (-32763 & 10503) ? 26945 & 1665 : 8257 & -30960) : (n == (24587 & 2886) ? 97 & 21253 : 1 & 17570))) != 0;
    }

    protected void Method_38665(Class_1367 class_1367, String[] arrstring, int n) {
        Class_20976 class_20976 = this.Method_38676();
        String string = Class_38659.\u0000, `((Class_1367)class_1367, (String)arrstring[n++]);
        if (arrstring.length > n) {
            Class_7873 class_7873 = this.Method_38666(arrstring[n++], (12512 & 14) != 0);
            class_20976.Method_21006(string, class_7873);
            Object[] arrobject = new Object[24606 & -26398];
            arrobject[16384 & -30603] = class_7873.Method_7881();
            arrobject[21537 & 10269] = string;
            Class_38659.\u0000strictfp((Class_1367)class_1367, (Class_26550)this, (String)"commands.scoreboard.players.resetscore.success", (Object[])arrobject);
        } else {
            class_20976.Method_21006(string, null);
            Object[] arrobject = new Object[25105 & 321];
            arrobject[512 & 7386] = string;
            Class_38659.\u0000strictfp((Class_1367)class_1367, (Class_26550)this, (String)"commands.scoreboard.players.reset.success", (Object[])arrobject);
        }
    }

    protected Class_7873 Method_38666(String string, boolean bl) {
        Class_20976 class_20976 = this.Method_38676();
        Class_7873 class_7873 = class_20976.Method_21003(string);
        if (class_7873 == null) {
            Object[] arrobject = new Object[517 & 18835];
            arrobject[16428 & 2690] = string;
            throw new Class_30034("commands.scoreboard.objectiveNotFound", arrobject);
        }
        if (bl && class_7873.Method_7883().Method_27942()) {
            Object[] arrobject = new Object[4097 & 16593];
            arrobject[1 & -28208] = string;
            throw new Class_30034("commands.scoreboard.objectiveReadOnly", arrobject);
        }
        return class_7873;
    }

    protected void Method_38667(Class_1367 class_1367, String[] arrstring, int n) {
        Class_20976 class_20976 = this.Method_38676();
        if (arrstring.length > n) {
            Class_22057 class_22057 = this.Method_38670(arrstring[n]);
            if (class_22057 == null) {
                return;
            }
            Collection collection = class_22057.Method_22087();
            class_1367.Method_1374(Class_26261.Field_26263, collection.size());
            if (collection.size() <= 0) {
                Object[] arrobject = new Object[3073 & 67];
                arrobject[17128 & 262] = class_22057.Method_22075();
                throw new Class_30034("commands.scoreboard.teams.list.player.empty", arrobject);
            }
            Object[] arrobject = new Object[6166 & -32758];
            arrobject[20736 & 2192] = collection.size();
            arrobject[1 & 17569] = class_22057.Method_22075();
            Class_2849 class_2849 = new Class_2849("commands.scoreboard.teams.list.player.count", arrobject);
            class_2849.\u0000strictfp().Method_2917(Class_5478.Field_5482);
            class_1367.Method_1373(class_2849);
            class_1367.Method_1373(new Class_2840(Class_38659.\u0000strictfp((Object[])collection.toArray())));
        } else {
            Collection collection = class_20976.Method_20994();
            class_1367.Method_1374(Class_26261.Field_26263, collection.size());
            if (collection.size() <= 0) {
                throw new Class_30034("commands.scoreboard.teams.list.empty", new Object[1561 & 20902]);
            }
            Object[] arrobject = new Object[923 & 21505];
            arrobject[1152 & 22536] = collection.size();
            Class_2849 class_2849 = new Class_2849("commands.scoreboard.teams.list.count", arrobject);
            class_2849.\u0000strictfp().Method_2917(Class_5478.Field_5482);
            class_1367.Method_1373(class_2849);
            for (Class_22057 class_22057 : collection) {
                Object[] arrobject2 = new Object[16387 & -27117];
                arrobject2[-28616 & 196] = class_22057.Method_22075();
                arrobject2[577 & -16381] = class_22057.Method_22080();
                arrobject2[515 & -23154] = class_22057.Method_22087().size();
                class_1367.Method_1373(new Class_2849("commands.scoreboard.teams.list.entry", arrobject2));
            }
        }
    }

    protected void Method_38668(Class_1367 class_1367, String[] arrstring, int n) {
        String string;
        Class_20976 class_20976 = this.Method_38676();
        if ((string = Class_38659.\u0000strictfp((Class_1367)class_1367, (String)arrstring[n++])).length() > (56 & 26728)) {
            Object[] arrobject = new Object[20626 & -32766];
            arrobject[4116 & -30520] = string;
            arrobject[3 & 1049] = 18984 & -32338;
            throw new Class_32994("commands.scoreboard.players.name.tooLong", arrobject);
        }
        Class_7873 class_7873 = this.Method_38666(arrstring[n], (6160 & 1101) != 0);
        if (class_7873.Method_7883() != Class_27930.Field_27939) {
            Object[] arrobject = new Object[28947 & 521];
            arrobject[1 & -17352] = class_7873.Method_7881();
            throw new Class_30034("commands.scoreboard.players.enable.noTrigger", arrobject);
        }
        Class_21696 class_21696 = class_20976.Method_20993(string, class_7873);
        class_21696.Method_21705((2196 & 8256) != 0);
        Object[] arrobject = new Object[-16350 & 10882];
        arrobject[20769 & 8704] = class_7873.Method_7881();
        arrobject[-32699 & 18449] = string;
        Class_38659.\u0000strictfp((Class_1367)class_1367, (Class_26550)this, (String)"commands.scoreboard.players.enable.success", (Object[])arrobject);
    }

    protected void Method_38669(Class_1367 class_1367, String[] arrstring, int n) {
        Class_7873 class_7873;
        String string;
        Class_20976 class_20976 = this.Method_38676();
        if ((string = Class_38659.\u0000, `((Class_1367)class_1367, (String)arrstring[n++])).length() > (-30552 & 16505)) {
            Object[] arrobject = new Object[6242 & 24579];
            arrobject[16388 & 2818] = string;
            arrobject[3 & -28059] = 8494 & 5672;
            throw new Class_32994("commands.scoreboard.players.name.tooLong", arrobject);
        }
        if (!class_20976.Method_21011(string, class_7873 = this.Method_38666(arrstring[n++], (16393 & -31376) != 0))) {
            Object[] arrobject = new Object[16482 & 8450];
            arrobject[-29854 & 0] = class_7873.Method_7881();
            arrobject[5265 & 18475] = string;
            throw new Class_30034("commands.scoreboard.players.test.notFound", arrobject);
        }
        int n2 = arrstring[n].equals("*") ? -1071642512 & -2145647095 : Class_38659.\u0000strictfp((String)arrstring[n]);
        int n3 = ++n < arrstring.length && !arrstring[n].equals("*") ? Class_38659.\u0000strictfp((String)arrstring[n], (int)n2) : Integer.MAX_VALUE & -1;
        Class_21696 class_21696 = class_20976.Method_20993(string, class_7873);
        if (class_21696.Method_21706() < n2 || class_21696.Method_21706() > n3) {
            Object[] arrobject = new Object[4195 & 8203];
            arrobject[36 & 208] = class_21696.Method_21706();
            arrobject[129 & -14255] = n2;
            arrobject[1651 & 16386] = n3;
            throw new Class_30034("commands.scoreboard.players.test.failed", arrobject);
        }
        Object[] arrobject = new Object[4251 & 16739];
        arrobject[5252 & -32703] = class_21696.Method_21706();
        arrobject[16397 & 417] = n2;
        arrobject[9218 & 21118] = n3;
        Class_38659.\u0000strictfp((Class_1367)class_1367, (Class_26550)this, (String)"commands.scoreboard.players.test.success", (Object[])arrobject);
    }

    protected Class_22057 Method_38670(String string) {
        Class_20976 class_20976 = this.Method_38676();
        Class_22057 class_22057 = class_20976.Method_21018(string);
        if (class_22057 == null) {
            Object[] arrobject = new Object[4119 & 745];
            arrobject[17537 & 64] = string;
            throw new Class_30034("commands.scoreboard.teamNotFound", arrobject);
        }
        return class_22057;
    }

    protected void Method_38671(Class_1367 class_1367, String[] arrstring, int n) {
        Class_22057 class_22057;
        if ((class_22057 = this.Method_38670(arrstring[n++])) != null) {
            String string;
            if (!((string = arrstring[n++].toLowerCase()).equalsIgnoreCase("color") || string.equalsIgnoreCase("friendlyfire") || string.equalsIgnoreCase("seeFriendlyInvisibles") || string.equalsIgnoreCase("nametagVisibility") || string.equalsIgnoreCase("deathMessageVisibility"))) {
                throw new Class_34974("commands.scoreboard.teams.option.usage", new Object[-16000 & 8212]);
            }
            if (arrstring.length == (10404 & -11443)) {
                if (string.equalsIgnoreCase("color")) {
                    Object[] arrobject = new Object[17043 & -23510];
                    arrobject[-15104 & 8269] = string;
                    arrobject[2305 & -16319] = Class_38659.\u0000strictfp((Collection)Class_5478.Method_5562((1097 & 2049) != 0, (23562 & -32224) != 0));
                    throw new Class_34974("commands.scoreboard.teams.option.noValue", arrobject);
                }
                if (!string.equalsIgnoreCase("friendlyfire") && !string.equalsIgnoreCase("seeFriendlyInvisibles")) {
                    if (!string.equalsIgnoreCase("nametagVisibility") && !string.equalsIgnoreCase("deathMessageVisibility")) {
                        throw new Class_34974("commands.scoreboard.teams.option.usage", new Object[-8606 & 20]);
                    }
                    Object[] arrobject = new Object[4262 & 2130];
                    arrobject[3380 & -12160] = string;
                    arrobject[2187 & 4097] = Class_38659.\u0000strictfp((Object[])Class_31355.Method_31376());
                    throw new Class_34974("commands.scoreboard.teams.option.noValue", arrobject);
                }
                Object[] arrobject = new Object[-27634 & 8226];
                arrobject[664 & 12353] = string;
                String[] arrstring2 = new String[-32758 & 774];
                arrstring2[9506 & 2568] = "true";
                arrstring2[209 & 20481] = "false";
                arrobject[-12271 & 1061] = Class_38659.\u0000strictfp(Arrays.asList(arrstring2));
                throw new Class_34974("commands.scoreboard.teams.option.noValue", arrobject);
            }
            String string2 = arrstring[n];
            if (string.equalsIgnoreCase("color")) {
                Class_5478 class_5478 = Class_5478.Method_5527(string2);
                if (class_5478 == null || class_5478.Method_5547()) {
                    Object[] arrobject = new Object[12103 & -32630];
                    arrobject[1797 & 8200] = string;
                    arrobject[16729 & 1029] = Class_38659.\u0000strictfp((Collection)Class_5478.Method_5562((1667 & 10257) != 0, (675 & 8452) != 0));
                    throw new Class_34974("commands.scoreboard.teams.option.noValue", arrobject);
                }
                class_22057.Method_22074(class_5478);
                class_22057.Method_22072(class_5478.Method_5540());
                class_22057.Method_22071(Class_5478.Field_5507.Method_5540());
            } else if (string.equalsIgnoreCase("friendlyfire")) {
                if (!string2.equalsIgnoreCase("true") && !string2.equalsIgnoreCase("false")) {
                    Object[] arrobject = new Object[23570 & 8259];
                    arrobject[-31679 & 20480] = string;
                    String[] arrstring3 = new String[-15414 & 4130];
                    arrstring3[1080 & 4482] = "true";
                    arrstring3[337 & 1029] = "false";
                    arrobject[9219 & 45] = Class_38659.\u0000strictfp(Arrays.asList(arrstring3));
                    throw new Class_34974("commands.scoreboard.teams.option.noValue", arrobject);
                }
                class_22057.Method_22085(string2.equalsIgnoreCase("true"));
            } else if (string.equalsIgnoreCase("seeFriendlyInvisibles")) {
                if (!string2.equalsIgnoreCase("true") && !string2.equalsIgnoreCase("false")) {
                    Object[] arrobject = new Object[1214 & -32445];
                    arrobject[-32509 & 12420] = string;
                    String[] arrstring4 = new String[-8178 & 6163];
                    arrstring4[8214 & 1024] = "true";
                    arrstring4[-12247 & 915] = "false";
                    arrobject[-27031 & 145] = Class_38659.\u0000strictfp(Arrays.asList(arrstring4));
                    throw new Class_34974("commands.scoreboard.teams.option.noValue", arrobject);
                }
                class_22057.Method_22091(string2.equalsIgnoreCase("true"));
            } else if (string.equalsIgnoreCase("nametagVisibility")) {
                Class_31355 class_31355 = Class_31355.Method_31373(string2);
                if (class_31355 == null) {
                    Object[] arrobject = new Object[-24534 & 21702];
                    arrobject[34 & 29081] = string;
                    arrobject[-32685 & 18437] = Class_38659.\u0000strictfp((Object[])Class_31355.Method_31376());
                    throw new Class_34974("commands.scoreboard.teams.option.noValue", arrobject);
                }
                class_22057.Method_22073(class_31355);
            } else if (string.equalsIgnoreCase("deathMessageVisibility")) {
                Class_31355 class_31355 = Class_31355.Method_31373(string2);
                if (class_31355 == null) {
                    Object[] arrobject = new Object[-31210 & 20547];
                    arrobject[10 & 2065] = string;
                    arrobject[16769 & 8199] = Class_38659.\u0000strictfp((Object[])Class_31355.Method_31376());
                    throw new Class_34974("commands.scoreboard.teams.option.noValue", arrobject);
                }
                class_22057.Method_22086(class_31355);
            }
            Object[] arrobject = new Object[547 & 5251];
            arrobject[320 & 8224] = string;
            arrobject[833 & 4139] = class_22057.Method_22075();
            arrobject[1282 & 12942] = string2;
            Class_38659.\u0000strictfp((Class_1367)class_1367, (Class_26550)this, (String)"commands.scoreboard.teams.option.success", (Object[])arrobject);
        }
    }

    public void Method_38672(Class_1367 class_1367, String[] arrstring) {
        if (!this.Method_38682(class_1367, arrstring)) {
            if (arrstring.length < (-24559 & 4901)) {
                throw new Class_34974("commands.scoreboard.usage", new Object[8349 & 16416]);
            }
            if (arrstring[57 & -19200].equalsIgnoreCase("objectives")) {
                if (arrstring.length == (-24567 & 6481)) {
                    throw new Class_34974("commands.scoreboard.objectives.usage", new Object[-20350 & 2604]);
                }
                if (arrstring[-30463 & 193].equalsIgnoreCase("list")) {
                    this.Method_38686(class_1367);
                } else if (arrstring[-16363 & 641].equalsIgnoreCase("add")) {
                    if (arrstring.length < (676 & 30)) {
                        throw new Class_34974("commands.scoreboard.objectives.add.usage", new Object[80 & 13064]);
                    }
                    this.Method_38679(class_1367, arrstring, -32766 & 2714);
                } else if (arrstring[-14975 & 4167].equalsIgnoreCase("remove")) {
                    if (arrstring.length != (-12221 & 10559)) {
                        throw new Class_34974("commands.scoreboard.objectives.remove.usage", new Object[1104 & 774]);
                    }
                    this.Method_38663(class_1367, arrstring[2715 & -27550]);
                } else {
                    if (!arrstring[145 & -32469].equalsIgnoreCase("setdisplay")) {
                        throw new Class_34974("commands.scoreboard.objectives.usage", new Object[4128 & 153]);
                    }
                    if (arrstring.length != (10627 & 31) && arrstring.length != (10021 & -10226)) {
                        throw new Class_34974("commands.scoreboard.objectives.setdisplay.usage", new Object[6788 & 8264]);
                    }
                    this.Method_38660(class_1367, arrstring, -15342 & 707);
                }
            } else if (arrstring[24738 & 580].equalsIgnoreCase("players")) {
                if (arrstring.length == (521 & 385)) {
                    throw new Class_34974("commands.scoreboard.players.usage", new Object[-15028 & 4112]);
                }
                if (arrstring[-15743 & 2055].equalsIgnoreCase("list")) {
                    if (arrstring.length > (-32765 & 595)) {
                        throw new Class_34974("commands.scoreboard.players.list.usage", new Object[1060 & -32358]);
                    }
                    this.Method_38689(class_1367, arrstring, -30437 & 29794);
                } else if (arrstring[-20095 & 2569].equalsIgnoreCase("add")) {
                    if (arrstring.length < (16709 & 15373)) {
                        throw new Class_34974("commands.scoreboard.players.add.usage", new Object[9836 & 403]);
                    }
                    this.Method_38685(class_1367, arrstring, 258 & -30198);
                } else if (arrstring[1345 & 20621].equalsIgnoreCase("remove")) {
                    if (arrstring.length < (-31899 & 2055)) {
                        throw new Class_34974("commands.scoreboard.players.remove.usage", new Object[1024 & 2066]);
                    }
                    this.Method_38685(class_1367, arrstring, 19970 & 8195);
                } else if (arrstring[4161 & -16127].equalsIgnoreCase("set")) {
                    if (arrstring.length < (-2643 & 5)) {
                        throw new Class_34974("commands.scoreboard.players.set.usage", new Object[320 & 158]);
                    }
                    this.Method_38685(class_1367, arrstring, 6342 & 16642);
                } else if (arrstring[-8179 & 2177].equalsIgnoreCase("reset")) {
                    if (arrstring.length != (20003 & -32701) && arrstring.length != (6276 & 8255)) {
                        throw new Class_34974("commands.scoreboard.players.reset.usage", new Object[64 & 16688]);
                    }
                    this.Method_38665(class_1367, arrstring, 5130 & 19142);
                } else if (arrstring[13185 & -31717].equalsIgnoreCase("enable")) {
                    if (arrstring.length != (8196 & 18957)) {
                        throw new Class_34974("commands.scoreboard.players.enable.usage", new Object[8 & 16128]);
                    }
                    this.Method_38668(class_1367, arrstring, 7 & 22746);
                } else if (arrstring[18453 & -20055].equalsIgnoreCase("test")) {
                    if (arrstring.length != (709 & 26645) && arrstring.length != (551 & 6534)) {
                        throw new Class_34974("commands.scoreboard.players.test.usage", new Object[-15759 & 8192]);
                    }
                    this.Method_38669(class_1367, arrstring, 1538 & 4426);
                } else {
                    if (!arrstring[-19951 & 16515].equalsIgnoreCase("operation")) {
                        throw new Class_34974("commands.scoreboard.players.usage", new Object[1024 & 8465]);
                    }
                    if (arrstring.length != (7 & 2375)) {
                        throw new Class_34974("commands.scoreboard.players.operation.usage", new Object[-32206 & 25604]);
                    }
                    this.Method_38687(class_1367, arrstring, 2211 & 322);
                }
            } else {
                if (!arrstring[8580 & 20000].equalsIgnoreCase("teams")) {
                    throw new Class_34974("commands.scoreboard.usage", new Object[772 & 4128]);
                }
                if (arrstring.length == (8841 & 23587)) {
                    throw new Class_34974("commands.scoreboard.teams.usage", new Object[2325 & 4288]);
                }
                if (arrstring[3125 & 24705].equalsIgnoreCase("list")) {
                    if (arrstring.length > (3 & -13597)) {
                        throw new Class_34974("commands.scoreboard.teams.list.usage", new Object[-32376 & 8193]);
                    }
                    this.Method_38667(class_1367, arrstring, 18442 & 1283);
                } else if (arrstring[-30143 & 23].equalsIgnoreCase("add")) {
                    if (arrstring.length < (-14333 & 12291)) {
                        throw new Class_34974("commands.scoreboard.teams.add.usage", new Object[16515 & 3584]);
                    }
                    this.Method_38677(class_1367, arrstring, 20482 & -30701);
                } else if (arrstring[-23935 & 16401].equalsIgnoreCase("remove")) {
                    if (arrstring.length != (1571 & 16395)) {
                        throw new Class_34974("commands.scoreboard.teams.remove.usage", new Object[4836 & 1042]);
                    }
                    this.Method_38662(class_1367, arrstring, -32254 & 3091);
                } else if (arrstring[16655 & 1617].equalsIgnoreCase("empty")) {
                    if (arrstring.length != (3 & 2343)) {
                        throw new Class_34974("commands.scoreboard.teams.empty.usage", new Object[8288 & 5002]);
                    }
                    this.Method_38661(class_1367, arrstring, 167 & 1538);
                } else if (arrstring[1 & 2049].equalsIgnoreCase("join")) {
                    if (!(arrstring.length >= (300 & -13819) || arrstring.length == (16455 & 7459) && class_1367 instanceof Class_626)) {
                        throw new Class_34974("commands.scoreboard.teams.join.usage", new Object[4224 & 11575]);
                    }
                    this.Method_38684(class_1367, arrstring, 12422 & 2050);
                } else if (arrstring[-22511 & 4205].equalsIgnoreCase("leave")) {
                    if (arrstring.length < (11 & 17575) && !(class_1367 instanceof Class_626)) {
                        throw new Class_34974("commands.scoreboard.teams.leave.usage", new Object[12568 & 1]);
                    }
                    this.Method_38678(class_1367, arrstring, 643 & -16090);
                } else {
                    if (!arrstring[-32491 & 2145].equalsIgnoreCase("option")) {
                        throw new Class_34974("commands.scoreboard.teams.usage", new Object[272 & -32756]);
                    }
                    if (arrstring.length != (-28411 & 54) && arrstring.length != (8277 & 5125)) {
                        throw new Class_34974("commands.scoreboard.teams.option.usage", new Object[-31680 & 165]);
                    }
                    this.Method_38671(class_1367, arrstring, 10 & -31630);
                }
            }
        }
    }

    public List Method_38673(Class_1367 class_1367, String[] arrstring, Class_4751 class_4751) {
        if (arrstring.length == (-32755 & 30865)) {
            String[] arrstring2 = new String[8563 & -16381];
            arrstring2[5157 & 18952] = "objectives";
            arrstring2[2049 & 12325] = "players";
            arrstring2[18458 & 9378] = "teams";
            return Class_38659.\u0000strictfp((String[])arrstring, (String[])arrstring2);
        }
        if (arrstring[-24576 & 238].equalsIgnoreCase("objectives")) {
            if (arrstring.length == (526 & 5378)) {
                String[] arrstring3 = new String[52 & 16644];
                arrstring3[-16376 & 1521] = "list";
                arrstring3[1545 & -30585] = "add";
                arrstring3[29202 & 2087] = "remove";
                arrstring3[-12269 & 8707] = "setdisplay";
                return Class_38659.\u0000strictfp((String[])arrstring, (String[])arrstring3);
            }
            if (arrstring[-31731 & 18529].equalsIgnoreCase("add")) {
                if (arrstring.length == (9671 & 22532)) {
                    Set set = Class_27930.Field_27937.keySet();
                    return Class_38659.\u0000strictfp((String[])arrstring, set);
                }
            } else if (arrstring[28691 & 2305].equalsIgnoreCase("remove")) {
                if (arrstring.length == (527 & -12269)) {
                    return Class_38659.\u0000strictfp((String[])arrstring, (Collection)this.Method_38674((16772 & -25599) != 0));
                }
            } else if (arrstring[13341 & 131].equalsIgnoreCase("setdisplay")) {
                if (arrstring.length == (12347 & 17475)) {
                    return Class_38659.\u0000strictfp((String[])arrstring, (String[])Class_20976.Method_20990());
                }
                if (arrstring.length == (2972 & -28665)) {
                    return Class_38659.\u0000strictfp((String[])arrstring, (Collection)this.Method_38674((-32256 & 24681) != 0));
                }
            }
        } else if (arrstring[12480 & -14332].equalsIgnoreCase("players")) {
            if (arrstring.length == (4130 & 8835)) {
                String[] arrstring4 = new String[10250 & 1160];
                arrstring4[18049 & 256] = "set";
                arrstring4[4353 & 8361] = "add";
                arrstring4[17410 & 6218] = "remove";
                arrstring4[-32381 & 9247] = "reset";
                arrstring4[-32492 & 19500] = "list";
                arrstring4[4117 & 10311] = "enable";
                arrstring4[-31730 & 534] = "test";
                arrstring4[8743 & -16377] = "operation";
                return Class_38659.\u0000strictfp((String[])arrstring, (String[])arrstring4);
            }
            if (!(arrstring[16771 & 15949].equalsIgnoreCase("set") || arrstring[-15351 & 5057].equalsIgnoreCase("add") || arrstring[-19129 & 49].equalsIgnoreCase("remove") || arrstring[2625 & 171].equalsIgnoreCase("reset"))) {
                if (arrstring[30793 & -31225].equalsIgnoreCase("enable")) {
                    if (arrstring.length == (-11985 & 643)) {
                        return Class_38659.\u0000strictfp((String[])arrstring, (String[])Class_2457.Method_2530().Method_2554());
                    }
                    if (arrstring.length == (19876 & 8215)) {
                        return Class_38659.\u0000strictfp((String[])arrstring, (Collection)this.Method_38680());
                    }
                } else if (!arrstring[-6139 & 5969].equalsIgnoreCase("list") && !arrstring[25859 & 113].equalsIgnoreCase("test")) {
                    if (arrstring[57 & -32575].equalsIgnoreCase("operation")) {
                        if (arrstring.length == (403 & 18539)) {
                            return Class_38659.\u0000strictfp((String[])arrstring, (Collection)this.Method_38676().Method_20988());
                        }
                        if (arrstring.length == (-31218 & 4)) {
                            return Class_38659.\u0000strictfp((String[])arrstring, (Collection)this.Method_38674((1025 & 16387) != 0));
                        }
                        if (arrstring.length == (-16107 & 9295)) {
                            String[] arrstring5 = new String[73 & 24845];
                            arrstring5[-31998 & 17] = "+=";
                            arrstring5[16535 & -32759] = "-=";
                            arrstring5[2050 & 17962] = "*=";
                            arrstring5[1235 & -16125] = "/=";
                            arrstring5[2566 & 16589] = "%=";
                            arrstring5[-29881 & 25613] = "=";
                            arrstring5[4134 & 926] = "<";
                            arrstring5[12679 & 2583] = ">";
                            arrstring5[3400 & 8335] = "><";
                            return Class_38659.\u0000strictfp((String[])arrstring, (String[])arrstring5);
                        }
                        if (arrstring.length == (902 & -30698)) {
                            return Class_38659.\u0000strictfp((String[])arrstring, (String[])Class_2457.Method_2530().Method_2554());
                        }
                        if (arrstring.length == (-30649 & 26127)) {
                            return Class_38659.\u0000strictfp((String[])arrstring, (Collection)this.Method_38674((25898 & 644) != 0));
                        }
                    }
                } else {
                    if (arrstring.length == (-32761 & 3219)) {
                        return Class_38659.\u0000strictfp((String[])arrstring, (Collection)this.Method_38676().Method_20988());
                    }
                    if (arrstring.length == (-27612 & 4) && arrstring[3331 & 24641].equalsIgnoreCase("test")) {
                        return Class_38659.\u0000strictfp((String[])arrstring, (Collection)this.Method_38674((5181 & -16000) != 0));
                    }
                }
            } else {
                if (arrstring.length == (2131 & -22641)) {
                    return Class_38659.\u0000strictfp((String[])arrstring, (String[])Class_2457.Method_2530().Method_2554());
                }
                if (arrstring.length == (-32620 & 2415)) {
                    return Class_38659.\u0000strictfp((String[])arrstring, (Collection)this.Method_38674((8579 & 1601) != 0));
                }
            }
        } else if (arrstring[6918 & -16192].equalsIgnoreCase("teams")) {
            if (arrstring.length == (17330 & -21490)) {
                String[] arrstring6 = new String[519 & -30649];
                arrstring6[8197 & 522] = "add";
                arrstring6[18033 & 2051] = "remove";
                arrstring6[2054 & -27646] = "join";
                arrstring6[2051 & -24405] = "leave";
                arrstring6[292 & 24607] = "empty";
                arrstring6[17877 & 6157] = "list";
                arrstring6[-14906 & 8758] = "option";
                return Class_38659.\u0000strictfp((String[])arrstring, (String[])arrstring6);
            }
            if (arrstring[-16245 & 5409].equalsIgnoreCase("join")) {
                if (arrstring.length == (407 & 10307)) {
                    return Class_38659.\u0000strictfp((String[])arrstring, (Collection)this.Method_38676().Method_21010());
                }
                if (arrstring.length >= (2572 & 1284)) {
                    return Class_38659.\u0000strictfp((String[])arrstring, (String[])Class_2457.Method_2530().Method_2554());
                }
            } else {
                if (arrstring[1313 & -23865].equalsIgnoreCase("leave")) {
                    return Class_38659.\u0000strictfp((String[])arrstring, (String[])Class_2457.Method_2530().Method_2554());
                }
                if (!(arrstring[3753 & 81].equalsIgnoreCase("empty") || arrstring[21011 & -32763].equalsIgnoreCase("list") || arrstring[1103 & 10385].equalsIgnoreCase("remove"))) {
                    if (arrstring[16449 & 10265].equalsIgnoreCase("option")) {
                        if (arrstring.length == (-14333 & 10123)) {
                            return Class_38659.\u0000strictfp((String[])arrstring, (Collection)this.Method_38676().Method_21010());
                        }
                        if (arrstring.length == (12356 & -30699)) {
                            String[] arrstring7 = new String[791 & 8237];
                            arrstring7[17473 & -32210] = "color";
                            arrstring7[8873 & 321] = "friendlyfire";
                            arrstring7[338 & 8230] = "seeFriendlyInvisibles";
                            arrstring7[20487 & -29693] = "nametagVisibility";
                            arrstring7[13 & 68] = "deathMessageVisibility";
                            return Class_38659.\u0000strictfp((String[])arrstring, (String[])arrstring7);
                        }
                        if (arrstring.length == (37 & -28027)) {
                            if (arrstring[26115 & -26493].equalsIgnoreCase("color")) {
                                return Class_38659.\u0000strictfp((String[])arrstring, (Collection)Class_5478.Method_5562((-30193 & 16417) != 0, (1442 & 10316) != 0));
                            }
                            if (arrstring[71 & 1187].equalsIgnoreCase("nametagVisibility") || arrstring[531 & 8291].equalsIgnoreCase("deathMessageVisibility")) {
                                return Class_38659.\u0000strictfp((String[])arrstring, (String[])Class_31355.Method_31376());
                            }
                            if (arrstring[203 & 1027].equalsIgnoreCase("friendlyfire") || arrstring[8323 & 16455].equalsIgnoreCase("seeFriendlyInvisibles")) {
                                String[] arrstring8 = new String[19154 & 1039];
                                arrstring8[16900 & 13312] = "true";
                                arrstring8[1313 & 29205] = "false";
                                return Class_38659.\u0000strictfp((String[])arrstring, (String[])arrstring8);
                            }
                        }
                    }
                } else if (arrstring.length == (527 & 259)) {
                    return Class_38659.\u0000strictfp((String[])arrstring, (Collection)this.Method_38676().Method_21010());
                }
            }
        }
        return null;
    }

    protected List Method_38674(boolean bl) {
        Collection collection = this.Method_38676().Method_20996();
        ArrayList arrayList = Lists.newArrayList();
        for (Class_7873 class_7873 : collection) {
            if (bl && class_7873.Method_7883().Method_27942()) continue;
            arrayList.add(class_7873.Method_7881());
        }
        return arrayList;
    }

    public String Method_38675() {
        return "scoreboard";
    }

    protected Class_20976 Method_38676() {
        return Class_2457.Method_2530().Method_2550(-32256 & 12552).\u0000strictfp();
    }

    protected void Method_38677(Class_1367 class_1367, String[] arrstring, int n) {
        String string = arrstring[n++];
        Class_20976 class_20976 = this.Method_38676();
        if (class_20976.Method_21018(string) != null) {
            Object[] arrobject = new Object[2561 & 8259];
            arrobject[232 & -30462] = string;
            throw new Class_30034("commands.scoreboard.teams.add.alreadyExists", arrobject);
        }
        if (string.length() > (-28496 & 16409)) {
            Object[] arrobject = new Object[8283 & 2598];
            arrobject[-18391 & 16384] = string;
            arrobject[-24575 & 129] = 146 & 6997;
            throw new Class_32994("commands.scoreboard.teams.add.tooLong", arrobject);
        }
        if (string.length() == 0) {
            throw new Class_34974("commands.scoreboard.teams.add.usage", new Object[20500 & -29950]);
        }
        if (arrstring.length > n) {
            String string2 = Class_38659.\u0000strictfp((Class_1367)class_1367, (String[])arrstring, (int)n).Method_1788();
            if (string2.length() > (18994 & 12320)) {
                Object[] arrobject = new Object[14395 & 17414];
                arrobject[2724 & 1106] = string2;
                arrobject[-22525 & 1769] = -28634 & 19104;
                throw new Class_32994("commands.scoreboard.teams.add.displayTooLong", arrobject);
            }
            if (string2.length() > 0) {
                class_20976.Method_21008(string).Method_22076(string2);
            } else {
                class_20976.Method_21008(string);
            }
        } else {
            class_20976.Method_21008(string);
        }
        Object[] arrobject = new Object[8465 & 1];
        arrobject[25232 & 32] = string;
        Class_38659.\u0000strictfp((Class_1367)class_1367, (Class_26550)this, (String)"commands.scoreboard.teams.add.success", (Object[])arrobject);
    }

    protected void Method_38678(Class_1367 class_1367, String[] arrstring, int n) {
        Class_20976 class_20976 = this.Method_38676();
        HashSet hashSet = Sets.newHashSet();
        HashSet hashSet2 = Sets.newHashSet();
        if (class_1367 instanceof Class_626 && n == arrstring.length) {
            String string = Class_38659.\u0000strictfp((Class_1367)class_1367).\u0000, `();
            if (class_20976.Method_21002(string)) {
                hashSet.add(string);
            } else {
                hashSet2.add(string);
            }
        } else {
            while (n < arrstring.length) {
                String string;
                if ((string = arrstring[n++]).startsWith("@")) {
                    for (Class_1061 class_1061 : Class_38659.\u0000strictfp((Class_1367)class_1367, (String)string)) {
                        String string2 = Class_38659.\u0000, `((Class_1367)class_1367, (String)class_1061.Method_1194().toString());
                        if (class_20976.Method_21002(string2)) {
                            hashSet.add(string2);
                            continue;
                        }
                        hashSet2.add(string2);
                    }
                    continue;
                }
                String string3 = Class_38659.\u0000, `((Class_1367)class_1367, (String)string);
                if (class_20976.Method_21002(string3)) {
                    hashSet.add(string3);
                    continue;
                }
                hashSet2.add(string3);
            }
        }
        if (!hashSet.isEmpty()) {
            class_1367.Method_1374(Class_26261.Field_26268, hashSet.size());
            Object[] arrobject = new Object[2571 & 24674];
            arrobject[4101 & -13992] = hashSet.size();
            arrobject[-23727 & 5129] = Class_38659.\u0000strictfp((Object[])hashSet.toArray(new String[hashSet.size()]));
            Class_38659.\u0000strictfp((Class_1367)class_1367, (Class_26550)this, (String)"commands.scoreboard.teams.leave.success", (Object[])arrobject);
        }
        if (!hashSet2.isEmpty()) {
            Object[] arrobject = new Object[-32238 & 12610];
            arrobject[17411 & 8452] = hashSet2.size();
            arrobject[-32255 & 1041] = Class_38659.\u0000strictfp((Object[])hashSet2.toArray(new String[hashSet2.size()]));
            throw new Class_30034("commands.scoreboard.teams.leave.failure", arrobject);
        }
    }

    protected void Method_38679(Class_1367 class_1367, String[] arrstring, int n) {
        String string = arrstring[n++];
        String string2 = arrstring[n++];
        Class_20976 class_20976 = this.Method_38676();
        Class_27930 class_27930 = (Class_27930)Class_27930.Field_27937.get(string2);
        if (class_27930 == null) {
            Object[] arrobject = new Object[25089 & -31661];
            arrobject[1024 & 16732] = string2;
            throw new Class_34974("commands.scoreboard.objectives.add.wrongType", arrobject);
        }
        if (class_20976.Method_21003(string) != null) {
            Object[] arrobject = new Object[403 & 20545];
            arrobject[2048 & 1888] = string;
            throw new Class_30034("commands.scoreboard.objectives.add.alreadyExists", arrobject);
        }
        if (string.length() > (1042 & 17044)) {
            Object[] arrobject = new Object[75 & 2];
            arrobject[12368 & 16429] = string;
            arrobject[7505 & -32735] = 658 & 16477;
            throw new Class_32994("commands.scoreboard.objectives.add.tooLong", arrobject);
        }
        if (string.length() == 0) {
            throw new Class_34974("commands.scoreboard.objectives.add.usage", new Object[-23984 & 4387]);
        }
        if (arrstring.length > n) {
            String string3 = Class_38659.\u0000strictfp((Class_1367)class_1367, (String[])arrstring, (int)n).Method_1788();
            if (string3.length() > (24610 & -32276)) {
                Object[] arrobject = new Object[17442 & 390];
                arrobject[10241 & -32730] = string3;
                arrobject[-30719 & 13965] = -32732 & 546;
                throw new Class_32994("commands.scoreboard.objectives.add.displayTooLong", arrobject);
            }
            if (string3.length() > 0) {
                class_20976.Method_21000(string, class_27930).Method_7879(string3);
            } else {
                class_20976.Method_21000(string, class_27930);
            }
        } else {
            class_20976.Method_21000(string, class_27930);
        }
        Object[] arrobject = new Object[-32631 & 11367];
        arrobject[1366 & 6280] = string;
        Class_38659.\u0000strictfp((Class_1367)class_1367, (Class_26550)this, (String)"commands.scoreboard.objectives.add.success", (Object[])arrobject);
    }

    protected List Method_38680() {
        Collection collection = this.Method_38676().Method_20996();
        ArrayList arrayList = Lists.newArrayList();
        for (Class_7873 class_7873 : collection) {
            if (class_7873.Method_7883() != Class_27930.Field_27939) continue;
            arrayList.add(class_7873.Method_7881());
        }
        return arrayList;
    }

    private void Method_38681() {
        MethodHandle methodHandle = MethodHandles.constant(String.class, "MC|BlazingPack");
    }

    private boolean Method_38682(Class_1367 class_1367, String[] arrstring) {
        int n = -1 & -1;
        for (int i = -28671 & 2082; i < arrstring.length; ++i) {
            if (!this.Method_38664(arrstring, i) || !"*".equals(arrstring[i])) continue;
            if (n >= 0) {
                throw new Class_30034("commands.scoreboard.noMultiWildcard", new Object[16420 & 8834]);
            }
            n = i;
        }
        if (n < 0) {
            return (18498 & -24192) != 0;
        }
        ArrayList arrayList = Lists.newArrayList((Iterable)this.Method_38676().Method_20988());
        String string = arrstring[n];
        ArrayList arrayList2 = Lists.newArrayList();
        Iterator iterator = arrayList.iterator();
        while (iterator.hasNext()) {
            String string2;
            arrstring[n] = string2 = (String)iterator.next();
            try {
                this.Method_38672(class_1367, arrstring);
                arrayList2.add(string2);
            }
            catch (Class_30034 class_30034) {
                Class_2849 class_2849 = new Class_2849(class_30034.getMessage(), class_30034.Method_30037());
                class_2849.\u0000strictfp().Method_2917(Class_5478.Field_5505);
                class_1367.Method_1373(class_2849);
            }
        }
        arrstring[n] = string;
        class_1367.Method_1374(Class_26261.Field_26268, arrayList2.size());
        if (arrayList2.size() == 0) {
            throw new Class_34974("commands.scoreboard.allMatchesFailed", new Object[-32640 & 2089]);
        }
        return (11105 & 4225) != 0;
    }

    public String Method_38683(Class_1367 class_1367) {
        return "commands.scoreboard.usage";
    }

    protected void Method_38684(Class_1367 class_1367, String[] arrstring, int n) {
        Class_20976 class_20976 = this.Method_38676();
        String string = arrstring[n++];
        HashSet hashSet = Sets.newHashSet();
        HashSet hashSet2 = Sets.newHashSet();
        if (class_1367 instanceof Class_626 && n == arrstring.length) {
            String string2 = Class_38659.\u0000strictfp((Class_1367)class_1367).\u0000, `();
            if (class_20976.Method_20998(string2, string)) {
                hashSet.add(string2);
            } else {
                hashSet2.add(string2);
            }
        } else {
            while (n < arrstring.length) {
                String string3;
                if ((string3 = arrstring[n++]).startsWith("@")) {
                    for (Class_1061 class_1061 : Class_38659.\u0000strictfp((Class_1367)class_1367, (String)string3)) {
                        String string4 = Class_38659.\u0000, `((Class_1367)class_1367, (String)class_1061.Method_1194().toString());
                        if (class_20976.Method_20998(string4, string)) {
                            hashSet.add(string4);
                            continue;
                        }
                        hashSet2.add(string4);
                    }
                    continue;
                }
                String string5 = Class_38659.\u0000, `((Class_1367)class_1367, (String)string3);
                if (class_20976.Method_20998(string5, string)) {
                    hashSet.add(string5);
                    continue;
                }
                hashSet2.add(string5);
            }
        }
        if (!hashSet.isEmpty()) {
            class_1367.Method_1374(Class_26261.Field_26268, hashSet.size());
            Object[] arrobject = new Object[-24445 & 21507];
            arrobject[-7144 & 257] = hashSet.size();
            arrobject[13315 & 17229] = string;
            arrobject[9282 & 16914] = Class_38659.\u0000strictfp((Object[])hashSet.toArray(new String[hashSet.size()]));
            Class_38659.\u0000strictfp((Class_1367)class_1367, (Class_26550)this, (String)"commands.scoreboard.teams.join.success", (Object[])arrobject);
        }
        if (!hashSet2.isEmpty()) {
            Object[] arrobject = new Object[-16373 & 7];
            arrobject[-5632 & 172] = hashSet2.size();
            arrobject[451 & -21983] = string;
            arrobject[2766 & 18] = Class_38659.\u0000strictfp((Object[])hashSet2.toArray(new String[hashSet2.size()]));
            throw new Class_30034("commands.scoreboard.teams.join.failure", arrobject);
        }
    }

    protected void Method_38685(Class_1367 class_1367, String[] arrstring, int n) {
        String string;
        int n2;
        Object object;
        Object object2;
        String string2 = arrstring[n - (17499 & -24191)];
        int n3 = n;
        if ((string = Class_38659.\u0000, `((Class_1367)class_1367, (String)arrstring[n++])).length() > (5160 & 2617)) {
            Object[] arrobject = new Object[-15934 & 9234];
            arrobject[1049 & 8256] = string;
            arrobject[113 & 29707] = 16639 & -30680;
            throw new Class_32994("commands.scoreboard.players.name.tooLong", arrobject);
        }
        Class_7873 class_7873 = this.Method_38666(arrstring[n++], (-27511 & 2817) != 0);
        int n4 = n2 = string2.equalsIgnoreCase("set") ? Class_38659.\u0000strictfp((String)arrstring[n++]) : Class_38659.\u0000strictfp((String)arrstring[n++], (int)(-32308 & 12304));
        if (arrstring.length > n) {
            object2 = Class_38659.\u0000strictfp((Class_1367)class_1367, (String)arrstring[n3]);
            try {
                object = Class_10981.Method_10996(Class_38659.\u0000strictfp((String[])arrstring, (int)n));
                Class_1699 class_1699 = new Class_1699();
                ((Class_1061)object2).Method_1263(class_1699);
                if (!Class_25852.Method_25854((Class_1674)object, class_1699, (-23533 & 845) != 0)) {
                    Object[] arrobject = new Object[-31487 & 2061];
                    arrobject[17931 & -24316] = string;
                    throw new Class_30034("commands.scoreboard.players.set.tagMismatch", arrobject);
                }
            }
            catch (Class_34310 class_34310) {
                Object[] arrobject = new Object[22539 & 9761];
                arrobject[965 & -15320] = class_34310.getMessage();
                throw new Class_30034("commands.scoreboard.players.set.tagError", arrobject);
            }
        }
        object2 = this.Method_38676();
        object = ((Class_20976)object2).Method_20993(string, class_7873);
        if (string2.equalsIgnoreCase("set")) {
            ((Class_21696)object).Method_21709(n2);
        } else if (string2.equalsIgnoreCase("add")) {
            ((Class_21696)object).Method_21707(n2);
        } else {
            ((Class_21696)object).Method_21710(n2);
        }
        Object[] arrobject = new Object[6915 & 25699];
        arrobject[-20192 & 17045] = class_7873.Method_7881();
        arrobject[5253 & 8785] = string;
        arrobject[8227 & 21574] = ((Class_21696)object).Method_21706();
        Class_38659.\u0000strictfp((Class_1367)class_1367, (Class_26550)this, (String)"commands.scoreboard.players.set.success", (Object[])arrobject);
    }

    protected void Method_38686(Class_1367 class_1367) {
        Class_20976 class_20976 = this.Method_38676();
        Collection collection = class_20976.Method_20996();
        if (collection.size() <= 0) {
            throw new Class_30034("commands.scoreboard.objectives.list.empty", new Object[17408 & 0]);
        }
        Object[] arrobject = new Object[2069 & 737];
        arrobject[2888 & -12160] = collection.size();
        Class_2849 class_2849 = new Class_2849("commands.scoreboard.objectives.list.count", arrobject);
        class_2849.\u0000strictfp().Method_2917(Class_5478.Field_5482);
        class_1367.Method_1373(class_2849);
        for (Class_7873 class_7873 : collection) {
            Object[] arrobject2 = new Object[1171 & 18951];
            arrobject2[4426 & 10757] = class_7873.Method_7881();
            arrobject2[-7911 & 3077] = class_7873.Method_7886();
            arrobject2[16418 & 3074] = class_7873.Method_7883().Method_27940();
            class_1367.Method_1373(new Class_2849("commands.scoreboard.objectives.list.entry", arrobject2));
        }
    }

    protected void Method_38687(Class_1367 class_1367, String[] arrstring, int n) {
        Class_20976 class_20976 = this.Method_38676();
        String string = Class_38659.\u0000, `((Class_1367)class_1367, (String)arrstring[n++]);
        Class_7873 class_7873 = this.Method_38666(arrstring[n++], (1617 & 22691) != 0);
        String string2 = arrstring[n++];
        String string3 = Class_38659.\u0000, `((Class_1367)class_1367, (String)arrstring[n++]);
        Class_7873 class_78732 = this.Method_38666(arrstring[n], (16640 & 8392) != 0);
        if (string.length() > (5738 & 312)) {
            Object[] arrobject = new Object[2726 & -27565];
            arrobject[17466 & -28411] = string;
            arrobject[5893 & -32589] = -15320 & 172;
            throw new Class_32994("commands.scoreboard.players.name.tooLong", arrobject);
        }
        if (string3.length() > (40 & 10664)) {
            Object[] arrobject = new Object[3074 & 794];
            arrobject[17673 & -26620] = string3;
            arrobject[9827 & -16375] = 568 & -12179;
            throw new Class_32994("commands.scoreboard.players.name.tooLong", arrobject);
        }
        Class_21696 class_21696 = class_20976.Method_20993(string, class_7873);
        if (!class_20976.Method_21011(string3, class_78732)) {
            Object[] arrobject = new Object[-32602 & 4098];
            arrobject[13348 & 968] = class_78732.Method_7881();
            arrobject[12371 & 17413] = string3;
            throw new Class_30034("commands.scoreboard.players.operation.notFound", arrobject);
        }
        Class_21696 class_216962 = class_20976.Method_20993(string3, class_78732);
        if (string2.equals("+=")) {
            class_21696.Method_21709(class_21696.Method_21706() + class_216962.Method_21706());
        } else if (string2.equals("-=")) {
            class_21696.Method_21709(class_21696.Method_21706() - class_216962.Method_21706());
        } else if (string2.equals("*=")) {
            class_21696.Method_21709(class_21696.Method_21706() * class_216962.Method_21706());
        } else if (string2.equals("/=")) {
            if (class_216962.Method_21706() != 0) {
                class_21696.Method_21709(class_21696.Method_21706() / class_216962.Method_21706());
            }
        } else if (string2.equals("%=")) {
            if (class_216962.Method_21706() != 0) {
                class_21696.Method_21709(class_21696.Method_21706() % class_216962.Method_21706());
            }
        } else if (string2.equals("=")) {
            class_21696.Method_21709(class_216962.Method_21706());
        } else if (string2.equals("<")) {
            class_21696.Method_21709(Math.min(class_21696.Method_21706(), class_216962.Method_21706()));
        } else if (string2.equals(">")) {
            class_21696.Method_21709(Math.max(class_21696.Method_21706(), class_216962.Method_21706()));
        } else {
            if (!string2.equals("><")) {
                Object[] arrobject = new Object[2633 & -16329];
                arrobject[24608 & 5657] = string2;
                throw new Class_30034("commands.scoreboard.players.operation.invalidOperation", arrobject);
            }
            int n2 = class_21696.Method_21706();
            class_21696.Method_21709(class_216962.Method_21706());
            class_216962.Method_21709(n2);
        }
        Class_38659.\u0000strictfp((Class_1367)class_1367, (Class_26550)this, (String)"commands.scoreboard.players.operation.success", (Object[])new Object[9230 & 4320]);
    }

    public int Method_38688() {
        return -30206 & 30019;
    }

    protected void Method_38689(Class_1367 class_1367, String[] arrstring, int n) {
        Class_20976 class_20976 = this.Method_38676();
        if (arrstring.length > n) {
            String string = Class_38659.\u0000, `((Class_1367)class_1367, (String)arrstring[n]);
            Map map = class_20976.Method_20986(string);
            class_1367.Method_1374(Class_26261.Field_26263, map.size());
            if (map.size() <= 0) {
                Object[] arrobject = new Object[17 & 27649];
                arrobject[17060 & 1048] = string;
                throw new Class_30034("commands.scoreboard.players.list.player.empty", arrobject);
            }
            Object[] arrobject = new Object[-28274 & 17458];
            arrobject[-20288 & 18181] = map.size();
            arrobject[-28413 & 1225] = string;
            Class_2849 class_2849 = new Class_2849("commands.scoreboard.players.list.player.count", arrobject);
            class_2849.\u0000strictfp().Method_2917(Class_5478.Field_5482);
            class_1367.Method_1373(class_2849);
            for (Class_21696 class_21696 : map.values()) {
                Object[] arrobject2 = new Object[9243 & 4999];
                arrobject2[16448 & -24575] = class_21696.Method_21706();
                arrobject2[25 & 2625] = class_21696.Method_21711().Method_7886();
                arrobject2[1794 & 26786] = class_21696.Method_21711().Method_7881();
                class_1367.Method_1373(new Class_2849("commands.scoreboard.players.list.player.entry", arrobject2));
            }
        } else {
            Collection collection = class_20976.Method_20988();
            class_1367.Method_1374(Class_26261.Field_26263, collection.size());
            if (collection.size() <= 0) {
                throw new Class_30034("commands.scoreboard.players.list.empty", new Object[54 & -30712]);
            }
            Object[] arrobject = new Object[-22399 & 4673];
            arrobject[-28646 & 9248] = collection.size();
            Class_2849 class_2849 = new Class_2849("commands.scoreboard.players.list.count", arrobject);
            class_2849.\u0000strictfp().Method_2917(Class_5478.Field_5482);
            class_1367.Method_1373(class_2849);
            class_1367.Method_1373(new Class_2840(Class_38659.\u0000strictfp((Object[])collection.toArray())));
        }
    }
}

