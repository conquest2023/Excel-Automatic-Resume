package org.example;

import java.util.Scanner;

public class ResumeView {
    Personlnfo personlnfo = new Personlnfo();
    Education education = new Education();
    Career career = new Career();


    public Personlnfo inputPersonInfo() {

        Scanner sc = new Scanner(System.in);
        System.out.print("사진 파일명을 입력하세요:");
        personlnfo.photo = sc.nextLine();
        System.out.print("이름을 입력하세요:");
        personlnfo.name = sc.next();
        System.out.print("이메일을 입력하세요:");
        personlnfo.email = sc.next();
        System.out.print("주소를 입력하세요:");
        personlnfo.address = sc.next();
        System.out.print("핸드폰 번호를 입력하세요:");
        personlnfo.phoneNumber = sc.nextInt();
        System.out.print("생일을 입력하세요");
        personlnfo.birthDate = sc.nextInt();
        return personlnfo;
    }

    public Education inputEducationList() {
        Scanner sc = new Scanner(System.in);
        System.out.println("학력 정보를 입력하세요 (종료는 q):");
        System.out.println("졸업년도  " +"학교명  "+"전공  "+"졸업여부  ");
        education.graduationStatus = sc.nextLine();
        education.graduationYear = sc.nextInt();
        education.major = sc.nextLine();
        education.schoolName = sc.nextLine();
        return education;
    }

    public Career inputCareerList() {
        Scanner sc = new Scanner(System.in);
        System.out.println("경력 정보를 입력하세요 (종료는 q)");
        System.out.println("근무기간  " +"근무처  "+"담당업무  "+"근속연수  ");
        career.companyName=sc.nextLine();
        career.employmentYears=sc.nextInt();
        career.jobtitle=sc.nextLine();
        career.workPeriod=sc.nextInt();
        return  career;
    }

    public String inputSelfIntroduciton() {
        Scanner sc = new Scanner(System.in);
        System.out.println("자기소개를 입력하세요.여러 줄을 입력하려면 빈 줄을 입력하세요.");
        String SelfIntroduction = sc.next();

        System.out.println("이력서가 완성되었습니다.");
        return SelfIntroduction;
    }


}
