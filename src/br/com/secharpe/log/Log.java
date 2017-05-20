package br.com.secharpe.log;

/**
 *
 * @author LuizAlexandre17 <luizalexandreluz@unesc.net>
 */

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;

/**
 *
 * @author comp8
 */
public class Log {

    public void escrever(String User) throws IOException {
        //O segundo parametro "true" indica append para o arquivo em quest�o.

        String logFile = "log.log";
        FileOutputStream escritorArquivos = new FileOutputStream(logFile, true);
        int tamanho = 0;
        String data = (new java.util.Date()).toString();
        String msg =  User + "";
        while (tamanho < msg.length()) {
            escritorArquivos.write((int) msg.charAt(tamanho++));
        }
        escritorArquivos.flush();
        escritorArquivos.close();
    }

    public String lerArquivo(String strCaminho) {

        try {
            BufferedReader in = new BufferedReader(new FileReader(strCaminho));
            String str;
            StringBuffer buf = new StringBuffer();
            while (in.ready()) {
                str = in.readLine();
                buf.append(str);
            }
            in.close();
            return buf.toString();
        } catch (IOException e) {
            e.printStackTrace();
            return null;
        }
    }
}
