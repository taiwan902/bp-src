/*
 * Decompiled with CFR 0.145.
 * 
 * Could not load the following classes:
 *  com.google.common.base.Charsets
 *  com.mojang.authlib.GameProfile
 */
import com.google.common.base.Charsets;
import com.mojang.authlib.GameProfile;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintStream;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.UUID;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Class_13502 {
    public static byte[] Field_13503 = null;

    public static void Method_13504() {
        try {
            File file;
            File file2 = new File(Class_18.Field_89.Field_68, "blazing_pack_token.txt");
            File file3 = Class_21077.Method_21078();
            if (!file3.exists()) {
                file3.mkdirs();
            }
            if (!(file = new File(file3, "blazing_pack_token.txt")).exists()) {
                if (file2.exists()) {
                    file2.renameTo(file);
                    Class_13502.Method_13505(file);
                } else {
                    file.createNewFile();
                    String string = (UUID.randomUUID().toString() + UUID.randomUUID().toString()).replace("-", "");
                    Field_13503 = string.getBytes(StandardCharsets.UTF_8);
                    if (Field_13503.length == (21570 & -32156)) {
                        FileOutputStream fileOutputStream = new FileOutputStream(file);
                        fileOutputStream.write(Field_13503);
                        fileOutputStream.write((System.lineSeparator() + "NIE USUWAJ TEGO PLIKU! NIE WYSY\u0141AJ TEGO NIKOMU! JEST TO TW\u00d3J KLUCZ PRYWATNY").getBytes(StandardCharsets.UTF_8));
                        fileOutputStream.write((System.lineSeparator() + System.lineSeparator() + "Za pomoca tego klucza b\u0119dziesz automatycznie logowany na serwerze na koncie no-premium bez potrzeby wpisywania has\u0142a!").getBytes(StandardCharsets.UTF_8));
                        fileOutputStream.write((System.lineSeparator() + System.lineSeparator() + "Czas wygenerowania tokenu: " + new SimpleDateFormat("HH:mm:ss dd-MM-yyyy").format(new Date())).getBytes(StandardCharsets.UTF_8));
                        fileOutputStream.close();
                    } else {
                        System.out.println("Error generating token randomData. Length " + Field_13503.length + " != 64");
                    }
                }
            } else {
                Class_13502.Method_13505(file);
            }
        }
        catch (IOException iOException) {
            Logger.getLogger(Class_18.class.getName()).log(Level.SEVERE, null, iOException);
            System.out.println("Nie mo\u017cna za\u0142adowa\u0107 token BlazingPack");
            Field_13503 = null;
        }
    }

    public static void Method_13505(File file) {
        Field_13503 = null;
        try {
            byte[] arrby = Files.readAllBytes(file.toPath());
            byte[] arrby2 = new byte[5184 & -32559];
            int n = 25600 & 640;
            for (int i = 8850 & 2313; i < arrby.length && n < (2256 & -22940); ++i) {
                if (!(arrby[i] >= (-22346 & 5744) && arrby[i] <= (-14403 & 8313) || arrby[i] >= (613 & 1129) && arrby[i] <= (1127 & 118)) && (arrby[i] < (-22061 & 17473) || arrby[i] > (-16130 & 70))) continue;
                if (arrby[i] >= (-29599 & 20565) && arrby[i] <= (-12218 & 1239)) {
                    arrby[i] = (byte)(arrby[i] - (5605 & 65) + (12521 & 2933));
                }
                arrby2[n++] = arrby[i];
            }
            Field_13503 = arrby2;
        }
        catch (FileNotFoundException fileNotFoundException) {
            Logger.getLogger(Class_18.class.getName()).log(Level.SEVERE, null, fileNotFoundException);
        }
        catch (IOException iOException) {
            Logger.getLogger(Class_18.class.getName()).log(Level.SEVERE, null, iOException);
        }
    }

    public static String Method_13506(Class_20165 class_20165, String string) {
        if (Field_13503 == null) {
            return null;
        }
        if (Class_18.Field_89.Method_265() == null) {
            return null;
        }
        UUID uUID = Class_626.Method_851(class_20165.Method_20192());
        Class_22553 class_22553 = Class_16620.Method_16627(16578 & 4780);
        System.out.println("Generowanie token BlazingPack dla: \"" + uUID.toString() + "\" \"" + string + "\" \"" + uUID + "\"");
        class_22553.Method_22610(Field_13503);
        class_22553.Method_22610(string.getBytes(Charsets.UTF_8));
        class_22553.Method_22584(uUID.getLeastSignificantBits());
        class_22553.Method_22584(uUID.getMostSignificantBits());
        byte[] arrby = class_22553.Method_22599();
        String string2 = Class_20072.Method_20078(arrby);
        class_22553.release();
        return string2;
    }

    private void Method_13507() {
        MethodHandle methodHandle = MethodHandles.constant(String.class, "MC|BlazingPack");
    }
}

