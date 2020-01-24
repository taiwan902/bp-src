/*
 * Decompiled with CFR 0.145.
 * 
 * Could not load the following classes:
 *  com.google.common.util.concurrent.ListenableFuture
 *  com.google.gson.JsonElement
 *  com.google.gson.JsonObject
 *  com.google.gson.JsonParser
 */
import com.google.common.util.concurrent.ListenableFuture;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.PrintStream;
import java.io.Reader;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.net.HttpURLConnection;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;
import java.net.URLClassLoader;
import java.net.URLConnection;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Class_41092 {
    public static String Field_41093 = Class_41092.Method_41095("\u08d9\u08c2\u08d2\u08c0\u08d4");

    private static URLConnection Method_41094(String string) {
        URL uRL = new URL(string);
        URLConnection uRLConnection = uRL.openConnection();
        uRLConnection.setConnectTimeout(10128 & -6306);
        uRLConnection.setReadTimeout(30521 & -22764);
        if (!(uRLConnection instanceof HttpURLConnection) || ((HttpURLConnection)uRLConnection).getResponseCode() != (1226 & -16163)) {
            return null;
        }
        return uRLConnection;
    }

    private static String Method_41095(String string) {
        int n = 16437;
        char[] arrc = string.toCharArray();
        StackTraceElement[] arrstackTraceElement = new Throwable().getStackTrace();
        n = (char)(n ^ (char)arrstackTraceElement[0].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getClassName().hashCode());
        char c = (char)Class_8.Method_10(Class_41092.class, 1);
        n = (char)(n ^ c);
        char c2 = (char)(n >> 7);
        for (int n2 = 0; n2 < arrc.length; n2 = (int)((char)(n2 + 1))) {
            arrc[n2] = (char)(arrc[n2] ^ n ^ n2 & c2);
        }
        return new String(arrc);
    }

    public static void Method_41096(Class_23208 class_23208, String string) {
        class_23208.Method_23222();
        class_23208.Method_23221("\u00a74B\u0142\u0105d przy automatycznej aktualizacji paczki! " + string + "\n\u00a7eMasz star\u0105 wersje blazingpacka! \n \u00a76Pobierz r\u0119cznie ZIP najnowszej paczki z \u00a7bwww.blazingpack.pl \u00a76i podmie\u0144 zawarto\u015b\u0107 plik\u00f3w w \u00a7b.minecraft \u00a76na aktualne.");
    }

    public static Class_25167 Method_41097(String string) {
        URLConnection uRLConnection = Class_41092.Method_41094(string);
        if (uRLConnection == null) {
            return null;
        }
        InputStream inputStream = uRLConnection.getInputStream();
        if (inputStream == null) {
            return null;
        }
        JsonParser jsonParser = new JsonParser();
        JsonObject jsonObject = jsonParser.parse((Reader)new InputStreamReader(inputStream, StandardCharsets.UTF_8)).getAsJsonObject();
        Class_25167 class_25167 = new Class_25167();
        class_25167.Field_25172 = jsonObject.get("size").getAsInt();
        class_25167.Field_25169 = jsonObject.get("sha1").getAsString();
        class_25167.Field_25170 = jsonObject.get("md5").getAsString();
        class_25167.Field_25168 = !jsonObject.has("u") || jsonObject.get("u").getAsInt() != 0 ? 4099 & 10881 : 31766 & 160;
        int n = class_25167.Field_25168 ? 1 : 0;
        if (jsonObject.has("d")) {
            class_25167.Field_25171 = jsonObject.get("d").getAsString();
        }
        return class_25167;
    }

    public static void Method_41098(Class_18 class_18, Class_23208 class_23208) {
        class_23208.Method_23221("Rozpoczynam proces aktualizacji... 0%");
        String string = Class_32118.Method_32122(class_18.Field_38);
        System.out.println("Client md5: " + string);
        class_23208.Method_23221("Rozpoczynam proces aktualizacji... 30%");
        Object[] arrobject = new Object[4355 & -16373];
        arrobject[-16352 & 259] = "https://update2.blazingpack.pl";
        arrobject[20565 & 545] = "apiv2";
        arrobject[994 & 2058] = Field_41093;
        Class_25167 class_25167 = Class_41092.Method_41097(String.format("%s/%s/files/client/%s/json", arrobject));
        Class_24595 class_24595 = class_18.Method_247(class_25167.Field_25171);
        System.out.println("Online md5: " + class_25167.Field_25170);
        if (class_25167.Field_25168 && string.toString().equalsIgnoreCase(class_25167.Field_25170)) {
            class_23208.Method_23221("Klient jest aktualny!");
            Thread.sleep(34709245L & -6212078476019104836L);
        } else if (class_18.Field_96) {
            class_23208.Method_23221("Klient jest nieaktualny!");
            Thread.sleep(1108488752134702076L & 288655036L);
        } else {
            class_23208.Method_23221("Rozpoczynam proces aktualizacji... 60%");
            class_24595.Method_24620(class_25167.Field_25169, class_25167.Field_25172, null, new Class_21439(class_25167, class_18, class_23208));
            return;
        }
        Class_18.Field_89.Method_229(new Class_22820(class_18));
    }

    private void Method_41099() {
        MethodHandle methodHandle = MethodHandles.constant(String.class, "MC|BlazingPack");
    }

    public static void Method_41100(Class_18 class_18) {
        Class_23208 class_23208 = new Class_23208();
        class_23208.Method_23220();
        class_23208.Method_23221("\u0141adowanie...");
        class_18.Method_218(class_23208);
        Thread thread = new Thread((Runnable)new Class_43822(class_23208, class_18), "Check updates");
        thread.setDaemon((17 & 8201) != 0);
        thread.start();
    }

    protected static void Method_41101(Class_18 class_18, Class_23208 class_23208, Class_25167 class_25167, long l, Class_19123 class_19123) {
        block6 : {
            try {
                class_23208.Method_23221("Instalowanie aktualizacji...");
                Path path = Paths.get(((URLClassLoader)Class_18.class.getClassLoader()).getURLs()[259 & 9344].toURI());
                File file = path.toFile();
                File file2 = new File(file.getParentFile(), file.getName() + ".tmp");
                File file3 = new File(file.getParentFile(), file.getName() + ".new");
                file2.delete();
                file3.delete();
                class_23208.Field_23211 = 7449 & 25249;
                class_19123.Method_19130(new FileOutputStream(file2), new Class_38562(l, class_23208));
                class_19123.Field_19126.delete();
                String string = Class_7749.Method_7753(file2.toPath());
                class_23208.Field_23211 = 513 & 20690;
                if (!string.equalsIgnoreCase(class_25167.Field_25170)) {
                    Class_41092.Method_41096(class_23208, "Suma kontrolna sie nie zgadza!");
                    file2.delete();
                }
                if (file2.renameTo(file3)) {
                    class_23208.Method_23222();
                    class_23208.Method_23221("\u00a74Zaktualizowano poprawnie!\n\u00a7eUruchom ponownie gre!");
                    try {
                        Thread.sleep(4154373979161779083L & -4154373980553013332L);
                    }
                    catch (InterruptedException interruptedException) {
                        // empty catch block
                    }
                    Class_18.Field_89.Method_229(new Class_41705(class_18));
                    break block6;
                }
                file2.delete();
                Class_41092.Method_41096(class_23208, "rename failed");
            }
            catch (IOException | URISyntaxException exception) {
                exception.printStackTrace();
                Class_41092.Method_41096(class_23208, exception.toString());
            }
        }
    }
}

