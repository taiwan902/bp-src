/*
 * Decompiled with CFR 0.145.
 * 
 * Could not load the following classes:
 *  com.google.common.util.concurrent.ListenableFuture
 *  com.google.common.util.concurrent.ListeningExecutorService
 *  com.google.common.util.concurrent.MoreExecutors
 *  com.google.common.util.concurrent.ThreadFactoryBuilder
 *  org.apache.logging.log4j.LogManager
 *  org.apache.logging.log4j.Logger
 */
import com.google.common.util.concurrent.ListenableFuture;
import com.google.common.util.concurrent.ListeningExecutorService;
import com.google.common.util.concurrent.MoreExecutors;
import com.google.common.util.concurrent.ThreadFactoryBuilder;
import java.io.BufferedReader;
import java.io.DataOutputStream;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.Reader;
import java.io.UnsupportedEncodingException;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.net.HttpURLConnection;
import java.net.Proxy;
import java.net.ServerSocket;
import java.net.URL;
import java.net.URLConnection;
import java.net.URLEncoder;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Class_32476 {
    public static final ListeningExecutorService Field_32477 = MoreExecutors.listeningDecorator((ExecutorService)Executors.newCachedThreadPool(new ThreadFactoryBuilder().setDaemon((4105 & -5517) != 0).setNameFormat(Class_32476.Method_32486("\uc252\uc250\uc242\uc252\uc256\uc254\uc254\uc254\uc252\uc240\uc210\uc210\uc256")).build()));
    private static final Logger Field_32478;
    private static final AtomicInteger Field_32479;

    private void Method_32480() {
        MethodHandle methodHandle = MethodHandles.constant(String.class, "MC|BlazingPack");
    }

    static Logger Method_32481() {
        return Field_32478;
    }

    private static String Method_32482(URL uRL, String string, boolean bl) {
        try {
            String string2;
            Proxy proxy;
            Proxy proxy2 = proxy = Class_2457.Method_2530() == null ? null : Class_2457.Method_2530().Method_2540();
            if (proxy == null) {
                proxy = Proxy.NO_PROXY;
            }
            HttpURLConnection httpURLConnection = (HttpURLConnection)uRL.openConnection(proxy);
            httpURLConnection.setRequestMethod("POST");
            httpURLConnection.setRequestProperty("Content-Type", "application/x-www-form-urlencoded");
            httpURLConnection.setRequestProperty("Content-Length", "" + string.getBytes().length);
            httpURLConnection.setRequestProperty("Content-Language", "en-US");
            httpURLConnection.setUseCaches((69 & 34) != 0);
            httpURLConnection.setDoInput((-32755 & 2243) != 0);
            httpURLConnection.setDoOutput((8389 & 4401) != 0);
            DataOutputStream dataOutputStream = new DataOutputStream(httpURLConnection.getOutputStream());
            dataOutputStream.writeBytes(string);
            dataOutputStream.flush();
            dataOutputStream.close();
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(httpURLConnection.getInputStream()));
            StringBuffer stringBuffer = new StringBuffer();
            while ((string2 = bufferedReader.readLine()) != null) {
                stringBuffer.append(string2);
                stringBuffer.append((char)(16397 & 14109));
            }
            bufferedReader.close();
            return stringBuffer.toString();
        }
        catch (Exception exception) {
            if (!bl) {
                Field_32478.error("Could not post to " + uRL, (Throwable)exception);
            }
            return "";
        }
    }

    public static ListenableFuture Method_32483(File file, String string, Map map, int n, Class_2748 class_2748, Proxy proxy) {
        ListenableFuture listenableFuture = Field_32477.submit((Runnable)new Class_11632(class_2748, string, proxy, map, file, n));
        return listenableFuture;
    }

    static {
        Field_32479 = new AtomicInteger(-32256 & 93);
        Field_32478 = LogManager.getLogger();
    }

    public static int Method_32484() {
        ServerSocket serverSocket = null;
        int n = -1 & -1;
        try {
            serverSocket = new ServerSocket(16448 & 3201);
            n = serverSocket.getLocalPort();
        }
        finally {
            try {
                if (serverSocket != null) {
                    serverSocket.close();
                }
            }
            catch (IOException iOException) {}
        }
        return n;
    }

    public static String Method_32485(Map map) {
        StringBuilder stringBuilder = new StringBuilder();
        for (Map.Entry entry : map.entrySet()) {
            if (stringBuilder.length() > 0) {
                stringBuilder.append((char)(8254 & 38));
            }
            try {
                stringBuilder.append(URLEncoder.encode((String)entry.getKey(), "UTF-8"));
            }
            catch (UnsupportedEncodingException unsupportedEncodingException) {
                unsupportedEncodingException.printStackTrace();
            }
            if (entry.getValue() == null) continue;
            stringBuilder.append((char)(4221 & -15555));
            try {
                stringBuilder.append(URLEncoder.encode(entry.getValue().toString(), "UTF-8"));
            }
            catch (UnsupportedEncodingException unsupportedEncodingException) {
                unsupportedEncodingException.printStackTrace();
            }
        }
        return stringBuilder.toString();
    }

    private static String Method_32486(String string) {
        int n = 21810;
        char[] arrc = string.toCharArray();
        StackTraceElement[] arrstackTraceElement = new Throwable().getStackTrace();
        n = (char)(n ^ (char)arrstackTraceElement[0].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getClassName().hashCode());
        char c = (char)Class_8.Method_10(Class_32476.class, 1);
        n = (char)(n ^ c);
        char c2 = (char)(n >> 7);
        for (int n2 = 0; n2 < arrc.length; n2 = (int)((char)(n2 + 1))) {
            arrc[n2] = (char)(arrc[n2] ^ n ^ n2 & c2);
        }
        return new String(arrc);
    }

    public static String Method_32487(URL uRL, Map map, boolean bl) {
        return Class_32476.Method_32482(uRL, Class_32476.Method_32485(map), bl);
    }

    public static String Method_32488(URL uRL) {
        String string;
        HttpURLConnection httpURLConnection = (HttpURLConnection)uRL.openConnection();
        httpURLConnection.setRequestMethod("GET");
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(httpURLConnection.getInputStream()));
        StringBuilder stringBuilder = new StringBuilder();
        while ((string = bufferedReader.readLine()) != null) {
            stringBuilder.append(string);
            stringBuilder.append((char)(4109 & 8207));
        }
        bufferedReader.close();
        return stringBuilder.toString();
    }
}

