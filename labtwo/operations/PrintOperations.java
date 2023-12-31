package labtwo.operations;

public class PrintOperations {
    public static void printMainOperations(){
        System.out.println("Welcome to TUM's student management system!\n" +
        "What do you want to do?\n" + 
        "g - General operations\n" + 
        "f - Faculty operations\n" +
        "d - Data operations\n" +
        System.lineSeparator() +
        "q - Quit program\n" + 
        "your input>");
    }

    public static void printGeneralOperations(){
        System.out.println("General operations\n" +
        "What do you want to do?\n" + 
        "nf/<faculty name>/<faculty abbreviation>/<field> - create faculty\n" + 
        "ss/<student email> - search student and show faculty\n" +
        "df - display faculties\n"+
        "df/field - display all faculties of a field\n" +
        System.lineSeparator() +
        "b - back\n" + 
        "q - Quit program\n" + 
        "your input>");
    }

    public static void printFacultyOperations(){
        System.out.println("Faculty operations\n" +
        "What do you want to do?\n" + 
        "ns/<faculty abbreviation>/<first name>/<last name>/<email>/<day>/<month>/<year> - create student\n" + 
        "gs/<email> - graduate student\n" +
        "ds/<faculty abbreviation> - display enrolled students\n" +
        "dg/<faculty abbreviation> - display graduated students\n" + 
        "bf/<faculty abbreviation>/<email> - check if student belongs to faculty\n" +
        System.lineSeparator() +
        "b - back\n" + 
        "q - Quit program\n" + 
        "your input>");
    }

    public static void printFileOperations(){
        System.out.println("File manager operations\n" +
        "What do you want to do?\n" +
        "sd - save data in file\n" +
        "rd - read data from file\n" +
        "res - restore data from file\n" +
        "rs - read all students\n" + 
        "rg - read graduated students\n" +
        System.lineSeparator() +
         "b - back\n" + 
        "q - Quit program\n" + 
        "your input>");
    }
}
