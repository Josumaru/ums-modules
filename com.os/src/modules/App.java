package modules;

import java.util.Map;
import java.util.HashMap;

public class App {
    public static void main(String args[]) {
        String redColor = "\u001B[31m";
        String whiteColor = "\u001B[0m";

        if (args.length == 0) {
            String helpCommand = """
                    usage : java -jar --enable-preview com.datacomunication.jar -m <modules> -l <languange>

                    -h              Show this help
                    -m, --modules   Show modules    :
                                    1      Show module 1 (Introduction to Data Communication)
                    -l, --language  Change langua>ge :
                                    id (default)
                                    en (comming soon)
                    """;
            System.out.println(helpCommand);
        }

        Map<String, Modules> modules = new HashMap<>();

        modules.put("1", new Modules(
                1,
                """
                        \u001BSistem Komputer = OS ada di komputer
                        Komputer sebagai wadahnya, OS sebagai media komunikasin\u001B[0m
                        
                        
                        Blissmerr:  Komputer adalah suatu alat electronik yang mampu melakukan bebrapa tugas 
                                    yaitu menerima input memproses dan mengeluarkan otput dalam sebuah informasi
                        
                        
                        komputer adlah peralatan electronic yang dapat menerima input, mengolah input, dan mengeluarkan output dalam bentuk informasi.
                        
                        Struktur komputer :
                            1.  System Bus
                            2.  ALU
                            3.  Perangkat I/O
                            4.  Memory:
                                a.  RAM >> Random Access Memory >> Menyimpan data sementara
                                b.  ROM >> Read Access Memory >> Menyimpan data secara Non Volatil
                        
                        Sementara (Volatil) >> Hanya menyimpan ketika ada tegangan listrik >> RAM
                        Tidak Sementara (Non Volatil) >> Dapat menyimpan walaupun tidak ada sinyal listrik >> ROM
                        
                        
                        Perangkat IO
                            Input   :   1. Keyboard
                                        2. Mouse
                                        3. Scanner
                                        4. Camera
                                        5. Joystick

                            Output  :   1. Printer
                                        2. Monitor
                                        3. LCD Projector
                                        4. Hologram
                                        5. Speaker
                        
                        
                        System Operasi :
                            1. Windows
                            2. Linux
                            3. Mac OS
                            4. DLL
                                        """));

        for (int i = 1; i <= modules.size(); i++) {
            if (args.length > 0 && ((args[0].equals("-m")
                    || args[0].equals("--modules"))
                    && args[1].equals(String.format("%d", i)))) {
                System.out.println(modules.get(String.format("%d", i)));
            } else {
                System.out.println("Something Wrong");
            }
        }
    }
}
