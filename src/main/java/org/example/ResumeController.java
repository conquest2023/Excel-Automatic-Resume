package org.example;

public class ResumeController {

    public static void main(String[] args) {

        ResumeController resumeController = new ResumeController();

        resumeController.createResume();

    }

     public void createResume(){
         ResumeView resumeView=new ResumeView();
         resumeView.inputPersonInfo();
         resumeView.inputEducationList();
         resumeView.inputCareerList();
         resumeView.inputSelfIntroduciton();
    }
    public  void createResumeSheet(){

    }
    public void createSelfIntroductionSheet(){

    }
    public void getWrapCellStyle(){

    }
    public void saveWorkbookToFile(){


    }
}
