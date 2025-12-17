package PrintSpooler;

import java.util.ArrayList;

class PrintSpooler {
    private static PrintSpooler instance;
    private ArrayList<PrintJob> printJobs;

    private PrintSpooler(){
        printJobs = new ArrayList<PrintJob>();
    }

    public static synchronized PrintSpooler getInstance(){
        if (instance == null) {
            instance = new PrintSpooler();
        }
        return instance;
    }

    public void addJob(PrintJob job){
        printJobs.add(job);
    }

}
