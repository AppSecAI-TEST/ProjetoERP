package br.com.secharpe.util;

import java.io.File;

/**
 *
 * @author luandr
 */
public final class Vars {
    //GLOBALS
    public final static String PROP_FILE = "src" + File.separator + "br" + File.separator + "com" + File.separator + "secharpe" + File.separator + "util" + File.separator + "config.properties";   
    public static final String PROP_NEW = br.com.secharpe.util.Propriedades.getProp("form.new");
    public static final String PROP_REMOVE = br.com.secharpe.util.Propriedades.getProp("form.remove");
    public static final String PROP_EDIT = br.com.secharpe.util.Propriedades.getProp("form.edit");
    public static final String PROP_CLOSE = br.com.secharpe.util.Propriedades.getProp("form.close");
    public static final String PROP_VIEW = br.com.secharpe.util.Propriedades.getProp("form.view");
    public static final String PROP_SAVE = br.com.secharpe.util.Propriedades.getProp("form.save");
    public static final String PROP_ERASE = br.com.secharpe.util.Propriedades.getProp("form.erase");
    public static final String PROP_SAVECOMPANY = br.com.secharpe.util.Propriedades.getProp("form.savecompany");
    public static final String LOGIN_ENTER = br.com.secharpe.util.Propriedades.getProp("login.enter");
    public static final String PATH_TO_ICON_FOLDER = "/br/com/secharpe/util/image/";
    public static final String TITLE_MESSAGE_DEFAULT = "Ooops, um erro ocorreu!";

}
