import classes.Menus;

public class Main {
    public static void main(String[] args) {


        System.out.println("""
         .S_sSSs      sSSs   .S_sSSs      sSSs    sSSSSs   .S_SSSs     .S_sSSs      sSSs_sSSs      sSSs       \s
        .SS~YS%%b    d%%SP  .SS~YS%%b    d%%SP   d%%%%SP  .SS~SSSSS   .SS~YS%%b    d%%SP~YS%%b    d%%SP       \s
        S%S   `S%b  d%S'    S%S   `S%b  d%S'    d%S'      S%S   SSSS  S%S   `S%b  d%S'     `S%b  d%S'         \s
        S%S    S%S  S%S     S%S    S%S  S%S     S%S       S%S    S%S  S%S    S%S  S%S       S%S  S%|          \s
        S%S    d*S  S&S     S%S    S&S  S&S     S&S       S%S SSSS%S  S%S    S&S  S&S       S&S  S&S          \s
        S&S   .S*S  S&S_Ss  S&S    S&S  S&S_Ss  S&S       S&S  SSS%S  S&S    S&S  S&S       S&S  Y&Ss         \s
        S&S_sdSSS   S&S~SP  S&S    S&S  S&S~SP  S&S       S&S    S&S  S&S    S&S  S&S       S&S  `S&&S        \s
        S&S~YSY%b   S&S     S&S    S&S  S&S     S&S sSSs  S&S    S&S  S&S    S&S  S&S       S&S    `S*S       \s
        S*S   `S%b  S*b     S*S    S*S  S*b     S*b `S%%  S*S    S&S  S*S    d*S  S*b       d*S     l*S       \s
        S*S    S%S  S*S.    S*S    S*S  S*S.    S*S   S%  S*S    S*S  S*S   .S*S  S*S.     .S*S    .S*P       \s
        S*S    S&S   SSSbs  S*S    S*S   SSSbs   SS_sSSS  S*S    S*S  S*S_sdSSS    SSSbs_sdSSS   sSS*S        \s
        S*S    SSS    YSSP  S*S    SSS    YSSP    Y~YSSY  SSS    S*S  SSS~YSSY      YSSP~YSSY    YSS'         \s""");

        Menus menu = new Menus();

        menu.menuInicial();

    }

}