package FinalProjectJavaCore.Develop;

import FinalProjectJavaCore.WorkWithFiles.WorkWithBankDataBase;
import FinalProjectJavaCore.WorkWithFiles.WorkWithInputFile;

public class MethodOne {
    public static void one(){
        WorkWithBankDataBase.parseAccount();
        System.out.println(WorkWithInputFile.parseFilesFromInput());
       // WorkWithInputFile.moveFileFromInputToArchive();
    }
}
