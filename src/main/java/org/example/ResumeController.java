package org.example;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.util.List;

public class ResumeController {
    public static void main(String[] args) {

        ResumeController resumeController=new ResumeController();
        resumeController.createResume();
    }
    private  ResumeView view;

    public ResumeController(){
        view=new ResumeView();
    }



    public void createResume() {
        ResumeController resumeController = new ResumeController();

        Personlnfo personlnfo= view.inputPersonInfo();
        List<Education> educations=view.inputEducationList();
        List<Career> careers= view.inputCareerList();
         String self=view.inputSelfIntroduciton();

    }

    public void createResumeSheet() {

    }

    public void createSelfIntroductionSheet() {


    }

    public void getWrapCellStyle() {

    }

    public void saveWorkbookToFile() {


    }
}
