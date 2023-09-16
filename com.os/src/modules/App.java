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
                        \u001BSistem komputer = OS ada di komputer komputer sebagia wadahnya OS sebagai media komunikasi\u001B[0m
                        
                        
                        Blissmerr: Komputer adalah suatu alat electronik yang mampu melakukan bebrapa tugas 
                        yaitu menerima input memproses dan mengeluarkan otput dalam sebuah informasi
                        
                        
                        komputer adlah peralatan electromik yang dapat menerima input, mengolah in
                        
                        Struktur komputer 
                        
                        RAM
                        ROM
                        
                        Sementara >> hanya menyimpan ketika ada tegangan listrik
                        ROM >> <<
                        Volatil >> Sementara
                        Non Volatil >> <<
                        
                        
                        Perangkat IO
                        
                        
                        
                        System Operasi
                        1. Windows
                        2. DLL
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
